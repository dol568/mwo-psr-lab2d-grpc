// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: calculator.proto

package sr.grpc.gen;

/**
 * Protobuf type {@code calculator.ComplexArithmeticOpArguments}
 */
public final class ComplexArithmeticOpArguments extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:calculator.ComplexArithmeticOpArguments)
    ComplexArithmeticOpArgumentsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ComplexArithmeticOpArguments.newBuilder() to construct.
  private ComplexArithmeticOpArguments(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ComplexArithmeticOpArguments() {
    optype_ = 0;
    args_ = emptyDoubleList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ComplexArithmeticOpArguments();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return sr.grpc.gen.CalculatorProto.internal_static_calculator_ComplexArithmeticOpArguments_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return sr.grpc.gen.CalculatorProto.internal_static_calculator_ComplexArithmeticOpArguments_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            sr.grpc.gen.ComplexArithmeticOpArguments.class, sr.grpc.gen.ComplexArithmeticOpArguments.Builder.class);
  }

  public static final int OPTYPE_FIELD_NUMBER = 1;
  private int optype_ = 0;
  /**
   * <code>.calculator.OperationType optype = 1;</code>
   * @return The enum numeric value on the wire for optype.
   */
  @java.lang.Override public int getOptypeValue() {
    return optype_;
  }
  /**
   * <code>.calculator.OperationType optype = 1;</code>
   * @return The optype.
   */
  @java.lang.Override public sr.grpc.gen.OperationType getOptype() {
    sr.grpc.gen.OperationType result = sr.grpc.gen.OperationType.forNumber(optype_);
    return result == null ? sr.grpc.gen.OperationType.UNRECOGNIZED : result;
  }

  public static final int ARGS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.DoubleList args_;
  /**
   * <code>repeated double args = 2;</code>
   * @return A list containing the args.
   */
  @java.lang.Override
  public java.util.List<java.lang.Double>
      getArgsList() {
    return args_;
  }
  /**
   * <code>repeated double args = 2;</code>
   * @return The count of args.
   */
  public int getArgsCount() {
    return args_.size();
  }
  /**
   * <code>repeated double args = 2;</code>
   * @param index The index of the element to return.
   * @return The args at the given index.
   */
  public double getArgs(int index) {
    return args_.getDouble(index);
  }
  private int argsMemoizedSerializedSize = -1;

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (optype_ != sr.grpc.gen.OperationType.SUM.getNumber()) {
      output.writeEnum(1, optype_);
    }
    if (getArgsList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(argsMemoizedSerializedSize);
    }
    for (int i = 0; i < args_.size(); i++) {
      output.writeDoubleNoTag(args_.getDouble(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (optype_ != sr.grpc.gen.OperationType.SUM.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, optype_);
    }
    {
      int dataSize = 0;
      dataSize = 8 * getArgsList().size();
      size += dataSize;
      if (!getArgsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      argsMemoizedSerializedSize = dataSize;
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof sr.grpc.gen.ComplexArithmeticOpArguments)) {
      return super.equals(obj);
    }
    sr.grpc.gen.ComplexArithmeticOpArguments other = (sr.grpc.gen.ComplexArithmeticOpArguments) obj;

    if (optype_ != other.optype_) return false;
    if (!getArgsList()
        .equals(other.getArgsList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + OPTYPE_FIELD_NUMBER;
    hash = (53 * hash) + optype_;
    if (getArgsCount() > 0) {
      hash = (37 * hash) + ARGS_FIELD_NUMBER;
      hash = (53 * hash) + getArgsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static sr.grpc.gen.ComplexArithmeticOpArguments parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sr.grpc.gen.ComplexArithmeticOpArguments parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sr.grpc.gen.ComplexArithmeticOpArguments parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sr.grpc.gen.ComplexArithmeticOpArguments parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sr.grpc.gen.ComplexArithmeticOpArguments parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sr.grpc.gen.ComplexArithmeticOpArguments parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sr.grpc.gen.ComplexArithmeticOpArguments parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sr.grpc.gen.ComplexArithmeticOpArguments parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static sr.grpc.gen.ComplexArithmeticOpArguments parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static sr.grpc.gen.ComplexArithmeticOpArguments parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static sr.grpc.gen.ComplexArithmeticOpArguments parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sr.grpc.gen.ComplexArithmeticOpArguments parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(sr.grpc.gen.ComplexArithmeticOpArguments prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code calculator.ComplexArithmeticOpArguments}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:calculator.ComplexArithmeticOpArguments)
      sr.grpc.gen.ComplexArithmeticOpArgumentsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sr.grpc.gen.CalculatorProto.internal_static_calculator_ComplexArithmeticOpArguments_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sr.grpc.gen.CalculatorProto.internal_static_calculator_ComplexArithmeticOpArguments_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sr.grpc.gen.ComplexArithmeticOpArguments.class, sr.grpc.gen.ComplexArithmeticOpArguments.Builder.class);
    }

    // Construct using sr.grpc.gen.ComplexArithmeticOpArguments.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      optype_ = 0;
      args_ = emptyDoubleList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return sr.grpc.gen.CalculatorProto.internal_static_calculator_ComplexArithmeticOpArguments_descriptor;
    }

    @java.lang.Override
    public sr.grpc.gen.ComplexArithmeticOpArguments getDefaultInstanceForType() {
      return sr.grpc.gen.ComplexArithmeticOpArguments.getDefaultInstance();
    }

    @java.lang.Override
    public sr.grpc.gen.ComplexArithmeticOpArguments build() {
      sr.grpc.gen.ComplexArithmeticOpArguments result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public sr.grpc.gen.ComplexArithmeticOpArguments buildPartial() {
      sr.grpc.gen.ComplexArithmeticOpArguments result = new sr.grpc.gen.ComplexArithmeticOpArguments(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(sr.grpc.gen.ComplexArithmeticOpArguments result) {
      if (((bitField0_ & 0x00000002) != 0)) {
        args_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.args_ = args_;
    }

    private void buildPartial0(sr.grpc.gen.ComplexArithmeticOpArguments result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.optype_ = optype_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof sr.grpc.gen.ComplexArithmeticOpArguments) {
        return mergeFrom((sr.grpc.gen.ComplexArithmeticOpArguments)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(sr.grpc.gen.ComplexArithmeticOpArguments other) {
      if (other == sr.grpc.gen.ComplexArithmeticOpArguments.getDefaultInstance()) return this;
      if (other.optype_ != 0) {
        setOptypeValue(other.getOptypeValue());
      }
      if (!other.args_.isEmpty()) {
        if (args_.isEmpty()) {
          args_ = other.args_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureArgsIsMutable();
          args_.addAll(other.args_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              optype_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 17: {
              double v = input.readDouble();
              ensureArgsIsMutable();
              args_.addDouble(v);
              break;
            } // case 17
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureArgsIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                args_.addDouble(input.readDouble());
              }
              input.popLimit(limit);
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int optype_ = 0;
    /**
     * <code>.calculator.OperationType optype = 1;</code>
     * @return The enum numeric value on the wire for optype.
     */
    @java.lang.Override public int getOptypeValue() {
      return optype_;
    }
    /**
     * <code>.calculator.OperationType optype = 1;</code>
     * @param value The enum numeric value on the wire for optype to set.
     * @return This builder for chaining.
     */
    public Builder setOptypeValue(int value) {
      optype_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.calculator.OperationType optype = 1;</code>
     * @return The optype.
     */
    @java.lang.Override
    public sr.grpc.gen.OperationType getOptype() {
      sr.grpc.gen.OperationType result = sr.grpc.gen.OperationType.forNumber(optype_);
      return result == null ? sr.grpc.gen.OperationType.UNRECOGNIZED : result;
    }
    /**
     * <code>.calculator.OperationType optype = 1;</code>
     * @param value The optype to set.
     * @return This builder for chaining.
     */
    public Builder setOptype(sr.grpc.gen.OperationType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      optype_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.calculator.OperationType optype = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOptype() {
      bitField0_ = (bitField0_ & ~0x00000001);
      optype_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.DoubleList args_ = emptyDoubleList();
    private void ensureArgsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        args_ = mutableCopy(args_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     * <code>repeated double args = 2;</code>
     * @return A list containing the args.
     */
    public java.util.List<java.lang.Double>
        getArgsList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(args_) : args_;
    }
    /**
     * <code>repeated double args = 2;</code>
     * @return The count of args.
     */
    public int getArgsCount() {
      return args_.size();
    }
    /**
     * <code>repeated double args = 2;</code>
     * @param index The index of the element to return.
     * @return The args at the given index.
     */
    public double getArgs(int index) {
      return args_.getDouble(index);
    }
    /**
     * <code>repeated double args = 2;</code>
     * @param index The index to set the value at.
     * @param value The args to set.
     * @return This builder for chaining.
     */
    public Builder setArgs(
        int index, double value) {

      ensureArgsIsMutable();
      args_.setDouble(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated double args = 2;</code>
     * @param value The args to add.
     * @return This builder for chaining.
     */
    public Builder addArgs(double value) {

      ensureArgsIsMutable();
      args_.addDouble(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated double args = 2;</code>
     * @param values The args to add.
     * @return This builder for chaining.
     */
    public Builder addAllArgs(
        java.lang.Iterable<? extends java.lang.Double> values) {
      ensureArgsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, args_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated double args = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearArgs() {
      args_ = emptyDoubleList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:calculator.ComplexArithmeticOpArguments)
  }

  // @@protoc_insertion_point(class_scope:calculator.ComplexArithmeticOpArguments)
  private static final sr.grpc.gen.ComplexArithmeticOpArguments DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new sr.grpc.gen.ComplexArithmeticOpArguments();
  }

  public static sr.grpc.gen.ComplexArithmeticOpArguments getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ComplexArithmeticOpArguments>
      PARSER = new com.google.protobuf.AbstractParser<ComplexArithmeticOpArguments>() {
    @java.lang.Override
    public ComplexArithmeticOpArguments parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ComplexArithmeticOpArguments> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ComplexArithmeticOpArguments> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public sr.grpc.gen.ComplexArithmeticOpArguments getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

