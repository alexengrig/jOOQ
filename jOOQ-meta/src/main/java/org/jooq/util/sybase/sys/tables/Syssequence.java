/**
 * This class is generated by jOOQ
 */
package org.jooq.util.sybase.sys.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class Syssequence extends org.jooq.impl.TableImpl<org.jooq.util.sybase.sys.tables.records.SyssequenceRecord> {

	private static final long serialVersionUID = -1851464416;

	/**
	 * The singleton instance of SYSSEQUENCE
	 */
	public static final org.jooq.util.sybase.sys.tables.Syssequence SYSSEQUENCE = new org.jooq.util.sybase.sys.tables.Syssequence();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.sybase.sys.tables.records.SyssequenceRecord> __RECORD_TYPE = org.jooq.util.sybase.sys.tables.records.SyssequenceRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.sybase.sys.tables.records.SyssequenceRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SyssequenceRecord, java.lang.Long> OBJECT_ID = createField("object_id", org.jooq.impl.SQLDataType.BIGINT, SYSSEQUENCE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SyssequenceRecord, java.lang.Integer> OWNER = createField("owner", org.jooq.impl.SQLDataType.INTEGER, SYSSEQUENCE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SyssequenceRecord, java.lang.Long> MIN_VALUE = createField("min_value", org.jooq.impl.SQLDataType.BIGINT, SYSSEQUENCE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SyssequenceRecord, java.lang.Long> MAX_VALUE = createField("max_value", org.jooq.impl.SQLDataType.BIGINT, SYSSEQUENCE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SyssequenceRecord, java.lang.Long> INCREMENT_BY = createField("increment_by", org.jooq.impl.SQLDataType.BIGINT, SYSSEQUENCE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SyssequenceRecord, java.lang.Long> START_WITH = createField("start_with", org.jooq.impl.SQLDataType.BIGINT, SYSSEQUENCE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SyssequenceRecord, java.lang.Integer> CACHE = createField("cache", org.jooq.impl.SQLDataType.INTEGER, SYSSEQUENCE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SyssequenceRecord, java.lang.Byte> CYCLE = createField("cycle", org.jooq.impl.SQLDataType.TINYINT, SYSSEQUENCE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SyssequenceRecord, java.lang.Long> RESUME_AT = createField("resume_at", org.jooq.impl.SQLDataType.BIGINT, SYSSEQUENCE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SyssequenceRecord, java.lang.String> SEQUENCE_NAME = createField("sequence_name", org.jooq.impl.SQLDataType.CHAR, SYSSEQUENCE);

	/**
	 * No further instances allowed
	 */
	private Syssequence() {
		super("SYSSEQUENCE", org.jooq.util.sybase.sys.Sys.SYS);
	}
}
