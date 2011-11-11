/**
 * This class is generated by jOOQ
 */
package org.jooq.util.db2.syscat.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class Columns extends org.jooq.impl.TableImpl<org.jooq.util.db2.syscat.tables.records.ColumnsRecord> {

	private static final long serialVersionUID = -1030925130;

	/**
	 * The singleton instance of COLUMNS
	 */
	public static final org.jooq.util.db2.syscat.tables.Columns COLUMNS = new org.jooq.util.db2.syscat.tables.Columns();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.db2.syscat.tables.records.ColumnsRecord> __RECORD_TYPE = org.jooq.util.db2.syscat.tables.records.ColumnsRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.db2.syscat.tables.records.ColumnsRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.String> TABSCHEMA = createField("TABSCHEMA", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.String> TABNAME = createField("TABNAME", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.String> COLNAME = createField("COLNAME", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.Short> COLNO = createField("COLNO", org.jooq.impl.SQLDataType.SMALLINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.String> TYPESCHEMA = createField("TYPESCHEMA", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.String> TYPENAME = createField("TYPENAME", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.Integer> LENGTH = createField("LENGTH", org.jooq.impl.SQLDataType.INTEGER, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.Short> SCALE = createField("SCALE", org.jooq.impl.SQLDataType.SMALLINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.String> DEFAULT = createField("DEFAULT", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.String> NULLS = createField("NULLS", org.jooq.impl.SQLDataType.CHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.Short> CODEPAGE = createField("CODEPAGE", org.jooq.impl.SQLDataType.SMALLINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.String> COLLATIONSCHEMA = createField("COLLATIONSCHEMA", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.String> COLLATIONNAME = createField("COLLATIONNAME", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.String> LOGGED = createField("LOGGED", org.jooq.impl.SQLDataType.CHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.String> COMPACT = createField("COMPACT", org.jooq.impl.SQLDataType.CHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.Long> COLCARD = createField("COLCARD", org.jooq.impl.SQLDataType.BIGINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.String> HIGH2KEY = createField("HIGH2KEY", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.String> LOW2KEY = createField("LOW2KEY", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.Integer> AVGCOLLEN = createField("AVGCOLLEN", org.jooq.impl.SQLDataType.INTEGER, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.Short> KEYSEQ = createField("KEYSEQ", org.jooq.impl.SQLDataType.SMALLINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.Short> PARTKEYSEQ = createField("PARTKEYSEQ", org.jooq.impl.SQLDataType.SMALLINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.Short> NQUANTILES = createField("NQUANTILES", org.jooq.impl.SQLDataType.SMALLINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.Short> NMOSTFREQ = createField("NMOSTFREQ", org.jooq.impl.SQLDataType.SMALLINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.Long> NUMNULLS = createField("NUMNULLS", org.jooq.impl.SQLDataType.BIGINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.String> TARGET_TYPESCHEMA = createField("TARGET_TYPESCHEMA", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.String> TARGET_TYPENAME = createField("TARGET_TYPENAME", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.String> SCOPE_TABSCHEMA = createField("SCOPE_TABSCHEMA", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.String> SCOPE_TABNAME = createField("SCOPE_TABNAME", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.String> SOURCE_TABSCHEMA = createField("SOURCE_TABSCHEMA", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.String> SOURCE_TABNAME = createField("SOURCE_TABNAME", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.String> DL_FEATURES = createField("DL_FEATURES", org.jooq.impl.SQLDataType.CHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.String> SPECIAL_PROPS = createField("SPECIAL_PROPS", org.jooq.impl.SQLDataType.CHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.String> HIDDEN = createField("HIDDEN", org.jooq.impl.SQLDataType.CHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.Integer> INLINE_LENGTH = createField("INLINE_LENGTH", org.jooq.impl.SQLDataType.INTEGER, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.Short> PCTINLINED = createField("PCTINLINED", org.jooq.impl.SQLDataType.SMALLINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.String> IDENTITY = createField("IDENTITY", org.jooq.impl.SQLDataType.CHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.String> ROWCHANGETIMESTAMP = createField("ROWCHANGETIMESTAMP", org.jooq.impl.SQLDataType.CHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.String> GENERATED = createField("GENERATED", org.jooq.impl.SQLDataType.CHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.String> TEXT = createField("TEXT", org.jooq.impl.SQLDataType.CLOB, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.String> COMPRESS = createField("COMPRESS", org.jooq.impl.SQLDataType.CHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.Double> AVGDISTINCTPERPAGE = createField("AVGDISTINCTPERPAGE", org.jooq.impl.SQLDataType.DOUBLE, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.Double> PAGEVARIANCERATIO = createField("PAGEVARIANCERATIO", org.jooq.impl.SQLDataType.DOUBLE, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.Short> SUB_COUNT = createField("SUB_COUNT", org.jooq.impl.SQLDataType.SMALLINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.Short> SUB_DELIM_LENGTH = createField("SUB_DELIM_LENGTH", org.jooq.impl.SQLDataType.SMALLINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.Integer> AVGCOLLENCHAR = createField("AVGCOLLENCHAR", org.jooq.impl.SQLDataType.INTEGER, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.String> IMPLICITVALUE = createField("IMPLICITVALUE", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.String> SECLABELNAME = createField("SECLABELNAME", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ColumnsRecord, java.lang.String> REMARKS = createField("REMARKS", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * No further instances allowed
	 */
	private Columns() {
		super("COLUMNS", org.jooq.util.db2.syscat.Syscat.SYSCAT);
	}
}
