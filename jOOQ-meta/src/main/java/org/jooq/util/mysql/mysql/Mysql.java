/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.mysql;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class Mysql extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = -1276822357;

	/**
	 * The singleton instance of mysql
	 */
	public static final Mysql MYSQL = new Mysql();

	/**
	 * No further instances allowed
	 */
	private Mysql() {
		super("mysql");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			org.jooq.util.mysql.mysql.tables.Proc.PROC,
			org.jooq.util.mysql.mysql.tables.ProcsPriv.PROCS_PRIV);
	}
}
