package solutions.legatus.mservice.mscc.client.Service.impl;

import solutions.legatus.mservice.mscc.client.Bean.impl.MsccBeanAdapter;
import solutions.legatus.mservice.mscc.client.Request.impl.ApacheMsccRestClient;
import solutions.legatus.mservice.mscc.client.Request.impl.HttpResponseBean;
import solutions.legatus.mservice.mscc.client.Request.impl.MsccClientRequest;
import solutions.legatus.mservice.mscc.client.Service.ICommDialogService;
import solutions.legatus.mservice.mscc.client.Utils.MsccReturnMessages;

import java.util.List;

/**
 * Created by ahou on 5/16/2016.
 */
public class CommDialogService implements ICommDialogService {

    // for Restful Server
    private String BASE_URI     = "http://localhost:9100";
    private String APP_NAME     = "MsccClient";
    private String APP_KEY      = "legatus";
    private String APP_SECRET   = "legatus";
    private String ACCESS_TOKEN = "token";

    // for service
    private MsccClientRequest.OrganizationService organizationService;
    private MsccClientRequest.OfficeService officeService;
    private MsccClientRequest.UserService userService;
    private MsccClientRequest.UserOfficeService userOfficeService;
    //
    private MsccClientRequest.CollectionService collectionService;
    private MsccClientRequest.ObjectService objectService;
    private MsccClientRequest.FolderService folderService;
    private MsccClientRequest.FolderContentService folderContentService;
    private MsccClientRequest.MetaService metaService;

    private MsccClientRequest.SentToService sentToService;
    private MsccClientRequest.ActionService actionService;

    private MsccClientRequest.EmailService emailService;


    //private CommDialogService(){}

    public CommDialogService(String ServiceURL, String Port, String AppName, String AppKey, String AppSecret, String AccessToken  ) {

        this.BASE_URI = ServiceURL + ":" + Port;
        this.APP_NAME = AppName;
        this.APP_KEY  = AppKey;
        this.APP_SECRET = AppSecret;
        this.ACCESS_TOKEN = AccessToken;

        Init();
    }

    private void Init() {

        organizationService  = MsccClientRequest.getInstance( new ApacheMsccRestClient(), BASE_URI ).new OrganizationService();

        officeService        = MsccClientRequest.getInstance( new ApacheMsccRestClient(), BASE_URI ).new OfficeService();
        userService          = MsccClientRequest.getInstance( new ApacheMsccRestClient(), BASE_URI ).new UserService();
        userOfficeService    = MsccClientRequest.getInstance( new ApacheMsccRestClient(), BASE_URI ).new UserOfficeService();

        collectionService    = MsccClientRequest.getInstance( new ApacheMsccRestClient(), BASE_URI ).new CollectionService();
        objectService        = MsccClientRequest.getInstance( new ApacheMsccRestClient(), BASE_URI ).new ObjectService();
        folderService        = MsccClientRequest.getInstance( new ApacheMsccRestClient(), BASE_URI ).new FolderService();
        folderContentService = MsccClientRequest.getInstance( new ApacheMsccRestClient(), BASE_URI ).new FolderContentService();
        metaService          = MsccClientRequest.getInstance( new ApacheMsccRestClient(), BASE_URI ).new MetaService();

        sentToService        = MsccClientRequest.getInstance( new ApacheMsccRestClient(), BASE_URI ).new SentToService();
        actionService        = MsccClientRequest.getInstance( new ApacheMsccRestClient(), BASE_URI ).new ActionService();

        emailService         = MsccClientRequest.getInstance( new ApacheMsccRestClient(), BASE_URI ).new EmailService();

    }


    public String getBASE_URI() {
        return BASE_URI;
    }
    public void setBASE_URI(String BASE_URI) {
        this.BASE_URI = BASE_URI;
    }

    public String getAPP_NAME() {
        return APP_NAME;
    }
    public void setAPP_NAME(String APP_NAME) {
        this.APP_NAME = APP_NAME;
    }

    public String getAPP_KEY() {
        return APP_KEY;
    }
    public void setAPP_KEY(String API_KEY) {
        this.APP_KEY = API_KEY;
    }

    public String getAPP_SECRET() {
        return APP_SECRET;
    }
    public void setAPP_SECRET(String API_SECRET) {
        this.APP_SECRET = API_SECRET;
    }

    public String getACCESS_TOKEN() {
        return ACCESS_TOKEN;
    }
    public void setACCESS_TOKEN(String ACCESS_TOKEN) {
        this.ACCESS_TOKEN = ACCESS_TOKEN;
    }

    private String parseResponse( HttpResponseBean responseBean ) {

        if( responseBean != null ) {
            switch (responseBean.getStatusCode()) {
                case MsccReturnMessages.CREATED:
                case MsccReturnMessages.SUCCESSS:
                case MsccReturnMessages.ACCEPTED:
                    return MsccReturnMessages.success;

                case MsccReturnMessages.DUPLICATED:
                    return MsccReturnMessages.notunqiue;

                case MsccReturnMessages.NOT_FOUND:
                case MsccReturnMessages.BAD_REQUEST:
                default:
                    return MsccReturnMessages.notauthorized;
            }
        } else {
            return null;
        }
    }


    @Override
    public String makeNewCollection( MsccBeanAdapter.Collection collection ) {
        HttpResponseBean<MsccBeanAdapter.Collection> collectionHttpResponseBean = collectionService.add( collection );
        return parseResponse( collectionHttpResponseBean );
    }

    @Override
    public String addNewObjectFromFileHandle(MsccBeanAdapter.CollectionObject collectionObject) {
        HttpResponseBean<MsccBeanAdapter.CollectionObject> objectHttpResponseBean = objectService.add( collectionObject );
        return parseResponse( objectHttpResponseBean );
    }

    @Override
    public String addCollectionToFolder( MsccBeanAdapter.FolderContents folderContents ) {
        HttpResponseBean<MsccBeanAdapter.FolderContents> folderContentsHttpResponseBean = folderContentService.add(  folderContents );
        return parseResponse( folderContentsHttpResponseBean );
    }

    @Override
    public String removeCollctionFromFolder( MsccBeanAdapter.FolderContents.ID folderContentsID ) {
        HttpResponseBean<MsccBeanAdapter.FolderContents> folderContentsHttpResponseBean = folderContentService.deleteById( folderContentsID );
        return parseResponse( folderContentsHttpResponseBean );
    }

    @Override
    public String addFolder(MsccBeanAdapter.Collection folder) {
        HttpResponseBean<MsccBeanAdapter.Collection> folderHttpResponseBean = folderService.add(  folder );
        return parseResponse( folderHttpResponseBean );
    }

    @Override
    public String deleteFolder(MsccBeanAdapter.Folder.ID foldID) {
        HttpResponseBean<MsccBeanAdapter.Collection> folderHttpResponseBean = folderService.deleteById( foldID );
        return parseResponse( folderHttpResponseBean );
    }

    @Override
    public String addOrganization(MsccBeanAdapter.Organization organization ) {
        HttpResponseBean<MsccBeanAdapter.Organization> organizationHttpResponseBean = organizationService.add(  organization );
        return parseResponse( organizationHttpResponseBean );
    }


    @Override
    public String updateOrganization( MsccBeanAdapter.Organization.ID organizationID, MsccBeanAdapter.Organization updatedOrganization ) {
        HttpResponseBean<MsccBeanAdapter.Organization> organizationHttpResponseBean = organizationService.update(  organizationID, updatedOrganization  );
        return parseResponse( organizationHttpResponseBean );
    }

    @Override
    public String removeOrganization( MsccBeanAdapter.Organization.ID organizationID ) {
        HttpResponseBean<MsccBeanAdapter.Organization> organizationHttpResponseBean = organizationService.deleteById( organizationID );
        return parseResponse( organizationHttpResponseBean );
    }

    @Override
    public String addOffice( MsccBeanAdapter.Office office ) {
        HttpResponseBean<MsccBeanAdapter.Office> officeHttpResponseBean = officeService.add(  office );
        return parseResponse( officeHttpResponseBean );
    }

    @Override
    public String updateOffice(MsccBeanAdapter.Office.ID officeID, MsccBeanAdapter.Office updatedOffice) {
        HttpResponseBean<MsccBeanAdapter.Office> officeHttpResponseBean = officeService.update(  officeID, updatedOffice  );
        return parseResponse( officeHttpResponseBean );
    }

    @Override
    public String removeOffice( MsccBeanAdapter.Office.ID officeID ) {
        HttpResponseBean<MsccBeanAdapter.Office> officeHttpResponseBean = officeService.deleteById( officeID );
        return parseResponse( officeHttpResponseBean );
    }

    @Override
    public String addUser( MsccBeanAdapter.User user ) {
        HttpResponseBean<MsccBeanAdapter.User> userHttpResponseBean = userService.add(  user );
        return parseResponse( userHttpResponseBean );
    }

    @Override
    public String updateUser( MsccBeanAdapter.User.ID userID, MsccBeanAdapter.User updatedUser ) {
        HttpResponseBean<MsccBeanAdapter.User> userHttpResponseBean = userService.update(  userID, updatedUser  );
        return parseResponse( userHttpResponseBean );
    }

    @Override
    public String removeUser(MsccBeanAdapter.User.ID userID) {
        HttpResponseBean<MsccBeanAdapter.User> userHttpResponseBean = userService.deleteById( userID );
        return parseResponse( userHttpResponseBean );
    }

    @Override
    public String userToOffice( MsccBeanAdapter.UserOffice userOffice ) {
        HttpResponseBean<MsccBeanAdapter.UserOffice> userOfficeHttpResponseBean = userOfficeService.add( userOffice );
        return parseResponse( userOfficeHttpResponseBean );
    }

    @Override
    public String addPermission( MsccBeanAdapter.SentTo permission ) {
        HttpResponseBean<MsccBeanAdapter.SentTo> sentToHttpResponseBean = sentToService.addPermission(  permission );
        return parseResponse( sentToHttpResponseBean );
    }

    @Override
    public String removePermission( MsccBeanAdapter.SentTo.ID permissionID ) {
        HttpResponseBean<MsccBeanAdapter.SentTo> sentToHttpResponseBean = sentToService.removePermission(  permissionID );
        return parseResponse( sentToHttpResponseBean );
    }

    @Override
    public String sendAction(MsccBeanAdapter.SentTo action ) {
        HttpResponseBean<MsccBeanAdapter.SentTo> sentToHttpResponseBean = sentToService.addAction(  action );
        return parseResponse( sentToHttpResponseBean );
    }

    @Override
    public String unsendAction(MsccBeanAdapter.SentTo.ID actionID ) {
        HttpResponseBean<MsccBeanAdapter.SentTo> sentToHttpResponseBean = sentToService.removeAction( actionID );
        return parseResponse( sentToHttpResponseBean );
    }

    @Override
    public String recordAction( MsccBeanAdapter.ActionTaken actionTaken ) {

        HttpResponseBean<MsccBeanAdapter.ActionTaken> actionTakenHttpResponseBean = actionService.add( actionTaken );

        //System.out.println( actionTakenHttpResponseBean.getStatusCode() );
        //System.out.println( actionTakenHttpResponseBean.getEntity().toString() );

        return parseResponse( actionTakenHttpResponseBean );

    }


    @Override
    public String emailObjects( MsccBeanAdapter.EmailFact emailObjects ) {
        HttpResponseBean<String> emailObjectsHttpResponseBean = emailService.EmailObjects( emailObjects );
        return parseResponse( emailObjectsHttpResponseBean );
    }

    @Override
    public String updateCollectionName( MsccBeanAdapter.Collection.ID collectionID, MsccBeanAdapter.Collection updatedCollection ) {
        HttpResponseBean<MsccBeanAdapter.Collection> collectionHttpResponseBean = collectionService.update( collectionID, updatedCollection );
        return parseResponse( collectionHttpResponseBean );
    }

    @Override
    public String addMeta( MsccBeanAdapter.Meta meta ) {
        HttpResponseBean<MsccBeanAdapter.Meta> metaHttpResponseBean = metaService.add( meta );
        return parseResponse( metaHttpResponseBean );
    }

    @Override
    public String updateObject( MsccBeanAdapter.Meta.ID metaID, MsccBeanAdapter.Meta updatedMeta ) {
        HttpResponseBean<MsccBeanAdapter.Meta> metaHttpResponseBean = metaService.update(  metaID, updatedMeta  );
        return parseResponse( metaHttpResponseBean );
    }

    @Override
    public List<MsccBeanAdapter.CollectionObject.ID> searchObjectsByMetaData(MsccBeanAdapter.QueryCriteria queryCriteria) {
        HttpResponseBean<List<MsccBeanAdapter.CollectionObject.ID>> metaHttpResponseBeans = metaService.findObjectsByMeta( queryCriteria );

        return metaHttpResponseBeans.getEntity();

    }

    @Override
    public MsccBeanAdapter.CollectionObject getObjectsByKey(MsccBeanAdapter.CollectionObject.ID collectionObjectID) {
        HttpResponseBean<MsccBeanAdapter.CollectionObject> objectHttpResponseBeans = objectService.findById( collectionObjectID );

        if( objectHttpResponseBeans.getStatusCode() == 200 )
            return objectHttpResponseBeans.getEntity();
        else
            return  null;
    }

    @Override
    public List<MsccBeanAdapter.CollectionObject.ID> getObjectsByReference(MsccBeanAdapter.QueryCriteria queryCriteria) {
        HttpResponseBean<List<MsccBeanAdapter.CollectionObject.ID>> objectHttpResponseBeans = objectService.findByReference( queryCriteria );
        return objectHttpResponseBeans.getEntity();
    }

    @Override
    public List<MsccBeanAdapter.CollectionObject.ID> getObjectsByCollection(MsccBeanAdapter.Collection.ID collectionID) {
        HttpResponseBean<List<MsccBeanAdapter.CollectionObject.ID>> objectHttpResponseBeans = collectionService.findObjectsById( collectionID );
        return objectHttpResponseBeans.getEntity();

    }

    @Override
    public List<MsccBeanAdapter.Collection.ID> getCollectionsInFolder(MsccBeanAdapter.Folder.ID folderID ) {
        HttpResponseBean<List<MsccBeanAdapter.Collection.ID>> folderHttpResponseBeans = folderService.findCollectionById( folderID );

        return folderHttpResponseBeans.getEntity();
    }
}
