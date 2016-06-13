package solutions.legatus.mservice.mscc.client.Bean.impl;


import solutions.legatus.mservice.mscc.client.Bean.AbstractMsccEntity;
import solutions.legatus.mservice.mscc.client.Bean.AbstractMsccEntityID;
import solutions.legatus.mservice.mscc.client.Bean.IMsccBean;
import solutions.legatus.mservice.mscc.client.Utils.MsccConstants;

import java.sql.Timestamp;
import java.util.*;

/**
 * Created by ahou on 1/28/2016.
 */
public class MsccBeanAdapter implements IMsccBean {


    public final static class Collection extends AbstractMsccEntity {

        private ID  ID;

        private String Account;
        private String SubAccount;
        private MsccCollectionDialogType DialogType;
        private MsccCollectionDialogShare DialogShare;
        private String Folder;

        private Timestamp HalfalogueStartTs;
        private Timestamp ObsoletionTs;

        private String OrganizationCreator;
        private String OfficeCreator;
        private String UserCreator;
        private String UserCreatorEmail;
        private String UserCreatorTelephone;

        private String  OrganizationRqst;
        private String  OfficeRqst;
        private String  UserRqst;
        private String  RefNbrIDRqst;


        public Collection() {
        }

        private Collection( Builder builder ) {
            this.ID = builder.ID;
            this.Account = builder.Account;
            this.SubAccount = builder.SubAccount;
            this.DialogType = builder.DialogType;
            this.DialogShare = builder.DialogShare;
            this.Folder = builder.Folder;
            this.HalfalogueStartTs = builder.HalfalogueStartTs;
            this.ObsoletionTs = builder.ObsoletionTs;
            this.OrganizationCreator = builder.OrganizationCreator;
            this.OfficeCreator = builder.OfficeCreator;
            this.UserCreator = builder.UserCreator;
            this.UserCreatorEmail = builder.UserCreatorEmail;
            this.UserCreatorTelephone = builder.UserCreatorTelephone;
            this.OrganizationRqst = builder.OrganizationRqst;
            this.OfficeRqst = builder.OfficeRqst;
            this.UserRqst = builder.UserRqst;
            this.RefNbrIDRqst = builder.RefNbrIDRqst;
        }

        public Collection.ID getID() {
            return ID;
        }
        public void setID(Collection.ID ID) {
            this.ID = ID;
        }

        public String getAccount() {
            return Account;
        }
        public void setAccount(String account) {
            Account = account;
        }

        public String getSubAccount() {
            return SubAccount;
        }
        public void setSubAccount(String subAccount) {
            SubAccount = subAccount;
        }

        public MsccCollectionDialogType getDialogType() {
            return DialogType;
        }
        public void setDialogType(MsccCollectionDialogType dialogType) {
            DialogType = dialogType;
        }

        public MsccCollectionDialogShare getDialogShare() {
            return DialogShare;
        }
        public void setDialogShare(MsccCollectionDialogShare dialogShare) {
            DialogShare = dialogShare;
        }

        public String getFolder() {
            return Folder;
        }
        public void setFolder(String folder) {
            Folder = folder;
        }

        public Timestamp getHalfalogueStartTs() {
            return HalfalogueStartTs;
        }
        public void setHalfalogueStartTs(Timestamp halfalogueStartTs) {
            HalfalogueStartTs = halfalogueStartTs;
        }

        public Timestamp getObsoletionTs() {
            return ObsoletionTs;
        }
        public void setObsoletionTs(Timestamp obsoletionTs) {
            ObsoletionTs = obsoletionTs;
        }

        public String getOrganizationCreator() {
            return OrganizationCreator;
        }
        public void setOrganizationCreator(String organizationCreator) {
            OrganizationCreator = organizationCreator;
        }

        public String getOfficeCreator() {
            return OfficeCreator;
        }
        public void setOfficeCreator(String officeCreator) {
            OfficeCreator = officeCreator;
        }

        public String getUserCreator() {
            return UserCreator;
        }
        public void setUserCreator(String userCreator) {
            UserCreator = userCreator;
        }

        public String getUserCreatorEmail() {
            return UserCreatorEmail;
        }
        public void setUserCreatorEmail(String userCreatorEmail) {
            UserCreatorEmail = userCreatorEmail;
        }

        public String getUserCreatorTelephone() {
            return UserCreatorTelephone;
        }
        public void setUserCreatorTelephone(String userCreatorTelephone) {
            UserCreatorTelephone = userCreatorTelephone;
        }

        public String getOrganizationRqst() {
            return OrganizationRqst;
        }
        public void setOrganizationRqst(String organizationRqst) {
            OrganizationRqst = organizationRqst;
        }

        public String getOfficeRqst() {
            return OfficeRqst;
        }
        public void setOfficeRqst(String officeRqst) {
            OfficeRqst = officeRqst;
        }

        public String getUserRqst() {
            return UserRqst;
        }
        public void setUserRqst(String userRqst) {
            UserRqst = userRqst;
        }

        public String getRefNbrIDRqst() {
            return RefNbrIDRqst;
        }
        public void setRefNbrIDRqst(String refNbrIDRqst) {
            RefNbrIDRqst = refNbrIDRqst;
        }

        public static Builder getBuilder() {
            return new Builder();
        }

        public static class Builder {
            private ID ID;

            private String Account;
            private String SubAccount;
            private MsccCollectionDialogType DialogType;
            private MsccCollectionDialogShare DialogShare;
            private String Folder;

            private Timestamp HalfalogueStartTs;
            private Timestamp ObsoletionTs;

            private String OrganizationCreator;
            private String OfficeCreator;
            private String UserCreator;
            private String UserCreatorEmail;
            private String UserCreatorTelephone;

            private String  OrganizationRqst;
            private String  OfficeRqst;
            private String  UserRqst;
            private String  RefNbrIDRqst;


            private Builder() {}

            public Builder ID( ID id ) {
                this.ID = id;
                return this;
            }

            public Builder Account( String Account ) {
                this.Account = Account;
                return  this;
            }
            public Builder SubAccount( String SubAccount ) {
                this.SubAccount = SubAccount;
                return  this;
            }
            public Builder DialogType( MsccCollectionDialogType DialogType) {
                this.DialogType = DialogType;
                return  this;
            }
            public Builder DialogShare( MsccCollectionDialogShare DialogShare) {
                this.DialogShare = DialogShare;
                return  this;
            }
            public Builder Folder( String Folder) {
                this.Folder = Folder;
                return  this;
            }
            public Builder HalfalogueStartTs( Timestamp HalfalogueStartTs) {
                this.HalfalogueStartTs = HalfalogueStartTs;
                return  this;
            }
            public Builder ObsoletionTs( Timestamp ObsoletionTs) {
                this.ObsoletionTs = ObsoletionTs;
                return  this;
            }
            public Builder OrganizationCreator( String OrganizationCreator) {
                this.OrganizationCreator = OrganizationCreator;
                return  this;
            }
            public Builder OfficeCreator( String OfficeCreator) {
                this.OfficeCreator = OfficeCreator;
                return  this;
            }
            public Builder UserCreator( String UserCreator) {
                this.UserCreator = UserCreator;
                return  this;
            }
            public Builder UserCreatorEmail( String UserCreatorEmail) {
                this.UserCreatorEmail = UserCreatorEmail;
                return  this;
            }
            public Builder UserCreatorTelephone( String UserCreatorTelephone) {
                this.UserCreatorTelephone = UserCreatorTelephone;
                return  this;
            }
            public Builder OrganizationRqst( String OrganizationRqst) {
                this.OrganizationRqst = OrganizationRqst;
                return  this;
            }
            public Builder OfficeRqst( String OfficeRqst) {
                this.OfficeRqst = OfficeRqst;
                return  this;
            }
            public Builder UserRqst( String UserRqst) {
                this.UserRqst = UserRqst;
                return  this;
            }
            public Builder RefNbrIDRqst( String RefNbrIDRqst) {
                this.RefNbrIDRqst = RefNbrIDRqst;
                return  this;
            }


            public Collection build() {
                Collection collection = new Collection( this );
                return collection;
            }

        }

        public static class ID extends AbstractMsccEntityID {

            private String  OrganizationID;
            private String  OfficeID;
            private String  UserID;
            private String  RefNbrID;

            public ID() {
            }

            public ID(String organizationID, String officeID, String userID, String refNbrID) {
                OrganizationID = organizationID;
                OfficeID = officeID;
                UserID = userID;
                RefNbrID = refNbrID;
            }

            public String getOrganizationID() {
                return OrganizationID;
            }

            public void setOrganizationID(String organizationID) {
                OrganizationID = organizationID;
            }

            public String getOfficeID() {
                return OfficeID;
            }

            public void setOfficeID(String officeID) {
                OfficeID = officeID;
            }

            public String getUserID() {
                return UserID;
            }

            public void setUserID(String userID) {
                UserID = userID;
            }

            public String getRefNbrID() {
                return RefNbrID;
            }

            public void setRefNbrID(String refNbrID) {
                RefNbrID = refNbrID;
            }


            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                ID id = (ID) o;
                return OrganizationID.equals( id.OrganizationID ) &&
                        OfficeID.equals( id.OfficeID ) &&
                        UserID.equals( id.UserID ) &&
                        RefNbrID.equals( id.RefNbrID );
            }

//            @Override
//            public int hashCode() {
//                return Objects.hash(OrganizationID, OfficeID, UserID, RefNbrID);
//            }

            public static int hashCode(Object object) {
                return object == null ? 0 : object.hashCode();
            }

            @Override
            public String toString() {
                return "ID{" +
                        "OrganizationID='" + OrganizationID + '\'' +
                        ", OfficeID='" + OfficeID + '\'' +
                        ", UserID='" + UserID + '\'' +
                        ", RefNbrID='" + RefNbrID + '\'' +
                        '}';
            }
        }


        @Override
        public String toString() {
            return "Collection{" +
                    "ID=" + ID +
                    ", Account='" + Account + '\'' +
                    ", SubAccount='" + SubAccount + '\'' +
                    ", DialogType='" + DialogType + '\'' +
                    ", DialogShare='" + DialogShare + '\'' +
                    ", Folder='" + Folder + '\'' +
                    ", HalfalogueStartTs=" + HalfalogueStartTs +
                    ", ObsoletionTs=" + ObsoletionTs +
                    ", OrganizationCreator='" + OrganizationCreator + '\'' +
                    ", OfficeCreator='" + OfficeCreator + '\'' +
                    ", UserCreator='" + UserCreator + '\'' +
                    ", UserCreatorEmail='" + UserCreatorEmail + '\'' +
                    ", UserCreatorTelephone='" + UserCreatorTelephone + '\'' +
                    ", OrganizationRqst='" + OrganizationRqst + '\'' +
                    ", OfficeRqst='" + OfficeRqst + '\'' +
                    ", UserRqst='" + UserRqst + '\'' +
                    ", RefNbrIDRqst='" + RefNbrIDRqst + '\'' +
                    '}';
        }
    }

    public final static class Folder extends AbstractMsccEntity {

        private ID ID;

        private String  CollectionOrganization;
        private String  CollectionOffice;
        private String  CollectionUser;
        private String  CollectionRefNbr;
        private Timestamp CreatedTs;
        private Timestamp DeactivatedTs;

        public Folder( Builder builder ) {
            this.ID = builder.ID;
            this.CollectionOrganization = builder.CollectionOrganization;
            this.CollectionOffice = builder.CollectionOffice;
            this.CollectionUser = builder.CollectionUser;
            this.CollectionRefNbr = builder.CollectionRefNbr;

        }
        public ID getID() {
            return ID;
        }
        public void setID( ID ID) {
            this.ID = ID;
        }

        public String getCollectionOrganization() {
            return CollectionOrganization;
        }
        public void setCollectionOrganization( String collectionOrganizationID ) {
            this.CollectionOrganization = collectionOrganizationID;
        }

        public String getCollectionOffice() {
            return CollectionOffice;
        }
        public void setCollectionOffice( String collectionOfficeID) {
            this.CollectionOffice = collectionOfficeID;
        }

        public String getCollectionUser() {
            return CollectionUser;
        }
        public void setCollectionUser(String collectionUserID) {
            this.CollectionUser = collectionUserID;
        }

        public String getCollectionRefNbr() {
            return CollectionRefNbr;
        }
        public void setCollectionRefNbr(String collectionRefNbrID) {
            this.CollectionRefNbr = collectionRefNbrID;
        }

        public Timestamp getCreatedTs() {
            return CreatedTs;
        }
        public void setCreatedTs(Timestamp createdTs) {
            CreatedTs = createdTs;
        }

        public Timestamp getDeactivatedTs() {
            return DeactivatedTs;
        }
        public void setDeactivatedTs(Timestamp deactivatedTs) {
            DeactivatedTs = deactivatedTs;
        }

        public static Builder getBuilder() {
            return new Builder();
        }

        public  static class Builder {

            private ID ID;

            private String  CollectionOrganization;
            private String  CollectionOffice;
            private String  CollectionUser;
            private String  CollectionRefNbr;

            private Timestamp CreatedTs;
            private Timestamp DeactivatedTs;

            private Builder() {}

            public Builder ID( ID ID) {
                this.ID = ID;
                return  this;

            }

            public Builder OrganizationCollection( String organizationCollection ) {
                this.CollectionOrganization = organizationCollection;
                return  this;
            }

            public Builder OfficeCollection( String officeCollection ) {
                this.CollectionOffice = officeCollection;
                return  this;
            }

            public Builder UserCollection( String userCollection) {
                this.CollectionUser = userCollection;
                return  this;
            }

            public Builder RefNbrCollection( String refnbrCollection ) {
                this.CollectionRefNbr = refnbrCollection;
                return  this;
            }
            public Builder CreatedTs( Timestamp OrganizationCreatedTs ) {
                this.CreatedTs = OrganizationCreatedTs;
                return this;
            }
            public Builder DeactivatedTs( Timestamp OrganizationDeactivatedTs ) {
                this.DeactivatedTs = OrganizationDeactivatedTs;
                return this;
            }

            public Folder build() {
                Folder folder = new Folder( this );
                return folder;
            }

        }


        public static class ID  extends AbstractMsccEntityID {

            private String  OrganizationID;
            private String  OfficeID;
            private String  UserID;
            private String  FolderID;

            public ID() {
            }

            public ID( String organizationID, String officeID, String userID, String folderID ) {
                OrganizationID = organizationID;
                OfficeID = officeID;
                UserID = userID;
                FolderID = folderID;
            }

            public String getOrganizationID() {
                return OrganizationID;
            }
            public void setOrganizationID(String organizationID) {
                OrganizationID = organizationID;
            }

            public String getOfficeID() {
                return OfficeID;
            }
            public void setOfficeID(String officeID) {
                OfficeID = officeID;
            }

            public String getUserID() {
                return UserID;
            }
            public void setUserID(String userID) {
                UserID = userID;
            }

            public String getFolderID() {
                return FolderID;
            }
            public void setFolderID(String folderID) {
                FolderID = folderID;
            }

            @Override
            public boolean equals( Object o ) {
                if( this == o ) return true;
                if( o == null || getClass() != o.getClass() ) return false;
                ID that = ( ID )o;

                return  ( OrganizationID.equals( that.getOrganizationID() ) ) &&
                        ( OfficeID.equals( that.getOfficeID() ) ) &&
                        ( UserID.equals( that.getUserID() )  ) &&
                        ( FolderID.equals( that.getFolderID() )  );
            }

            //@Override
            //public int hashCode() {
            //    return Objects.hash( OrganizationID, OfficeID, UserID, FolderID );
            //}

            public static int hashCode(Object object) {
                return object == null ? 0 : object.hashCode();
            }

            @Override
            public String toString() {
                return "MsccFolderID{" +
                        "OrganizationID='" + OrganizationID + '\'' +
                        ", OfficeID='" + OfficeID + '\'' +
                        ", UserID='" + UserID + '\'' +
                        ", FolderID='" + FolderID + '\'' +
                        '}';
            }

        }

        @Override
        public String toString() {
            return "MsccFolder{" +
                    "ID=" + ID +
                    ", collectionOrganizationID='" + CollectionOrganization + '\'' +
                    ", collectionOfficeID='" + CollectionOffice + '\'' +
                    ", collectionUserID='" + CollectionUser + '\'' +
                    ", collectionRefNbrID='" + CollectionRefNbr + '\'' +
                    '}';
        }
    }


    public final static class FolderContents  extends AbstractMsccEntity {

        private ID ID;
        private Timestamp FolderTs;

        public FolderContents() {
        }

        public FolderContents( ID ID ) {
            this.ID = ID;
        }

        public FolderContents( Builder builder ) {
            this.ID = builder.ID;
        }

        public ID getID() {
            return ID;
        }
        public void setID(ID ID) {
            this.ID = ID;
        }

        public Timestamp getFolderTs() {
            return this.FolderTs;
        }
        public void setFolderTs(Timestamp folderTs) {
            this.FolderTs = folderTs;
        }

        public static Builder getBuilder() {
            return new Builder();
        }

        public  static class Builder {

            private ID ID;

            private Builder() {}

            public Builder ID( ID ID) {
                this.ID = ID;
                return  this;
            }

            public FolderContents build() {
                FolderContents msccFolderContents = new FolderContents( this );
                return msccFolderContents;
            }

        }

        public static class ID extends AbstractMsccEntityID {

            private String  OrganizationID;
            private String  OfficeID;
            private String  UserID;
            private String  FolderID;

            private String  CollectionOrganization;
            private String  CollectionOffice;
            private String  CollectionUser;
            private String  CollectionRefNbr;
            private Integer     SequenceID;

            public ID() {
            }

            public ID(String organizationID, String officeID, String userID, String folderID, String collectionOrganization, String collectionOffice, String collectionUser, String collectionRefNbr, int SequenceID) {
                this.OrganizationID = organizationID;
                this.OfficeID = officeID;
                this.UserID = userID;
                this.FolderID = folderID;

                this.CollectionOrganization = collectionOrganization;
                this.CollectionOffice = collectionOffice;
                this.CollectionUser = collectionUser;
                this.CollectionRefNbr = collectionRefNbr;

                this.SequenceID = SequenceID;
            }

            public String getOrganizationID() {
                return this.OrganizationID;
            }
            public void setOrganizationID(String organizationID) {
                this.OrganizationID = organizationID;
            }

            public String getOfficeID() {
                return this.OfficeID;
            }
            public void setOfficeID(String officeID) {
                this.OfficeID = officeID;
            }

            public String getUserID() {
                return this.UserID;
            }
            public void setUserID(String userID) {
                this.UserID = userID;
            }

            public String getFolderID() {
                return this.FolderID;
            }
            public void setFolderID(String folderID) {
                this.FolderID = folderID;
            }

            public String getCollectionOrganization() {
                return this.CollectionOrganization;
            }
            public void setCollectionOrganization(String collectionOrganization) {
                this.CollectionOrganization = collectionOrganization;
            }

            public String getCollectionOffice() {
                return this.CollectionOffice;
            }
            public void setCollectionOffice(String collectionOffice) {
                this.CollectionOffice = collectionOffice;
            }

            public String getCollectionUser() {
                return this.CollectionUser;
            }
            public void setCollectionUser(String collectionUser) {
                this.CollectionUser = collectionUser;
            }

            public String getCollectionRefNbr() {
                return this.CollectionRefNbr;
            }
            public void setCollectionRefNbr(String collectionRefNbr) {
                this.CollectionRefNbr = collectionRefNbr;
            }

            public Integer getSequenceID() {
                return this.SequenceID;
            }
            public void setSequenceID( Integer sequenceID ) {
                this.SequenceID = sequenceID;
            }

            @Override
            public boolean equals(Object o) {

                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                ID that = (ID) o;

                return  OrganizationID.equals( that.getOrganizationID() ) &&
                        OfficeID.equals(      that.getOfficeID() ) &&
                        UserID.equals(        that.getUserID() ) &&
                        FolderID.equals(      that.getFolderID() ) &&
                        CollectionOrganization.equals( that.getCollectionOrganization() ) &&
                        CollectionOffice.equals(       that.getCollectionOffice() ) &&
                        CollectionUser.equals(         that.getCollectionUser() ) &&
                        CollectionRefNbr.equals(       that.getCollectionRefNbr() ) &&
                        SequenceID == that.getSequenceID()
                        ;
            }

//            @Override
//            public int hashCode() {
//                return Objects.hash(OrganizationID, OfficeID, UserID, FolderID, CollectionOrganization, CollectionOffice, CollectionUser, CollectionRefNbr );
//            }

            public static int hashCode(Object object) {
                return object == null ? 0 : object.hashCode();
            }

            @Override
            public String toString() {
                return "ID{" +
                        "OrganizationID='" + OrganizationID + '\'' +
                        ", OfficeID='" + OfficeID + '\'' +
                        ", UserID='" + UserID + '\'' +
                        ", FolderID='" + FolderID + '\'' +
                        ", CollectionOrganization='" + CollectionOrganization + '\'' +
                        ", CollectionOffice='" + CollectionOffice + '\'' +
                        ", CollectionUser='" + CollectionUser + '\'' +
                        ", CollectionRefNbr='" + CollectionRefNbr + '\'' +
                        ", SequenceID=" + SequenceID +
                        '}';
            }
        }


        @Override
        public String toString() {
            return "FolderContents{" +
                    "ID=" + ID +
                    ", FolderTs=" + FolderTs +

                    '}';
        }
    }

    public final static class Organization extends AbstractMsccEntity {

        private ID ID;
        private MsccOrganizationCountry Country;
        private MsccOrganizationLevel GovLevel;
        private String Name;
        private MsccOrganizationType Type;
        private Timestamp CreatedTs;
        private Timestamp DeactivatedTs;

        public Organization() {
        }

        public ID getID() {
            return ID;
        }
        public void setID(ID id) {
            this.ID = id;
        }

        public MsccOrganizationCountry getCountry() {
            return Country;
        }
        public void setCountry(MsccOrganizationCountry Country) {
            this.Country = Country;
        }

        public MsccOrganizationLevel getGovLevel() {
            return this.GovLevel;
        }
        public void setGovLevel(MsccOrganizationLevel GovLevel) {
            this.GovLevel = GovLevel;
        }

        public String getName() {
            return Name;
        }
        public void setName(String Name) {
            this.Name = Name;
        }

        public MsccOrganizationType getType() {
            return Type;
        }
        public void setType(MsccOrganizationType Type) {
            this.Type = Type;
        }

        public Timestamp getCreatedTs() {
            return CreatedTs;
        }
        public void setCreatedTs( Timestamp CreatedTs) {
            this.CreatedTs = CreatedTs;
        }
        public Timestamp getDeactivatedTs() {
            return DeactivatedTs;
        }
        public void setDeactivatedTs( Timestamp DeactivatedTs) {
            this.DeactivatedTs = DeactivatedTs;
        }


        private Organization( Builder builder ) {
            this.ID             = builder.ID;
            this.Country        = builder.Country;
            this.GovLevel       = builder.GovLevel;
            this.Name           = builder.Name;
            this.Type           = builder.Type;
            this.CreatedTs      = builder.CreatedTs;
            this.DeactivatedTs  = builder.DeactivatedTs;
        }

        public static Builder getBuilder() {
            return new Builder();
        }

        public static class Builder {

            private ID ID;
            private MsccOrganizationCountry Country;
            private MsccOrganizationLevel GovLevel;
            private String Name;
            private MsccOrganizationType Type;
            private Timestamp CreatedTs;
            private Timestamp DeactivatedTs;


            private Builder() {}

            public Builder ID( ID OrganizationID) {
                this.ID = OrganizationID;
                return this;
            }
            public Builder Country( MsccOrganizationCountry OrganizationCountry ) {
                this.Country = OrganizationCountry;
                return this;
            }
            public Builder GovLevel( MsccOrganizationLevel OrganizationGovLevel ) {
                this.GovLevel = OrganizationGovLevel;
                return this;
            }
            public Builder Name( String OrganizationName ) {
                this.Name = OrganizationName;
                return this;
            }
            public Builder Type( MsccOrganizationType OrganizationType ) {
                this.Type = OrganizationType;
                return this;
            }
            public Builder CreatedTs( Timestamp OrganizationCreatedTs ) {
                this.CreatedTs = OrganizationCreatedTs;
                return this;
            }
            public Builder DeactivatedTs( Timestamp OrganizationDeactivatedTs ) {
                this.DeactivatedTs = OrganizationDeactivatedTs;
                return this;
            }

            public Organization build() {
                Organization organization = new Organization( this );

                return organization;
            }

        }

        public static class ID extends AbstractMsccEntityID {
            private String OrganizationID;

            public ID() {
            }

            public ID(String organizationID) {
                OrganizationID = organizationID;
            }

            public String getOrganizationID() {
                return this.OrganizationID;
            }

            public void setOrganizationID(String organizationID) {
                this.OrganizationID = organizationID;
            }

            public boolean equals(Object o) {
                if (this == o) return true;

                if (o == null || getClass() != o.getClass()) return false;
                ID id = (ID) o;

                return OrganizationID.equals(  id.OrganizationID);
            }

//            @Override
//            public int hashCode() {
//                return Objects.hash(OrganizationID);
//            }

            public static int hashCode(Object object) {
                return object == null ? 0 : object.hashCode();
            }

            @Override
            public String toString() {
                return "ID{" +
                        "OrganizationID='" + OrganizationID + '\'' +
                        '}';
            }
        }

//        public void update( MsccBeanAdapter.Organization bean ) {
//            Optional.of( bean ).ifPresent(
//                    x ->  {
//                        this.update( x.getCountry() , x.getGovLevel(), x.getName(), x.getType(), x.getCreatedTs(),  x.getDeactivatedTs() );
//                    } );
//        }
//
//        public void update( MsccOrganizationCountry Country, MsccOrganizationLevel GovLevel, String Name, MsccOrganizationType Type, Timestamp CreatedTs, Timestamp DeactivatedTs ) {
//            Optional.ofNullable(  Country ).ifPresent(       (x) -> this.setCountry( x ) );
//            Optional.ofNullable(  GovLevel ).ifPresent(      (x) -> this.setGovLevel( x ) );
//            Optional.ofNullable(  Name ).ifPresent(          (x) -> this.setName( x ) );
//            Optional.ofNullable(  Type ).ifPresent(          (x) -> this.setType( x ) );
//            Optional.ofNullable(  CreatedTs ).ifPresent(     (x) -> this.setCreatedTs( x ) );
//            Optional.ofNullable(  DeactivatedTs ).ifPresent( (x) -> this.setDeactivatedTs( x ) );
//        }



        @Override
        public String toString() {
            return "Organization{" +
                    "OrganizationID='" + ID + '\'' +
                    ", OrganizationCountry='" + Country + '\'' +
                    ", OrganizationGovLevel='" + GovLevel + '\'' +
                    ", OrganizationName='" + Name + '\'' +
                    ", OrganizationType='" + Type + '\'' +
                    ", OrganizationCreatedTs=" + CreatedTs +
                    ", OrganizationDeactivatedTs=" + DeactivatedTs +
                    '}';
        }
    }

    public final static class Office extends AbstractMsccEntity {

        private MsccBeanAdapter.Office.ID ID;
        private String Address1;
        private String Address2;
        private String City;
        private String Jurisdiction;
        private String MainTele;
        private String Desc;
        private String Postal;
        private String Website;
        private Timestamp CreatedTs;
        private Timestamp DeactivatedTs;


        public Office() {
        }

        private Office( Builder builder ) {
            this.ID                 = builder.ID;
            this.Address1           = builder.Address1;
            this.Address2           = builder.Address2;
            this.City               = builder.City;
            this.Jurisdiction       = builder.Jurisdiction;
            this.MainTele           = builder.MainTele;
            this.Desc               = builder.Desc;
            this.Postal             = builder.Postal;
            this.Website            = builder.Website;
            this.CreatedTs          = builder.CreatedTs;
            this.DeactivatedTs      = builder.DeactivatedTs;
        }

        public static Builder getBuilder() {
            return new Builder();
        }


        public Office.ID getID() {
            return ID;
        }

        public void setID(Office.ID ID) {
            this.ID = ID;
        }

        public String getAddress1() {
            return Address1;
        }

        public void setAddress1(String address1) {
            Address1 = address1;
        }

        public String getAddress2() {
            return Address2;
        }

        public void setAddress2(String address2) {
            Address2 = address2;
        }

        public String getCity() {
            return City;
        }

        public void setCity(String city) {
            City = city;
        }

        public String getJurisdiction() {
            return Jurisdiction;
        }

        public void setJurisdiction(String jurisdiction) {
            Jurisdiction = jurisdiction;
        }

        public String getMainTele() {
            return MainTele;
        }

        public void setMainTele(String mainTele) {
            MainTele = mainTele;
        }

        public String getDesc() {
            return Desc;
        }

        public void setDesc(String Desc) {
            this.Desc = Desc;
        }

        public String getPostal() {
            return Postal;
        }

        public void setPostal(String postal) {
            Postal = postal;
        }

        public String getWebsite() {
            return Website;
        }

        public void setWebsite(String website) {
            Website = website;
        }

        public Timestamp getCreatedTs() {
            return CreatedTs;
        }

        public void setCreatedTs(Timestamp CreatedTs) {
            CreatedTs = CreatedTs;
        }

        public Timestamp getDeactivatedTs() {
            return DeactivatedTs;
        }

        public void setDeactivatedTs(Timestamp DeactivatedTs) {
            DeactivatedTs = DeactivatedTs;
        }


        public static class Builder {

            private ID ID;
            private String Address1;
            private String Address2;
            private String City;
            private String Jurisdiction;
            private String MainTele;
            private String Desc;
            private String Postal;
            private String Website;
            private Timestamp CreatedTs;
            private Timestamp DeactivatedTs;

            private Builder() {}

            public Builder ID(ID id) {
                this.ID = id;
                return  this;
            }
            public Builder Address1(String Address1 ) {
                this.Address1 = Address1;
                return this;
            }
            public Builder Address2( String Address2 ) {
                this.Address2 = Address2;
                return this;
            }
            public Builder City( String City ) {
                this.City = City;
                return this;
            }
            public Builder Jurisdiction( String JurisDiction ) {
                this.Jurisdiction = JurisDiction;
                return this;
            }
            public Builder MainTele( String MainTele ) {
                this.MainTele = MainTele;
                return this;
            }
            public Builder Desc( String Desc ) {
                this.Desc = Desc;
                return this;
            }
            public Builder Postal( String Postal ) {
                this.Postal = Postal;
                return this;

            }
            public Builder Website( String Website ) {
                this.Website = Website;
                return this;
            }

            public Builder CreatedTs( Timestamp CreatedTs ) {
                this.CreatedTs = CreatedTs;
                return this;
            }
            public Builder DeactivatedTs( Timestamp DeactivatedTs ) {
                this.DeactivatedTs  = DeactivatedTs;
                return this;

            }


            public Office build() {
                Office office = new Office( this );
                return office;
            }

        }


        public static class ID extends AbstractMsccEntityID  {

            private String OrganizationID;
            private String OfficeID;

            public ID() {
            }
            public ID(String organizationID, String officeID) {
                OrganizationID = organizationID;
                OfficeID = officeID;
            }

            public String getOrganizationID() {
                return OrganizationID;
            }
            public void setOrganizationID(String organizationID) {
                this.OrganizationID = organizationID;
            }

            public String getOfficeID() {
                return OfficeID;
            }
            public void setOfficeID(String officeID) {
                this.OfficeID = officeID;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                ID id = (ID) o;
                return OrganizationID.equals( id.OrganizationID ) &&
                             OfficeID.equals( id.OfficeID );
            }

//            @Override
//            public int hashCode() {
//                return Objects.hash(OrganizationID, OfficeID);
//            }

            public static int hashCode(Object object) {
                return object == null ? 0 : object.hashCode();
            }

            @Override
            public String toString() {
                return "ID{" +
                        "OrganizationID='" + OrganizationID + '\'' +
                        ", OfficeID='" + OfficeID + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "Office{" +
                    "ID=" + ID +
                    ", Address1='" + Address1 + '\'' +
                    ", Address2='" + Address2 + '\'' +
                    ", City='" + City + '\'' +
                    ", Jurisdiction='" + Jurisdiction + '\'' +
                    ", MainTele='" + MainTele + '\'' +
                    ", Desc='" + Desc + '\'' +
                    ", Postal='" + Postal + '\'' +
                    ", Website='" + Website + '\'' +
                    ", CreatedTs=" + CreatedTs +
                    ", DeactivatedTs=" + DeactivatedTs +
                    '}';
        }

//        public void update( MsccBeanAdapter.Office model ) {
//
//            Optional.of( model ).ifPresent(
//                    x ->  {
//                        update( x.getAddress1() , x.getAddress2(), x.getCity(), x.getJurisdiction(), x.getMainTele(), x.getDesc(), x.getPostal(), x.getWebsite(), x.getCreatedTs(),  x.getDeactivatedTs() );
//                    } );
//
//        }
//
//        public void update( String Address1, String Address2, String City, String Jurisdiction, String MainTele, String Desc, String Postal, String Website, Timestamp CreatedTs, Timestamp DeactivatedTs  ) {
//
//            Optional.ofNullable( Address1 ).ifPresent(x -> setAddress1( x ) );
//            Optional.ofNullable( Address2 ).ifPresent( x -> setAddress2( x ) );
//            Optional.ofNullable( City ).ifPresent( x -> setCity( x ) );
//            Optional.ofNullable( Jurisdiction ).ifPresent( x -> setJurisdiction( x ) );
//            Optional.ofNullable( MainTele ).ifPresent( x -> setMainTele( x ) );
//            Optional.ofNullable( Desc ).ifPresent( x -> setDesc( x ) );
//            Optional.ofNullable( Postal ).ifPresent( x ->setPostal( x ) );
//            Optional.ofNullable( Website ).ifPresent( x -> setWebsite( x ) );
//            Optional.ofNullable( CreatedTs ).ifPresent( x -> setCreatedTs( x ) );
//            Optional.ofNullable( DeactivatedTs ).ifPresent( x ->setDeactivatedTs( x ));
//
//        }


    }

    public final static class User extends AbstractMsccEntity {

        private ID ID;

        private String Name;
        private MsccUserPersonalTitle PersonalTitle;
        private String TeleDaytime;
        private String TeleOffhours;
        private String Timezone;
        private String Title;
        private String Credential;
        private String Email;
        private Timestamp CreatedTs;
        private Timestamp DeactivatedTs;

        public User() {
        }

        private User( Builder builder ) {
            this.ID = builder.ID;
            this.Name = builder.Name;
            this.PersonalTitle = builder.PersonalTitle;
            this.TeleDaytime = builder.TeleDaytime;
            this.TeleOffhours = builder.TeleOffhours;
            this.Timezone = builder.Timezone;
            this.Title = builder.Title;
            this.Credential = builder.Credential;
            this.Email = builder.Email;
            this.CreatedTs = builder.CreatedTs;
            this.DeactivatedTs = builder.DeactivatedTs;
        }

        public static Builder getBuilder() {
            return new Builder();
        }

        public User.ID getID() {
            return ID;
        }
        public void setID(User.ID ID) {
            this.ID = ID;
        }

        public String getName() {
            return Name;
        }
        public void setName(String name) {
            Name = name;
        }

        public MsccUserPersonalTitle getPersonalTitle() {
            return this.PersonalTitle;
        }
        public void setPersonalTitle(MsccUserPersonalTitle personalTitle) {
            PersonalTitle = personalTitle;
        }

        public String getTeleDaytime() {
            return TeleDaytime;
        }
        public void setTeleDaytime(String teleDaytime) {
            TeleDaytime = teleDaytime;
        }

        public String getTeleOffhours() {
            return TeleOffhours;
        }
        public void setTeleOffhours(String teleOffhours) {
            TeleOffhours = teleOffhours;
        }

        public String getTimezone() {
            return Timezone;
        }
        public void setTimezone(String timezone) {
            Timezone = timezone;
        }

        public String getTitle() {
            return Title;
        }
        public void setTitle(String title) {
            Title = title;
        }

        public String getCredential() {
            return this.Credential;
        }
        public void setCredential(String userCredential) {
            this.Credential = userCredential;
        }

        public String getEmail() {
            return this.Email;
        }
        public void setEmail(String userEmail) {
            this.Email = userEmail;
        }

        public Timestamp getCreatedTs() {
            return this.CreatedTs;
        }
        public void setCreatedTs(Timestamp userCreatedTs) {
            this.CreatedTs = userCreatedTs;
        }

        public Timestamp getDeactivatedTs() {
            return this.DeactivatedTs;
        }
        public void setDeactivatedTs(Timestamp userDeactivatedTs) {
            this.DeactivatedTs = userDeactivatedTs;
        }

        public static class ID extends AbstractMsccEntityID {

            private String OrganizationID;
            private String UserID;

            public ID() {
            }

            public ID(String organizationID, String userID) {
                this.OrganizationID = organizationID;
                this.UserID = userID;
            }

            public String getOrganizationID() {
                return OrganizationID;
            }
            public void setOrganizationID(String organizationID) {
                OrganizationID = organizationID;
            }

            public String getUserID() {
                return UserID;
            }
            public void setUserID(String userID) {
                UserID = userID;
            }

            @Override
            public boolean equals(Object o) {

                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                ID id = (ID) o;

                return OrganizationID.equals( id.OrganizationID) && UserID.equals( id.UserID );
            }

//            @Override
//            public int hashCode() {
//                return Objects.hash(OrganizationID, UserID);
//            }

            public static int hashCode(Object object) {
                return object == null ? 0 : object.hashCode();
            }

            @Override
            public String toString() {
                return "ID{" +
                        "OrganizationID='" + OrganizationID + '\'' +
                        ", UserID='" + UserID + '\'' +
                        '}';
            }
        }


        public static class Builder  {

            private ID ID;

            private String Name;
            private MsccUserPersonalTitle PersonalTitle;
            private String TeleDaytime;
            private String TeleOffhours;
            private String Timezone;
            private String Title;
            private String Credential;
            private String Email;
            private Timestamp CreatedTs;
            private Timestamp DeactivatedTs;

            private Builder() {}

            public Builder ID(ID id) {
                this.ID = id;
                return  this;
            }

            public Builder Name( String UserName) {
                this.Name = UserName;
                return  this;
            }
            public Builder PersonalTitle( MsccUserPersonalTitle PersonalTitle) {
                this.PersonalTitle = PersonalTitle;
                return  this;
            }
            public Builder TeleDaytime( String TeleDaytime) {
                this.TeleDaytime = TeleDaytime;
                return  this;
            }
            public Builder TeleOffhours( String TeleOffhours) {
                this.TeleOffhours = TeleOffhours;
                return  this;
            }
            public Builder Timezone( String Timezone) {
                this.Timezone = Timezone;
                return  this;
            }
            public Builder Title( String Title) {
                this.Title = Title;
                return  this;
            }
            public Builder Credential( String UserCredential) {
                this.Credential = UserCredential;
                return  this;
            }
            public Builder Email( String UserEmail) {
                this.Email = UserEmail;
                return  this;
            }
            public Builder CreatedTs( Timestamp UserCreatedTs ) {
                this.CreatedTs = UserCreatedTs;
                return  this;
            }
            public Builder DeactivatedTs( Timestamp UserDeactivatedTs ) {
                this.DeactivatedTs = UserDeactivatedTs;
                return  this;
            }

            public User build() {
                User user = new User( this );
                return user;
            }

        }

        @Override
        public String toString() {
            return "User{" +
                    "ID=" + ID +
                    ", Name='" + Name + '\'' +
                    ", PersonalTitle='" + PersonalTitle + '\'' +
                    ", TeleDaytime='" + TeleDaytime + '\'' +
                    ", TeleOffhours='" + TeleOffhours + '\'' +
                    ", Timezone='" + Timezone + '\'' +
                    ", Title='" + Title + '\'' +
                    ", Credential='" + Credential + '\'' +
                    ", Email='" + Email + '\'' +
                    ", CreatedTs=" + CreatedTs +
                    ", DeactivatedTs=" + DeactivatedTs +
                    '}';
        }
    } // end of class user

    public final static class UserOffice extends AbstractMsccEntity {

        private ID ID;
        private String OfficeRole;
        private String OrganizationFacilitator;
        private String UserFacilitator;
        private Timestamp CreatedTs;
        private Timestamp DeactivatedTs;


        public UserOffice() {
        }

        private UserOffice( Builder builder ) {
            this.ID = builder.ID;
            this.OfficeRole = builder.OfficeRole;
            this.OrganizationFacilitator = builder.OrganizationFacilitator;
            this.UserFacilitator = builder.UserFacilitator;
            this.CreatedTs = builder.CreatedTs;
            this.DeactivatedTs = builder.DeactivatedTs;
        }

        public static Builder getBuilder() {
            return new Builder();
        }

        public UserOffice.ID getID() {
            return ID;
        }
        public void setID(UserOffice.ID ID) {
            this.ID = ID;
        }

        public String getOfficeRole() {
            return OfficeRole;
        }
        public void setOfficeRole(String officeRole) {
            OfficeRole = officeRole;
        }

        public String getOrganizationFacilitator() {
            return OrganizationFacilitator;
        }
        public void setOrganizationFacilitator(String organizationFacilitator) {
            OrganizationFacilitator = organizationFacilitator;
        }

        public String getUserFacilitator() {
            return UserFacilitator;
        }
        public void setUserFacilitator(String userFacilitator) {
            UserFacilitator = userFacilitator;
        }

        public Timestamp getCreatedTs() {
            return CreatedTs;
        }
        public void setCreatedTs(Timestamp createdTs) {
            CreatedTs = createdTs;
        }

        public Timestamp getDeactivatedTs() {
            return DeactivatedTs;
        }
        public void setDeactivatedTs(Timestamp deactivatedTs) {
            DeactivatedTs = deactivatedTs;
        }


        public static class Builder {
            private ID ID;
            private String OfficeRole;
            private String OrganizationFacilitator;
            private String UserFacilitator;
            private Timestamp CreatedTs;
            private Timestamp DeactivatedTs;

            private Builder() {}

            public Builder ID( ID id ) {
                this.ID = id;
                return  this;

            }
            public Builder OfficeRole( String OfficeRole) {
                this.OfficeRole = OfficeRole;
                return  this;
            }
            public Builder OrganizationFacilitator( String OrganizationFacilitator) {
                this.OrganizationFacilitator = OrganizationFacilitator;
                return  this;
            }
            public Builder UserFacilitator( String UserFacilitator) {
                this.UserFacilitator = UserFacilitator;
                return  this;
            }
            public Builder CreatedTs( Timestamp UserOfficeCreatedTs ) {
                this.CreatedTs = UserOfficeCreatedTs;
                return  this;
            }
            public Builder DeactivatedTs( Timestamp UserOfficeDeactivatedTs ) {
                this.DeactivatedTs = UserOfficeDeactivatedTs;
                return  this;
            }

            public UserOffice build() {
                UserOffice userOffice = new UserOffice( this );
                return userOffice;
            }
        }

        public static class ID  extends AbstractMsccEntityID {

            private String  OrganizationID;
            private String  OfficeID;
            private String  UserID;

            public ID() {
            }

            public ID(String organizationID, String officeID, String userID) {
                OrganizationID = organizationID;
                OfficeID = officeID;
                UserID = userID;
            }

            public String getOrganizationID() {
                return OrganizationID;
            }

            public void setOrganizationID(String organizationID) {
                OrganizationID = organizationID;
            }

            public String getOfficeID() {
                return OfficeID;
            }

            public void setOfficeID(String officeID) {
                OfficeID = officeID;
            }

            public String getUserID() {
                return UserID;
            }

            public void setUserID(String userID) {
                UserID = userID;
            }


            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                ID id = (ID) o;
                return OrganizationID.equals( id.OrganizationID ) && OfficeID.equals( id.OfficeID ) && UserID.equals( id.UserID );
            }

//            @Override
//            public int hashCode() {
//                return Objects.hash(OrganizationID, OfficeID, UserID);
//            }


            public static int hashCode(Object object) {
                return object == null ? 0 : object.hashCode();
            }

            @Override
            public String toString() {
                return "ID{" +
                        "OrganizationID='" + OrganizationID + '\'' +
                        ", OfficeID='" + OfficeID + '\'' +
                        ", UserID='" + UserID + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "UserOffice{" +
                    "ID=" + ID +
                    ", OfficeRole='" + OfficeRole + '\'' +
                    ", OrganizationFacilitator='" + OrganizationFacilitator + '\'' +
                    ", UserFacilitator='" + UserFacilitator + '\'' +
                    ", CreatedTs=" + CreatedTs +
                    ", DeactivatedTs=" + DeactivatedTs +
                    '}';
        }
    }


    public final static class CollectionObject extends AbstractMsccEntity {

        private ID  ID;

        private MsccCollectionObjectAcq AcqUserService;
        private String IngestMethod;
        private String Instructions;
        private String Handle;
        private String Link;
        private Integer Size;

        private String Type;

        private String MD5Value;

        private String Supersedes;
        private String Superseded_by;

        private Timestamp Created;
        private Timestamp Ingested;
        private Timestamp ObsoletionTs;


        public CollectionObject() {
        }

        private CollectionObject( Builder builder ) {
            this.ID = builder.ID;
            this.AcqUserService = builder.AcqUserService;
            this.IngestMethod = builder.IngestMethod;
            this.Instructions = builder.Instructions;
            this.Handle = builder.Handle;
            this.Link = builder.Link;
            this.Size = builder.Size;
            this.Type = builder.Type;
            this.MD5Value = builder.MD5Value;
            this.Supersedes = builder.Supersedes;
            this.Superseded_by = builder.Superseded_by;
            this.Created = builder.Created;
            this.Ingested = builder.Ingested;
            this.ObsoletionTs = builder.ObsoletionTs;

        }

        public CollectionObject.ID getID() {
            return ID;
        }
        public void setID(CollectionObject.ID ID) {
            this.ID = ID;
        }

        public MsccCollectionObjectAcq getAcqUserService() {
            return AcqUserService;
        }
        public void setAcqUserService(MsccCollectionObjectAcq acqUserService) {
            AcqUserService = acqUserService;
        }

        public String getIngestMethod() {
            return IngestMethod;
        }
        public void setIngestMethod(String ingestMethod) {
            IngestMethod = ingestMethod;
        }

        public String getInstructions() {
            return Instructions;
        }
        public void setInstructions(String instructions) {
            Instructions = instructions;
        }

        public String getHandle() {
            return Handle;
        }
        public void setHandle(String handle) {
            Handle = handle;
        }


        public String getLink() {
            return Link;
        }
        public void setLink(String link) {
            Link = link;
        }

        public Integer getSize() {
            return Size;
        }
        public void setSize(Integer size) {
            Size = size;
        }

        public String getType() {
            return Type;
        }
        public void setType(String type) {
            Type = type;
        }

        public String getMD5Value() {
            return MD5Value;
        }
        public void setMD5Value(String MD5Value) {
            this.MD5Value = MD5Value;
        }

        public String getSupersedes() {
            return Supersedes;
        }
        public void setSupersedes(String supersedes) {
            Supersedes = supersedes;
        }

        public String getSuperseded_by() {
            return Superseded_by;
        }
        public void setSuperseded_by(String superseded_by) {
            Superseded_by = superseded_by;
        }


        public Timestamp getCreated() {
            return Created;
        }
        public void setCreated(Timestamp created) {
            Created = created;
        }

        public Timestamp getIngested() {
            return Ingested;
        }
        public void setIngested(Timestamp ingested) {
            Ingested = ingested;
        }

        public Timestamp getObsoletionTs() {
            return ObsoletionTs;
        }
        public void setObsoletionTs(Timestamp obsoletionTs) {
            ObsoletionTs = obsoletionTs;
        }

        public static Builder getBuilder() {
            return new Builder();
        }


        public static class Builder {
            private ID ID;

            private MsccCollectionObjectAcq AcqUserService;
            private String IngestMethod;
            private String Instructions;
            private String Handle;
            private String Link;
            private Integer Size;

            private String Type;

            private String MD5Value;

            private String Supersedes;
            private String Superseded_by;

            private Timestamp Created;
            private Timestamp Ingested;
            private Timestamp ObsoletionTs;

            private Builder() {}

            public Builder ID( ID id ) {
                this.ID = id;
                return this;
            }

            public Builder AcqUserService( MsccCollectionObjectAcq AcqUserService ) {
                this.AcqUserService = AcqUserService;
                return  this;
            }
            public Builder IngestMethod( String IngestMethod ) {
                this.IngestMethod = IngestMethod;
                return  this;
            }
            public Builder Instructions( String Instructions ) {
                this.Instructions = Instructions;
                return  this;
            }
            public Builder Handle( String Handle ) {
                this.Handle = Handle;
                return  this;
            }
            public Builder Link( String Link ) {
                this.Link = Link;
                return  this;
            }
            public Builder Size( Integer Size ) {
                this.Size = Size;
                return  this;
            }
            public Builder Type( String Type ) {
                this.Type = Type;
                return  this;
            }
            public Builder MD5Value( String MD5Value ) {
                this.MD5Value = MD5Value;
                return  this;
            }
            public Builder Supersedes( String Supersedes ) {
                this.Supersedes = Supersedes;
                return  this;
            }

            public Builder Superseded_by( String Superseded_by ) {
                this.Superseded_by = Superseded_by;
                return  this;
            }
            public Builder Created( Timestamp Created ) {
                this.Created = Created;
                return  this;
            }
            public Builder Ingested( Timestamp Ingested ) {
                this.Ingested = Ingested;
                return  this;
            }
            public Builder ObsoletionTs( Timestamp ObsoletionTs ) {
                this.ObsoletionTs = ObsoletionTs;
                return  this;
            }

            public CollectionObject build() {
                CollectionObject obj = new CollectionObject( this );
                return obj;
            }

        }

        public static class ID extends AbstractMsccEntityID {

            private String  OrganizationID;
            private String  OfficeID;
            private String  UserID;
            private String  RefNbrID;
            private Integer SequenceID;

            public ID() {
            }


            public ID(String organizationID, String officeID, String userID, String refNbrID, Integer sequenceID) {
                OrganizationID = organizationID;
                OfficeID = officeID;
                UserID = userID;
                RefNbrID = refNbrID;
                this.SequenceID = sequenceID;
            }

            public String getOrganizationID() {
                return OrganizationID;
            }

            public void setOrganizationID(String organizationID) {
                OrganizationID = organizationID;
            }

            public String getOfficeID() {
                return OfficeID;
            }

            public void setOfficeID(String officeID) {
                OfficeID = officeID;
            }

            public String getUserID() {
                return UserID;
            }

            public void setUserID(String userID) {
                UserID = userID;
            }

            public String getRefNbrID() {
                return RefNbrID;
            }

            public void setRefNbrID(String refNbrID) {
                RefNbrID = refNbrID;
            }

            public Integer getSequenceID() {
                return SequenceID;
            }

            public void setSequenceID(Integer sequenceID) {
                this.SequenceID = sequenceID;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                ID id = (ID) o;
                return OrganizationID.equals( id.OrganizationID) &&
                        OfficeID.equals(id.OfficeID) &&
                        UserID.equals( id.UserID) &&
                        RefNbrID.equals( id.RefNbrID) &&
                        SequenceID == id.SequenceID;
            }

//            @Override
//            public int hashCode() {
//                return Objects.hash(OrganizationID, OfficeID, UserID, RefNbrID, SequenceID);
//            }


            public static int hashCode(Object object) {
                return object == null ? 0 : object.hashCode();
            }

            @Override
            public String toString() {
                return "ID{" +
                        "OrganizationID='" + OrganizationID + '\'' +
                        ", OfficeID='" + OfficeID + '\'' +
                        ", UserID='" + UserID + '\'' +
                        ", RefNbrID='" + RefNbrID + '\'' +
                        ", sequenceID=" + SequenceID +
                        '}';
            }
        }


        @Override
        public String toString() {
            return "CollectionObject{" +
                    "ID=" + ID +
                    ", AcqUserService='" + AcqUserService + '\'' +
                    ", IngestMethod='" + IngestMethod + '\'' +
                    ", Instructions='" + Instructions + '\'' +
                    ", Handle='" + Handle + '\'' +
                    ", Link='" + Link + '\'' +
                    ", Size=" + Size +
                    ", Type='" + Type + '\'' +
                    ", MD5Value='" + MD5Value + '\'' +
                    ", Supersedes='" + Supersedes + '\'' +
                    ", Superseded_by='" + Superseded_by + '\'' +
                    ", Created=" + Created +
                    ", Ingested=" + Ingested +
                    ", ObsoletionTs=" + ObsoletionTs +
                    '}';
        }
    }


    public final static class SentTo extends AbstractMsccEntity {

        private ID ID;
        private MsccObjectSentToRight AccessRightSentTo;
        private String ActionDescSentTo;
        private MsccObjectSentToAction ActionRequestedSentTo;
        private Timestamp ActionTimeRequired;
        private MsccObjectSentToPriority ActionSenderPriority;
        private String ActionStatusSentTo;
        private String OrganizationSender;
        private String OfficeSender;
        private String UserSender;


        public SentTo() {
        }

        private SentTo( Builder builder ) {
            this.ID = builder.ID;

            this.AccessRightSentTo      = builder.AccessRightSentTo;
            this.ActionDescSentTo       = builder.ActionDescSentTo;
            this.ActionRequestedSentTo  = builder.ActionRequestedSentTo;
            this.ActionTimeRequired     = builder.ActionTimeRequired;
            this.ActionSenderPriority   = builder.ActionSenderPriority;
            this.ActionStatusSentTo     = builder.ActionStatusSentTo;
            this.OrganizationSender     = builder.OrganizationSender;
            this.OfficeSender           = builder.OfficeSender;
            this.UserSender             = builder.UserSender;


        }
        public SentTo.ID getID() {
            return ID;
        }
        public void setID( SentTo.ID ID) {
            this.ID = ID;
        }

        public MsccObjectSentToRight getAccessRightSentTo() {
            return this.AccessRightSentTo;
        }
        public void setAccessRightSentTo(MsccObjectSentToRight accessRightSentTo) {
            AccessRightSentTo = accessRightSentTo;
        }

        public String getActionDescSentTo() {
            return ActionDescSentTo;
        }
        public void setActionDescSentTo(String actionDescSentTo) {
            ActionDescSentTo = actionDescSentTo;
        }

        public MsccObjectSentToAction getActionRequestedSentTo() {
            return ActionRequestedSentTo;
        }
        public void setActionRequestedSentTo(MsccObjectSentToAction actionRequestedSentTo) {
            ActionRequestedSentTo = actionRequestedSentTo;
        }

        public Timestamp getActionTimeRequired() {
            return ActionTimeRequired;
        }
        public void setActionTimeRequired(Timestamp actionTimeRequired) {
            ActionTimeRequired = actionTimeRequired;
        }

        public MsccObjectSentToPriority getActionSenderPriority() {
            return ActionSenderPriority;
        }
        public void setActionSenderPriority(MsccObjectSentToPriority actionSenderPriority) {
            ActionSenderPriority = actionSenderPriority;
        }

        public String getActionStatusSentTo() {
            return ActionStatusSentTo;
        }
        public void setActionStatusSentTo(String actionStatusSentTo) {
            ActionStatusSentTo = actionStatusSentTo;
        }

        public String getOrganizationSender() {
            return OrganizationSender;
        }
        public void setOrganizationSender(String organizationSender) {
            OrganizationSender = organizationSender;
        }

        public String getOfficeSender() {
            return OfficeSender;
        }
        public void setOfficeSender(String officeSender) {
            OfficeSender = officeSender;
        }

        public String getUserSender() {
            return UserSender;
        }
        public void setUserSender(String userSender) {
            UserSender = userSender;
        }



        public static Builder getBuilder() {
            return new Builder();
        }

        public static class Builder {
            private ID ID;
            private MsccObjectSentToRight AccessRightSentTo;
            private String ActionDescSentTo;
            private MsccObjectSentToAction ActionRequestedSentTo;
            private Timestamp ActionTimeRequired;
            private MsccObjectSentToPriority ActionSenderPriority;
            private String ActionStatusSentTo;
            private String OrganizationSender;
            private String OfficeSender;
            private String UserSender;


            private Builder() {}

            public Builder ID( ID ID) {
                this.ID = ID;
                return  this;

            }

            public Builder AccessRightSentTo( MsccObjectSentToRight AccessRightSentTo) {
                this.AccessRightSentTo = AccessRightSentTo;
                return  this;
            }
            public Builder ActionDescSentTo( String ActionDescSentTo ) {
                this.ActionDescSentTo = ActionDescSentTo;
                return  this;
            }
            public Builder ActionRequestedSentTo( MsccObjectSentToAction ActionRequestedSentTo ) {
                this.ActionRequestedSentTo = ActionRequestedSentTo;
                return  this;
            }
            public Builder ActionTimeRequired( Timestamp ActionTimeRequired) {
                this.ActionTimeRequired = ActionTimeRequired;
                return  this;
            }
            public Builder ActionSenderPriority( MsccObjectSentToPriority ActionSenderPriority) {
                this.ActionSenderPriority = ActionSenderPriority;
                return  this;
            }
            public Builder ActionStatusSentTo( String ActionStatusSentTo) {
                this.ActionStatusSentTo = ActionStatusSentTo;
                return  this;
            }
            public Builder OrganizationSender( String OrganizationSender) {
                this.OrganizationSender = OrganizationSender;
                return  this;
            }
            public Builder OfficeSender( String OfficeSender ) {
                this.OfficeSender = OfficeSender;
                return  this;
            }
            public Builder UserSender( String UserSender) {
                this.UserSender = UserSender;
                return  this;
            }

            public SentTo build() {
                SentTo msccSentTo = new SentTo( this );
                return msccSentTo;
            }
        }

        public static class ID extends AbstractMsccEntityID {
            private String  OrganizationID;
            private String  OfficeID;
            private String  UserID;
            private String  RefNbrID;
            private Integer SequenceID;
            private String  OrganizationSentID;
            private String  OfficeSentID;
            private String  UserSentID;
            private Timestamp SentTs;

            public ID() {
            }

            public ID( String organizationID, String officeID, String userID, String refNbrID, Integer sequenceID, String organizationSentID, String officeSentID, String userSentID, Timestamp sentTs ) {
                OrganizationID = organizationID;
                OfficeID = officeID;
                UserID = userID;
                RefNbrID = refNbrID;
                SequenceID = sequenceID;
                OrganizationSentID = organizationSentID;
                OfficeSentID = officeSentID;
                UserSentID = userSentID;
                SentTs = sentTs;
            }

            public String getOrganizationID() {
                return OrganizationID;
            }
            public void setOrganizationID(String organizationID) {
                OrganizationID = organizationID;
            }

            public String getOfficeID() {
                return OfficeID;
            }
            public void setOfficeID(String officeID) {
                OfficeID = officeID;
            }

            public String getUserID() {
                return UserID;
            }
            public void setUserID(String userID) {
                UserID = userID;
            }

            public String getRefNbrID() {
                return RefNbrID;
            }
            public void setRefNbrID(String refNbrID) {
                RefNbrID = refNbrID;
            }

            public Integer getSequenceID() {
                return SequenceID;
            }
            public void setSequenceID( Integer sequenceID ) {
                SequenceID = sequenceID;
            }

            public String getOrganizationSentID() {
                return this.OrganizationSentID;
            }
            public void setOrganizationSentID(String organizationSentID) {
                this.OrganizationSentID = organizationSentID;
            }

            public String getOfficeSentID() {
                return this.OfficeSentID;
            }
            public void setOfficeSentID(String officeSentID) {
                this.OfficeSentID = officeSentID;
            }

            public String getUserSentID() {
                return this.UserSentID;
            }
            public void setUserSentID(String userSentID) {
                this.UserSentID = userSentID;
            }

            public Timestamp getSentTs() {
                return this.SentTs;
            }

            public void setSentTs(Timestamp sentTs) {
                this.SentTs = sentTs;
            }

            @Override
            public String toString() {
                return "ID{" +
                        "OrganizationID='" + OrganizationID + '\'' +
                        ", OfficeID='" + OfficeID + '\'' +
                        ", UserID='" + UserID + '\'' +
                        ", RefNbrID='" + RefNbrID + '\'' +
                        ", SequenceID=" + SequenceID +
                        ", OrganizationSentID='" + OrganizationSentID + '\'' +
                        ", OfficeSentID='" + OfficeSentID + '\'' +
                        ", UserSentID='" + UserSentID + '\'' +
                        ", SentTs=" + SentTs +
                        '}';
            }
        }


        @Override
        public String toString() {
            return "SentTo{" +
                    "ID=" + ID +
                    ", AccessRightSentTo='" + AccessRightSentTo + '\'' +
                    ", ActionDescSentTo='" + ActionDescSentTo + '\'' +
                    ", ActionRequestedSentTo='" + ActionRequestedSentTo + '\'' +
                    ", ActionTimeRequired=" + ActionTimeRequired +
                    ", ActionSenderPriority='" + ActionSenderPriority + '\'' +
                    ", ActionStatusSentTo='" + ActionStatusSentTo + '\'' +
                    ", OrganizationSender='" + OrganizationSender + '\'' +
                    ", OfficeSender='" + OfficeSender + '\'' +
                    ", UserSender='" + UserSender + '\'' +
                    '}';
        }
    }



    public final static class ActionTaken extends AbstractMsccEntity {

        private ID ID;

        private String  ActionOrganizationID;

        private String  ActionOfficeID;

        private String  ActionUserID;

        private String  ActionRefNbrID;

        private Integer ActionSequenceID;

        private MsccObjectSentToRight AccessRightSentTo;

        private MsccObjectSentToAction ActionRequestedSentTo;

        private String ActionDescSentTo;

        private String UserCreator;

        private String UserCreatorEmail;

        private String UserCreatorTelephone;

        private MsccObjectSentToAction SuggestedNextAction;


        public ActionTaken() {
        }

        private ActionTaken( Builder builder ) {
            this.ID = builder.ID;

            this.ActionOrganizationID   = builder.ActionOrganizationID;
            this.ActionOfficeID         = builder.ActionOfficeID;
            this.ActionUserID           = builder.ActionUserID;
            this.ActionRefNbrID         = builder.ActionRefNbrID;
            this.ActionSequenceID       = builder.ActionSequenceID;

            this.AccessRightSentTo      = builder.AccessRightSentTo;
            this.ActionRequestedSentTo  = builder.ActionRequestedSentTo;
            this.ActionDescSentTo       = builder.ActionDescSentTo;

            this.UserCreator            = builder.UserCreator;
            this.UserCreatorEmail       = builder.UserCreatorEmail;
            this.UserCreatorTelephone   = builder.UserCreatorTelephone;

            this.SuggestedNextAction    = builder.SuggestedNextAction;
        }

        public ActionTaken.ID getID() {
            return ID;
        }
        public void setID( ActionTaken.ID ID) {
            this.ID = ID;
        }

        public String getActionOrganizationID() {
            return ActionOrganizationID;
        }
        public void setActionOrganizationID(String actionOrganizationID) {
            ActionOrganizationID = actionOrganizationID;
        }

        public String getActionOfficeID() {
            return ActionOfficeID;
        }
        public void setActionOfficeID(String actionOfficeID) {
            ActionOfficeID = actionOfficeID;
        }

        public String getActionUserID() {
            return ActionUserID;
        }
        public void setActionUserID(String actionUserID) {
            ActionUserID = actionUserID;
        }

        public String getActionRefNbrID() {
            return ActionRefNbrID;
        }
        public void setActionRefNbrID(String actionRefNbrID) {
            ActionRefNbrID = actionRefNbrID;
        }

        public Integer getActionSequenceID() {
            return ActionSequenceID;
        }
        public void setActionSequenceID(Integer actionSequenceID) {
            ActionSequenceID = actionSequenceID;
        }


        public MsccObjectSentToRight getAccessRightSentTo() {
            return AccessRightSentTo;
        }

        public void setAccessRightSentTo(MsccObjectSentToRight accessRightSentTo) {
            AccessRightSentTo = accessRightSentTo;
        }

        public MsccObjectSentToAction getActionRequestedSentTo() {
            return this.ActionRequestedSentTo;
        }
        public void setActionRequestedSentTo(MsccObjectSentToAction actionRequestedSentTo) {
            this.ActionRequestedSentTo = actionRequestedSentTo;
        }

        public String getActionDescSentTo() {
            return ActionDescSentTo;
        }
        public void setActionDescSentTo(String actionDescSentTo) {
            ActionDescSentTo = actionDescSentTo;
        }

        public String getUserCreator() {
            return UserCreator;
        }
        public void setUserCreator(String userCreator) {
            UserCreator = userCreator;
        }

        public String getUserCreatorEmail() {
            return UserCreatorEmail;
        }
        public void setUserCreatorEmail(String userCreatorEmail) {
            UserCreatorEmail = userCreatorEmail;
        }

        public String getUserCreatorTelephone() {
            return UserCreatorTelephone;
        }
        public void setUserCreatorTelephone(String userCreatorTelephone) {
            UserCreatorTelephone = userCreatorTelephone;
        }

        public MsccObjectSentToAction getSuggestedNextAction() {
            return SuggestedNextAction;
        }
        public void setSuggestedNextAction(MsccObjectSentToAction suggestedNextAction) {
            SuggestedNextAction = suggestedNextAction;
        }

        public static Builder getBuilder() {
            return new Builder();
        }

        public static class Builder {

            private ID ID;

            private String  ActionOrganizationID;

            private String  ActionOfficeID;

            private String  ActionUserID;

            private String  ActionRefNbrID;

            private Integer ActionSequenceID;

            private MsccObjectSentToRight AccessRightSentTo;

            private MsccObjectSentToAction ActionRequestedSentTo;

            private String ActionDescSentTo;

            private String UserCreator;

            private String UserCreatorEmail;

            private String UserCreatorTelephone;

            private MsccObjectSentToAction SuggestedNextAction;


            private Builder() {}

            public Builder ID( ID ID) {
                this.ID = ID;
                return  this;
            }

             public Builder ActionSentTo( String sentOrganizationID, String sentOfficeID , String sentUserID) {
                this.ID.SentOrganizationID = sentOrganizationID;
                this.ID.SentOfficeID = sentOfficeID;
                this.ID.SentUserID = sentUserID;
                return  this;
            }

            public Builder ActionObjectID( String actionOrganizationID, String actionOfficeID, String actionUserID, String actionRefNbrID, Integer actionSequenceID  ) {
                this.ActionOrganizationID = actionOrganizationID;
                this.ActionOfficeID = actionOfficeID;
                this.ActionUserID = actionUserID;
                this.ActionRefNbrID = actionRefNbrID;
                this.ActionSequenceID = actionSequenceID;
                return  this;
            }

            public Builder ActionOrganizationID( String actionOrganizationID ) {
                this.ActionOrganizationID = actionOrganizationID;
                return  this;
            }

            public Builder ActionOfficeID( String actionOfficeID ) {
                this.ActionOfficeID = actionOfficeID;
                return  this;
            }

            public Builder ActionUserID( String actionUserID) {
                this.ActionUserID = actionUserID;
                return  this;
            }

            public Builder ActionRefNbrID( String actionRefNbrID) {
                this.ActionRefNbrID = actionRefNbrID;
                return  this;
            }

            public Builder ActionSequenceID( Integer actionSequenceID) {
                this.ActionSequenceID = actionSequenceID;
                return  this;
            }

            public Builder AccessRightSentTo( MsccObjectSentToRight AccessRightSentTo) {
                this.AccessRightSentTo = AccessRightSentTo;
                return  this;
            }


            public Builder ActionRequestedSentTo( MsccObjectSentToAction actionRequestedSentTo) {
                this.ActionRequestedSentTo = actionRequestedSentTo;
                return  this;
            }

            public Builder ActionDescSentTo( String ActionDescSentTo ) {
                this.ActionDescSentTo = ActionDescSentTo;
                return  this;
            }

            public Builder UserCreator( String userCreator ) {
                this.UserCreator = userCreator;
                return  this;
            }

            public Builder UserCreatorEmail( String userCreatorEmail ) {
                this.UserCreatorEmail = userCreatorEmail;
                return  this;
            }

            public Builder UserCreatorTelephone( String userCreatorTelephone ) {
                this.UserCreatorTelephone = userCreatorTelephone;
                return  this;
            }

            public Builder SuggestedNextAction( MsccObjectSentToAction suggestedNextAction ) {
                this.SuggestedNextAction = suggestedNextAction;
                return  this;
            }

            public ActionTaken build() {
                ActionTaken msccActionTaken = new ActionTaken( this );
                return msccActionTaken;
            }
        }

        public static class ID extends AbstractMsccEntityID {

            private String  OrganizationID;
            private String  OfficeID;
            private String  UserID;
            private String  RefNbrID;
            private Integer SequenceID;

            private String  SentOrganizationID;
            private String  SentOfficeID;
            private String  SentUserID;

            private Timestamp SentTs;
            private Timestamp SentActionTs;

            public ID() {
            }

            public ID( String organizationID, String officeID, String userID, String refNbrID, Integer sequenceID, String SentOrganizationID, String SentOfficeID, String SentUserID, Timestamp sentTs, Timestamp sentActionTs ) {
                this.OrganizationID  = organizationID;
                this.OfficeID        = officeID;
                this.UserID          = userID;
                this.RefNbrID        = refNbrID;
                this.SequenceID      = sequenceID;

                this.SentOrganizationID = SentOrganizationID;
                this.SentOfficeID = SentOfficeID;
                this.SentUserID = SentUserID;

                this.SentTs          = sentTs;
                this.SentActionTs    = sentActionTs;
            }


            public String getOrganizationID() {
                return OrganizationID;
            }
            public void setOrganizationID(String organizationID) {
                OrganizationID = organizationID;
            }

            public String getOfficeID() {
                return OfficeID;
            }
            public void setOfficeID(String officeID) {
                OfficeID = officeID;
            }

            public String getUserID() {
                return UserID;
            }
            public void setUserID(String userID) {
                UserID = userID;
            }

            public String getRefNbrID() {
                return RefNbrID;
            }
            public void setRefNbrID(String refNbrID) {
                RefNbrID = refNbrID;
            }

            public Integer getSequenceID() {
                return SequenceID;
            }
            public void setSequenceID( Integer sequenceID ) {
                SequenceID = sequenceID;
            }

            public String getSentOrganizationID() {
                return SentOrganizationID;
            }

            public void setSentOrganizationID(String sentOrganizationID) {
                SentOrganizationID = sentOrganizationID;
            }

            public String getSentOfficeID() {
                return SentOfficeID;
            }

            public void setSentOfficeID(String sentOfficeID) {
                SentOfficeID = sentOfficeID;
            }

            public String getSentUserID() {
                return SentUserID;
            }

            public void setSentUserID(String sentUserID) {
                SentUserID = sentUserID;
            }

            public Timestamp getSentTs() {
                return this.SentTs;
            }
            public void setSentTs(Timestamp sentTs) {
                this.SentTs = sentTs;
            }

            public Timestamp getSentActionTs() {
                return SentActionTs;
            }

            public void setSentActionTs(Timestamp sentActionTs) {
                SentActionTs = sentActionTs;
            }


            @Override
            public String toString() {
                return "ID{" +
                        "OrganizationID='" + OrganizationID + '\'' +
                        ", OfficeID='" + OfficeID + '\'' +
                        ", UserID='" + UserID + '\'' +
                        ", RefNbrID='" + RefNbrID + '\'' +
                        ", SequenceID=" + SequenceID +
                        ", SentOrganizationID='" + SentOrganizationID + '\'' +
                        ", SentOfficeID='" + SentOfficeID + '\'' +
                        ", SentUserID='" + SentUserID + '\'' +
                        ", SentTs=" + SentTs +
                        ", SentActionTs=" + SentActionTs +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "ActionTaken{" +
                    "ID=" + ID +
                    ", ActionOrganizationID='" + ActionOrganizationID + '\'' +
                    ", ActionOfficeID='" + ActionOfficeID + '\'' +
                    ", ActionUserID='" + ActionUserID + '\'' +
                    ", ActionRefNbrID='" + ActionRefNbrID + '\'' +
                    ", ActionSequenceID=" + ActionSequenceID +
                    ", ActionRequestedSentTo=" + ActionRequestedSentTo +
                    ", ActionDescSentTo='" + ActionDescSentTo + '\'' +
                    ", UserCreator='" + UserCreator + '\'' +
                    ", UserCreatorEmail='" + UserCreatorEmail + '\'' +
                    ", UserCreatorTelephone='" + UserCreatorTelephone + '\'' +
                    ", SuggestedNextAction=" + SuggestedNextAction +
                    '}';
        }

    }


    public final static class Meta extends AbstractMsccEntity {

        private ID ID;

        private String  OrganizationMeta;
        private String  OfficeMeta;
        private String  UserMeta;
        private Timestamp SentTsMeta;

        public Meta() {
        }

        private Meta( Builder builder ) {
            this.ID = builder.ID;

            this.OrganizationMeta       = builder.OrganizationMeta;
            this.OfficeMeta             = builder.OfficeMeta;
            this.UserMeta               = builder.UserMeta;
            this.SentTsMeta             = builder.SentTsMeta;
        }

        public ID getID() {
            return ID;
        }
        public void setID( ID ID ) {
            this.ID = ID;
        }

        public String getOrganizationMeta() {
            return OrganizationMeta;
        }
        public void setOrganizationMeta( String organizationMeta ) {
            OrganizationMeta = organizationMeta;
        }

        public String getOfficeMeta() {
            return OfficeMeta;
        }
        public void setOfficeMeta( String officeMeta ) {
            OfficeMeta = officeMeta;
        }

        public String getUserMeta() {
            return UserMeta;
        }
        public void setUserMeta( String userMeta ) {
            UserMeta = userMeta;
        }

        public Timestamp getSentTsMeta() {
            return SentTsMeta;
        }
        public void setSentTsMeta( Timestamp sentTsMeta ) {
            SentTsMeta = sentTsMeta;
        }

        public static Builder getBuilder() {
            return new Builder();
        }

        public void update( Meta model) {
        }

        public  static class Builder {

            private ID ID;

            private String  OrganizationMeta;
            private String  OfficeMeta;
            private String  UserMeta;
            private Timestamp SentTsMeta;

            private Builder() {}

            public Builder ID( ID ID) {
                this.ID = ID;
                return  this;
            }

            public Builder OrganizationMeta( String organizationMeta) {
                this.OrganizationMeta = organizationMeta;
                return  this;
            }

            public Builder OfficeMeta( String officeMeta) {
                this.OfficeMeta = officeMeta;
                return  this;
            }

            public Builder UserMeta( String userMeta) {
                this.UserMeta = userMeta;
                return  this;
            }

            public Builder SentTsMeta( Timestamp sentTsMeta) {
                this.SentTsMeta = sentTsMeta;
                return  this;
            }


            public Meta build() {
                Meta msccMeta = new Meta( this );
                return msccMeta;
            }

        }

        public static class ID extends AbstractMsccEntityID {

            private String  OrganizationID;
            private String  OfficeID;
            private String  UserID;
            private String  RefNbrID;
            private Integer SequenceID;

            private String MetaType;
            private String ChValue;
            private Integer NrValue;
            private Timestamp DtValue;

            public ID() {
            }

            public ID( String organizationID, String officeID, String userID, String refNbrID, Integer sequenceID, String metaType,  String chValue, Integer nrValue, Timestamp dtValue ) {
                this.OrganizationID = organizationID;
                this.OfficeID = officeID;
                this.UserID = userID;
                this.RefNbrID = refNbrID;
                this.SequenceID = sequenceID;
                this.MetaType = metaType;
                this.ChValue = chValue;
                this.NrValue = nrValue;
                this.DtValue = dtValue;

            }

            public String getOrganizationID() {
                return OrganizationID;
            }
            public void setOrganizationID(String organizationID) {
                OrganizationID = organizationID;
            }

            public String getOfficeID() {
                return OfficeID;
            }
            public void setOfficeID(String officeID) {
                OfficeID = officeID;
            }

            public String getUserID() {
                return UserID;
            }
            public void setUserID(String userID) {
                UserID = userID;
            }

            public String getRefNbrID() {
                return RefNbrID;
            }
            public void setRefNbrID(String refNbrID) {
                RefNbrID = refNbrID;
            }

            public Integer getSequenceID() {
                return SequenceID;
            }
            public void setSequenceID( Integer sequenceID ) {
                SequenceID = sequenceID;
            }

            public String getMetaType() {
                return MetaType;
            }
            public void setMetaType( String metaType ) {
                MetaType = metaType;
            }

            public String getChValue() {
                return ChValue;
            }
            public void setChValue(String chValue) {
                ChValue = chValue;
            }

            public Integer getNrValue() {
                return NrValue;
            }
            public void setNrValue(Integer nrValue) {
                NrValue = nrValue;
            }

            public Timestamp getDtValue() {
                return DtValue;
            }
            public void setDtValue(Timestamp dtValue) {
                DtValue = dtValue;
            }


            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                ID that = (ID) o;

                return OrganizationID.equals( that.getOrganizationID() ) &&
                        OfficeID.equals( that.getOfficeID() ) &&
                        UserID.equals( that.getUserID() ) &&
                        RefNbrID.equals( that.getRefNbrID() ) &&
                        SequenceID.equals( that.getSequenceID() ) &&
                        MetaType.equals( that.getMetaType() ) &&
                        ChValue.equals( that.getChValue() ) &&
                        NrValue ==  that.getNrValue() &&
                        DtValue.equals( that.getDtValue());

            }

//            @Override
//            public int hashCode() {
//                return Objects.hash(OrganizationID, OfficeID, UserID, RefNbrID, SequenceID, MetaType, ChValue, NrValue, DtValue);
//            }

            public static int hashCode(Object object) {
                return object == null ? 0 : object.hashCode();
            }

            @Override
            public String toString() {
                return "MsccMetaID{" +
                        "OrganizationID='" + OrganizationID + '\'' +
                        ", OfficeID='" + OfficeID + '\'' +
                        ", UserID='" + UserID + '\'' +
                        ", RefNbrID='" + RefNbrID + '\'' +
                        ", SequenceID=" + SequenceID +
                        ", MetaType='" + MetaType + '\'' +
                        ", ChValue='" + ChValue + '\'' +
                        ", NrValue=" + NrValue +
                        ", DtValue=" + DtValue +
                        '}';
            }


        }



        @Override
        public String toString() {
            return "MsccMeta{" +
                    "ID=" + ID +
                    ", OrganizationMeta='" + OrganizationMeta + '\'' +
                    ", OfficeMeta='" + OfficeMeta + '\'' +
                    ", UserMeta='" + UserMeta + '\'' +
                    ", SentTsMeta=" + SentTsMeta +
                    '}';
        }
    }


    public final static class Result {
        String result;
        int    statusCode;

        public Result() {
        }

        public Result(String result, int statusCode) {
            this.result = result;
            this.statusCode = statusCode;
        }

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }

        public int getStatusCode() {
            return statusCode;
        }

        public void setStatusCode(int statusCode) {
            this.statusCode = statusCode;
        }

        @Override
        public String toString() {
            return "Result{" +
                    "result='" + result + '\'' +
                    ", statusCode=" + statusCode +
                    '}';
        }
    }


    public static class QueryCriteria extends AbstractMsccEntityID {

        private Map<String, Object> FuzzyQuery;
        private Integer StartSequence;
        private Integer MaxResultCount;
        private Integer PageNumber;
        private Integer PageSize;
        private List<String> GroupBy;
        private List<String> OrderBy;

        private String Sort;

        public QueryCriteria() {
            this( new HashMap<String, Object>(), MsccConstants.MSCC_SEARCH_DEFAULT_START_QUENCE, MsccConstants.MSCC_SEARCH_RESULTSET_MAXCOUNT, MsccConstants.MSCC_SEARCH_DEFAULT_PAGENUMBER, MsccConstants.MSCC_SEARCH_DEFAULT_PAGESIZE, null, null, null );
        }

        public QueryCriteria( Map<String, Object> fuzzyQuery, Integer startSequence, Integer maxResultCount, Integer pageNumber, Integer pageSize, List<String> groupBy, List<String> orderBy, String sort  ) {

            this.FuzzyQuery = fuzzyQuery;

            this.StartSequence = startSequence < 0 ? MsccConstants.MSCC_SEARCH_DEFAULT_START_QUENCE  : startSequence;

            if( maxResultCount > MsccConstants.MSCC_SEARCH_RESULTSET_MAXCOUNT ) {
                maxResultCount = MsccConstants.MSCC_SEARCH_RESULTSET_MAXCOUNT;
            }
            this.MaxResultCount = maxResultCount;

            this.PageNumber = pageNumber < 0 ? MsccConstants.MSCC_SEARCH_DEFAULT_PAGENUMBER : pageNumber;

            this.PageSize = pageSize > MsccConstants.MSCC_SEARCH_DEFAULT_PAGESIZE ? MsccConstants.MSCC_SEARCH_DEFAULT_PAGESIZE : pageSize;

            if( sort == null ) {
            //if( !Optional.ofNullable( sort ).isPresent() ) {
                this.Sort = MsccConstants.MSCC_SEARCH_DEFAULT_SORTDIRECTION;
            }

            this.GroupBy = groupBy;
            this.OrderBy = orderBy;

        }


        public Map<String, Object> getFuzzyQuery() {
            return FuzzyQuery;
        }

        public void setFuzzyQuery(Map<String, Object> fuzzyQuery) {
            this.FuzzyQuery = fuzzyQuery;
        }

        public QueryCriteria addFuzzyQuery( SearchTerm term ) {

            //
            if( this.getFuzzyQuery() == null )
            //if( !Optional.ofNullable( this.getFuzzyQuery() ).isPresent() )
                this.FuzzyQuery = new HashMap<String, Object>();
            this.FuzzyQuery.put( term.getKey(), term.getValue() );

            return this;
        }

        public QueryCriteria removeFuzzyQuery( SearchTerm term ) {
            this.FuzzyQuery.remove( term.getKey() );
            return this;
        }


        public Integer getStartSequence() {
            return StartSequence;
        }

        public void setStartSequence(Integer startSequence) {
            this.StartSequence = startSequence;
        }

        public Integer getMaxResultCount() {
            return this.MaxResultCount;
        }

        public void setMaxResultCount(Integer maxResultCount) {
            this.MaxResultCount = maxResultCount;
        }

        public Integer getPageNumber() {
            return PageNumber;
        }

        public void setPageNumber(Integer pageNumber) {
            this.PageNumber = pageNumber;
        }

        public Integer getPageSize() {
            return PageSize;
        }

        public void setPageSize(Integer pageSize) {
            this.PageSize = pageSize;
        }

        public List<String> getGroupBy() {
            return GroupBy;
        }

        public void setGroupBy(List<String> groupBy) {
            this.GroupBy = groupBy;
        }

        public List<String> getOrderBy() {
            return OrderBy;
        }

        public void setOrderBy(List<String> orderBy) {
            this.OrderBy = orderBy;
        }

        public String getSort() {
            return Sort;
        }

        public void setSort( String sort) {
            this.Sort = sort;
        }


        @Override
        public String toString() {
            return "MsccQueryCriteria{" +
                    "fuzzyQuery=" + FuzzyQuery +
                    ", startSequence=" + StartSequence +
                    ", maxResultCount=" + MaxResultCount +
                    ", pageNumber=" + PageNumber +
                    ", pageSize=" + PageSize +
                    ", groupBy=" + GroupBy +
                    ", orderBy=" + OrderBy +
                    ", sort=" + Sort +
                    '}';
        }


    }


    public static class SearchTerm implements IMsccBean {

        private String key;
        private Object value;

        public SearchTerm() {
        }

        public SearchTerm(String key, Object value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "MsccSearchTerm{" +
                    "term='" + key + '\'' +
                    ", value='" + value + '\'' +
                    '}';
        }
    }

    public static class EmailFact extends AbstractMsccEntity {

        private String Process;

        private String Subject;

        private String OrganizationSender;
        private String OfficeSender;
        private String UserSender;
        private String EmailSender;

        private String OrganizationReceiver;
        private String OfficeReceiver;
        private String UserReceiver;
        private String EmailReceiver;

        private List<String> ActionRequested;
        private List<CollectionObject.ID> objectIDSet;

        public EmailFact() {
            ActionRequested = new ArrayList<String>();
            objectIDSet = new ArrayList<CollectionObject.ID>();
        }

        public String getProcess() {
            return Process;
        }
        public void setProcess(String process) {
            Process = process;
        }

        public String getOrganizationSender() {
            return OrganizationSender;
        }
        public void setOrganizationSender(String organizationSender) {
            OrganizationSender = organizationSender;
        }

        public String getOfficeSender() {
            return OfficeSender;
        }
        public void setOfficeSender(String officeSender) {
            OfficeSender = officeSender;
        }

        public String getUserSender() {
            return UserSender;
        }
        public void setUserSender(String userSender) {
            UserSender = userSender;
        }

        public String getOrganizationReceiver() {
            return OrganizationReceiver;
        }
        public void setOrganizationReceiver(String organizationReceiver) {
            OrganizationReceiver = organizationReceiver;
        }

        public String getOfficeReceiver() {
            return OfficeReceiver;
        }
        public void setOfficeReceiver(String officeReceiver) {
            OfficeReceiver = officeReceiver;
        }

        public String getUserReceiver() {
            return UserReceiver;
        }
        public void setUserReceiver(String userReceiver) {
            UserReceiver = userReceiver;
        }

        public List<CollectionObject.ID> getObjectIDSet() {
            return objectIDSet;
        }
        public void setObjectIDSet(List <CollectionObject.ID> objectIDSet) {
            this.objectIDSet = objectIDSet;
        }

        public List<String> getActionRequested() {
            return ActionRequested;
        }
        public void setActionRequested(List<String> actionRequested) {
            ActionRequested = actionRequested;
        }


        public String getSubject() {
            return Subject;
        }

        public void setSubject(String subject) {
            Subject = subject;
        }

        public String getEmailSender() {
            return EmailSender;
        }
        public void setEmailSender(String emailSender) {
            EmailSender = emailSender;
        }

        public String getEmailReceiver() {
            return EmailReceiver;
        }
        public void setEmailReceiver(String emailReceiver) {
            EmailReceiver = emailReceiver;
        }

        @Override
        public String toString() {
            return "EmailFact{" +
                    "Process='" + Process + '\'' +
                    ", Subject='" + Subject + '\'' +
                    ", OrganizationSender='" + OrganizationSender + '\'' +
                    ", OfficeSender='" + OfficeSender + '\'' +
                    ", UserSender='" + UserSender + '\'' +
                    ", EmailSender='" + EmailSender + '\'' +
                    ", OrganizationReceiver='" + OrganizationReceiver + '\'' +
                    ", OfficeReceiver='" + OfficeReceiver + '\'' +
                    ", UserReceiver='" + UserReceiver + '\'' +
                    ", EmailReceiver='" + EmailReceiver + '\'' +
                    ", ActionRequested=" + ActionRequested +
                    ", objectIDSet=" + objectIDSet +
                    '}';
        }
    }



}
