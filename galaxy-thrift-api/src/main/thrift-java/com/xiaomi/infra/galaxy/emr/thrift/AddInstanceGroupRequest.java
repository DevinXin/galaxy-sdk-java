/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.emr.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-1-12")
public class AddInstanceGroupRequest implements libthrift091.TBase<AddInstanceGroupRequest, AddInstanceGroupRequest._Fields>, java.io.Serializable, Cloneable, Comparable<AddInstanceGroupRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("AddInstanceGroupRequest");

  private static final libthrift091.protocol.TField NAME_FIELD_DESC = new libthrift091.protocol.TField("name", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField CLUSTER_ID_FIELD_DESC = new libthrift091.protocol.TField("clusterId", libthrift091.protocol.TType.STRING, (short)2);
  private static final libthrift091.protocol.TField ROLE_FIELD_DESC = new libthrift091.protocol.TField("role", libthrift091.protocol.TType.I32, (short)3);
  private static final libthrift091.protocol.TField INSTANCE_TYPE_FIELD_DESC = new libthrift091.protocol.TField("instanceType", libthrift091.protocol.TType.STRING, (short)4);
  private static final libthrift091.protocol.TField REQUESTED_INSTANCE_COUNT_FIELD_DESC = new libthrift091.protocol.TField("requestedInstanceCount", libthrift091.protocol.TType.I32, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AddInstanceGroupRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AddInstanceGroupRequestTupleSchemeFactory());
  }

  public String name; // required
  public String clusterId; // optional
  /**
   * 
   * @see InstanceGroupRole
   */
  public InstanceGroupRole role; // optional
  public String instanceType; // optional
  public int requestedInstanceCount; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    NAME((short)1, "name"),
    CLUSTER_ID((short)2, "clusterId"),
    /**
     * 
     * @see InstanceGroupRole
     */
    ROLE((short)3, "role"),
    INSTANCE_TYPE((short)4, "instanceType"),
    REQUESTED_INSTANCE_COUNT((short)5, "requestedInstanceCount");

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
        case 1: // NAME
          return NAME;
        case 2: // CLUSTER_ID
          return CLUSTER_ID;
        case 3: // ROLE
          return ROLE;
        case 4: // INSTANCE_TYPE
          return INSTANCE_TYPE;
        case 5: // REQUESTED_INSTANCE_COUNT
          return REQUESTED_INSTANCE_COUNT;
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
  private static final int __REQUESTEDINSTANCECOUNT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.CLUSTER_ID,_Fields.ROLE,_Fields.INSTANCE_TYPE,_Fields.REQUESTED_INSTANCE_COUNT};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new libthrift091.meta_data.FieldMetaData("name", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.CLUSTER_ID, new libthrift091.meta_data.FieldMetaData("clusterId", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.ROLE, new libthrift091.meta_data.FieldMetaData("role", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, InstanceGroupRole.class)));
    tmpMap.put(_Fields.INSTANCE_TYPE, new libthrift091.meta_data.FieldMetaData("instanceType", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.REQUESTED_INSTANCE_COUNT, new libthrift091.meta_data.FieldMetaData("requestedInstanceCount", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(AddInstanceGroupRequest.class, metaDataMap);
  }

  public AddInstanceGroupRequest() {
  }

  public AddInstanceGroupRequest(
    String name)
  {
    this();
    this.name = name;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AddInstanceGroupRequest(AddInstanceGroupRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetClusterId()) {
      this.clusterId = other.clusterId;
    }
    if (other.isSetRole()) {
      this.role = other.role;
    }
    if (other.isSetInstanceType()) {
      this.instanceType = other.instanceType;
    }
    this.requestedInstanceCount = other.requestedInstanceCount;
  }

  public AddInstanceGroupRequest deepCopy() {
    return new AddInstanceGroupRequest(this);
  }

  @Override
  public void clear() {
    this.name = null;
    this.clusterId = null;
    this.role = null;
    this.instanceType = null;
    setRequestedInstanceCountIsSet(false);
    this.requestedInstanceCount = 0;
  }

  public String getName() {
    return this.name;
  }

  public AddInstanceGroupRequest setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getClusterId() {
    return this.clusterId;
  }

  public AddInstanceGroupRequest setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public void unsetClusterId() {
    this.clusterId = null;
  }

  /** Returns true if field clusterId is set (has been assigned a value) and false otherwise */
  public boolean isSetClusterId() {
    return this.clusterId != null;
  }

  public void setClusterIdIsSet(boolean value) {
    if (!value) {
      this.clusterId = null;
    }
  }

  /**
   * 
   * @see InstanceGroupRole
   */
  public InstanceGroupRole getRole() {
    return this.role;
  }

  /**
   * 
   * @see InstanceGroupRole
   */
  public AddInstanceGroupRequest setRole(InstanceGroupRole role) {
    this.role = role;
    return this;
  }

  public void unsetRole() {
    this.role = null;
  }

  /** Returns true if field role is set (has been assigned a value) and false otherwise */
  public boolean isSetRole() {
    return this.role != null;
  }

  public void setRoleIsSet(boolean value) {
    if (!value) {
      this.role = null;
    }
  }

  public String getInstanceType() {
    return this.instanceType;
  }

  public AddInstanceGroupRequest setInstanceType(String instanceType) {
    this.instanceType = instanceType;
    return this;
  }

  public void unsetInstanceType() {
    this.instanceType = null;
  }

  /** Returns true if field instanceType is set (has been assigned a value) and false otherwise */
  public boolean isSetInstanceType() {
    return this.instanceType != null;
  }

  public void setInstanceTypeIsSet(boolean value) {
    if (!value) {
      this.instanceType = null;
    }
  }

  public int getRequestedInstanceCount() {
    return this.requestedInstanceCount;
  }

  public AddInstanceGroupRequest setRequestedInstanceCount(int requestedInstanceCount) {
    this.requestedInstanceCount = requestedInstanceCount;
    setRequestedInstanceCountIsSet(true);
    return this;
  }

  public void unsetRequestedInstanceCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __REQUESTEDINSTANCECOUNT_ISSET_ID);
  }

  /** Returns true if field requestedInstanceCount is set (has been assigned a value) and false otherwise */
  public boolean isSetRequestedInstanceCount() {
    return EncodingUtils.testBit(__isset_bitfield, __REQUESTEDINSTANCECOUNT_ISSET_ID);
  }

  public void setRequestedInstanceCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __REQUESTEDINSTANCECOUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case CLUSTER_ID:
      if (value == null) {
        unsetClusterId();
      } else {
        setClusterId((String)value);
      }
      break;

    case ROLE:
      if (value == null) {
        unsetRole();
      } else {
        setRole((InstanceGroupRole)value);
      }
      break;

    case INSTANCE_TYPE:
      if (value == null) {
        unsetInstanceType();
      } else {
        setInstanceType((String)value);
      }
      break;

    case REQUESTED_INSTANCE_COUNT:
      if (value == null) {
        unsetRequestedInstanceCount();
      } else {
        setRequestedInstanceCount((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case CLUSTER_ID:
      return getClusterId();

    case ROLE:
      return getRole();

    case INSTANCE_TYPE:
      return getInstanceType();

    case REQUESTED_INSTANCE_COUNT:
      return Integer.valueOf(getRequestedInstanceCount());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case CLUSTER_ID:
      return isSetClusterId();
    case ROLE:
      return isSetRole();
    case INSTANCE_TYPE:
      return isSetInstanceType();
    case REQUESTED_INSTANCE_COUNT:
      return isSetRequestedInstanceCount();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AddInstanceGroupRequest)
      return this.equals((AddInstanceGroupRequest)that);
    return false;
  }

  public boolean equals(AddInstanceGroupRequest that) {
    if (that == null)
      return false;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_clusterId = true && this.isSetClusterId();
    boolean that_present_clusterId = true && that.isSetClusterId();
    if (this_present_clusterId || that_present_clusterId) {
      if (!(this_present_clusterId && that_present_clusterId))
        return false;
      if (!this.clusterId.equals(that.clusterId))
        return false;
    }

    boolean this_present_role = true && this.isSetRole();
    boolean that_present_role = true && that.isSetRole();
    if (this_present_role || that_present_role) {
      if (!(this_present_role && that_present_role))
        return false;
      if (!this.role.equals(that.role))
        return false;
    }

    boolean this_present_instanceType = true && this.isSetInstanceType();
    boolean that_present_instanceType = true && that.isSetInstanceType();
    if (this_present_instanceType || that_present_instanceType) {
      if (!(this_present_instanceType && that_present_instanceType))
        return false;
      if (!this.instanceType.equals(that.instanceType))
        return false;
    }

    boolean this_present_requestedInstanceCount = true && this.isSetRequestedInstanceCount();
    boolean that_present_requestedInstanceCount = true && that.isSetRequestedInstanceCount();
    if (this_present_requestedInstanceCount || that_present_requestedInstanceCount) {
      if (!(this_present_requestedInstanceCount && that_present_requestedInstanceCount))
        return false;
      if (this.requestedInstanceCount != that.requestedInstanceCount)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_name = true && (isSetName());
    list.add(present_name);
    if (present_name)
      list.add(name);

    boolean present_clusterId = true && (isSetClusterId());
    list.add(present_clusterId);
    if (present_clusterId)
      list.add(clusterId);

    boolean present_role = true && (isSetRole());
    list.add(present_role);
    if (present_role)
      list.add(role.getValue());

    boolean present_instanceType = true && (isSetInstanceType());
    list.add(present_instanceType);
    if (present_instanceType)
      list.add(instanceType);

    boolean present_requestedInstanceCount = true && (isSetRequestedInstanceCount());
    list.add(present_requestedInstanceCount);
    if (present_requestedInstanceCount)
      list.add(requestedInstanceCount);

    return list.hashCode();
  }

  @Override
  public int compareTo(AddInstanceGroupRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetClusterId()).compareTo(other.isSetClusterId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClusterId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.clusterId, other.clusterId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRole()).compareTo(other.isSetRole());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRole()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.role, other.role);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInstanceType()).compareTo(other.isSetInstanceType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInstanceType()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.instanceType, other.instanceType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRequestedInstanceCount()).compareTo(other.isSetRequestedInstanceCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequestedInstanceCount()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.requestedInstanceCount, other.requestedInstanceCount);
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
    StringBuilder sb = new StringBuilder("AddInstanceGroupRequest(");
    boolean first = true;

    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (isSetClusterId()) {
      if (!first) sb.append(", ");
      sb.append("clusterId:");
      if (this.clusterId == null) {
        sb.append("null");
      } else {
        sb.append(this.clusterId);
      }
      first = false;
    }
    if (isSetRole()) {
      if (!first) sb.append(", ");
      sb.append("role:");
      if (this.role == null) {
        sb.append("null");
      } else {
        sb.append(this.role);
      }
      first = false;
    }
    if (isSetInstanceType()) {
      if (!first) sb.append(", ");
      sb.append("instanceType:");
      if (this.instanceType == null) {
        sb.append("null");
      } else {
        sb.append(this.instanceType);
      }
      first = false;
    }
    if (isSetRequestedInstanceCount()) {
      if (!first) sb.append(", ");
      sb.append("requestedInstanceCount:");
      sb.append(this.requestedInstanceCount);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (name == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'name' was not present! Struct: " + toString());
    }
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

  private static class AddInstanceGroupRequestStandardSchemeFactory implements SchemeFactory {
    public AddInstanceGroupRequestStandardScheme getScheme() {
      return new AddInstanceGroupRequestStandardScheme();
    }
  }

  private static class AddInstanceGroupRequestStandardScheme extends StandardScheme<AddInstanceGroupRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, AddInstanceGroupRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CLUSTER_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.clusterId = iprot.readString();
              struct.setClusterIdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ROLE
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.role = com.xiaomi.infra.galaxy.emr.thrift.InstanceGroupRole.findByValue(iprot.readI32());
              struct.setRoleIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // INSTANCE_TYPE
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.instanceType = iprot.readString();
              struct.setInstanceTypeIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // REQUESTED_INSTANCE_COUNT
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.requestedInstanceCount = iprot.readI32();
              struct.setRequestedInstanceCountIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, AddInstanceGroupRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.clusterId != null) {
        if (struct.isSetClusterId()) {
          oprot.writeFieldBegin(CLUSTER_ID_FIELD_DESC);
          oprot.writeString(struct.clusterId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.role != null) {
        if (struct.isSetRole()) {
          oprot.writeFieldBegin(ROLE_FIELD_DESC);
          oprot.writeI32(struct.role.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.instanceType != null) {
        if (struct.isSetInstanceType()) {
          oprot.writeFieldBegin(INSTANCE_TYPE_FIELD_DESC);
          oprot.writeString(struct.instanceType);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetRequestedInstanceCount()) {
        oprot.writeFieldBegin(REQUESTED_INSTANCE_COUNT_FIELD_DESC);
        oprot.writeI32(struct.requestedInstanceCount);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AddInstanceGroupRequestTupleSchemeFactory implements SchemeFactory {
    public AddInstanceGroupRequestTupleScheme getScheme() {
      return new AddInstanceGroupRequestTupleScheme();
    }
  }

  private static class AddInstanceGroupRequestTupleScheme extends TupleScheme<AddInstanceGroupRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, AddInstanceGroupRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.name);
      BitSet optionals = new BitSet();
      if (struct.isSetClusterId()) {
        optionals.set(0);
      }
      if (struct.isSetRole()) {
        optionals.set(1);
      }
      if (struct.isSetInstanceType()) {
        optionals.set(2);
      }
      if (struct.isSetRequestedInstanceCount()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetClusterId()) {
        oprot.writeString(struct.clusterId);
      }
      if (struct.isSetRole()) {
        oprot.writeI32(struct.role.getValue());
      }
      if (struct.isSetInstanceType()) {
        oprot.writeString(struct.instanceType);
      }
      if (struct.isSetRequestedInstanceCount()) {
        oprot.writeI32(struct.requestedInstanceCount);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, AddInstanceGroupRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.name = iprot.readString();
      struct.setNameIsSet(true);
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.clusterId = iprot.readString();
        struct.setClusterIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.role = com.xiaomi.infra.galaxy.emr.thrift.InstanceGroupRole.findByValue(iprot.readI32());
        struct.setRoleIsSet(true);
      }
      if (incoming.get(2)) {
        struct.instanceType = iprot.readString();
        struct.setInstanceTypeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.requestedInstanceCount = iprot.readI32();
        struct.setRequestedInstanceCountIsSet(true);
      }
    }
  }

}

