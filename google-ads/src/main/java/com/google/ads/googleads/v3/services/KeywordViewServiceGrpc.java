package com.google.ads.googleads.v3.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Service to manage keyword views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v3/services/keyword_view_service.proto")
public final class KeywordViewServiceGrpc {

  private KeywordViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v3.services.KeywordViewService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetKeywordViewMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetKeywordViewRequest,
      com.google.ads.googleads.v3.resources.KeywordView> METHOD_GET_KEYWORD_VIEW = getGetKeywordViewMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetKeywordViewRequest,
      com.google.ads.googleads.v3.resources.KeywordView> getGetKeywordViewMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetKeywordViewRequest,
      com.google.ads.googleads.v3.resources.KeywordView> getGetKeywordViewMethod() {
    return getGetKeywordViewMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetKeywordViewRequest,
      com.google.ads.googleads.v3.resources.KeywordView> getGetKeywordViewMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetKeywordViewRequest, com.google.ads.googleads.v3.resources.KeywordView> getGetKeywordViewMethod;
    if ((getGetKeywordViewMethod = KeywordViewServiceGrpc.getGetKeywordViewMethod) == null) {
      synchronized (KeywordViewServiceGrpc.class) {
        if ((getGetKeywordViewMethod = KeywordViewServiceGrpc.getGetKeywordViewMethod) == null) {
          KeywordViewServiceGrpc.getGetKeywordViewMethod = getGetKeywordViewMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.GetKeywordViewRequest, com.google.ads.googleads.v3.resources.KeywordView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v3.services.KeywordViewService", "GetKeywordView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.GetKeywordViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.resources.KeywordView.getDefaultInstance()))
                  .setSchemaDescriptor(new KeywordViewServiceMethodDescriptorSupplier("GetKeywordView"))
                  .build();
          }
        }
     }
     return getGetKeywordViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeywordViewServiceStub newStub(io.grpc.Channel channel) {
    return new KeywordViewServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeywordViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new KeywordViewServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeywordViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new KeywordViewServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage keyword views.
   * </pre>
   */
  public static abstract class KeywordViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested keyword view in full detail.
     * </pre>
     */
    public void getKeywordView(com.google.ads.googleads.v3.services.GetKeywordViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.KeywordView> responseObserver) {
      asyncUnimplementedUnaryCall(getGetKeywordViewMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetKeywordViewMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.GetKeywordViewRequest,
                com.google.ads.googleads.v3.resources.KeywordView>(
                  this, METHODID_GET_KEYWORD_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage keyword views.
   * </pre>
   */
  public static final class KeywordViewServiceStub extends io.grpc.stub.AbstractStub<KeywordViewServiceStub> {
    private KeywordViewServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KeywordViewServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordViewServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KeywordViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested keyword view in full detail.
     * </pre>
     */
    public void getKeywordView(com.google.ads.googleads.v3.services.GetKeywordViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.KeywordView> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetKeywordViewMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage keyword views.
   * </pre>
   */
  public static final class KeywordViewServiceBlockingStub extends io.grpc.stub.AbstractStub<KeywordViewServiceBlockingStub> {
    private KeywordViewServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KeywordViewServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordViewServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KeywordViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested keyword view in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v3.resources.KeywordView getKeywordView(com.google.ads.googleads.v3.services.GetKeywordViewRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetKeywordViewMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage keyword views.
   * </pre>
   */
  public static final class KeywordViewServiceFutureStub extends io.grpc.stub.AbstractStub<KeywordViewServiceFutureStub> {
    private KeywordViewServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KeywordViewServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordViewServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KeywordViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested keyword view in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.resources.KeywordView> getKeywordView(
        com.google.ads.googleads.v3.services.GetKeywordViewRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetKeywordViewMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_KEYWORD_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KeywordViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeywordViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_KEYWORD_VIEW:
          serviceImpl.getKeywordView((com.google.ads.googleads.v3.services.GetKeywordViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.KeywordView>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class KeywordViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeywordViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v3.services.KeywordViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeywordViewService");
    }
  }

  private static final class KeywordViewServiceFileDescriptorSupplier
      extends KeywordViewServiceBaseDescriptorSupplier {
    KeywordViewServiceFileDescriptorSupplier() {}
  }

  private static final class KeywordViewServiceMethodDescriptorSupplier
      extends KeywordViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeywordViewServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (KeywordViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeywordViewServiceFileDescriptorSupplier())
              .addMethod(getGetKeywordViewMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
