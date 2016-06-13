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
 * Created by ahou on 2/12/2016.
 */


public class MsccClientFolderRequetTest {
    private final static String BASE_URI = "http://localhost:9100";

    private MsccClientRequest.FolderService folderService;
    private MsccClientRequest.CollectionService collectionService;

    @Before
    public void setup() {
        folderService = MsccClientRequest.getInstance(  new ApacheMsccRestClient(), BASE_URI ).new FolderService();
        collectionService = MsccClientRequest.getInstance(  new ApacheMsccRestClient(), BASE_URI ).new CollectionService();
    }



    @Test
    public void Folder_add_test() {

        MsccBeanAdapter.Collection entity = MsccBeanAdapter.Collection.getBuilder()

                .ID( new MsccBeanAdapter.Collection.ID( "legat110", "scott111", "", "radio" ) )
                .Account( "123456789")
                .DialogShare(MsccCollectionDialogShare.ORGOWNER )
                .DialogType(MsccCollectionDialogType.ALLTYPE )
                .Folder( "makeup" )
                .OrganizationCreator( "legat188")
                .build();


        HttpResponseBean<MsccBeanAdapter.Collection> collectionHttpResponseBean = folderService.add(  entity );

        System.out.println( collectionHttpResponseBean);
        if( collectionHttpResponseBean != null && collectionHttpResponseBean.getEntity() != null ) {

            System.out.println( collectionHttpResponseBean.getEntity().getID() );

            System.out.println( collectionHttpResponseBean.getStatusCode() );
        } else {

            System.out.println( "xxxx");
        }

        Assert.assertTrue( collectionHttpResponseBean.getStatusCode() == 201 );

    }


    @Test
    public void Folder_findone_test() {

        MsccBeanAdapter.Folder entity = MsccBeanAdapter.Folder.getBuilder()
                .ID( new MsccBeanAdapter.Folder.ID( "legat120", "scott124", "batman", "park" ) )
                .build();

        HttpResponseBean<List<MsccBeanAdapter.Collection.ID>> folderHttpResponseBean = folderService.findCollectionById( entity.getID() );

        System.out.println( folderHttpResponseBean.getStatusCode() );

        if( folderHttpResponseBean.getStatusCode() == 200 ) {
            System.out.println( "The result organization is: " + folderHttpResponseBean.getEntity()  );

            //System.out.println( "organization govlevl is : " + folderHttpResponseBean.getEntity().getGovLevel() );
        }


    }




    @Test
    public void Folder_deleteone_test() {

        MsccBeanAdapter.Folder entity = MsccBeanAdapter.Folder.getBuilder()
                .ID( new MsccBeanAdapter.Folder.ID( "legat110", "scott111", "", "makeup" ) )
                .build();

        HttpResponseBean<MsccBeanAdapter.Collection> collectionHttpResponseBean = folderService.deleteById( entity.getID() );

        System.out.println( "=====================" + collectionHttpResponseBean );

        if( collectionHttpResponseBean.getEntity() != null ) {
            System.out.println( collectionHttpResponseBean.getEntity().getID() );
        }

        System.out.println( collectionHttpResponseBean.getStatusCode() );


        Assert.assertTrue( collectionHttpResponseBean.getStatusCode() == 202 );

    }





}
