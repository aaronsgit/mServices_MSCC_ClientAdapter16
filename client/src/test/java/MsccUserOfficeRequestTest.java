import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import solutions.legatus.mservice.mscc.client.Bean.impl.MsccBeanAdapter;
import solutions.legatus.mservice.mscc.client.Request.impl.ApacheMsccRestClient;
import solutions.legatus.mservice.mscc.client.Request.impl.HttpResponseBean;
import solutions.legatus.mservice.mscc.client.Request.impl.MsccClientRequest;

/**
 * Created by ahou on 2/27/2016.
 */
public class MsccUserOfficeRequestTest {

    private final static String BASE_URI = "http://localhost:9100";

    private MsccClientRequest.UserOfficeService userOfficeService;

    private  MsccBeanAdapter.UserOffice   userOffice;

    @Before
    public void setup() {

        userOfficeService = MsccClientRequest.getInstance(  new ApacheMsccRestClient(), BASE_URI ).new UserOfficeService();

    }



    @Test
    public void UserOffice_findone_ShouldFail_ID_NULL() {


        MsccBeanAdapter.UserOffice entity = MsccBeanAdapter.UserOffice.getBuilder()
                .ID(  new MsccBeanAdapter.UserOffice.ID( "legat120", "scott", "user3" ) )
                .build();

        entity.setID(null);

        HttpResponseBean<MsccBeanAdapter.UserOffice> userHttpResponseBean = userOfficeService.findById( entity.getID() );


        if( userHttpResponseBean != null && userHttpResponseBean.getEntity() != null ) {
            System.out.println( userHttpResponseBean.getEntity() );
        } else {

            System.out.println( "I got null indeed." );
        }

        System.out.println( "=====================");

        Assert.assertTrue( userHttpResponseBean.getStatusCode() == 400 );

    }


//
    @Test
    public void User_findone_ShouldFail_ID_NOTFOUND() {


        MsccBeanAdapter.UserOffice entity = MsccBeanAdapter.UserOffice.getBuilder()
                .ID(  new  MsccBeanAdapter.UserOffice.ID( "legat120", "scott", "user12" ) )
                .build();


        HttpResponseBean<MsccBeanAdapter.UserOffice> userHttpResponseBean = userOfficeService.findById( entity.getID() );


        if( userHttpResponseBean != null  ) {
            if( userHttpResponseBean.getEntity() != null ) {
                System.out.println( userHttpResponseBean.getEntity() );

            }

            System.out.println( userHttpResponseBean.getStatusCode() );

        } else {

            System.out.println( "I got null indeed." );
        }

        System.out.println( "=====================");

        Assert.assertTrue( userHttpResponseBean.getStatusCode() == 404 );

    }



    @Test
    public void User_findone_ShouldFindOne() {


        MsccBeanAdapter.UserOffice entity = MsccBeanAdapter.UserOffice.getBuilder()
                .ID(  new MsccBeanAdapter.UserOffice.ID( "legat120", "scott", "user10" ) )
                .build();


        HttpResponseBean<MsccBeanAdapter.UserOffice> userHttpResponseBean = userOfficeService.findById( entity.getID() );

        System.out.println( "=====================");

        if( userHttpResponseBean.getEntity() != null ) {
            System.out.println( userHttpResponseBean.getEntity() );
        }

        System.out.println( userHttpResponseBean.getStatusCode() );


    }
//
//
//
//    @Test
//    public void User_add_ShouldFail_Parentkey_notfound() {
//
//        //parent key not found
//
//        MsccBean.UserOffice entity = MsccBeanFactory.getInstance().createUserOfficeBean().getBuilder()
//                .ID(  MsccBeanFactory.getInstance().createUserOfficeBeanID( "legat138", "scott4", "user3" ) )
//                .OfficeRole( "super")
//                .OrganizationFacilitator( "rocksoli")
//                .UserFacilitator( "hero")
//                .build();
//
//
//
//
//        HttpResponseBean<MsccBean.UserOffice> userHttpResponseBean = userOfficeService.add(  entity );
//
//
//        if( userHttpResponseBean != null  ) {
//
//            System.out.println( userHttpResponseBean.getStatusCode() );
//            if(  userHttpResponseBean.getEntity() != null ) {
//                System.out.println( "---" + userHttpResponseBean.getEntity() );
//            }
//        } else {
//
//            System.out.println( "xxxx");
//        }
//
//        System.out.println( "====" + userHttpResponseBean.getStatusCode() );
//
//
//        Assert.assertTrue( 400 == userHttpResponseBean.getStatusCode() );
//
//    }
////
//    @Test
//    public void User_add_ShouldFaild_DUPLICATE() {
//
//
//        //parent key not found
//        MsccBean.UserOffice entity = userOffice;
//
//        userOffice.getID().setUserID( "user7");
//
//        HttpResponseBean<MsccBean.UserOffice> userHttpResponseBean = userOfficeService.add(  entity );
//
//
//        if( userHttpResponseBean != null  ) {
//
//            System.out.println( userHttpResponseBean.getStatusCode() );
//            if(  userHttpResponseBean.getEntity() != null ) {
//                System.out.println( userHttpResponseBean.getEntity() );
//            }
//        } else {
//
//            System.out.println( "xxxx");
//        }
//
//
//        Assert.assertTrue( 409 == userHttpResponseBean.getStatusCode() );
//
//    }
//
//    @Test
//    public void User_add_ShouldFaild_IDNULL() {
//
//        //parent key not found
//        MsccBean.UserOffice entity = MsccBean.UserOffice.getBuilder()
//                .ID(  new MsccBean.UserOffice.ID( "legat120", "", ""  ) )
//
//                .build();
//
//
//        HttpResponseBean<MsccBean.UserOffice> userHttpResponseBean = userOfficeService.add(  entity );
//
//        if( userHttpResponseBean != null  ) {
//
//            System.out.println( userHttpResponseBean.getStatusCode() );
//            if(  userHttpResponseBean.getEntity() != null ) {
//                System.out.println( userHttpResponseBean.getEntity() );
//            }
//        } else {
//
//            System.out.println( "xxxx");
//        }
//
//
//        Assert.assertTrue( 400 == userHttpResponseBean.getStatusCode() );
//
//    }
//
////
//    @Test
//    public void userOffice_add_Should_ok() {
//
//        //parent key not found
//        MsccBean.UserOffice entity = userOffice;
//
//        userOffice.getID().setUserID( "user7");
//
//        HttpResponseBean<MsccBean.UserOffice> userHttpResponseBean = userOfficeService.add(  entity );
//
//
//        if( userHttpResponseBean != null  ) {
//
//            System.out.println( userHttpResponseBean.getStatusCode() );
//            if(  userHttpResponseBean.getEntity() != null ) {
//                System.out.println( userHttpResponseBean.getEntity() );
//            }
//        } else {
//
//            System.out.println( "xxxx");
//        }
//
//
//        Assert.assertTrue( 201 == userHttpResponseBean.getStatusCode() );
//
//    }
//
//
//    @Test
//    public void User_update_test() {
//
//
//        MsccBean.UserOffice updated = MsccBean.UserOffice.getBuilder()
//                .ID( new MsccBean.UserOffice.ID( "legat120", "scott", "user7"  ) )
//
//                .build();
//
//        HttpResponseBean<MsccBean.UserOffice> userHttpResponseBean = userOfficeService.update(  updated.getID(), userOffice   );
//
//        if( userHttpResponseBean != null  ) {
//            if( userHttpResponseBean.getEntity() != null )
//                System.out.println( userHttpResponseBean.getEntity() );
//
//            System.out.println( userHttpResponseBean.getStatusCode() );
//        } else {
//
//            System.out.println( "officeHttpResponseBean is null");
//        }
//
//        Assert.assertTrue( 202 == userHttpResponseBean.getStatusCode() );
//
//
//
//    }
//
//    @Test
//    public void User_deleteone_test() {
//
//        MsccBean.UserOffice entity = MsccBean.UserOffice.getBuilder()
//                .ID( new MsccBean.UserOffice.ID( "legat120", "scott", "user7"  ) )
//
//                .build();
//        HttpResponseBean<MsccBean.UserOffice> userHttpResponseBean = userOfficeService.deleteById( entity.getID() );
//
//        System.out.println( "=====================" + userHttpResponseBean );
//
//        if( userHttpResponseBean.getEntity() != null ) {
//            System.out.println( userHttpResponseBean.getEntity().getID() );
//        }
//
//        System.out.println( userHttpResponseBean.getStatusCode() );
//
//        Assert.assertTrue( 202 == userHttpResponseBean.getStatusCode() );
//
//    }


}
