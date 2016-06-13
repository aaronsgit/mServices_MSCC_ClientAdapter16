/**
 * Created by ahou on 2/26/2016.
 */
public class MsccUserRequestTest {

//    private final static String BASE_URI = "http://localhost:9100";
//
//    private MsccClientRequest.UserService userService;
//
//    private  MsccBean.User   user;
//
//    @Before
//    public void setup() {
//
//        userService       = MsccClientRequest.getInstance(  new AsyncMsccRestClient(), BASE_URI ).new UserService();
//
//        user = MsccBeanFactory.getInstance().createUserBean().getBuilder()
//                .ID(  new MsccBean.User.ID( "legat120", "user5"  ) )
//                .Name( "superman")
//                .PersonalTitle( "Mr.")
//                .TeleDaytime( "4151234567")
//                .TeleOffhours( "4801234567")
//                .Timezone( "us-az")
//                .Title( "super boss")
//                .Credential( "super")
//                .Email( "super@super.com")
//                .build();
//
//
//    }
//
//
//
//    @Test
//    public void User_findone_ShouldFail_ID_NULL() {
//
//
//        MsccBean.User entity = MsccBean.User.getBuilder()
//                .ID(  new MsccBean.User.ID( "legat99", "" ) )
//                .build();
//
//
//        HttpResponseBean<MsccBean.User> userHttpResponseBean = userService.findById( entity.getID() );
//
//
//        if( userHttpResponseBean != null && userHttpResponseBean.getEntity() != null ) {
//            System.out.println( userHttpResponseBean.getEntity().getID() );
//            System.out.println( userHttpResponseBean.getEntity() );
//        } else {
//
//            System.out.println( "I got null indeed." );
//        }
//
//        System.out.println( "=====================");
//
//        Assert.assertTrue( userHttpResponseBean.getStatusCode() == 400 );
//
//    }
//
//
//
//    @Test
//    public void User_findone_ShouldFail_ID_NOTFOUND() {
//
//
//        MsccBean.User entity = MsccBean.User.getBuilder()
//                .ID(  new MsccBean.User.ID( "legat99", "12345" ) )
//                .build();
//
//
//        HttpResponseBean<MsccBean.User> userHttpResponseBean = userService.findById( entity.getID() );
//
//
//        if( userHttpResponseBean != null  ) {
//            if( userHttpResponseBean.getEntity() != null ) {
//                System.out.println( userHttpResponseBean.getEntity() );
//
//                if( userHttpResponseBean.getEntity().getID() != null )  {
//                    System.out.println( userHttpResponseBean.getEntity().getID() );
//                }
//            }
//
//            System.out.println( userHttpResponseBean.getStatusCode() );
//
//        } else {
//
//            System.out.println( "I got null indeed." );
//        }
//
//        System.out.println( "=====================");
//
//        Assert.assertTrue( userHttpResponseBean.getStatusCode() == 404 );
//
//    }
//
//
//
//    @Test
//    public void User_findone_ShouldFindOne() {
//
//
//        MsccBean.User entity = MsccBean.User.getBuilder()
//                .ID(  new MsccBean.User.ID( "legat120", "user5" ) )
//                .build();
//
//
//        HttpResponseBean<MsccBean.User> userHttpResponseBean = userService.findById( entity.getID() );
//
//        System.out.println( "=====================");
//
//        if( userHttpResponseBean.getEntity() != null ) {
//            System.out.println( userHttpResponseBean.getEntity().getID() );
//            System.out.println( userHttpResponseBean.getEntity() );
//        }
//
//        System.out.println( userHttpResponseBean.getStatusCode() );
//
//
//    }
//
//
//
//    @Test
//    public void User_add_ShouldFail_Parentkey_notfound() {
//
//        //parent key not found
//        MsccBean.User entity = MsccBean.User.getBuilder()
//                .ID(  new MsccBean.User.ID( "leg72", "user5"  ) )
//                .Name( "superman")
//                .PersonalTitle( "Mr.")
//                .TeleDaytime( "4151234567")
//                .TeleOffhours( "4801234567")
//                .Timezone( "us-az")
//                .Title( "super boss")
//                .Credential( "super")
//                .Email( "super@super.com")
//                .build();
//
//
//
//        HttpResponseBean<MsccBean.User> userHttpResponseBean = userService.add(  entity );
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
//        System.out.println( "====" + userHttpResponseBean.getStatusCode() );
//
//
//        Assert.assertTrue( 400 == userHttpResponseBean.getStatusCode() );
//
//    }
//
//    @Test
//    public void User_add_ShouldFaild_DUPLICATE() {
//
//        //parent key not found
//        MsccBean.User entity = MsccBean.User.getBuilder()
//                .ID(  new MsccBean.User.ID( "legat120", "user6"  ) )
//
//                .build();
//
//
//        HttpResponseBean<MsccBean.User> userHttpResponseBean = userService.add(  entity );
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
//    @Test
//    public void User_add_ShouldFaild_IDNULL() {
//
//        //parent key not found
//        MsccBean.User entity = MsccBean.User.getBuilder()
//                .ID(  new MsccBean.User.ID( "legat120", ""  ) )
//
//                .build();
//
//
//        HttpResponseBean<MsccBean.User> userHttpResponseBean = userService.add(  entity );
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
//
//    @Test
//    public void user_add_Should_ok() {
//
//        //parent key not found
//        MsccBean.User entity = user;
//
//        user.getID().setUserID( "user7");
//
//        HttpResponseBean<MsccBean.User> userHttpResponseBean = userService.add(  entity );
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
//    @Test
//    public void User_update_test() {
//
//
//        MsccBean.User updated = MsccBean.User.getBuilder()
//                .ID( new MsccBean.User.ID( "legat120", "user5"  ) )
//
//                .build();
//
//        HttpResponseBean<MsccBean.User> userHttpResponseBean = userService.update(  updated.getID(), user   );
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
//        MsccBean.User entity = MsccBean.User.getBuilder()
//                .ID(  new MsccBean.User.ID( "legat120", "user5"  ) )
//
//                .build();
//        HttpResponseBean<MsccBean.User> userHttpResponseBean = userService.deleteById( entity.getID() );
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
//

}
