// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.ads.googleads.examples.remarketing;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v3.common.CrmBasedUserListInfo;
import com.google.ads.googleads.v3.common.LogicalUserListInfo;
import com.google.ads.googleads.v3.common.LogicalUserListOperandInfo;
import com.google.ads.googleads.v3.common.UserListLogicalRuleInfo;
import com.google.ads.googleads.v3.enums.CustomerMatchUploadKeyTypeEnum.CustomerMatchUploadKeyType;
import com.google.ads.googleads.v3.enums.UserListLogicalRuleOperatorEnum.UserListLogicalRuleOperator;
import com.google.ads.googleads.v3.errors.GoogleAdsError;
import com.google.ads.googleads.v3.errors.GoogleAdsException;
import com.google.ads.googleads.v3.resources.UserList;
import com.google.ads.googleads.v3.services.MutateUserListsResponse;
import com.google.ads.googleads.v3.services.UserListOperation;
import com.google.ads.googleads.v3.services.UserListServiceClient;
import com.google.ads.googleads.v3.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.Int64Value;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Creates a user list (a.k.a. audience) and uploads members to populate the list.
 *
 * <p><em>Notes:</em>
 *
 * <ul>
 *   <li>It may take up to several hours for the list to be populated with members.
 *   <li>Email addresses must be associated with a Google account.
 *   <li>For privacy purposes, the user list size will show as zero until the list has at least
 *       1,000 members. After that, the size will be rounded to the two most significant digits.
 * </ul>
 */
public class AddCrmBasedUserList {

  private static final String[] EMAILS =
      new String[] {"customer1@example.com", "customer2@example.com", "customer3@example.com"};

  private static class AddCrmBasedUserListParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;
  }

  public static void main(String[] args) {
    AddCrmBasedUserListParams params = new AddCrmBasedUserListParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
    }

    GoogleAdsClient googleAdsClient;
    try {
      googleAdsClient = GoogleAdsClient.newBuilder().fromPropertiesFile().build();
    } catch (FileNotFoundException fnfe) {
      System.err.printf(
          "Failed to load GoogleAdsClient configuration from file. Exception: %s%n", fnfe);
      return;
    } catch (IOException ioe) {
      System.err.printf("Failed to create GoogleAdsClient. Exception: %s%n", ioe);
      return;
    }

    try {
      new AddCrmBasedUserList().runExample(googleAdsClient, params.customerId);
    } catch (GoogleAdsException gae) {
      // GoogleAdsException is the base class for most exceptions thrown by an API request.
      // Instances of this exception have a message and a GoogleAdsFailure that contains a
      // collection of GoogleAdsErrors that indicate the underlying causes of the
      // GoogleAdsException.
      System.err.printf(
          "Request ID %s failed due to GoogleAdsException. Underlying errors:%n",
          gae.getRequestId());
      int i = 0;
      for (GoogleAdsError googleAdsError : gae.getGoogleAdsFailure().getErrorsList()) {
        System.err.printf("  Error %d: %s%n", i++, googleAdsError);
      }
    }
  }

  /**
   * Runs the example.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId) {
    // Creates a CRM based user list.
    String userListResourceName = createUserList(googleAdsClient, customerId);

    // Adds members to the user list.
    addMembersToUserList(googleAdsClient, customerId, userListResourceName);
  }

  /**
   * Creates a CRM based user list that will be used to add members.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @return the user list resource name.
   */
  private String createUserList(GoogleAdsClient googleAdsClient, long customerId) {
    // Creates the new user list.
    UserList userList =
        UserList.newBuilder()
            .setName(
                StringValue.of(
                    "Customer relationship management list #" + System.currentTimeMillis()))
            .setDescription(
                StringValue.of("A list of customers that originated from email addresses"))
            // CRM-based user lists can use a membership life span of 10000 to indicate unlimited;
            // otherwise normal values apply. Sets the membership life span to 30 days.
            .setMembershipLifeSpan(Int64Value.of(30))
            .setCrmBasedUserList(
                CrmBasedUserListInfo.newBuilder()
                    .setUploadKeyType(CustomerMatchUploadKeyType.CONTACT_INFO))
            .build();

    // Creates the operation.
    UserListOperation operation = UserListOperation.newBuilder().setCreate(userList).build();

    // Creates the service client.
    try (UserListServiceClient userListServiceClient =
        googleAdsClient.getLatestVersion().createUserListServiceClient()) {
      // Adds the user list.
      MutateUserListsResponse response =
          userListServiceClient.mutateUserLists(
              Long.toString(customerId), ImmutableList.of(operation));
      // Prints the response.
      System.out.printf(
          "Created CRM based user list with resource name, '%s'.%n",
          response.getResults(0).getResourceName());
      return response.getResults(0).getResourceName();
    }
  }

  /**
   * Adds members to a CRM based user list.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param userListResourceName the resource name of the CRM based user list to add members to.
   */
  private void addMembersToUserList(
      GoogleAdsClient googleAdsClient, long customerId, String userListResourceName) {
    try (UserListServiceClient userListServiceClient =
        googleAdsClient.getLatestVersion().createUserListServiceClient()) {
      // TODO(jradcliff): Update with example once available.
    }
  }
}
