import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import solutions.legatus.mservice.mscc.client.Bean.impl.MsccBeanAdapter;
import solutions.legatus.mservice.mscc.client.Bean.impl.MsccCollectionDialogShare;
import solutions.legatus.mservice.mscc.client.Bean.impl.MsccCollectionDialogType;
import solutions.legatus.mservice.mscc.client.Bean.impl.MsccCollectionObjectAcq;

import solutions.legatus.mservice.mscc.client.Request.impl.ApacheMsccRestClient;
import solutions.legatus.mservice.mscc.client.Request.impl.HttpResponseBean;
import solutions.legatus.mservice.mscc.client.Request.impl.MsccClientRequest;
import solutions.legatus.mservice.mscc.client.Utils.MsccConstants;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by ahou on 5/13/2016.
 */


public class MsccClientCollectionObjectRequestTest {
    private final static String BASE_URI = "http://localhost:9100";

    private MsccClientRequest.ObjectService objectService;

    @Before
    public void setup() {
        objectService = MsccClientRequest.getInstance(new ApacheMsccRestClient(), BASE_URI).new ObjectService();
    }


    @Test
    public void Object_add_test() {


        MsccBeanAdapter.CollectionObject entity = MsccBeanAdapter.CollectionObject.getBuilder()
                .ID( new MsccBeanAdapter.CollectionObject.ID( "legat120", "scott214", "user114", "serious", null ) )
                .AcqUserService( MsccCollectionObjectAcq.SERVICE )
                .build();

        HttpResponseBean<MsccBeanAdapter.CollectionObject> objectHttpResponseBean = objectService.add( entity );


        if( objectHttpResponseBean != null && objectHttpResponseBean.getEntity() != null) {

            System.out.println( "The added entity is:" + objectHttpResponseBean.getEntity() );
            //System.out.println(collectionHttpResponseBean.getEntity().getID());

            System.out.println(objectHttpResponseBean.getStatusCode());
        } else {

            System.out.println("failed");
        }

        Assert.assertTrue(objectHttpResponseBean.getStatusCode() == 201);

    }



    @Test
    public void findObjectsByCollectionID_test() {

        MsccBeanAdapter.Collection entity = MsccBeanAdapter.Collection.getBuilder()

                .ID( new MsccBeanAdapter.Collection.ID( "legat120", "scott214", "user114", "serious" ) )
                .Account( "123456789")
                .DialogShare(MsccCollectionDialogShare.ORGOWNER )
                .DialogType(MsccCollectionDialogType.ALLTYPE )
                .Folder( "piano" )
                .OrganizationCreator( "legat188")
                .build();

//        HttpResponseBean<MsccBeanAdapter.CollectionObject.ID> collectionHttpResponseBean = objectService.findObjectsById( entity.getID() );
//
//        System.out.println( "what we got " + collectionHttpResponseBean.getEntity() );
//
//        System.out.println(collectionHttpResponseBean.getStatusCode());

    }


    @Test
    public void getObjectReferenceTest() throws Exception {

        MsccBeanAdapter.SearchTerm t1 = new MsccBeanAdapter.SearchTerm( MsccConstants.MSCC_SEARCH_ORGANIZATION, "legat120" );
        MsccBeanAdapter.SearchTerm t2 = new MsccBeanAdapter.SearchTerm(MsccConstants.MSCC_SEARCH_OFFICE, "scott214" );
        //MsccBeanAdapter.SearchTerm t3 = new MsccBeanAdapter.SearchTerm(MsccConstants.MSCC_SEARCH_SEQUENCE, "2" );
        MsccBeanAdapter.SearchTerm t3 = new MsccBeanAdapter.SearchTerm(MsccConstants.MSCC_SEARCH_SEQUENCE, 100 );
//        MsccBeanAdapter.SearchTerm t4 = new MsccBeanAdapter.SearchTerm(MsccConstants.MSCC_SEARCH_REFNBR, "950" );

        MsccBeanAdapter.QueryCriteria q = new MsccBeanAdapter.QueryCriteria( );
        q.addFuzzyQuery( t1 );
        q.addFuzzyQuery( t2 );
        q.addFuzzyQuery( t3 );

//        q.addFuzzyQuery( t2 ).addFuzzyQuery( t3 ).addFuzzyQuery( t4 );

        List<String> orderBy = new ArrayList<String>();
        orderBy.add( "Created");

        HttpResponseBean<List<MsccBeanAdapter.CollectionObject.ID>> objectHttpResponseBean = objectService.findByReference( q );

        if( objectHttpResponseBean != null && objectHttpResponseBean.getEntity() != null) {

            System.out.println( "The searched entity is:" + objectHttpResponseBean.getEntity() );
            //System.out.println(collectionHttpResponseBean.getEntity().getID());

            System.out.println(objectHttpResponseBean.getStatusCode());
        } else {

            System.out.println("failed");
        }

        Assert.assertTrue(objectHttpResponseBean.getStatusCode() == 200);


    }



    @Test
    public void Object_findone_test() {

        MsccBeanAdapter.CollectionObject entity = MsccBeanAdapter.CollectionObject.getBuilder()
                .ID( new MsccBeanAdapter.CollectionObject.ID( "legat120", "scott214", "user114", "serious", 1 ) )
                .AcqUserService( MsccCollectionObjectAcq.SERVICE )
                .build();


        HttpResponseBean<MsccBeanAdapter.CollectionObject> objectHttpResponseBean = objectService.findById( entity.getID() );

        System.out.println( objectHttpResponseBean.getStatusCode() );

        if( objectHttpResponseBean.getStatusCode() == 200 ) {
            System.out.println( "The result object is: " + objectHttpResponseBean.getEntity().toString() );

        }


    }


    @Test
    public void Collection_update_test() {

        MsccBeanAdapter.CollectionObject entity = MsccBeanAdapter.CollectionObject.getBuilder()
                .ID( new MsccBeanAdapter.CollectionObject.ID( "legat120", "scott214", "user114", "serious", 1 ) )
                .AcqUserService( MsccCollectionObjectAcq.SERVICE )
                .build();

        MsccBeanAdapter.CollectionObject updated = MsccBeanAdapter.CollectionObject.getBuilder()
                .ID( new MsccBeanAdapter.CollectionObject.ID( "legat120", "scott214", "user114", "serious", 1 ) )
                .Superseded_by( "test" )
                .AcqUserService( MsccCollectionObjectAcq.USER )
                .build();

        HttpResponseBean<MsccBeanAdapter.CollectionObject> objectHttpResponseBean = objectService.update( entity.getID(), updated );

        if (objectHttpResponseBean != null && objectHttpResponseBean.getEntity() != null) {
            System.out.println(objectHttpResponseBean);
            System.out.println(objectHttpResponseBean.getStatusCode());
        } else {

            System.out.println("yyyy");
        }
        Assert.assertTrue(objectHttpResponseBean.getStatusCode() == 202);
    }



    @Test
    public void Collection_deleteone_test() {

//        MsccBeanAdapter.Collection entity = MsccBeanAdapter.Collection.getBuilder()
//
//                .ID( new MsccBeanAdapter.Collection.ID( "legat110", "scott111", "", "radio" ) )
//                .Account( "123456789")
//                .DialogShare(MsccCollectionDialogShare.ORGOWNER )
//                .DialogType(MsccCollectionDialogType.ALLTYPE )
//                .Folder( "piano" )
//                .OrganizationCreator( "legat188")
//                .build();
//
//        HttpResponseBean<MsccBeanAdapter.Collection> collectionHttpResponseBean = collectionService.deleteById( entity.getID() );
//
//        if( collectionHttpResponseBean.getStatusCode() == 202 ) {
//            System.out.println( collectionHttpResponseBean.getEntity().getID() );
//        } else {
//            System.out.println( collectionHttpResponseBean.getEntity() );
//        }
//
//        System.out.println(collectionHttpResponseBean.getStatusCode());
//
//
//        Assert.assertTrue(collectionHttpResponseBean.getStatusCode() == 202);

    }


}