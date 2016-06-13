package solutions.legatus.mservice.mscc.client.Service;

import solutions.legatus.mservice.mscc.client.Bean.impl.MsccBeanAdapter;

import java.util.List;

/**
 * Created by ahou on 5/16/2016.
 */
public interface ICommDialogService {

    //Add and remove
    public String makeNewCollection( MsccBeanAdapter.Collection collection );
    public String addNewObjectFromFileHandle( MsccBeanAdapter.CollectionObject collectionObject );
    public String addCollectionToFolder( MsccBeanAdapter.FolderContents folderContents );
    public String removeCollctionFromFolder( MsccBeanAdapter.FolderContents.ID folderContentsID  );

    public String addFolder( MsccBeanAdapter.Collection folder );
    public String deleteFolder( MsccBeanAdapter.Folder.ID foldID );

    public String addOrganization( MsccBeanAdapter.Organization organization );
    public String updateOrganization( MsccBeanAdapter.Organization.ID organizationID, MsccBeanAdapter.Organization updatedOrganization );
    public String removeOrganization( MsccBeanAdapter.Organization.ID organizationID );

    public String addOffice( MsccBeanAdapter.Office office );
    public String updateOffice( MsccBeanAdapter.Office.ID officeID,  MsccBeanAdapter.Office updatedOffice );
    public String removeOffice( MsccBeanAdapter.Office.ID officeID );

    public String addUser( MsccBeanAdapter.User user );
    public String updateUser( MsccBeanAdapter.User.ID userID, MsccBeanAdapter.User updatedUser );
    public String removeUser( MsccBeanAdapter.User.ID userID );

    public String userToOffice( MsccBeanAdapter.UserOffice userOffice );

    // permission and actions
    public String addPermission( MsccBeanAdapter.SentTo permission );
    public String removePermission( MsccBeanAdapter.SentTo.ID permissionID );

    public String sendAction( MsccBeanAdapter.SentTo action );
    public String unsendAction( MsccBeanAdapter.SentTo.ID actionID );

    public String recordAction( MsccBeanAdapter.ActionTaken actionTaken );

//    public MsccBeanAdapter.Collection transferOwner( MsccBeanAdapter.Collection.ID collectionID, MsccBeanAdapter.Collection updatedCollection );
//    public MsccBeanAdapter.Collection transferCreator( MsccBeanAdapter.Collection.ID collectionID, MsccBeanAdapter.Collection updatedCollection );

    //Deliver
    public String emailObjects( MsccBeanAdapter.EmailFact emailObjects );
//    public void printObjects( MsccBeanAdapter.PrintFact printObjects );
//    public void mailObjects( MsccBeanAdapter.MailFact mailObjects );


    //Update MetaData
    public String updateCollectionName( MsccBeanAdapter.Collection.ID collectionID, MsccBeanAdapter.Collection updatedCollection );
    public String addMeta( MsccBeanAdapter.Meta meta );
    public String updateObject( MsccBeanAdapter.Meta.ID metaID, MsccBeanAdapter.Meta updatedMeta );

    //FIND
    List<MsccBeanAdapter.CollectionObject.ID> searchObjectsByMetaData(MsccBeanAdapter.QueryCriteria queryCriteria );
    MsccBeanAdapter.CollectionObject getObjectsByKey( MsccBeanAdapter.CollectionObject.ID collectionObjectID );
    List<MsccBeanAdapter.CollectionObject.ID> getObjectsByReference( MsccBeanAdapter.QueryCriteria queryCriteria );
    List<MsccBeanAdapter.CollectionObject.ID> getObjectsByCollection( MsccBeanAdapter.Collection.ID collectionID );
    List<MsccBeanAdapter.Collection.ID> getCollectionsInFolder( MsccBeanAdapter.Folder.ID folderID );

//    //Add and remove
//    public MsccBeanAdapter.Collection makeNewCollection( MsccBeanAdapter.Collection collection );
//    public MsccBeanAdapter.CollectionObject addNewObjectFromFileHandle( MsccBeanAdapter.CollectionObject collectionObject );
//    public MsccBeanAdapter.FolderContents addCollectionToFolder( MsccBeanAdapter.FolderContents folderContents );
//    public MsccBeanAdapter.FolderContents removeCollctionFromFolder( MsccBeanAdapter.FolderContents.ID folderContentsID  );
//
//    public MsccBeanAdapter.Collection addFolder( MsccBeanAdapter.Collection folder );
//    public MsccBeanAdapter.Collection.ID deleteFolder( MsccBeanAdapter.Folder.ID foldID );
//
//    public MsccBeanAdapter.Organization addOrganization( MsccBeanAdapter.Organization organization );
//    public MsccBeanAdapter.Organization updateOrganization( MsccBeanAdapter.Organization.ID organizationID, MsccBeanAdapter.Organization updatedOrganization );
//    public MsccBeanAdapter.Organization removeOrganization( MsccBeanAdapter.Organization.ID organizationID );
//
//    public MsccBeanAdapter.Office addOffice( MsccBeanAdapter.Office office );
//    public MsccBeanAdapter.Office updateOffice( MsccBeanAdapter.Office.ID officeID,  MsccBeanAdapter.Office updatedOffice );
//    public MsccBeanAdapter.Office removeOffice( MsccBeanAdapter.Office.ID officeID );
//
//    public MsccBeanAdapter.User addUser( MsccBeanAdapter.User user );
//    public MsccBeanAdapter.User updateUser( MsccBeanAdapter.User.ID userID, MsccBeanAdapter.User updatedUser );
//    public MsccBeanAdapter.User removeUser( MsccBeanAdapter.User.ID userID );
//
//    public MsccBeanAdapter.UserOffice userToOffice( MsccBeanAdapter.UserOffice userOffice );
//
//    // permission and actions
//    public MsccBeanAdapter.SentTo addPermission( MsccBeanAdapter.SentTo permission );
//    public MsccBeanAdapter.SentTo removePermission( MsccBeanAdapter.SentTo.ID permissionID );
//
//    public MsccBeanAdapter.SentTo sendAction( MsccBeanAdapter.SentTo action );
//    public MsccBeanAdapter.SentTo unsendAction( MsccBeanAdapter.SentTo.ID actionID );
//
////    public MsccBeanAdapter.Collection transferOwner( MsccBeanAdapter.Collection.ID collectionID, MsccBeanAdapter.Collection updatedCollection );
////    public MsccBeanAdapter.Collection transferCreator( MsccBeanAdapter.Collection.ID collectionID, MsccBeanAdapter.Collection updatedCollection );
//
//    //Deliver
//    public void emailObjects( MsccBeanAdapter.EmailFact emailObjects );
////    public void printObjects( MsccBeanAdapter.PrintFact printObjects );
////    public void mailObjects( MsccBeanAdapter.MailFact mailObjects );
//
//
//    //Update MetaData
//    MsccBeanAdapter.Collection updateCollectionName( MsccBeanAdapter.Collection.ID collectionID, MsccBeanAdapter.Collection updatedCollection );
//    MsccBeanAdapter.Meta addMeta( MsccBeanAdapter.Meta meta );
//    MsccBeanAdapter.Meta updateObject( MsccBeanAdapter.Meta.ID metaID, MsccBeanAdapter.Meta updatedMeta );
//
//    //FIND
//    List<MsccBeanAdapter.CollectionObject.ID> searchObjectsByMetaData(MsccBeanAdapter.QueryCriteria queryCriteria );
//    MsccBeanAdapter.CollectionObject getObjectsByKey( MsccBeanAdapter.CollectionObject.ID collectionObjectID );
//    List<MsccBeanAdapter.CollectionObject.ID> getObjectsByReference( MsccBeanAdapter.QueryCriteria queryCriteria );
//    List<MsccBeanAdapter.CollectionObject.ID> getObjectsByCollection( MsccBeanAdapter.Collection.ID collectionID );
//    List<MsccBeanAdapter.Collection.ID> getCollectionsInFolder( MsccBeanAdapter.Folder.ID folderID );

}
