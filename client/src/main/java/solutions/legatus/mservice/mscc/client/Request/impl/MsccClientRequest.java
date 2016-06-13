package solutions.legatus.mservice.mscc.client.Request.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import solutions.legatus.mservice.mscc.client.Bean.impl.MsccBeanAdapter;
import solutions.legatus.mservice.mscc.client.Request.*;
import solutions.legatus.mservice.mscc.client.Utils.BeanUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//import static solutions.legatus.mservice.mscc.client.Request.impl.MsccClientRequest.UserOfficeService._USEROFFICE_ROUTE_;

/**
 * Created by ahou on 2/12/2016.
 */
public class MsccClientRequest implements ILegatusService {

    private static final Logger LOGGER = LoggerFactory.getLogger( MsccClientRequest.class);

    private final static String BASE_URI = "http://localhost:9100";

    private final static String APP_NAME     = "MsccClient";
    private final static String API_KEY      = "legatus";
    private final static String API_SECRET   = "legatus";
    private final static String ACCESS_TOKEN = "token";

    private final static String _CONTENT_TYPE = "application/json";


    private final static String _LISTALL_ = "/listAll";
    private final static String _LIST_    = "/list";
    private final static String _FINDONE_ = "";


    private static MsccClientRequest _instance_;

    private String baseUri;
    private IMsccRestClient restClient;

    private MsccClientRequest() {
        this( new ApacheMsccRestClient(), BASE_URI);
    }

    private MsccClientRequest( IMsccRestClient restClient, String baseUri ) {

        this.restClient = restClient;
        this.baseUri = baseUri;
    }


    public static MsccClientRequest getInstance( IMsccRestClient restClient, String baseUri  ) {
        if (_instance_ == null) {

            synchronized (MsccClientRequest.class) {
                if (_instance_ == null) {
                    _instance_ = new MsccClientRequest( restClient, baseUri  );
                }
            }

        }

        return _instance_;
    }

    public class OrganizationService extends AbstractMsccRestService<MsccBeanAdapter.Organization, MsccBeanAdapter.Organization.ID>  implements IMsccOrganizationRest {

        private final static String _ORGANIZATION_ROUTE_ = "/api/organizations";

        public OrganizationService() {
            LOGGER.info("Initilization ... " + OrganizationService.class);
        }

        @Override
        public HttpResponseBean<MsccBeanAdapter.Organization> findById(MsccBeanAdapter.Organization.ID Id) {

            LOGGER.info("findById ... " + MsccClientRequest.class + "--->" + OrganizationService.class + "---->" + Id);

            HttpResponseBean responseBean = null;

            MsccBeanAdapter.Organization organization = new MsccBeanAdapter.Organization();

            responseBean =  findByIdServcice( restClient, organization, Id, getFindOneRoute( _ORGANIZATION_ROUTE_) );

            return responseBean;

        } //end of findbyId

        @Override
        public HttpResponseBean<List<MsccBeanAdapter.Organization>> listAll() {

            LOGGER.info("list ... " + MsccClientRequest.class + "--->" + OrganizationService.class + "---->" );

            int statusCode = -1;
            HttpResponseBean responseBean = new HttpResponseBean<List<MsccBeanAdapter.Organization>>();


            String url = getListAllRoute( _ORGANIZATION_ROUTE_);

            MsccBeanAdapter.Organization organization = new MsccBeanAdapter.Organization();

            responseBean = listAllService( restClient, organization, url );

            return responseBean;

        } //end of listAll()




        @Override
        public HttpResponseBean<MsccBeanAdapter.Organization> add(MsccBeanAdapter.Organization entity) {

            LOGGER.info("add ... " + MsccClientRequest.class + "--->" + OrganizationService.class + "---->" + entity);

            HttpResponseBean responseBean = null;
            int statusCode = -1;

            responseBean = addService( restClient, entity, getPostRoute( _ORGANIZATION_ROUTE_ ) );

            return  responseBean;

        } //end of add


        @Override
        public HttpResponseBean<MsccBeanAdapter.Organization> update(MsccBeanAdapter.Organization.ID entityID, MsccBeanAdapter.Organization entity) {

            LOGGER.info("update ... " + MsccClientRequest.class + " --->" + OrganizationService.class + "---->" + entity);

            HttpResponseBean responseBean = null;
            int statusCode = -1;

            responseBean = updateService( restClient, entityID, entity, getFindOneRoute( _ORGANIZATION_ROUTE_) );

            return responseBean;

        } //end of put


        @Override
        public HttpResponseBean<MsccBeanAdapter.Organization> deleteById(MsccBeanAdapter.Organization.ID entityID) {

            LOGGER.info("deletebyid ... " + MsccClientRequest.class + " --->" + OrganizationService.class + "---->" + entityID);

            HttpResponseBean responseBean = null;
            int statusCode = -1;

            MsccBeanAdapter.Organization organization = new MsccBeanAdapter.Organization();

            responseBean = deleteByIdService( restClient, entityID, organization, getFindOneRoute(_ORGANIZATION_ROUTE_) );

            return responseBean;

        } //end of deletebyId



        @Override
        public HttpResponseBean<List<MsccBeanAdapter.Organization>> list(int pageNumber, int pageSize) {


            LOGGER.info("list ... " + MsccClientRequest.class + " --->" + OrganizationService.class + "---->" + "pageNumber: " + pageNumber + " pageSize: " + pageSize);

            HttpResponseBean responseBean = null;
            int statusCode = -1;

            MsccBeanAdapter.Organization organization = new MsccBeanAdapter.Organization();
            if (pageNumber > 0 && pageSize > 0) {

                String url = getPagelistRoute(_ORGANIZATION_ROUTE_, pageNumber, pageSize );

                System.out.println( "url is " + url );

                responseBean = listService(restClient, organization, url );

            }

            return responseBean;

        } //end of list
//


    } //end of organizationService

    public class OfficeService extends AbstractMsccRestService<MsccBeanAdapter.Office, MsccBeanAdapter.Office.ID> implements IMsccOfficeRest {

        private final static String _OFFICE_ROUTE_ = "/api/offices";

        public OfficeService() {

            LOGGER.info("Initilization ... " + OfficeService.class);
        }

        @Override
        public HttpResponseBean<MsccBeanAdapter.Office> findById(MsccBeanAdapter.Office.ID Id) {

            LOGGER.info( "findById ... " +  MsccClientRequest.class + "---> " +  OfficeService.class  + "--->" + Id );

            HttpResponseBean responseBean = null;

            MsccBeanAdapter.Office office = new MsccBeanAdapter.Office();

            responseBean =  findByIdServcice( restClient, office, Id, getFindOneRoute( _OFFICE_ROUTE_ ) );

            return responseBean;


        }

        @Override
        public HttpResponseBean<MsccBeanAdapter.Office> add(MsccBeanAdapter.Office entity) {

            LOGGER.info("add ... " + MsccClientRequest.class + "--->" + OfficeService.class + "---->" + entity);

            HttpResponseBean responseBean = null;
            int statusCode = -1;

            responseBean =  addService( restClient, entity, getPostRoute( _OFFICE_ROUTE_ ) );

            return responseBean;
        }

        @Override
        public HttpResponseBean<MsccBeanAdapter.Office> update(MsccBeanAdapter.Office.ID entityID, MsccBeanAdapter.Office entity) {

            LOGGER.info("update ... " + MsccClientRequest.class + "--->" + OfficeService.class + "---->" + entity);

            HttpResponseBean responseBean = null;
            int statusCode = -1;

            responseBean =  updateService( restClient, entityID, entity, getPostRoute( _OFFICE_ROUTE_ ) );


            return responseBean;

        }


        @Override
        public HttpResponseBean<MsccBeanAdapter.Office> deleteById(MsccBeanAdapter.Office.ID entityID ) {

            LOGGER.info("delete ... " + MsccClientRequest.class + "--->" + OfficeService.class + "---->" );

            HttpResponseBean responseBean = null;
            int statusCode = -1;

            MsccBeanAdapter.Office entity = new MsccBeanAdapter.Office();

            responseBean =  deleteByIdService( restClient, entityID, entity, getDeleteOneRoute( _OFFICE_ROUTE_ ) );


            return responseBean;

        }



    } //end of office service

    public class UserService extends AbstractMsccRestService<MsccBeanAdapter.User, MsccBeanAdapter.User.ID> implements IMsccUserRest {

        private final static String _USER_ROUTE_ = "/api/users";

        public UserService() {

            LOGGER.info("Initilization ... " + UserService.class);
        }

        @Override
        public HttpResponseBean<MsccBeanAdapter.User> findById(MsccBeanAdapter.User.ID Id) {

            LOGGER.info( "findById ... " +  MsccClientRequest.class + "---> " +  UserService.class  + "--->" + Id );

            HttpResponseBean responseBean = null;

            MsccBeanAdapter.User user = new MsccBeanAdapter.User();
            responseBean =  findByIdServcice( restClient, user, Id, getFindOneRoute( _USER_ROUTE_ ) );

            return responseBean;


        }

        @Override
        public HttpResponseBean<MsccBeanAdapter.User> add(MsccBeanAdapter.User entity) {

            LOGGER.info("add ... " + MsccClientRequest.class + "--->" + UserService.class + "---->" + entity);

            HttpResponseBean responseBean = null;
            int statusCode = -1;

            responseBean =  addService( restClient, entity, getPostRoute( _USER_ROUTE_ ) );

            return responseBean;
        }

        @Override
        public HttpResponseBean<MsccBeanAdapter.User> update(MsccBeanAdapter.User.ID entityID, MsccBeanAdapter.User entity) {

            LOGGER.info("update ... " + MsccClientRequest.class + "--->" + UserService.class + "---->" + entity);

            HttpResponseBean responseBean = new HttpResponseBean<MsccBeanAdapter.User>( );
            int statusCode = -1;

            responseBean =  updateService( restClient, entityID, entity, getFindOneRoute( _USER_ROUTE_ ) );

            return responseBean;

        }


        @Override
        public HttpResponseBean<MsccBeanAdapter.User> deleteById(MsccBeanAdapter.User.ID entityID ) {

            LOGGER.info("delete ... " + MsccClientRequest.class + "--->" + UserService.class + "---->" );

            HttpResponseBean responseBean = null;
            int statusCode = -1;

            MsccBeanAdapter.User entity = new MsccBeanAdapter.User();

            responseBean =  deleteByIdService( restClient, entityID, entity, getDeleteOneRoute( _USER_ROUTE_ ) );

            return responseBean;

        }


    } //end of user service

    public class UserOfficeService extends AbstractMsccRestService<MsccBeanAdapter.UserOffice, MsccBeanAdapter.UserOffice.ID> implements IMsccUserOfficeRest {

        private final static String _USEROFFICE_ROUTE_ = "/api/useroffices";

        public UserOfficeService() {

            LOGGER.info("Initilization ... " + UserOfficeService.class);
        }

        @Override
        public HttpResponseBean<MsccBeanAdapter.UserOffice> findById(MsccBeanAdapter.UserOffice.ID Id) {

            LOGGER.info( "findById ... " +  MsccClientRequest.class + "---> " +  UserService.class  + "--->" + Id );

            HttpResponseBean responseBean = null;

            MsccBeanAdapter.UserOffice userOffice = new MsccBeanAdapter.UserOffice();

            responseBean =  findByIdServcice( restClient, userOffice, Id, getFindOneRoute( _USEROFFICE_ROUTE_ ) );


            return responseBean;


        }

        @Override
        public HttpResponseBean<MsccBeanAdapter.UserOffice> add(MsccBeanAdapter.UserOffice entity) {

            LOGGER.info("add ... " + MsccClientRequest.class + "--->" + UserOfficeService.class + "---->" + entity);

            HttpResponseBean responseBean = null;
            int statusCode = -1;

            responseBean =  addService( restClient, entity, getPostRoute( _USEROFFICE_ROUTE_ ) );

            return responseBean;
        }

        @Override
        public HttpResponseBean<MsccBeanAdapter.UserOffice> update(MsccBeanAdapter.UserOffice.ID entityID, MsccBeanAdapter.UserOffice entity) {

            LOGGER.info("update ... " + MsccClientRequest.class + "--->" + UserOfficeService.class + "---->" + entity);

            HttpResponseBean responseBean = new HttpResponseBean<MsccBeanAdapter.UserOffice>( );
            int statusCode = -1;

            responseBean =  updateService( restClient, entityID, entity, getPostRoute( _USEROFFICE_ROUTE_ ) );


            return responseBean;

        }


        @Override
        public HttpResponseBean<MsccBeanAdapter.UserOffice> deleteById(MsccBeanAdapter.UserOffice.ID entityID ) {

            LOGGER.info("delete ... " + MsccClientRequest.class + "--->" + UserOfficeService.class + "---->" );

            HttpResponseBean responseBean = null;
            int statusCode = -1;

            MsccBeanAdapter.UserOffice entity = new MsccBeanAdapter.UserOffice();

            responseBean =  deleteByIdService( restClient, entityID, entity, getDeleteOneRoute( _USEROFFICE_ROUTE_ ) );

            return responseBean;

        }


    } //end of user service

    public class CollectionService extends AbstractMsccRestService<MsccBeanAdapter.Collection, MsccBeanAdapter.Collection.ID> implements IMsccCollectionService {

        private final static String _COLLECTION_ROUTE_ = "/api/collections";

        public CollectionService() {

            LOGGER.info("Initilization ... " + CollectionService.class);
        }


        public HttpResponseBean<MsccBeanAdapter.CollectionObject.ID> findObjectsByIdServcice(IMsccRestClient restClient, MsccBeanAdapter.Collection entity, MsccBeanAdapter.Collection.ID Id, String url) {

            LOGGER.info("findByIdService ... " + AbstractMsccRestService.class + "--->" + Id);

            HttpResponseBean responseBean = null;

            responseBean = new HttpResponseBean<MsccBeanAdapter.CollectionObject.ID>();

            List<HttpRequestHeader> headers = new ArrayList<HttpRequestHeader>();

            List<MsccBeanAdapter.CollectionObject> t = new ArrayList<MsccBeanAdapter.CollectionObject>();

            headers.add(new HttpRequestHeader("Accept", _CONTENT_TYPE));

            HttpResponse response = null;

            try {
                response = restClient.doGet( url, headers, Id);

                System.out.println( "url is " + url );
                System.out.println( "url is " + headers );
                System.out.println( "url is " + Id );
                System.out.println( "response is " + response );

                StringBuffer responseHttp = BeanUtils.convertResponseToString( response );

                ObjectMapper mapper = new ObjectMapper();
                //List<MyClass> myObjects = mapper.readValue(jsonInput, new TypeReference<List<MyClass>>(){});
                List<MsccBeanAdapter.CollectionObject.ID> ids  = mapper.readValue( responseHttp.toString(), new TypeReference<List<MsccBeanAdapter.CollectionObject.ID>>(){} );

                responseBean.setEntity( ids );
                responseBean.setStatusCode( response.getStatusLine().getStatusCode() );

            } catch (IOException e) {
                //e.printStackTrace();
                //LOGGER.warn("OnException", e.toString());
                responseBean.setStatusCode( 500 );
            }

            return responseBean;

        } //end of findbyId


        public HttpResponseBean<List<MsccBeanAdapter.CollectionObject.ID>> findObjectsById(MsccBeanAdapter.Collection.ID Id ) {

            LOGGER.info( "findById ... " +  MsccClientRequest.class + "---> " +  CollectionService.class  + "--->" + Id );

            HttpResponseBean responseBean = null;

            MsccBeanAdapter.CollectionObject.ID objectID = new MsccBeanAdapter.CollectionObject.ID();

            responseBean =  findObjectsByIdServcice( restClient, null, Id, getFindOneRoute( _COLLECTION_ROUTE_ ) );


            return responseBean;


        }

        @Override
        public HttpResponseBean<MsccBeanAdapter.Collection> findById(MsccBeanAdapter.Collection.ID Id) {
            return null;
        }

        @Override
        public HttpResponseBean<MsccBeanAdapter.Collection> add(MsccBeanAdapter.Collection entity) {

            LOGGER.info("add ... " + MsccClientRequest.class + "--->" + CollectionService.class + "---->" + entity);

            HttpResponseBean responseBean = null;
            int statusCode = -1;

            responseBean =  addService( restClient, entity, getPostRoute( _COLLECTION_ROUTE_ ) );

            return responseBean;
        }

        @Override
        public HttpResponseBean<MsccBeanAdapter.Collection> update(MsccBeanAdapter.Collection.ID entityID, MsccBeanAdapter.Collection entity) {

            LOGGER.info("update ... " + MsccClientRequest.class + "--->" + CollectionService.class + "---->" + entity);

            HttpResponseBean responseBean = new HttpResponseBean<MsccBeanAdapter.Collection>( );
            int statusCode = -1;

            responseBean =  updateService( restClient, entityID, entity, getPostRoute( _COLLECTION_ROUTE_ ) );


            return responseBean;

        }


        @Override
        public HttpResponseBean<MsccBeanAdapter.Collection> deleteById( MsccBeanAdapter.Collection.ID entityID  ) {

            LOGGER.info("delete ... " + MsccClientRequest.class + "--->" + CollectionService.class + "---->" );

            HttpResponseBean responseBean = null;
            int statusCode = -1;

            MsccBeanAdapter.Collection entity = new MsccBeanAdapter.Collection();

            responseBean =  deleteByIdService( restClient, entityID, entity, getDeleteOneRoute( _COLLECTION_ROUTE_ ) );

            return responseBean;

        }


    } //end of collection

    public class ObjectService extends AbstractMsccRestService<MsccBeanAdapter.CollectionObject, MsccBeanAdapter.CollectionObject.ID> implements IMsccObjectService {

        private final static String _OBJECT_ROUTE_ = "/api/objects";

        public ObjectService() {

            LOGGER.info("Initilization ... " + ObjectService.class);
        }


        @Override
        public HttpResponseBean<MsccBeanAdapter.CollectionObject> add( MsccBeanAdapter.CollectionObject entity ) {

            LOGGER.info( "add ... " + MsccClientRequest.class + "--->" + CollectionService.class + "---->" + entity );

            HttpResponseBean responseBean = null;
            int statusCode = -1;

            responseBean =  addService( restClient, entity, getPostRoute( _OBJECT_ROUTE_ ) );

            return responseBean;
        }


        @Override
        public HttpResponseBean<MsccBeanAdapter.CollectionObject> findById( MsccBeanAdapter.CollectionObject.ID Id ) {

            LOGGER.info("findById ... " + MsccClientRequest.class + "--->" + ObjectService.class + "---->" + Id);

            HttpResponseBean responseBean = null;

            MsccBeanAdapter.CollectionObject obj = new MsccBeanAdapter.CollectionObject();

            responseBean =  findByIdServcice( restClient, obj, Id, getFindOneRoute( _OBJECT_ROUTE_) );

            return responseBean;
        }


        @Override
        public HttpResponseBean<List<MsccBeanAdapter.CollectionObject.ID>> findByReference( MsccBeanAdapter.QueryCriteria queryCriteria ) {

            LOGGER.info( "findByReference ... " + AbstractMsccRestService.class + "--->" + queryCriteria );

            HttpResponseBean responseBean = null;

            responseBean = new HttpResponseBean<MsccBeanAdapter.CollectionObject.ID>();

            List<HttpRequestHeader> headers = new ArrayList<HttpRequestHeader>();

            List<MsccBeanAdapter.CollectionObject> t = new ArrayList<MsccBeanAdapter.CollectionObject>();

            headers.add(new HttpRequestHeader("Accept", _CONTENT_TYPE));

            HttpResponse response = null;

            //String url = baseUri + _OBJECT_ROUTE_ + "/" + "search/{qc}";
            String url = baseUri + _OBJECT_ROUTE_ + "/" + "search";


            try {
                response = restClient.doGet( url, headers, queryCriteria );

                StringBuffer responseHttp = BeanUtils.convertResponseToString( response );

                ObjectMapper mapper = new ObjectMapper();
                //List<MyClass> myObjects = mapper.readValue(jsonInput, new TypeReference<List<MyClass>>(){});


                List<MsccBeanAdapter.CollectionObject.ID> ids  = mapper.readValue( responseHttp.toString(), new TypeReference<List<MsccBeanAdapter.CollectionObject.ID>>(){} );

                responseBean.setEntity( ids );
                responseBean.setStatusCode( response.getStatusLine().getStatusCode() );

            } catch (IOException e) {
                e.printStackTrace();
                LOGGER.warn("OnException", e.toString());
                responseBean.setStatusCode( 500 );
            }

            return responseBean;



        }

        @Override
        public HttpResponseBean<MsccBeanAdapter.CollectionObject> update(MsccBeanAdapter.CollectionObject.ID entityID, MsccBeanAdapter.CollectionObject entity) {

            LOGGER.info("update ... " + MsccClientRequest.class + "--->" + CollectionService.class + "---->" + entity);

            HttpResponseBean responseBean = new HttpResponseBean<MsccBeanAdapter.Collection>( );
            int statusCode = -1;

            responseBean =  updateService( restClient, entityID, entity, getPostRoute( _OBJECT_ROUTE_ ) );


            return responseBean;

        }


        @Override
        public HttpResponseBean<MsccBeanAdapter.CollectionObject> deleteById( MsccBeanAdapter.CollectionObject.ID entityID  ) {

            LOGGER.info("delete ... " + MsccClientRequest.class + "--->" + CollectionService.class + "---->" );

            HttpResponseBean responseBean = null;
            int statusCode = -1;

            MsccBeanAdapter.CollectionObject entity = new MsccBeanAdapter.CollectionObject();

            responseBean =  deleteByIdService( restClient, entityID, entity, getDeleteOneRoute( _OBJECT_ROUTE_ ) );

            return responseBean;

        }


    } //end of object service

    public class FolderService extends AbstractMsccRestService<MsccBeanAdapter.Folder, MsccBeanAdapter.Folder.ID> implements IMsccFolderService {

        private final static String _FOLDER_ROUTE_ = "/api/folders";

        public FolderService() {

            LOGGER.info("Initilization ... " + FolderService.class);
        }


        @Override
        public HttpResponseBean<MsccBeanAdapter.Collection> add(MsccBeanAdapter.Collection entity) {

            LOGGER.info("add ... " + MsccClientRequest.class + "--->" + FolderService.class + "---->" + entity);

            HttpResponseBean responseBean = null;
            int statusCode = -1;

            responseBean = addService(restClient, entity, getPostRoute(_FOLDER_ROUTE_));


            return responseBean;

        }

        @Override
        public HttpResponseBean<List<MsccBeanAdapter.Collection.ID>> findCollectionById(MsccBeanAdapter.Folder.ID Id) {
            LOGGER.info("findById ... " + MsccClientRequest.class + "---> " + CollectionService.class + "--->" + Id);

            HttpResponseBean responseBean = null;

            MsccBeanAdapter.CollectionObject.ID objectID = new MsccBeanAdapter.CollectionObject.ID();

            responseBean = findCollectionByIdServcice(restClient, null, Id, getFindOneRoute(_FOLDER_ROUTE_));


            return responseBean;

        }


        public HttpResponseBean<MsccBeanAdapter.Collection.ID> findCollectionByIdServcice(IMsccRestClient restClient, MsccBeanAdapter.Collection entity, MsccBeanAdapter.Folder.ID Id, String url) {

            LOGGER.info("findByIdService ... " + FolderService.class + "--->" + Id);

            HttpResponseBean responseBean = null;

            List<HttpRequestHeader> headers = new ArrayList<HttpRequestHeader>();

            List<MsccBeanAdapter.Collection.ID> t = new ArrayList<MsccBeanAdapter.Collection.ID>();

            headers.add(new HttpRequestHeader("Accept", _CONTENT_TYPE));

            HttpResponse response = null;

            responseBean = new HttpResponseBean<MsccBeanAdapter.Collection.ID>();

            try {
                List<MsccBeanAdapter.Collection.ID> ids;

                response = restClient.doGet(url, headers, Id);

                StringBuffer responseHttp = BeanUtils.convertResponseToString( response );

                System.out.println( "response" + response.toString() );

                if( response.getStatusLine().getStatusCode() == 200 ) {

                    //System.out.println(  response.getResponseBody().toString() );
                    ObjectMapper mapper = new ObjectMapper();


                    //List<MyClass> myObjects = mapper.readValue(jsonInput, new TypeReference<List<MyClass>>(){});
                    ids = mapper.readValue( responseHttp.toString(), new TypeReference<List<MsccBeanAdapter.Collection.ID>>() {
                    });

                } else {

                    ids = new ArrayList<MsccBeanAdapter.Collection.ID>();

                }

                responseBean.setEntity( ids );

                responseBean.setStatusCode(response.getStatusLine().getStatusCode());

            } catch (IOException e) {
                //e.printStackTrace();
                LOGGER.warn("OnException", e.toString());
                responseBean.setStatusCode(500);
            }

            return responseBean;

        } //end of findbyId


        @Override
        public HttpResponseBean<MsccBeanAdapter.Collection> deleteById(MsccBeanAdapter.Folder.ID entityID) {

            LOGGER.info("delete ... " + MsccClientRequest.class + "--->" + FolderService.class + "---->");

            HttpResponseBean responseBean = null;
            int statusCode = -1;

            MsccBeanAdapter.Collection entity = new MsccBeanAdapter.Collection();

            responseBean = deleteByIdService(restClient, entityID, entity, getDeleteOneRoute(_FOLDER_ROUTE_));

            return responseBean;

        } // End of folder


    } //End of folder servier

    public class FolderContentService extends AbstractMsccRestService<MsccBeanAdapter.Folder, MsccBeanAdapter.FolderContents.ID> implements IMsccFolderContentService {

            private final static String _FOLDER_ROUTE_ = "/api/folder/contents";

            public FolderContentService() {

                LOGGER.info("Initilization ... " + FolderService.class);
            }


            @Override
            public HttpResponseBean<MsccBeanAdapter.FolderContents> add(MsccBeanAdapter.FolderContents entity) {

                LOGGER.info("add ... " + MsccClientRequest.class + "--->" + FolderService.class + "---->" + entity);

                HttpResponseBean responseBean = null;
                int statusCode = -1;

                responseBean = addService(restClient, entity, getPostRoute(_FOLDER_ROUTE_));


                return responseBean;

            }


            @Override
            public HttpResponseBean<MsccBeanAdapter.FolderContents> deleteById(  MsccBeanAdapter.FolderContents.ID entityID ) {

                LOGGER.info("delete ... " + MsccClientRequest.class + "--->" + FolderService.class + "---->");

                HttpResponseBean responseBean = null;
                int statusCode = -1;

                MsccBeanAdapter.FolderContents entity = new MsccBeanAdapter.FolderContents();

                responseBean = deleteByIdService( restClient, entityID, entity, getDeleteOneRoute(_FOLDER_ROUTE_) );

                return responseBean;

            }


    }// End of folder content

    public class SentToService extends AbstractMsccRestService<MsccBeanAdapter.SentTo, MsccBeanAdapter.SentTo.ID> implements IMsccSentToService {

        private final static String _SENT_TO_ROUTE_ = "/api/authorization";

        public SentToService() {

            LOGGER.info("Initilization ... " + FolderService.class);
        }


        @Override
        public HttpResponseBean<MsccBeanAdapter.SentTo> addPermission( MsccBeanAdapter.SentTo entity ) {

            LOGGER.info("add ... " + MsccClientRequest.class + "--->" + FolderService.class + "---->" + entity);

            HttpResponseBean responseBean = null;
            int statusCode = -1;

            responseBean = addService(restClient, entity, getPostRoute(_SENT_TO_ROUTE_));


            return responseBean;

        }

        @Override
        public HttpResponseBean<MsccBeanAdapter.SentTo> removePermission( MsccBeanAdapter.SentTo.ID entityID ) {

            LOGGER.info("deletebyid ... " + MsccClientRequest.class + " --->" + SentToService.class + "---->" + entityID);

            HttpResponseBean responseBean = null;
            int statusCode = -1;

            MsccBeanAdapter.SentTo sento = new MsccBeanAdapter.SentTo();

            responseBean = deleteByIdService( restClient, entityID, sento, getFindOneRoute(_SENT_TO_ROUTE_) );

            return responseBean;
        }

        @Override
        public HttpResponseBean<MsccBeanAdapter.SentTo> addAction( MsccBeanAdapter.SentTo entity ) {

            LOGGER.info("add ... " + MsccClientRequest.class + "--->" + FolderService.class + "---->" + entity);

            HttpResponseBean responseBean = null;
            int statusCode = -1;

            responseBean = addService(restClient, entity, getPostRoute(_SENT_TO_ROUTE_));


            return responseBean;

        }

        @Override
        public HttpResponseBean<MsccBeanAdapter.SentTo> removeAction( MsccBeanAdapter.SentTo.ID entityID ) {

            LOGGER.info("deletebyid ... " + MsccClientRequest.class + " --->" + SentToService.class + "---->" + entityID);

            HttpResponseBean responseBean = null;
            int statusCode = -1;

            MsccBeanAdapter.SentTo sento = new MsccBeanAdapter.SentTo();

            responseBean = deleteByIdService( restClient, entityID, sento, getFindOneRoute(_SENT_TO_ROUTE_) );

            return responseBean;

        }



    }// End of sento

    public class MetaService extends AbstractMsccRestService<MsccBeanAdapter.Meta, MsccBeanAdapter.Meta.ID> implements IMsccMetaService {

        private final static String _META_ROUTE_ = "/api/metas";

        public MetaService() {

            LOGGER.info("Initilization ... " + CollectionService.class);
        }

        @Override
        public HttpResponseBean<List<MsccBeanAdapter.CollectionObject.ID>> findObjectsByMeta( MsccBeanAdapter.QueryCriteria queryCriteria ) {

            LOGGER.info("findObjectsByMeta ... " + MetaService.class + "--->" + queryCriteria );

            HttpResponseBean responseBean = null;

            responseBean = new HttpResponseBean<List<MsccBeanAdapter.CollectionObject.ID>>();

            List<HttpRequestHeader> headers = new ArrayList<HttpRequestHeader>();

            List<MsccBeanAdapter.CollectionObject> t = new ArrayList<MsccBeanAdapter.CollectionObject>();

            headers.add(new HttpRequestHeader("Accept", _CONTENT_TYPE));

            String url = baseUri + _META_ROUTE_ + "/" + "search";


            HttpResponse response = null;

            try {
                response = restClient.doGet( url, headers, queryCriteria );

                StringBuffer responseHttp = BeanUtils.convertResponseToString( response );


                ObjectMapper mapper = new ObjectMapper();
                //List<MyClass> myObjects = mapper.readValue(jsonInput, new TypeReference<List<MyClass>>(){});
                List<MsccBeanAdapter.CollectionObject.ID> ids  = mapper.readValue( responseHttp.toString(), new TypeReference<List<MsccBeanAdapter.CollectionObject.ID>>(){} );

                responseBean.setEntity( ids );
                responseBean.setStatusCode( response.getStatusLine().getStatusCode() );

            } catch (IOException e) {
                e.printStackTrace();
                LOGGER.warn("OnException", e.toString());
                responseBean.setStatusCode( 500 );
            }

            return responseBean;

        } //end of findbyId




        @Override
        public HttpResponseBean<MsccBeanAdapter.Meta> add( MsccBeanAdapter.Meta entity ) {

            LOGGER.info( "add ... " + MsccClientRequest.class + "--->" + FolderService.class + "---->" + entity );

            HttpResponseBean responseBean = null;

            int statusCode = -1;

            responseBean = addService( restClient, entity, getPostRoute( _META_ROUTE_ ) );


            return responseBean;
        }

        @Override
        public HttpResponseBean<MsccBeanAdapter.Meta> update(MsccBeanAdapter.Meta.ID entityID, MsccBeanAdapter.Meta entity) {
            LOGGER.info("update ... " + MsccClientRequest.class + "--->" + CollectionService.class + "---->" + entity);

            HttpResponseBean responseBean = new HttpResponseBean<MsccBeanAdapter.Collection>( );
            int statusCode = -1;

            responseBean =  updateService( restClient, entityID, entity, getPostRoute( _META_ROUTE_ ) );


            return responseBean;
        }
    } //end of collection

    public class ActionService extends AbstractMsccRestService<MsccBeanAdapter.ActionTaken, MsccBeanAdapter.ActionTaken.ID> implements IMsccActionService {

        private final static String _ACTION_TO_ROUTE_ = "/api/authorization/record";

        public ActionService() {

            LOGGER.info("Initilization ... " + ActionService.class);
        }


        @Override
        public HttpResponseBean<MsccBeanAdapter.ActionTaken> add( MsccBeanAdapter.ActionTaken entity ) {

            LOGGER.info("add ... " + MsccClientRequest.class + "--->" + ActionService.class + "---->" + entity);

            HttpResponseBean responseBean = null;
            int statusCode = -1;

            responseBean = addService(restClient, entity, getPostRoute(_ACTION_TO_ROUTE_));


            return responseBean;

        }




    }// End of sento

    public class EmailService extends AbstractMsccRestService implements IMsccEmailService {

        private final static String _EMAIL_TO_ROUTE_ = "/api/objects/email";

        public EmailService() {

            LOGGER.info("Initilization ... " + ActionService.class);
        }


        @Override
        public HttpResponseBean EmailObjects( MsccBeanAdapter.EmailFact entity ) {

            //responseBean = addService( restClient, entity, getPostRoute( _EMAIL_TO_ROUTE_ ) );

            LOGGER.info(  EmailService.class + "--->" + entity );

            HttpResponseBean responseBean = null;

            responseBean = new HttpResponseBean<MsccBeanAdapter.CollectionObject.ID>();

            List<HttpRequestHeader> headers = new ArrayList<HttpRequestHeader>();

            List<MsccBeanAdapter.CollectionObject> t = new ArrayList<MsccBeanAdapter.CollectionObject>();

            headers.add(new HttpRequestHeader("Accept", _CONTENT_TYPE));

            HttpResponse response = null;

            String url = getPostRoute( _EMAIL_TO_ROUTE_ );


            try {
                response = restClient.doPost( url, headers, entity );

                StringBuffer responseHttp = BeanUtils.convertResponseToString( response );

                ObjectMapper mapper = new ObjectMapper();
                //List<MyClass> myObjects = mapper.readValue(jsonInput, new TypeReference<List<MyClass>>(){});

                System.out.println( "The resonse is:" + responseHttp.toString() );

                responseBean.setEntity( responseHttp.toString() );

                responseBean.setStatusCode( response.getStatusLine().getStatusCode() );

            } catch (IOException e) {
                e.printStackTrace();
                LOGGER.warn("OnException", e.toString());
                responseBean.setStatusCode( 500 );
            }

            return responseBean;

        }

    }// End of sentoEmail

        private String getListAllRoute(String route) {
            return baseUri + route + _LISTALL_;
        }
        private String getPagelistRoute(String route, int pageNumber, int pageSize )    {
            return baseUri + route + _LIST_ + "/" + pageNumber + "/" + pageSize ;
        }
        private String getFindOneRoute(String route) {
            return baseUri + route + _FINDONE_;
        }
        private String getDeleteOneRoute(String route) {
            return baseUri + route + _FINDONE_;
        }
        private String getPostRoute(String route)    {
        return baseUri + route;
    }


}







