/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.sds.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-3-25")
public class ConsumedOffset implements libthrift091.TBase<ConsumedOffset, ConsumedOffset._Fields>, java.io.Serializable, Cloneable, Comparable<ConsumedOffset> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("ConsumedOffset");

  private static final libthrift091.protocol.TField CONSUMED_DATA_OFFSET_FIELD_DESC = new libthrift091.protocol.TField("consumedDataOffset", libthrift091.protocol.TType.MAP, (short)1);
  private static final libthrift091.protocol.TField DATA_CONSUME_FINISHED_FIELD_DESC = new libthrift091.protocol.TField("dataConsumeFinished", libthrift091.protocol.TType.BOOL, (short)2);
  private static final libthrift091.protocol.TField CONSUMED_EDIT_OFFSET_FIELD_DESC = new libthrift091.protocol.TField("consumedEditOffset", libthrift091.protocol.TType.I64, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ConsumedOffsetStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ConsumedOffsetTupleSchemeFactory());
  }

  /**
   * 当前存量数据的消费偏移
   */
  public Map<String,Datum> consumedDataOffset; // optional
  /**
   * 存量数据是否消费完毕
   */
  public boolean dataConsumeFinished; // optional
  /**
   * 当前增量数据的消费偏移
   */
  public long consumedEditOffset; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 当前存量数据的消费偏移
     */
    CONSUMED_DATA_OFFSET((short)1, "consumedDataOffset"),
    /**
     * 存量数据是否消费完毕
     */
    DATA_CONSUME_FINISHED((short)2, "dataConsumeFinished"),
    /**
     * 当前增量数据的消费偏移
     */
    CONSUMED_EDIT_OFFSET((short)3, "consumedEditOffset");

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
        case 1: // CONSUMED_DATA_OFFSET
          return CONSUMED_DATA_OFFSET;
        case 2: // DATA_CONSUME_FINISHED
          return DATA_CONSUME_FINISHED;
        case 3: // CONSUMED_EDIT_OFFSET
          return CONSUMED_EDIT_OFFSET;
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
  private static final int __DATACONSUMEFINISHED_ISSET_ID = 0;
  private static final int __CONSUMEDEDITOFFSET_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.CONSUMED_DATA_OFFSET,_Fields.DATA_CONSUME_FINISHED,_Fields.CONSUMED_EDIT_OFFSET};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CONSUMED_DATA_OFFSET, new libthrift091.meta_data.FieldMetaData("consumedDataOffset", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.MAP        , "Dictionary")));
    tmpMap.put(_Fields.DATA_CONSUME_FINISHED, new libthrift091.meta_data.FieldMetaData("dataConsumeFinished", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.BOOL)));
    tmpMap.put(_Fields.CONSUMED_EDIT_OFFSET, new libthrift091.meta_data.FieldMetaData("consumedEditOffset", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(ConsumedOffset.class, metaDataMap);
  }

  public ConsumedOffset() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ConsumedOffset(ConsumedOffset other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetConsumedDataOffset()) {
      this.consumedDataOffset = other.consumedDataOffset;
    }
    this.dataConsumeFinished = other.dataConsumeFinished;
    this.consumedEditOffset = other.consumedEditOffset;
  }

  public ConsumedOffset deepCopy() {
    return new ConsumedOffset(this);
  }

  @Override
  public void clear() {
    this.consumedDataOffset = null;
    setDataConsumeFinishedIsSet(false);
    this.dataConsumeFinished = false;
    setConsumedEditOffsetIsSet(false);
    this.consumedEditOffset = 0;
  }

  public int getConsumedDataOffsetSize() {
    return (this.consumedDataOffset == null) ? 0 : this.consumedDataOffset.size();
  }

  public void putToConsumedDataOffset(String key, Datum val) {
    if (this.consumedDataOffset == null) {
      this.consumedDataOffset = new HashMap<String,Datum>();
    }
    this.consumedDataOffset.put(key, val);
  }

  /**
   * 当前存量数据的消费偏移
   */
  public Map<String,Datum> getConsumedDataOffset() {
    return this.consumedDataOffset;
  }

  /**
   * 当前存量数据的消费偏移
   */
  public ConsumedOffset setConsumedDataOffset(Map<String,Datum> consumedDataOffset) {
    this.consumedDataOffset = consumedDataOffset;
    return this;
  }

  public void unsetConsumedDataOffset() {
    this.consumedDataOffset = null;
  }

  /** Returns true if field consumedDataOffset is set (has been assigned a value) and false otherwise */
  public boolean isSetConsumedDataOffset() {
    return this.consumedDataOffset != null;
  }

  public void setConsumedDataOffsetIsSet(boolean value) {
    if (!value) {
      this.consumedDataOffset = null;
    }
  }

  /**
   * 存量数据是否消费完毕
   */
  public boolean isDataConsumeFinished() {
    return this.dataConsumeFinished;
  }

  /**
   * 存量数据是否消费完毕
   */
  public ConsumedOffset setDataConsumeFinished(boolean dataConsumeFinished) {
    this.dataConsumeFinished = dataConsumeFinished;
    setDataConsumeFinishedIsSet(true);
    return this;
  }

  public void unsetDataConsumeFinished() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DATACONSUMEFINISHED_ISSET_ID);
  }

  /** Returns true if field dataConsumeFinished is set (has been assigned a value) and false otherwise */
  public boolean isSetDataConsumeFinished() {
    return EncodingUtils.testBit(__isset_bitfield, __DATACONSUMEFINISHED_ISSET_ID);
  }

  public void setDataConsumeFinishedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DATACONSUMEFINISHED_ISSET_ID, value);
  }

  /**
   * 当前增量数据的消费偏移
   */
  public long getConsumedEditOffset() {
    return this.consumedEditOffset;
  }

  /**
   * 当前增量数据的消费偏移
   */
  public ConsumedOffset setConsumedEditOffset(long consumedEditOffset) {
    this.consumedEditOffset = consumedEditOffset;
    setConsumedEditOffsetIsSet(true);
    return this;
  }

  public void unsetConsumedEditOffset() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CONSUMEDEDITOFFSET_ISSET_ID);
  }

  /** Returns true if field consumedEditOffset is set (has been assigned a value) and false otherwise */
  public boolean isSetConsumedEditOffset() {
    return EncodingUtils.testBit(__isset_bitfield, __CONSUMEDEDITOFFSET_ISSET_ID);
  }

  public void setConsumedEditOffsetIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CONSUMEDEDITOFFSET_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CONSUMED_DATA_OFFSET:
      if (value == null) {
        unsetConsumedDataOffset();
      } else {
        setConsumedDataOffset((Map<String,Datum>)value);
      }
      break;

    case DATA_CONSUME_FINISHED:
      if (value == null) {
        unsetDataConsumeFinished();
      } else {
        setDataConsumeFinished((Boolean)value);
      }
      break;

    case CONSUMED_EDIT_OFFSET:
      if (value == null) {
        unsetConsumedEditOffset();
      } else {
        setConsumedEditOffset((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CONSUMED_DATA_OFFSET:
      return getConsumedDataOffset();

    case DATA_CONSUME_FINISHED:
      return Boolean.valueOf(isDataConsumeFinished());

    case CONSUMED_EDIT_OFFSET:
      return Long.valueOf(getConsumedEditOffset());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CONSUMED_DATA_OFFSET:
      return isSetConsumedDataOffset();
    case DATA_CONSUME_FINISHED:
      return isSetDataConsumeFinished();
    case CONSUMED_EDIT_OFFSET:
      return isSetConsumedEditOffset();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ConsumedOffset)
      return this.equals((ConsumedOffset)that);
    return false;
  }

  public boolean equals(ConsumedOffset that) {
    if (that == null)
      return false;

    boolean this_present_consumedDataOffset = true && this.isSetConsumedDataOffset();
    boolean that_present_consumedDataOffset = true && that.isSetConsumedDataOffset();
    if (this_present_consumedDataOffset || that_present_consumedDataOffset) {
      if (!(this_present_consumedDataOffset && that_present_consumedDataOffset))
        return false;
      if (!this.consumedDataOffset.equals(that.consumedDataOffset))
        return false;
    }

    boolean this_present_dataConsumeFinished = true && this.isSetDataConsumeFinished();
    boolean that_present_dataConsumeFinished = true && that.isSetDataConsumeFinished();
    if (this_present_dataConsumeFinished || that_present_dataConsumeFinished) {
      if (!(this_present_dataConsumeFinished && that_present_dataConsumeFinished))
        return false;
      if (this.dataConsumeFinished != that.dataConsumeFinished)
        return false;
    }

    boolean this_present_consumedEditOffset = true && this.isSetConsumedEditOffset();
    boolean that_present_consumedEditOffset = true && that.isSetConsumedEditOffset();
    if (this_present_consumedEditOffset || that_present_consumedEditOffset) {
      if (!(this_present_consumedEditOffset && that_present_consumedEditOffset))
        return false;
      if (this.consumedEditOffset != that.consumedEditOffset)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_consumedDataOffset = true && (isSetConsumedDataOffset());
    list.add(present_consumedDataOffset);
    if (present_consumedDataOffset)
      list.add(consumedDataOffset);

    boolean present_dataConsumeFinished = true && (isSetDataConsumeFinished());
    list.add(present_dataConsumeFinished);
    if (present_dataConsumeFinished)
      list.add(dataConsumeFinished);

    boolean present_consumedEditOffset = true && (isSetConsumedEditOffset());
    list.add(present_consumedEditOffset);
    if (present_consumedEditOffset)
      list.add(consumedEditOffset);

    return list.hashCode();
  }

  @Override
  public int compareTo(ConsumedOffset other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetConsumedDataOffset()).compareTo(other.isSetConsumedDataOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConsumedDataOffset()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.consumedDataOffset, other.consumedDataOffset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDataConsumeFinished()).compareTo(other.isSetDataConsumeFinished());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDataConsumeFinished()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.dataConsumeFinished, other.dataConsumeFinished);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetConsumedEditOffset()).compareTo(other.isSetConsumedEditOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConsumedEditOffset()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.consumedEditOffset, other.consumedEditOffset);
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
    StringBuilder sb = new StringBuilder("ConsumedOffset(");
    boolean first = true;

    if (isSetConsumedDataOffset()) {
      sb.append("consumedDataOffset:");
      if (this.consumedDataOffset == null) {
        sb.append("null");
      } else {
        sb.append(this.consumedDataOffset);
      }
      first = false;
    }
    if (isSetDataConsumeFinished()) {
      if (!first) sb.append(", ");
      sb.append("dataConsumeFinished:");
      sb.append(this.dataConsumeFinished);
      first = false;
    }
    if (isSetConsumedEditOffset()) {
      if (!first) sb.append(", ");
      sb.append("consumedEditOffset:");
      sb.append(this.consumedEditOffset);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    // check for sub-struct validity
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

  private static class ConsumedOffsetStandardSchemeFactory implements SchemeFactory {
    public ConsumedOffsetStandardScheme getScheme() {
      return new ConsumedOffsetStandardScheme();
    }
  }

  private static class ConsumedOffsetStandardScheme extends StandardScheme<ConsumedOffset> {

    public void read(libthrift091.protocol.TProtocol iprot, ConsumedOffset struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CONSUMED_DATA_OFFSET
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map426 = iprot.readMapBegin();
                struct.consumedDataOffset = new HashMap<String,Datum>(2*_map426.size);
                String _key427;
                Datum _val428;
                for (int _i429 = 0; _i429 < _map426.size; ++_i429)
                {
                  _key427 = iprot.readString();
                  _val428 = new Datum();
                  _val428.read(iprot);
                  struct.consumedDataOffset.put(_key427, _val428);
                }
                iprot.readMapEnd();
              }
              struct.setConsumedDataOffsetIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DATA_CONSUME_FINISHED
            if (schemeField.type == libthrift091.protocol.TType.BOOL) {
              struct.dataConsumeFinished = iprot.readBool();
              struct.setDataConsumeFinishedIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CONSUMED_EDIT_OFFSET
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.consumedEditOffset = iprot.readI64();
              struct.setConsumedEditOffsetIsSet(true);
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
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, ConsumedOffset struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.consumedDataOffset != null) {
        if (struct.isSetConsumedDataOffset()) {
          oprot.writeFieldBegin(CONSUMED_DATA_OFFSET_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, struct.consumedDataOffset.size()));
            for (Map.Entry<String, Datum> _iter430 : struct.consumedDataOffset.entrySet())
            {
              oprot.writeString(_iter430.getKey());
              _iter430.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetDataConsumeFinished()) {
        oprot.writeFieldBegin(DATA_CONSUME_FINISHED_FIELD_DESC);
        oprot.writeBool(struct.dataConsumeFinished);
        oprot.writeFieldEnd();
      }
      if (struct.isSetConsumedEditOffset()) {
        oprot.writeFieldBegin(CONSUMED_EDIT_OFFSET_FIELD_DESC);
        oprot.writeI64(struct.consumedEditOffset);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ConsumedOffsetTupleSchemeFactory implements SchemeFactory {
    public ConsumedOffsetTupleScheme getScheme() {
      return new ConsumedOffsetTupleScheme();
    }
  }

  private static class ConsumedOffsetTupleScheme extends TupleScheme<ConsumedOffset> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, ConsumedOffset struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetConsumedDataOffset()) {
        optionals.set(0);
      }
      if (struct.isSetDataConsumeFinished()) {
        optionals.set(1);
      }
      if (struct.isSetConsumedEditOffset()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetConsumedDataOffset()) {
        {
          oprot.writeI32(struct.consumedDataOffset.size());
          for (Map.Entry<String, Datum> _iter431 : struct.consumedDataOffset.entrySet())
          {
            oprot.writeString(_iter431.getKey());
            _iter431.getValue().write(oprot);
          }
        }
      }
      if (struct.isSetDataConsumeFinished()) {
        oprot.writeBool(struct.dataConsumeFinished);
      }
      if (struct.isSetConsumedEditOffset()) {
        oprot.writeI64(struct.consumedEditOffset);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, ConsumedOffset struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        {
          libthrift091.protocol.TMap _map432 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.consumedDataOffset = new HashMap<String,Datum>(2*_map432.size);
          String _key433;
          Datum _val434;
          for (int _i435 = 0; _i435 < _map432.size; ++_i435)
          {
            _key433 = iprot.readString();
            _val434 = new Datum();
            _val434.read(iprot);
            struct.consumedDataOffset.put(_key433, _val434);
          }
        }
        struct.setConsumedDataOffsetIsSet(true);
      }
      if (incoming.get(1)) {
        struct.dataConsumeFinished = iprot.readBool();
        struct.setDataConsumeFinishedIsSet(true);
      }
      if (incoming.get(2)) {
        struct.consumedEditOffset = iprot.readI64();
        struct.setConsumedEditOffsetIsSet(true);
      }
    }
  }

}

