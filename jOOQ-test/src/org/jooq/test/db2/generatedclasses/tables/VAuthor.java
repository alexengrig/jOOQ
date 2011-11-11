/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class VAuthor extends org.jooq.impl.TableImpl<org.jooq.test.db2.generatedclasses.tables.records.VAuthorRecord> {

	private static final long serialVersionUID = 665213810;

	/**
	 * The singleton instance of V_AUTHOR
	 */
	public static final org.jooq.test.db2.generatedclasses.tables.VAuthor V_AUTHOR = new org.jooq.test.db2.generatedclasses.tables.VAuthor();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.db2.generatedclasses.tables.records.VAuthorRecord> __RECORD_TYPE = org.jooq.test.db2.generatedclasses.tables.records.VAuthorRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.db2.generatedclasses.tables.records.VAuthorRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.VAuthorRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, V_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.VAuthorRecord, java.lang.String> FIRST_NAME = createField("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR, V_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.VAuthorRecord, java.lang.String> LAST_NAME = createField("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR, V_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.VAuthorRecord, java.sql.Date> DATE_OF_BIRTH = createField("DATE_OF_BIRTH", org.jooq.impl.SQLDataType.DATE, V_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.VAuthorRecord, java.lang.Integer> YEAR_OF_BIRTH = createField("YEAR_OF_BIRTH", org.jooq.impl.SQLDataType.INTEGER, V_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.VAuthorRecord, java.lang.String> ADDRESS = createField("ADDRESS", org.jooq.impl.SQLDataType.VARCHAR, V_AUTHOR);

	/**
	 * No further instances allowed
	 */
	private VAuthor() {
		super("V_AUTHOR", org.jooq.test.db2.generatedclasses.Lukas.LUKAS);
	}
}
