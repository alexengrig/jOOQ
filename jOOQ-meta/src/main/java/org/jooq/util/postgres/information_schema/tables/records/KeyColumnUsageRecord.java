/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.information_schema.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class KeyColumnUsageRecord extends org.jooq.impl.TableRecordImpl<org.jooq.util.postgres.information_schema.tables.records.KeyColumnUsageRecord> {

	private static final long serialVersionUID = 1668765474;

	/**
	 * An uncommented item
	 */
	public void setConstraintCatalog(java.lang.String value) {
		setValue(org.jooq.util.postgres.information_schema.tables.KeyColumnUsage.CONSTRAINT_CATALOG, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getConstraintCatalog() {
		return getValue(org.jooq.util.postgres.information_schema.tables.KeyColumnUsage.CONSTRAINT_CATALOG);
	}

	/**
	 * An uncommented item
	 */
	public void setConstraintSchema(java.lang.String value) {
		setValue(org.jooq.util.postgres.information_schema.tables.KeyColumnUsage.CONSTRAINT_SCHEMA, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getConstraintSchema() {
		return getValue(org.jooq.util.postgres.information_schema.tables.KeyColumnUsage.CONSTRAINT_SCHEMA);
	}

	/**
	 * An uncommented item
	 */
	public void setConstraintName(java.lang.String value) {
		setValue(org.jooq.util.postgres.information_schema.tables.KeyColumnUsage.CONSTRAINT_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getConstraintName() {
		return getValue(org.jooq.util.postgres.information_schema.tables.KeyColumnUsage.CONSTRAINT_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setTableCatalog(java.lang.String value) {
		setValue(org.jooq.util.postgres.information_schema.tables.KeyColumnUsage.TABLE_CATALOG, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getTableCatalog() {
		return getValue(org.jooq.util.postgres.information_schema.tables.KeyColumnUsage.TABLE_CATALOG);
	}

	/**
	 * An uncommented item
	 */
	public void setTableSchema(java.lang.String value) {
		setValue(org.jooq.util.postgres.information_schema.tables.KeyColumnUsage.TABLE_SCHEMA, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getTableSchema() {
		return getValue(org.jooq.util.postgres.information_schema.tables.KeyColumnUsage.TABLE_SCHEMA);
	}

	/**
	 * An uncommented item
	 */
	public void setTableName(java.lang.String value) {
		setValue(org.jooq.util.postgres.information_schema.tables.KeyColumnUsage.TABLE_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getTableName() {
		return getValue(org.jooq.util.postgres.information_schema.tables.KeyColumnUsage.TABLE_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setColumnName(java.lang.String value) {
		setValue(org.jooq.util.postgres.information_schema.tables.KeyColumnUsage.COLUMN_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getColumnName() {
		return getValue(org.jooq.util.postgres.information_schema.tables.KeyColumnUsage.COLUMN_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setOrdinalPosition(java.lang.Integer value) {
		setValue(org.jooq.util.postgres.information_schema.tables.KeyColumnUsage.ORDINAL_POSITION, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getOrdinalPosition() {
		return getValue(org.jooq.util.postgres.information_schema.tables.KeyColumnUsage.ORDINAL_POSITION);
	}

	/**
	 * An uncommented item
	 */
	public void setPositionInUniqueConstraint(java.lang.Integer value) {
		setValue(org.jooq.util.postgres.information_schema.tables.KeyColumnUsage.POSITION_IN_UNIQUE_CONSTRAINT, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getPositionInUniqueConstraint() {
		return getValue(org.jooq.util.postgres.information_schema.tables.KeyColumnUsage.POSITION_IN_UNIQUE_CONSTRAINT);
	}

	/**
	 * Create a detached KeyColumnUsageRecord
	 */
	public KeyColumnUsageRecord() {
		super(org.jooq.util.postgres.information_schema.tables.KeyColumnUsage.KEY_COLUMN_USAGE);
	}
}
