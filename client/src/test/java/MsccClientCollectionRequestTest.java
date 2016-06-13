import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import solutions.legatus.mservice.mscc.client.Bean.impl.MsccBeanAdapter;
import solutions.legatus.mservice.mscc.client.Bean.impl.MsccCollectionDialogShare;
import solutions.legatus.mservice.mscc.client.Bean.impl.MsccCollectionDialogType;
import solutions.legatus.mservice.mscc.client.Request.impl.ApacheMsccRestClient;
import solutions.legatus.mservice.mscc.client.Request.impl.HttpResponseBean;
import solutions.legatus.mservice.mscc.client.Request.impl.MsccClientRequest;

import java.util.List;


/**
 * Created by ahou on 5/13/2016.
 */


public class MsccClientCollectionRequestTest {
    private final static String BASE_URI = "http://localhost:9100";

    private MsccClientRequest.CollectionService collectionService;

    @Before
    public void setup() {
        collectionService = MsccClientRequest.getInstance(new ApacheMsccRestClient(), BASE_URI).new CollectionService();
    }


    @Test
    public void Collection_add_test() {

        MsccBeanAdapter.Collection entity = MsccBeanAdapter.Collection.getBuilder()

                .ID( new MsccBeanAdapter.Collection.ID( "legat110", "scott111", "", "radio" ) )
                .Account( "123456789")
                .DialogShare(MsccCollectionDialogShare.ORGOWNER )
                .DialogType(MsccCollectionDialogType.ALLTYPE )
                .Folder( "piano" )
                .OrganizationCreator( "legat188")
                .build();

        HttpResponseBean<MsccBeanAdapter.Collection> collectionHttpResponseBean = collectionService.add( entity );


        if( collectionHttpResponseBean != null && collectionHttpResponseBean.getEntity() != null) {

            System.out.println( collectionHttpResponseBean.getEntity() );
            //System.out.println(collectionHttpResponseBean.getEntity().getID());

            System.out.println(collectionHttpResponseBean.getStatusCode());
        } else {

            System.out.println("failed");
        }

        Assert.assertTrue(collectionHttpResponseBean.getStatusCode() == 201);

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

        HttpResponseBean<List<MsccBeanAdapter.CollectionObject.ID>> collectionHttpResponseBean = collectionService.findObjectsById( entity.getID() );

        System.out.println( "what we got " + collectionHttpResponseBean.getEntity() );

        System.out.println(collectionHttpResponseBean.getStatusCode());

    }



    @Test
    public void Collection_update_test() {

        MsccBeanAdapter.Collection entity = MsccBeanAdapter.Collection.getBuilder()

                .ID( new MsccBeanAdapter.Collection.ID( "legat120", "scott124", "superman", "cloud" ) )
                .Account( "123456789")
                .DialogShare(MsccCollectionDialogShare.ORGOWNER )
                .DialogType(MsccCollectionDialogType.ALLTYPE )
                .Folder( "piano" )
                .OrganizationCreator( "legat188")
                .build();

        MsccBeanAdapter.Collection updated = MsccBeanAdapter.Collection.getBuilder()

                .ID( new MsccBeanAdapter.Collection.ID( "legat120", "scott124", "superman", "cloud" ) )
                .Account( "987654321")
                .DialogShare(MsccCollectionDialogShare.OFFOWNER )
                .DialogType(MsccCollectionDialogType.NONE )
                //.Folder( "piano" )
                //.OrganizationCreator( "legat188")
                .build();

        HttpResponseBean<MsccBeanAdapter.Collection> collectionHttpResponseBean = collectionService.update(entity.getID(), updated);

        if (collectionHttpResponseBean != null && collectionHttpResponseBean.getEntity() != null) {
            System.out.println(collectionHttpResponseBean);
            System.out.println(collectionHttpResponseBean.getStatusCode());
        } else {

            System.out.println("yyyy");
        }

        System.out.println(collectionHttpResponseBean.getStatusCode());

        Assert.assertTrue(collectionHttpResponseBean.getStatusCode() == 202);
    }



    @Test
    public void Collection_deleteone_test() {

        MsccBeanAdapter.Collection entity = MsccBeanAdapter.Collection.getBuilder()

                .ID( new MsccBeanAdapter.Collection.ID( "legat110", "scott111", "", "radio" ) )
                .Account( "123456789")
                .DialogShare(MsccCollectionDialogShare.ORGOWNER )
                .DialogType(MsccCollectionDialogType.ALLTYPE )
                .Folder( "piano" )
                .OrganizationCreator( "legat188")
                .build();

        HttpResponseBean<MsccBeanAdapter.Collection> collectionHttpResponseBean = collectionService.deleteById( entity.getID() );

        if( collectionHttpResponseBean.getStatusCode() == 202 ) {
            System.out.println( collectionHttpResponseBean.getEntity().getID() );
        } else {
            System.out.println( collectionHttpResponseBean.getEntity() );
        }

        System.out.println(collectionHttpResponseBean.getStatusCode());


        Assert.assertTrue(collectionHttpResponseBean.getStatusCode() == 202);

    }


}