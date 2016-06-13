import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import solutions.legatus.mservice.mscc.client.Bean.impl.MsccBeanAdapter;
import solutions.legatus.mservice.mscc.client.Request.impl.ApacheMsccRestClient;
import solutions.legatus.mservice.mscc.client.Request.impl.HttpResponseBean;
import solutions.legatus.mservice.mscc.client.Request.impl.MsccClientRequest;


/**
 * Created by ahou on 2/12/2016.
 */


public class MsccClientFolderContentRequetTest {
    private final static String BASE_URI = "http://localhost:9100";

    private MsccClientRequest.FolderContentService folderContentService;
    private MsccClientRequest.CollectionService collectionService;

    @Before
    public void setup() {
        folderContentService = MsccClientRequest.getInstance(  new ApacheMsccRestClient(), BASE_URI ).new FolderContentService();
        collectionService = MsccClientRequest.getInstance(  new ApacheMsccRestClient(), BASE_URI ).new CollectionService();
    }



    @Test
    public void FolderContents_add_test() {

        MsccBeanAdapter.FolderContents.ID contentsID = new  MsccBeanAdapter.FolderContents.ID( "legat120", "sedona", "snow", "street", "legat120", "scott214", "user114", "serious", 11  );

        MsccBeanAdapter.FolderContents entity = MsccBeanAdapter.FolderContents.getBuilder().ID( contentsID ).build();

        HttpResponseBean<MsccBeanAdapter.FolderContents> folderContentsHttpResponseBean = folderContentService.add(  entity );


        System.out.println( folderContentsHttpResponseBean.getStatusCode() );

        if( folderContentsHttpResponseBean.getStatusCode() == 201 )  {

            System.out.println( folderContentsHttpResponseBean.getEntity().getID() );

        } else {

            System.out.println( "xxxx");
        }

        Assert.assertTrue( folderContentsHttpResponseBean.getStatusCode() == 201 );

    }

//
//    @Test
//    public void Folder_findone_test() {
//
//        MsccBeanAdapter.Folder entity = MsccBeanAdapter.Folder.getBuilder()
//                .ID( new MsccBeanAdapter.Folder.ID( "legat120", "scott124", "batman", "park" ) )
//                .build();
//
//        HttpResponseBean<MsccBeanAdapter.Collection.ID> folderHttpResponseBean = folderService.findCollectionById( entity.getID() );
//
//        System.out.println( folderHttpResponseBean.getStatusCode() );
//
//        if( folderHttpResponseBean.getStatusCode() == 200 ) {
//            System.out.println( "The result organization is: " + folderHttpResponseBean.getEntity()  );
//
//            //System.out.println( "organization govlevl is : " + folderHttpResponseBean.getEntity().getGovLevel() );
//        }
//
//
//    }
//
//
//

    @Test
    public void FolderContents_deleteone_test() {

        MsccBeanAdapter.FolderContents.ID contentsID = new  MsccBeanAdapter.FolderContents.ID( "legat120", "sedona", "snow", "street", "legat120", "scott214", "user114", "serious", 11  );

        HttpResponseBean<MsccBeanAdapter.FolderContents> folderContentsHttpResponseBean = folderContentService.deleteById( contentsID );

        System.out.println( "=====================" + folderContentsHttpResponseBean );

        if( folderContentsHttpResponseBean.getEntity() != null ) {
            System.out.println( folderContentsHttpResponseBean.getEntity()  );
        }

        System.out.println( folderContentsHttpResponseBean.getStatusCode() );


        Assert.assertTrue( folderContentsHttpResponseBean.getStatusCode() == 202 );

    }





}
