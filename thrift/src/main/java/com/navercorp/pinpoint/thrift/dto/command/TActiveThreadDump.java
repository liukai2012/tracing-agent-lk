/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.navercorp.pinpoint.thrift.dto.command;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2018-10-19")
public class TActiveThreadDump implements org.apache.thrift.TBase<TActiveThreadDump, TActiveThreadDump._Fields>, java.io.Serializable, Cloneable, Comparable<TActiveThreadDump> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TActiveThreadDump");

  private static final org.apache.thrift.protocol.TField START_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("startTime", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField LOCAL_TRACE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("localTraceId", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField THREAD_DUMP_FIELD_DESC = new org.apache.thrift.protocol.TField("threadDump", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField SAMPLED_FIELD_DESC = new org.apache.thrift.protocol.TField("sampled", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final org.apache.thrift.protocol.TField TRANSACTION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("transactionId", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField ENTRY_POINT_FIELD_DESC = new org.apache.thrift.protocol.TField("entryPoint", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TActiveThreadDumpStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TActiveThreadDumpTupleSchemeFactory();

  private long startTime; // required
  private long localTraceId; // required
  private TThreadDump threadDump; // required
  private boolean sampled; // required
  private java.lang.String transactionId; // optional
  private java.lang.String entryPoint; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    START_TIME((short)1, "startTime"),
    LOCAL_TRACE_ID((short)2, "localTraceId"),
    THREAD_DUMP((short)3, "threadDump"),
    SAMPLED((short)4, "sampled"),
    TRANSACTION_ID((short)5, "transactionId"),
    ENTRY_POINT((short)6, "entryPoint");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // START_TIME
          return START_TIME;
        case 2: // LOCAL_TRACE_ID
          return LOCAL_TRACE_ID;
        case 3: // THREAD_DUMP
          return THREAD_DUMP;
        case 4: // SAMPLED
          return SAMPLED;
        case 5: // TRANSACTION_ID
          return TRANSACTION_ID;
        case 6: // ENTRY_POINT
          return ENTRY_POINT;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __STARTTIME_ISSET_ID = 0;
  private static final int __LOCALTRACEID_ISSET_ID = 1;
  private static final int __SAMPLED_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TRANSACTION_ID,_Fields.ENTRY_POINT};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.START_TIME, new org.apache.thrift.meta_data.FieldMetaData("startTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.LOCAL_TRACE_ID, new org.apache.thrift.meta_data.FieldMetaData("localTraceId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.THREAD_DUMP, new org.apache.thrift.meta_data.FieldMetaData("threadDump", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TThreadDump.class)));
    tmpMap.put(_Fields.SAMPLED, new org.apache.thrift.meta_data.FieldMetaData("sampled", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.TRANSACTION_ID, new org.apache.thrift.meta_data.FieldMetaData("transactionId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ENTRY_POINT, new org.apache.thrift.meta_data.FieldMetaData("entryPoint", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TActiveThreadDump.class, metaDataMap);
  }

  public TActiveThreadDump() {
    this.sampled = false;

  }

  public TActiveThreadDump(
    long startTime,
    long localTraceId,
    TThreadDump threadDump,
    boolean sampled)
  {
    this();
    this.startTime = startTime;
    setStartTimeIsSet(true);
    this.localTraceId = localTraceId;
    setLocalTraceIdIsSet(true);
    this.threadDump = threadDump;
    this.sampled = sampled;
    setSampledIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TActiveThreadDump(TActiveThreadDump other) {
    __isset_bitfield = other.__isset_bitfield;
    this.startTime = other.startTime;
    this.localTraceId = other.localTraceId;
    if (other.isSetThreadDump()) {
      this.threadDump = new TThreadDump(other.threadDump);
    }
    this.sampled = other.sampled;
    if (other.isSetTransactionId()) {
      this.transactionId = other.transactionId;
    }
    if (other.isSetEntryPoint()) {
      this.entryPoint = other.entryPoint;
    }
  }

  public TActiveThreadDump deepCopy() {
    return new TActiveThreadDump(this);
  }

  @Override
  public void clear() {
    setStartTimeIsSet(false);
    this.startTime = 0;
    setLocalTraceIdIsSet(false);
    this.localTraceId = 0;
    this.threadDump = null;
    this.sampled = false;

    this.transactionId = null;
    this.entryPoint = null;
  }

  public long getStartTime() {
    return this.startTime;
  }

  public void setStartTime(long startTime) {
    this.startTime = startTime;
    setStartTimeIsSet(true);
  }

  public void unsetStartTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STARTTIME_ISSET_ID);
  }

  /** Returns true if field startTime is set (has been assigned a value) and false otherwise */
  public boolean isSetStartTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STARTTIME_ISSET_ID);
  }

  public void setStartTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STARTTIME_ISSET_ID, value);
  }

  public long getLocalTraceId() {
    return this.localTraceId;
  }

  public void setLocalTraceId(long localTraceId) {
    this.localTraceId = localTraceId;
    setLocalTraceIdIsSet(true);
  }

  public void unsetLocalTraceId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LOCALTRACEID_ISSET_ID);
  }

  /** Returns true if field localTraceId is set (has been assigned a value) and false otherwise */
  public boolean isSetLocalTraceId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LOCALTRACEID_ISSET_ID);
  }

  public void setLocalTraceIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LOCALTRACEID_ISSET_ID, value);
  }

  public TThreadDump getThreadDump() {
    return this.threadDump;
  }

  public void setThreadDump(TThreadDump threadDump) {
    this.threadDump = threadDump;
  }

  public void unsetThreadDump() {
    this.threadDump = null;
  }

  /** Returns true if field threadDump is set (has been assigned a value) and false otherwise */
  public boolean isSetThreadDump() {
    return this.threadDump != null;
  }

  public void setThreadDumpIsSet(boolean value) {
    if (!value) {
      this.threadDump = null;
    }
  }

  public boolean isSampled() {
    return this.sampled;
  }

  public void setSampled(boolean sampled) {
    this.sampled = sampled;
    setSampledIsSet(true);
  }

  public void unsetSampled() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SAMPLED_ISSET_ID);
  }

  /** Returns true if field sampled is set (has been assigned a value) and false otherwise */
  public boolean isSetSampled() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SAMPLED_ISSET_ID);
  }

  public void setSampledIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SAMPLED_ISSET_ID, value);
  }

  public java.lang.String getTransactionId() {
    return this.transactionId;
  }

  public void setTransactionId(java.lang.String transactionId) {
    this.transactionId = transactionId;
  }

  public void unsetTransactionId() {
    this.transactionId = null;
  }

  /** Returns true if field transactionId is set (has been assigned a value) and false otherwise */
  public boolean isSetTransactionId() {
    return this.transactionId != null;
  }

  public void setTransactionIdIsSet(boolean value) {
    if (!value) {
      this.transactionId = null;
    }
  }

  public java.lang.String getEntryPoint() {
    return this.entryPoint;
  }

  public void setEntryPoint(java.lang.String entryPoint) {
    this.entryPoint = entryPoint;
  }

  public void unsetEntryPoint() {
    this.entryPoint = null;
  }

  /** Returns true if field entryPoint is set (has been assigned a value) and false otherwise */
  public boolean isSetEntryPoint() {
    return this.entryPoint != null;
  }

  public void setEntryPointIsSet(boolean value) {
    if (!value) {
      this.entryPoint = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case START_TIME:
      if (value == null) {
        unsetStartTime();
      } else {
        setStartTime((java.lang.Long)value);
      }
      break;

    case LOCAL_TRACE_ID:
      if (value == null) {
        unsetLocalTraceId();
      } else {
        setLocalTraceId((java.lang.Long)value);
      }
      break;

    case THREAD_DUMP:
      if (value == null) {
        unsetThreadDump();
      } else {
        setThreadDump((TThreadDump)value);
      }
      break;

    case SAMPLED:
      if (value == null) {
        unsetSampled();
      } else {
        setSampled((java.lang.Boolean)value);
      }
      break;

    case TRANSACTION_ID:
      if (value == null) {
        unsetTransactionId();
      } else {
        setTransactionId((java.lang.String)value);
      }
      break;

    case ENTRY_POINT:
      if (value == null) {
        unsetEntryPoint();
      } else {
        setEntryPoint((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case START_TIME:
      return getStartTime();

    case LOCAL_TRACE_ID:
      return getLocalTraceId();

    case THREAD_DUMP:
      return getThreadDump();

    case SAMPLED:
      return isSampled();

    case TRANSACTION_ID:
      return getTransactionId();

    case ENTRY_POINT:
      return getEntryPoint();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case START_TIME:
      return isSetStartTime();
    case LOCAL_TRACE_ID:
      return isSetLocalTraceId();
    case THREAD_DUMP:
      return isSetThreadDump();
    case SAMPLED:
      return isSetSampled();
    case TRANSACTION_ID:
      return isSetTransactionId();
    case ENTRY_POINT:
      return isSetEntryPoint();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TActiveThreadDump)
      return this.equals((TActiveThreadDump)that);
    return false;
  }

  public boolean equals(TActiveThreadDump that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_startTime = true;
    boolean that_present_startTime = true;
    if (this_present_startTime || that_present_startTime) {
      if (!(this_present_startTime && that_present_startTime))
        return false;
      if (this.startTime != that.startTime)
        return false;
    }

    boolean this_present_localTraceId = true;
    boolean that_present_localTraceId = true;
    if (this_present_localTraceId || that_present_localTraceId) {
      if (!(this_present_localTraceId && that_present_localTraceId))
        return false;
      if (this.localTraceId != that.localTraceId)
        return false;
    }

    boolean this_present_threadDump = true && this.isSetThreadDump();
    boolean that_present_threadDump = true && that.isSetThreadDump();
    if (this_present_threadDump || that_present_threadDump) {
      if (!(this_present_threadDump && that_present_threadDump))
        return false;
      if (!this.threadDump.equals(that.threadDump))
        return false;
    }

    boolean this_present_sampled = true;
    boolean that_present_sampled = true;
    if (this_present_sampled || that_present_sampled) {
      if (!(this_present_sampled && that_present_sampled))
        return false;
      if (this.sampled != that.sampled)
        return false;
    }

    boolean this_present_transactionId = true && this.isSetTransactionId();
    boolean that_present_transactionId = true && that.isSetTransactionId();
    if (this_present_transactionId || that_present_transactionId) {
      if (!(this_present_transactionId && that_present_transactionId))
        return false;
      if (!this.transactionId.equals(that.transactionId))
        return false;
    }

    boolean this_present_entryPoint = true && this.isSetEntryPoint();
    boolean that_present_entryPoint = true && that.isSetEntryPoint();
    if (this_present_entryPoint || that_present_entryPoint) {
      if (!(this_present_entryPoint && that_present_entryPoint))
        return false;
      if (!this.entryPoint.equals(that.entryPoint))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(startTime);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(localTraceId);

    hashCode = hashCode * 8191 + ((isSetThreadDump()) ? 131071 : 524287);
    if (isSetThreadDump())
      hashCode = hashCode * 8191 + threadDump.hashCode();

    hashCode = hashCode * 8191 + ((sampled) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetTransactionId()) ? 131071 : 524287);
    if (isSetTransactionId())
      hashCode = hashCode * 8191 + transactionId.hashCode();

    hashCode = hashCode * 8191 + ((isSetEntryPoint()) ? 131071 : 524287);
    if (isSetEntryPoint())
      hashCode = hashCode * 8191 + entryPoint.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TActiveThreadDump other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetStartTime()).compareTo(other.isSetStartTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.startTime, other.startTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLocalTraceId()).compareTo(other.isSetLocalTraceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocalTraceId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.localTraceId, other.localTraceId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetThreadDump()).compareTo(other.isSetThreadDump());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetThreadDump()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.threadDump, other.threadDump);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSampled()).compareTo(other.isSetSampled());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSampled()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sampled, other.sampled);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTransactionId()).compareTo(other.isSetTransactionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTransactionId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.transactionId, other.transactionId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetEntryPoint()).compareTo(other.isSetEntryPoint());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEntryPoint()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.entryPoint, other.entryPoint);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TActiveThreadDump(");
    boolean first = true;

    sb.append("startTime:");
    sb.append(this.startTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("localTraceId:");
    sb.append(this.localTraceId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("threadDump:");
    if (this.threadDump == null) {
      sb.append("null");
    } else {
      sb.append(this.threadDump);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sampled:");
    sb.append(this.sampled);
    first = false;
    if (isSetTransactionId()) {
      if (!first) sb.append(", ");
      sb.append("transactionId:");
      if (this.transactionId == null) {
        sb.append("null");
      } else {
        sb.append(this.transactionId);
      }
      first = false;
    }
    if (isSetEntryPoint()) {
      if (!first) sb.append(", ");
      sb.append("entryPoint:");
      if (this.entryPoint == null) {
        sb.append("null");
      } else {
        sb.append(this.entryPoint);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (threadDump != null) {
      threadDump.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TActiveThreadDumpStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TActiveThreadDumpStandardScheme getScheme() {
      return new TActiveThreadDumpStandardScheme();
    }
  }

  private static class TActiveThreadDumpStandardScheme extends org.apache.thrift.scheme.StandardScheme<TActiveThreadDump> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TActiveThreadDump struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // START_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.startTime = iprot.readI64();
              struct.setStartTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LOCAL_TRACE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.localTraceId = iprot.readI64();
              struct.setLocalTraceIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // THREAD_DUMP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.threadDump = new TThreadDump();
              struct.threadDump.read(iprot);
              struct.setThreadDumpIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SAMPLED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.sampled = iprot.readBool();
              struct.setSampledIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TRANSACTION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.transactionId = iprot.readString();
              struct.setTransactionIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // ENTRY_POINT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.entryPoint = iprot.readString();
              struct.setEntryPointIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TActiveThreadDump struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(START_TIME_FIELD_DESC);
      oprot.writeI64(struct.startTime);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LOCAL_TRACE_ID_FIELD_DESC);
      oprot.writeI64(struct.localTraceId);
      oprot.writeFieldEnd();
      if (struct.threadDump != null) {
        oprot.writeFieldBegin(THREAD_DUMP_FIELD_DESC);
        struct.threadDump.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SAMPLED_FIELD_DESC);
      oprot.writeBool(struct.sampled);
      oprot.writeFieldEnd();
      if (struct.transactionId != null) {
        if (struct.isSetTransactionId()) {
          oprot.writeFieldBegin(TRANSACTION_ID_FIELD_DESC);
          oprot.writeString(struct.transactionId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.entryPoint != null) {
        if (struct.isSetEntryPoint()) {
          oprot.writeFieldBegin(ENTRY_POINT_FIELD_DESC);
          oprot.writeString(struct.entryPoint);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TActiveThreadDumpTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TActiveThreadDumpTupleScheme getScheme() {
      return new TActiveThreadDumpTupleScheme();
    }
  }

  private static class TActiveThreadDumpTupleScheme extends org.apache.thrift.scheme.TupleScheme<TActiveThreadDump> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TActiveThreadDump struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStartTime()) {
        optionals.set(0);
      }
      if (struct.isSetLocalTraceId()) {
        optionals.set(1);
      }
      if (struct.isSetThreadDump()) {
        optionals.set(2);
      }
      if (struct.isSetSampled()) {
        optionals.set(3);
      }
      if (struct.isSetTransactionId()) {
        optionals.set(4);
      }
      if (struct.isSetEntryPoint()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetStartTime()) {
        oprot.writeI64(struct.startTime);
      }
      if (struct.isSetLocalTraceId()) {
        oprot.writeI64(struct.localTraceId);
      }
      if (struct.isSetThreadDump()) {
        struct.threadDump.write(oprot);
      }
      if (struct.isSetSampled()) {
        oprot.writeBool(struct.sampled);
      }
      if (struct.isSetTransactionId()) {
        oprot.writeString(struct.transactionId);
      }
      if (struct.isSetEntryPoint()) {
        oprot.writeString(struct.entryPoint);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TActiveThreadDump struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.startTime = iprot.readI64();
        struct.setStartTimeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.localTraceId = iprot.readI64();
        struct.setLocalTraceIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.threadDump = new TThreadDump();
        struct.threadDump.read(iprot);
        struct.setThreadDumpIsSet(true);
      }
      if (incoming.get(3)) {
        struct.sampled = iprot.readBool();
        struct.setSampledIsSet(true);
      }
      if (incoming.get(4)) {
        struct.transactionId = iprot.readString();
        struct.setTransactionIdIsSet(true);
      }
      if (incoming.get(5)) {
        struct.entryPoint = iprot.readString();
        struct.setEntryPointIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

