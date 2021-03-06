package org.labun.jooq.subgenerators.table;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
* This class is generated by jooq-generator.
*/
@Generated({"jooq-generator:"})
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SpecialtiesTable extends TableImpl<org.labun.jooq.subgenerators.record.SpecialtiesRecord> {

/**
* The reference instance of <code>PUBLIC.SPECIALTIES</code>
*/
public static final SpecialtiesTable SPECIALTIES = new SpecialtiesTable();

  /**
  * The class holding records for this type
  */
  @Override
  public Class<org.labun.jooq.subgenerators.record.SpecialtiesRecord> getRecordType() {
    return org.labun.jooq.subgenerators.record.SpecialtiesRecord.class;
  }

  /**
  * Create an aliased <code>PUBLIC.SPECIALTIES</code> table reference
  */
  public SpecialtiesTable() {
    this(DSL.name("SPECIALTIES"), null);
  }

  /**
  * Create an aliased <code>PUBLIC.SPECIALTIES</code> table reference
  */
  public SpecialtiesTable(String alias) {
    this(DSL.name(alias), SPECIALTIES);
  }

  /**
  * Create an aliased <code>PUBLIC.SPECIALTIES</code> table reference
  */
  public SpecialtiesTable(Name alias) {
    this(alias, SPECIALTIES);
  }

  private SpecialtiesTable(Name alias, Table<org.labun.jooq.subgenerators.record.SpecialtiesRecord> aliased) {
    this(alias, aliased, null);
  }

  private SpecialtiesTable(Name alias, Table<org.labun.jooq.subgenerators.record.SpecialtiesRecord> aliased, Field<?>[] parameters) {
    super(alias, null, aliased, parameters, "");
  }

  /**
  * The column <code>PUBLIC.SPECIALTIES.ID</code>.
  */
  public final TableField<org.labun.jooq.subgenerators.record.SpecialtiesRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

  /**
  * The column <code>PUBLIC.SPECIALTIES.NAME</code>.
  */
  public final TableField<org.labun.jooq.subgenerators.record.SpecialtiesRecord, java.lang.String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(80), this, "");


  /**
  * {@inheritDoc}
  */
  @Override
  public Schema getSchema() {
    return org.labun.jooq.subgenerators.Public.PUBLIC;
  }

  /**
  * {@inheritDoc}
  */
  @Override
  public SpecialtiesTable as(String alias) {
    return new SpecialtiesTable(DSL.name(alias), this);
  }

  /**
  * {@inheritDoc}
  */
  @Override
  public SpecialtiesTable as(Name alias) {
    return new SpecialtiesTable(alias, this);
  }

  /**
  * Rename this table
  */
  @Override
  public SpecialtiesTable rename(String name) {
    return new SpecialtiesTable(DSL.name(name), null);
  }

  /**
  * Rename this table
  */
  @Override
  public SpecialtiesTable rename(Name name) {
    return new SpecialtiesTable(name, null);
  }

  /**
  * {@inheritDoc}
  */
  @Override
  public List<Index> getIndexes() {
    return Arrays.<Index>asList(org.labun.jooq.subgenerators.PublicIndexes.INDEX_4, org.labun.jooq.subgenerators.PublicIndexes.PRIMARY_KEY_4);
  }

  /**
  * {@inheritDoc}
  */
  @Override
  public Identity<org.labun.jooq.subgenerators.record.SpecialtiesRecord, java.lang.Integer> getIdentity() {
    return org.labun.jooq.subgenerators.PublicKeys.IDENTITY_SPECIALTIES;
  }

  /**
  * {@inheritDoc}
  */
  @Override
  public UniqueKey<org.labun.jooq.subgenerators.record.SpecialtiesRecord> getPrimaryKey() {
    return org.labun.jooq.subgenerators.PublicKeys.CONSTRAINT_4;
  }

  /**
  * {@inheritDoc}
  */
  @Override
  public List<UniqueKey<org.labun.jooq.subgenerators.record.SpecialtiesRecord>> getKeys() {
    return Arrays.<UniqueKey<org.labun.jooq.subgenerators.record.SpecialtiesRecord>>asList(org.labun.jooq.subgenerators.PublicKeys.CONSTRAINT_4);
  }

  /**
  * {@inheritDoc}
  */
  @Override
  public List<ForeignKey<org.labun.jooq.subgenerators.record.SpecialtiesRecord, ?>> getReferences() {
    return Arrays.<ForeignKey<org.labun.jooq.subgenerators.record.SpecialtiesRecord, ?>>asList();
  }
}