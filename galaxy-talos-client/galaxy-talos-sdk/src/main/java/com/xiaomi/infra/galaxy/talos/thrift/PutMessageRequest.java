/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.talos.thrift;

import libthrift091.scheme.IScheme;
import libthrift091.scheme.SchemeFactory;
import libthrift091.scheme.StandardScheme;

import libthrift091.scheme.TupleScheme;
import libthrift091.protocol.TTupleProtocol;
import libthrift091.protocol.TProtocolException;
import libthrift091.EncodingUtils;
import libthrift091.TException;
import libthrift091.async.AsyncMethodCallback;
import libthrift091.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-6-23")
public class PutMessageRequest implements libthrift091.TBase<PutMessageRequest, PutMessageRequest._Fields>, java.io.Serializable, Cloneable, Comparable<PutMessageRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("PutMessageRequest");

  private static final libthrift091.protocol.TField TOPIC_AND_PARTITION_FIELD_DESC = new libthrift091.protocol.TField("topicAndPartition", libthrift091.protocol.TType.STRUCT, (short)1);
  private static final libthrift091.protocol.TField MESSAGE_BLOCKS_FIELD_DESC = new libthrift091.protocol.TField("messageBlocks", libthrift091.protocol.TType.LIST, (short)2);
  private static final libthrift091.protocol.TField MESSAGE_NUMBER_FIELD_DESC = new libthrift091.protocol.TField("messageNumber", libthrift091.protocol.TType.I32, (short)3);
  private static final libthrift091.protocol.TField SEQUENCE_ID_FIELD_DESC = new libthrift091.protocol.TField("sequenceId", libthrift091.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PutMessageRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PutMessageRequestTupleSchemeFactory());
  }

  /**
   * TopicAndPartititon for the messages to put;
   * 
   */
  public com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition topicAndPartition; // required
  /**
   * The message list to put, the talos producer should make sure all the messages
   * in the list have the same partitionId with topicAndParititon.partitionId;
   * 
   */
  public List<MessageBlock> messageBlocks; // required
  /**
   * total messageNumber for this messageBlocks;
   * 
   */
  public int messageNumber; // required
  /**
   * The unique identifier for this PutMessageRequest, should in format
   * client_id#sequence_id;
   * 
   */
  public String sequenceId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * TopicAndPartititon for the messages to put;
     * 
     */
    TOPIC_AND_PARTITION((short)1, "topicAndPartition"),
    /**
     * The message list to put, the talos producer should make sure all the messages
     * in the list have the same partitionId with topicAndParititon.partitionId;
     * 
     */
    MESSAGE_BLOCKS((short)2, "messageBlocks"),
    /**
     * total messageNumber for this messageBlocks;
     * 
     */
    MESSAGE_NUMBER((short)3, "messageNumber"),
    /**
     * The unique identifier for this PutMessageRequest, should in format
     * client_id#sequence_id;
     * 
     */
    SEQUENCE_ID((short)4, "sequenceId");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TOPIC_AND_PARTITION
          return TOPIC_AND_PARTITION;
        case 2: // MESSAGE_BLOCKS
          return MESSAGE_BLOCKS;
        case 3: // MESSAGE_NUMBER
          return MESSAGE_NUMBER;
        case 4: // SEQUENCE_ID
          return SEQUENCE_ID;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __MESSAGENUMBER_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOPIC_AND_PARTITION, new libthrift091.meta_data.FieldMetaData("topicAndPartition", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition.class)));
    tmpMap.put(_Fields.MESSAGE_BLOCKS, new libthrift091.meta_data.FieldMetaData("messageBlocks", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, MessageBlock.class))));
    tmpMap.put(_Fields.MESSAGE_NUMBER, new libthrift091.meta_data.FieldMetaData("messageNumber", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.SEQUENCE_ID, new libthrift091.meta_data.FieldMetaData("sequenceId", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(PutMessageRequest.class, metaDataMap);
  }

  public PutMessageRequest() {
  }

  public PutMessageRequest(
    com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition topicAndPartition,
    List<MessageBlock> messageBlocks,
    int messageNumber,
    String sequenceId)
  {
    this();
    this.topicAndPartition = topicAndPartition;
    this.messageBlocks = messageBlocks;
    this.messageNumber = messageNumber;
    setMessageNumberIsSet(true);
    this.sequenceId = sequenceId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PutMessageRequest(PutMessageRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTopicAndPartition()) {
      this.topicAndPartition = new com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition(other.topicAndPartition);
    }
    if (other.isSetMessageBlocks()) {
      List<MessageBlock> __this__messageBlocks = new ArrayList<MessageBlock>(other.messageBlocks.size());
      for (MessageBlock other_element : other.messageBlocks) {
        __this__messageBlocks.add(new MessageBlock(other_element));
      }
      this.messageBlocks = __this__messageBlocks;
    }
    this.messageNumber = other.messageNumber;
    if (other.isSetSequenceId()) {
      this.sequenceId = other.sequenceId;
    }
  }

  public PutMessageRequest deepCopy() {
    return new PutMessageRequest(this);
  }

  @Override
  public void clear() {
    this.topicAndPartition = null;
    this.messageBlocks = null;
    setMessageNumberIsSet(false);
    this.messageNumber = 0;
    this.sequenceId = null;
  }

  /**
   * TopicAndPartititon for the messages to put;
   * 
   */
  public com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition getTopicAndPartition() {
    return this.topicAndPartition;
  }

  /**
   * TopicAndPartititon for the messages to put;
   * 
   */
  public PutMessageRequest setTopicAndPartition(com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition topicAndPartition) {
    this.topicAndPartition = topicAndPartition;
    return this;
  }

  public void unsetTopicAndPartition() {
    this.topicAndPartition = null;
  }

  /** Returns true if field topicAndPartition is set (has been assigned a value) and false otherwise */
  public boolean isSetTopicAndPartition() {
    return this.topicAndPartition != null;
  }

  public void setTopicAndPartitionIsSet(boolean value) {
    if (!value) {
      this.topicAndPartition = null;
    }
  }

  public int getMessageBlocksSize() {
    return (this.messageBlocks == null) ? 0 : this.messageBlocks.size();
  }

  public java.util.Iterator<MessageBlock> getMessageBlocksIterator() {
    return (this.messageBlocks == null) ? null : this.messageBlocks.iterator();
  }

  public void addToMessageBlocks(MessageBlock elem) {
    if (this.messageBlocks == null) {
      this.messageBlocks = new ArrayList<MessageBlock>();
    }
    this.messageBlocks.add(elem);
  }

  /**
   * The message list to put, the talos producer should make sure all the messages
   * in the list have the same partitionId with topicAndParititon.partitionId;
   * 
   */
  public List<MessageBlock> getMessageBlocks() {
    return this.messageBlocks;
  }

  /**
   * The message list to put, the talos producer should make sure all the messages
   * in the list have the same partitionId with topicAndParititon.partitionId;
   * 
   */
  public PutMessageRequest setMessageBlocks(List<MessageBlock> messageBlocks) {
    this.messageBlocks = messageBlocks;
    return this;
  }

  public void unsetMessageBlocks() {
    this.messageBlocks = null;
  }

  /** Returns true if field messageBlocks is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageBlocks() {
    return this.messageBlocks != null;
  }

  public void setMessageBlocksIsSet(boolean value) {
    if (!value) {
      this.messageBlocks = null;
    }
  }

  /**
   * total messageNumber for this messageBlocks;
   * 
   */
  public int getMessageNumber() {
    return this.messageNumber;
  }

  /**
   * total messageNumber for this messageBlocks;
   * 
   */
  public PutMessageRequest setMessageNumber(int messageNumber) {
    this.messageNumber = messageNumber;
    setMessageNumberIsSet(true);
    return this;
  }

  public void unsetMessageNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MESSAGENUMBER_ISSET_ID);
  }

  /** Returns true if field messageNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __MESSAGENUMBER_ISSET_ID);
  }

  public void setMessageNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MESSAGENUMBER_ISSET_ID, value);
  }

  /**
   * The unique identifier for this PutMessageRequest, should in format
   * client_id#sequence_id;
   * 
   */
  public String getSequenceId() {
    return this.sequenceId;
  }

  /**
   * The unique identifier for this PutMessageRequest, should in format
   * client_id#sequence_id;
   * 
   */
  public PutMessageRequest setSequenceId(String sequenceId) {
    this.sequenceId = sequenceId;
    return this;
  }

  public void unsetSequenceId() {
    this.sequenceId = null;
  }

  /** Returns true if field sequenceId is set (has been assigned a value) and false otherwise */
  public boolean isSetSequenceId() {
    return this.sequenceId != null;
  }

  public void setSequenceIdIsSet(boolean value) {
    if (!value) {
      this.sequenceId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOPIC_AND_PARTITION:
      if (value == null) {
        unsetTopicAndPartition();
      } else {
        setTopicAndPartition((com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition)value);
      }
      break;

    case MESSAGE_BLOCKS:
      if (value == null) {
        unsetMessageBlocks();
      } else {
        setMessageBlocks((List<MessageBlock>)value);
      }
      break;

    case MESSAGE_NUMBER:
      if (value == null) {
        unsetMessageNumber();
      } else {
        setMessageNumber((Integer)value);
      }
      break;

    case SEQUENCE_ID:
      if (value == null) {
        unsetSequenceId();
      } else {
        setSequenceId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOPIC_AND_PARTITION:
      return getTopicAndPartition();

    case MESSAGE_BLOCKS:
      return getMessageBlocks();

    case MESSAGE_NUMBER:
      return Integer.valueOf(getMessageNumber());

    case SEQUENCE_ID:
      return getSequenceId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOPIC_AND_PARTITION:
      return isSetTopicAndPartition();
    case MESSAGE_BLOCKS:
      return isSetMessageBlocks();
    case MESSAGE_NUMBER:
      return isSetMessageNumber();
    case SEQUENCE_ID:
      return isSetSequenceId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PutMessageRequest)
      return this.equals((PutMessageRequest)that);
    return false;
  }

  public boolean equals(PutMessageRequest that) {
    if (that == null)
      return false;

    boolean this_present_topicAndPartition = true && this.isSetTopicAndPartition();
    boolean that_present_topicAndPartition = true && that.isSetTopicAndPartition();
    if (this_present_topicAndPartition || that_present_topicAndPartition) {
      if (!(this_present_topicAndPartition && that_present_topicAndPartition))
        return false;
      if (!this.topicAndPartition.equals(that.topicAndPartition))
        return false;
    }

    boolean this_present_messageBlocks = true && this.isSetMessageBlocks();
    boolean that_present_messageBlocks = true && that.isSetMessageBlocks();
    if (this_present_messageBlocks || that_present_messageBlocks) {
      if (!(this_present_messageBlocks && that_present_messageBlocks))
        return false;
      if (!this.messageBlocks.equals(that.messageBlocks))
        return false;
    }

    boolean this_present_messageNumber = true;
    boolean that_present_messageNumber = true;
    if (this_present_messageNumber || that_present_messageNumber) {
      if (!(this_present_messageNumber && that_present_messageNumber))
        return false;
      if (this.messageNumber != that.messageNumber)
        return false;
    }

    boolean this_present_sequenceId = true && this.isSetSequenceId();
    boolean that_present_sequenceId = true && that.isSetSequenceId();
    if (this_present_sequenceId || that_present_sequenceId) {
      if (!(this_present_sequenceId && that_present_sequenceId))
        return false;
      if (!this.sequenceId.equals(that.sequenceId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_topicAndPartition = true && (isSetTopicAndPartition());
    list.add(present_topicAndPartition);
    if (present_topicAndPartition)
      list.add(topicAndPartition);

    boolean present_messageBlocks = true && (isSetMessageBlocks());
    list.add(present_messageBlocks);
    if (present_messageBlocks)
      list.add(messageBlocks);

    boolean present_messageNumber = true;
    list.add(present_messageNumber);
    if (present_messageNumber)
      list.add(messageNumber);

    boolean present_sequenceId = true && (isSetSequenceId());
    list.add(present_sequenceId);
    if (present_sequenceId)
      list.add(sequenceId);

    return list.hashCode();
  }

  @Override
  public int compareTo(PutMessageRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTopicAndPartition()).compareTo(other.isSetTopicAndPartition());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopicAndPartition()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.topicAndPartition, other.topicAndPartition);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessageBlocks()).compareTo(other.isSetMessageBlocks());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageBlocks()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.messageBlocks, other.messageBlocks);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessageNumber()).compareTo(other.isSetMessageNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageNumber()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.messageNumber, other.messageNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSequenceId()).compareTo(other.isSetSequenceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSequenceId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.sequenceId, other.sequenceId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(libthrift091.protocol.TProtocol iprot) throws libthrift091.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(libthrift091.protocol.TProtocol oprot) throws libthrift091.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("PutMessageRequest(");
    boolean first = true;

    sb.append("topicAndPartition:");
    if (this.topicAndPartition == null) {
      sb.append("null");
    } else {
      sb.append(this.topicAndPartition);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("messageBlocks:");
    if (this.messageBlocks == null) {
      sb.append("null");
    } else {
      sb.append(this.messageBlocks);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("messageNumber:");
    sb.append(this.messageNumber);
    first = false;
    if (!first) sb.append(", ");
    sb.append("sequenceId:");
    if (this.sequenceId == null) {
      sb.append("null");
    } else {
      sb.append(this.sequenceId);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (topicAndPartition == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'topicAndPartition' was not present! Struct: " + toString());
    }
    if (messageBlocks == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'messageBlocks' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'messageNumber' because it's a primitive and you chose the non-beans generator.
    if (sequenceId == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'sequenceId' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (topicAndPartition != null) {
      topicAndPartition.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(out)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PutMessageRequestStandardSchemeFactory implements SchemeFactory {
    public PutMessageRequestStandardScheme getScheme() {
      return new PutMessageRequestStandardScheme();
    }
  }

  private static class PutMessageRequestStandardScheme extends StandardScheme<PutMessageRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, PutMessageRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOPIC_AND_PARTITION
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.topicAndPartition = new com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition();
              struct.topicAndPartition.read(iprot);
              struct.setTopicAndPartitionIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MESSAGE_BLOCKS
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list0 = iprot.readListBegin();
                struct.messageBlocks = new ArrayList<MessageBlock>(_list0.size);
                MessageBlock _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new MessageBlock();
                  _elem1.read(iprot);
                  struct.messageBlocks.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setMessageBlocksIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MESSAGE_NUMBER
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.messageNumber = iprot.readI32();
              struct.setMessageNumberIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SEQUENCE_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.sequenceId = iprot.readString();
              struct.setSequenceIdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetMessageNumber()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'messageNumber' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, PutMessageRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.topicAndPartition != null) {
        oprot.writeFieldBegin(TOPIC_AND_PARTITION_FIELD_DESC);
        struct.topicAndPartition.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.messageBlocks != null) {
        oprot.writeFieldBegin(MESSAGE_BLOCKS_FIELD_DESC);
        {
          oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, struct.messageBlocks.size()));
          for (MessageBlock _iter3 : struct.messageBlocks)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(MESSAGE_NUMBER_FIELD_DESC);
      oprot.writeI32(struct.messageNumber);
      oprot.writeFieldEnd();
      if (struct.sequenceId != null) {
        oprot.writeFieldBegin(SEQUENCE_ID_FIELD_DESC);
        oprot.writeString(struct.sequenceId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PutMessageRequestTupleSchemeFactory implements SchemeFactory {
    public PutMessageRequestTupleScheme getScheme() {
      return new PutMessageRequestTupleScheme();
    }
  }

  private static class PutMessageRequestTupleScheme extends TupleScheme<PutMessageRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, PutMessageRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.topicAndPartition.write(oprot);
      {
        oprot.writeI32(struct.messageBlocks.size());
        for (MessageBlock _iter4 : struct.messageBlocks)
        {
          _iter4.write(oprot);
        }
      }
      oprot.writeI32(struct.messageNumber);
      oprot.writeString(struct.sequenceId);
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, PutMessageRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.topicAndPartition = new com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition();
      struct.topicAndPartition.read(iprot);
      struct.setTopicAndPartitionIsSet(true);
      {
        libthrift091.protocol.TList _list5 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, iprot.readI32());
        struct.messageBlocks = new ArrayList<MessageBlock>(_list5.size);
        MessageBlock _elem6;
        for (int _i7 = 0; _i7 < _list5.size; ++_i7)
        {
          _elem6 = new MessageBlock();
          _elem6.read(iprot);
          struct.messageBlocks.add(_elem6);
        }
      }
      struct.setMessageBlocksIsSet(true);
      struct.messageNumber = iprot.readI32();
      struct.setMessageNumberIsSet(true);
      struct.sequenceId = iprot.readString();
      struct.setSequenceIdIsSet(true);
    }
  }

}

