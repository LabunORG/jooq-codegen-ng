package org.labun.jooq.subgenerators;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;

import javax.annotation.Generated;


/**
* This class is generated by jooq-generator.
*/
@Generated({"jooq-generator:"})
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public final class PublicKeys {

// -------------------------------------------------------------------------
// IDENTITY definitions
// -------------------------------------------------------------------------

  public static Identity<org.labun.jooq.subgenerators.record.OwnersRecord, java.lang.Integer> IDENTITY_OWNERS = Identities.IDENTITY_OWNERS;
  public static Identity<org.labun.jooq.subgenerators.record.PetsRecord, java.lang.Integer> IDENTITY_PETS = Identities.IDENTITY_PETS;
  public static Identity<org.labun.jooq.subgenerators.record.SpecialtiesRecord, java.lang.Integer> IDENTITY_SPECIALTIES = Identities.IDENTITY_SPECIALTIES;
  public static Identity<org.labun.jooq.subgenerators.record.TypesRecord, java.lang.Integer> IDENTITY_TYPES = Identities.IDENTITY_TYPES;
  public static Identity<org.labun.jooq.subgenerators.record.VetsRecord, java.lang.Integer> IDENTITY_VETS = Identities.IDENTITY_VETS;
  public static Identity<org.labun.jooq.subgenerators.record.VisitsRecord, java.lang.Integer> IDENTITY_VISITS = Identities.IDENTITY_VISITS;

// -------------------------------------------------------------------------
// UNIQUE and PRIMARY KEY definitions
// -------------------------------------------------------------------------

  public static final UniqueKey<org.labun.jooq.subgenerators.record.OwnersRecord> CONSTRAINT_8 = UniqueKeys.CONSTRAINT_8;
  public static final UniqueKey<org.labun.jooq.subgenerators.record.PetsRecord> CONSTRAINT_25 = UniqueKeys.CONSTRAINT_25;
  public static final UniqueKey<org.labun.jooq.subgenerators.record.SpecialtiesRecord> CONSTRAINT_4 = UniqueKeys.CONSTRAINT_4;
  public static final UniqueKey<org.labun.jooq.subgenerators.record.TypesRecord> CONSTRAINT_4C = UniqueKeys.CONSTRAINT_4C;
  public static final UniqueKey<org.labun.jooq.subgenerators.record.VetsRecord> CONSTRAINT_2 = UniqueKeys.CONSTRAINT_2;
  public static final UniqueKey<org.labun.jooq.subgenerators.record.VetSpecialtiesRecord> CONSTRAINT_7AC = UniqueKeys.CONSTRAINT_7AC;
  public static final UniqueKey<org.labun.jooq.subgenerators.record.VisitsRecord> CONSTRAINT_9 = UniqueKeys.CONSTRAINT_9;

// -------------------------------------------------------------------------
// FOREIGN KEY definitions
// -------------------------------------------------------------------------

  public static final ForeignKey<org.labun.jooq.subgenerators.record.PetsRecord, org.labun.jooq.subgenerators.record.TypesRecord> CONSTRAINT_256B = ForeignKeys.CONSTRAINT_256B;
  public static final ForeignKey<org.labun.jooq.subgenerators.record.PetsRecord, org.labun.jooq.subgenerators.record.OwnersRecord> CONSTRAINT_256 = ForeignKeys.CONSTRAINT_256;
  public static final ForeignKey<org.labun.jooq.subgenerators.record.VetSpecialtiesRecord, org.labun.jooq.subgenerators.record.VetsRecord> CONSTRAINT_7 = ForeignKeys.CONSTRAINT_7;
  public static final ForeignKey<org.labun.jooq.subgenerators.record.VetSpecialtiesRecord, org.labun.jooq.subgenerators.record.SpecialtiesRecord> CONSTRAINT_7A = ForeignKeys.CONSTRAINT_7A;
  public static final ForeignKey<org.labun.jooq.subgenerators.record.VisitsRecord, org.labun.jooq.subgenerators.record.PetsRecord> CONSTRAINT_96 = ForeignKeys.CONSTRAINT_96;

// -------------------------------------------------------------------------

  private static class Identities extends AbstractKeys {
    public static Identity<org.labun.jooq.subgenerators.record.OwnersRecord, java.lang.Integer> IDENTITY_OWNERS = createIdentity(org.labun.jooq.subgenerators.table.OwnersTable.OWNERS, org.labun.jooq.subgenerators.table.OwnersTable.OWNERS.ID);
    public static Identity<org.labun.jooq.subgenerators.record.PetsRecord, java.lang.Integer> IDENTITY_PETS = createIdentity(org.labun.jooq.subgenerators.table.PetsTable.PETS, org.labun.jooq.subgenerators.table.PetsTable.PETS.ID);
    public static Identity<org.labun.jooq.subgenerators.record.SpecialtiesRecord, java.lang.Integer> IDENTITY_SPECIALTIES = createIdentity(org.labun.jooq.subgenerators.table.SpecialtiesTable.SPECIALTIES, org.labun.jooq.subgenerators.table.SpecialtiesTable.SPECIALTIES.ID);
    public static Identity<org.labun.jooq.subgenerators.record.TypesRecord, java.lang.Integer> IDENTITY_TYPES = createIdentity(org.labun.jooq.subgenerators.table.TypesTable.TYPES, org.labun.jooq.subgenerators.table.TypesTable.TYPES.ID);
    public static Identity<org.labun.jooq.subgenerators.record.VetsRecord, java.lang.Integer> IDENTITY_VETS = createIdentity(org.labun.jooq.subgenerators.table.VetsTable.VETS, org.labun.jooq.subgenerators.table.VetsTable.VETS.ID);
    public static Identity<org.labun.jooq.subgenerators.record.VisitsRecord, java.lang.Integer> IDENTITY_VISITS = createIdentity(org.labun.jooq.subgenerators.table.VisitsTable.VISITS, org.labun.jooq.subgenerators.table.VisitsTable.VISITS.ID);
  }

  private static class UniqueKeys extends AbstractKeys {
    public static final UniqueKey<org.labun.jooq.subgenerators.record.OwnersRecord> CONSTRAINT_8 = createUniqueKey(org.labun.jooq.subgenerators.table.OwnersTable.OWNERS, "CONSTRAINT_8", org.labun.jooq.subgenerators.table.OwnersTable.OWNERS.ID);
    public static final UniqueKey<org.labun.jooq.subgenerators.record.PetsRecord> CONSTRAINT_25 = createUniqueKey(org.labun.jooq.subgenerators.table.PetsTable.PETS, "CONSTRAINT_25", org.labun.jooq.subgenerators.table.PetsTable.PETS.ID);
    public static final UniqueKey<org.labun.jooq.subgenerators.record.SpecialtiesRecord> CONSTRAINT_4 = createUniqueKey(org.labun.jooq.subgenerators.table.SpecialtiesTable.SPECIALTIES, "CONSTRAINT_4", org.labun.jooq.subgenerators.table.SpecialtiesTable.SPECIALTIES.ID);
    public static final UniqueKey<org.labun.jooq.subgenerators.record.TypesRecord> CONSTRAINT_4C = createUniqueKey(org.labun.jooq.subgenerators.table.TypesTable.TYPES, "CONSTRAINT_4C", org.labun.jooq.subgenerators.table.TypesTable.TYPES.ID);
    public static final UniqueKey<org.labun.jooq.subgenerators.record.VetsRecord> CONSTRAINT_2 = createUniqueKey(org.labun.jooq.subgenerators.table.VetsTable.VETS, "CONSTRAINT_2", org.labun.jooq.subgenerators.table.VetsTable.VETS.ID);
    public static final UniqueKey<org.labun.jooq.subgenerators.record.VetSpecialtiesRecord> CONSTRAINT_7AC = createUniqueKey(org.labun.jooq.subgenerators.table.VetSpecialtiesTable.VET_SPECIALTIES, "CONSTRAINT_7AC", org.labun.jooq.subgenerators.table.VetSpecialtiesTable.VET_SPECIALTIES.VET_ID, org.labun.jooq.subgenerators.table.VetSpecialtiesTable.VET_SPECIALTIES.SPECIALTY_ID);
    public static final UniqueKey<org.labun.jooq.subgenerators.record.VisitsRecord> CONSTRAINT_9 = createUniqueKey(org.labun.jooq.subgenerators.table.VisitsTable.VISITS, "CONSTRAINT_9", org.labun.jooq.subgenerators.table.VisitsTable.VISITS.ID);
  }

  private static class ForeignKeys extends AbstractKeys {
    public static final ForeignKey<org.labun.jooq.subgenerators.record.PetsRecord, org.labun.jooq.subgenerators.record.TypesRecord> CONSTRAINT_256B = createForeignKey(UniqueKeys.CONSTRAINT_4C, org.labun.jooq.subgenerators.table.PetsTable.PETS, "CONSTRAINT_256B", org.labun.jooq.subgenerators.table.PetsTable.PETS.TYPE_ID);
    public static final ForeignKey<org.labun.jooq.subgenerators.record.PetsRecord, org.labun.jooq.subgenerators.record.OwnersRecord> CONSTRAINT_256 = createForeignKey(UniqueKeys.CONSTRAINT_8, org.labun.jooq.subgenerators.table.PetsTable.PETS, "CONSTRAINT_256", org.labun.jooq.subgenerators.table.PetsTable.PETS.OWNER_ID);
    public static final ForeignKey<org.labun.jooq.subgenerators.record.VetSpecialtiesRecord, org.labun.jooq.subgenerators.record.VetsRecord> CONSTRAINT_7 = createForeignKey(UniqueKeys.CONSTRAINT_2, org.labun.jooq.subgenerators.table.VetSpecialtiesTable.VET_SPECIALTIES, "CONSTRAINT_7", org.labun.jooq.subgenerators.table.VetSpecialtiesTable.VET_SPECIALTIES.VET_ID);
    public static final ForeignKey<org.labun.jooq.subgenerators.record.VetSpecialtiesRecord, org.labun.jooq.subgenerators.record.SpecialtiesRecord> CONSTRAINT_7A = createForeignKey(UniqueKeys.CONSTRAINT_4, org.labun.jooq.subgenerators.table.VetSpecialtiesTable.VET_SPECIALTIES, "CONSTRAINT_7A", org.labun.jooq.subgenerators.table.VetSpecialtiesTable.VET_SPECIALTIES.SPECIALTY_ID);
    public static final ForeignKey<org.labun.jooq.subgenerators.record.VisitsRecord, org.labun.jooq.subgenerators.record.PetsRecord> CONSTRAINT_96 = createForeignKey(UniqueKeys.CONSTRAINT_25, org.labun.jooq.subgenerators.table.VisitsTable.VISITS, "CONSTRAINT_96", org.labun.jooq.subgenerators.table.VisitsTable.VISITS.PET_ID);
  }

}