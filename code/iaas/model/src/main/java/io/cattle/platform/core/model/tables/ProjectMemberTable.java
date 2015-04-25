/**
 * This class is generated by jOOQ
 */
package io.cattle.platform.core.model.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProjectMemberTable extends org.jooq.impl.TableImpl<io.cattle.platform.core.model.tables.records.ProjectMemberRecord> {

	private static final long serialVersionUID = 1681278501;

	/**
	 * The singleton instance of <code>cattle.project_member</code>
	 */
	public static final io.cattle.platform.core.model.tables.ProjectMemberTable PROJECT_MEMBER = new io.cattle.platform.core.model.tables.ProjectMemberTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<io.cattle.platform.core.model.tables.records.ProjectMemberRecord> getRecordType() {
		return io.cattle.platform.core.model.tables.records.ProjectMemberRecord.class;
	}

	/**
	 * The column <code>cattle.project_member.id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ProjectMemberRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>cattle.project_member.name</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ProjectMemberRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>cattle.project_member.account_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ProjectMemberRecord, java.lang.Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.project_member.kind</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ProjectMemberRecord, java.lang.String> KIND = createField("kind", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>cattle.project_member.uuid</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ProjectMemberRecord, java.lang.String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>cattle.project_member.description</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ProjectMemberRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * The column <code>cattle.project_member.state</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ProjectMemberRecord, java.lang.String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>cattle.project_member.created</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ProjectMemberRecord, java.util.Date> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.project_member.removed</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ProjectMemberRecord, java.util.Date> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.project_member.remove_time</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ProjectMemberRecord, java.util.Date> REMOVE_TIME = createField("remove_time", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.project_member.data</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ProjectMemberRecord, java.util.Map<String,Object>> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB.length(65535).asConvertedDataType(new io.cattle.platform.db.jooq.converter.DataConverter()), this, "");

	/**
	 * The column <code>cattle.project_member.external_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ProjectMemberRecord, java.lang.String> EXTERNAL_ID = createField("external_id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>cattle.project_member.project_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ProjectMemberRecord, java.lang.Long> PROJECT_ID = createField("project_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>cattle.project_member.external_id_type</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ProjectMemberRecord, java.lang.String> EXTERNAL_ID_TYPE = createField("external_id_type", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>cattle.project_member.role</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ProjectMemberRecord, java.lang.String> ROLE = createField("role", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * Create a <code>cattle.project_member</code> table reference
	 */
	public ProjectMemberTable() {
		this("project_member", null);
	}

	/**
	 * Create an aliased <code>cattle.project_member</code> table reference
	 */
	public ProjectMemberTable(java.lang.String alias) {
		this(alias, io.cattle.platform.core.model.tables.ProjectMemberTable.PROJECT_MEMBER);
	}

	private ProjectMemberTable(java.lang.String alias, org.jooq.Table<io.cattle.platform.core.model.tables.records.ProjectMemberRecord> aliased) {
		this(alias, aliased, null);
	}

	private ProjectMemberTable(java.lang.String alias, org.jooq.Table<io.cattle.platform.core.model.tables.records.ProjectMemberRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, io.cattle.platform.core.model.CattleTable.CATTLE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<io.cattle.platform.core.model.tables.records.ProjectMemberRecord, java.lang.Long> getIdentity() {
		return io.cattle.platform.core.model.Keys.IDENTITY_PROJECT_MEMBER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.ProjectMemberRecord> getPrimaryKey() {
		return io.cattle.platform.core.model.Keys.KEY_PROJECT_MEMBER_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.ProjectMemberRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.ProjectMemberRecord>>asList(io.cattle.platform.core.model.Keys.KEY_PROJECT_MEMBER_PRIMARY, io.cattle.platform.core.model.Keys.KEY_PROJECT_MEMBER_IDX_PROJECT_MEMBER_UUID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<io.cattle.platform.core.model.tables.records.ProjectMemberRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<io.cattle.platform.core.model.tables.records.ProjectMemberRecord, ?>>asList(io.cattle.platform.core.model.Keys.FK_PROJECT_MEMBER__ACCOUNT_ID, io.cattle.platform.core.model.Keys.FK_PROJECT_MEMBER__PROJECT_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public io.cattle.platform.core.model.tables.ProjectMemberTable as(java.lang.String alias) {
		return new io.cattle.platform.core.model.tables.ProjectMemberTable(alias, this);
	}

	/**
	 * Rename this table
	 */
	public io.cattle.platform.core.model.tables.ProjectMemberTable rename(java.lang.String name) {
		return new io.cattle.platform.core.model.tables.ProjectMemberTable(name, null);
	}
}