import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import solutions.legatus.mservice.mscc.client.Bean.impl.MsccBeanAdapter;
import solutions.legatus.mservice.mscc.client.Bean.impl.MsccObjectSentToAction;
import solutions.legatus.mservice.mscc.client.Bean.impl.MsccObjectSentToPriority;
import solutions.legatus.mservice.mscc.client.Bean.impl.MsccObjectSentToRight;
import solutions.legatus.mservice.mscc.client.Request.impl.ApacheMsccRestClient;
import solutions.legatus.mservice.mscc.client.Request.impl.HttpResponseBean;
import solutions.legatus.mservice.mscc.client.Request.impl.MsccClientRequest;
import solutions.legatus.mservice.mscc.client.Utils.BeanUtils;

import java.sql.Timestamp;


/**
 * Created by ahou on 5/15/2016.
 */
public class MsccClientSentToRequestTest {
    private final static String BASE_URI = "http://192.168.27.19:8100";

    private MsccClientRequest.SentToService sentoService;

    @Before
    public void setup() {
        sentoService = MsccClientRequest.getInstance(  new ApacheMsccRestClient(), BASE_URI ).new SentToService();
    }



    @Test
    public void permission_add_test() {


        MsccBeanAdapter.SentTo.ID msccSentToID = new MsccBeanAdapter.SentTo.ID( "legat120", "scott214", "user114", "serious", 12, "legat120", "scott129", "ironman", null );

//        Timestamp ts = Timestamp.from( Instant.parse("2020-10-23T10:12:35Z") );
//
//        ZonedDateTime utc = ZonedDateTime.now( ZoneOffset.UTC );
//
//
//        MsccBeanAdapter.SentTo entity  = MsccBeanAdapter.SentTo.getBuilder()
//                .ID( msccSentToID )
//                .AccessRightSentTo( MsccObjectSentToRight.INFORMATION  )
//                .ActionRequestedSentTo( MsccObjectSentToAction.NONE )
//                .ActionTimeRequired( ts )
//                .ActionSenderPriority( MsccObjectSentToPriority.LEVEL3 )
//                .ActionStatusSentTo( "status")
//                .ActionDescSentTo( "desc")
//                .OrganizationSender( "legat120")
//                .OfficeSender( "scott214")
//                .UserSender( "user114")
//                .build();
//
//        HttpResponseBean<MsccBeanAdapter.SentTo> sentToHttpResponseBean = sentoService.addPermission(  entity );
//
//        System.out.println( sentToHttpResponseBean);
//        if( sentToHttpResponseBean != null && sentToHttpResponseBean.getEntity() != null ) {
//
//            System.out.println( sentToHttpResponseBean.getEntity().getID() );
//
//            System.out.println( sentToHttpResponseBean.getStatusCode() );
//        } else {
//
//            System.out.println( "xxxx");
//        }
//
//        Assert.assertTrue( sentToHttpResponseBean.getStatusCode() == 201 );

    }




    @Test
    public void permission_deleteone_test() {

        Timestamp t = Timestamp.valueOf( "2016-03-24 23:45:45.438" );


        MsccBeanAdapter.SentTo.ID msccSentToID = new MsccBeanAdapter.SentTo.ID( "legat120", "scott214", "user114", "serious", 11, "legat120", "scott129", "ironman", BeanUtils.GetUTCTimestamp( "2016-05-15T18:00:56.049Z" ));

        HttpResponseBean<MsccBeanAdapter.SentTo> sentToHttpResponseBean = sentoService.removePermission( msccSentToID );

        System.out.println( "=====================" + sentToHttpResponseBean );

        if( sentToHttpResponseBean.getStatusCode() == 202 ) {
            System.out.println( sentToHttpResponseBean.getEntity().getID() );
        }

        System.out.println( sentToHttpResponseBean.getStatusCode() );


        Assert.assertTrue( sentToHttpResponseBean.getStatusCode() == 202 );

    }




    @Test
    public void action_add_test() {


        MsccBeanAdapter.SentTo.ID msccSentToID = new MsccBeanAdapter.SentTo.ID( "legat120", "scott214", "user114", "serious", 12, "legat120", "scott129", "ironman", null );



//        Timestamp ts = Timestamp.from( Instant.parse("2020-10-23T10:12:35Z") );
//
//        ZonedDateTime utc = ZonedDateTime.now( ZoneOffset.UTC );
//
//

        Timestamp ts = Timestamp.valueOf( "2020-10-23 10:12:35" );

        MsccBeanAdapter.SentTo entity  = MsccBeanAdapter.SentTo.getBuilder()
                .ID( msccSentToID )
                .AccessRightSentTo( MsccObjectSentToRight.ZERO  )
                .ActionRequestedSentTo( MsccObjectSentToAction.REVIEW_AND_APPROVE )
                .ActionTimeRequired( ts )
                .ActionSenderPriority( MsccObjectSentToPriority.LEVEL3 )
                .ActionStatusSentTo( "status")
                .ActionDescSentTo( "desc")
                .OrganizationSender( "legat120")
                .OfficeSender( "scott214")
                .UserSender( "user114")
                .build();

        HttpResponseBean<MsccBeanAdapter.SentTo> sentToHttpResponseBean = sentoService.addPermission(  entity );

        System.out.println( sentToHttpResponseBean);
        if( sentToHttpResponseBean != null && sentToHttpResponseBean.getEntity() != null ) {

            System.out.println( sentToHttpResponseBean.getEntity().getID() );

            System.out.println( sentToHttpResponseBean.getStatusCode() );
        } else {

            System.out.println( "xxxx");
        }

        Assert.assertTrue( sentToHttpResponseBean.getStatusCode() == 201 );

    }




    @Test
    public void action_deleteone_test() {

        Timestamp t = Timestamp.valueOf( "2016-03-24 23:45:45.438" );


        MsccBeanAdapter.SentTo.ID msccSentToID = new MsccBeanAdapter.SentTo.ID( "legat120", "scott214", "user114", "serious", 11, "legat120", "scott129", "ironman", BeanUtils.GetUTCTimestamp( "2016-05-15T18:00:56.049Z" ));

        HttpResponseBean<MsccBeanAdapter.SentTo> sentToHttpResponseBean = sentoService.removePermission( msccSentToID );

        System.out.println( "=====================" + sentToHttpResponseBean );

        if( sentToHttpResponseBean.getStatusCode() == 202 ) {
            System.out.println( sentToHttpResponseBean.getEntity().getID() );
        }

        System.out.println( sentToHttpResponseBean.getStatusCode() );


        Assert.assertTrue( sentToHttpResponseBean.getStatusCode() == 202 );

    }

}
