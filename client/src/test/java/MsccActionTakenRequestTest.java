import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import solutions.legatus.mservice.mscc.client.Bean.impl.MsccBeanAdapter;
import solutions.legatus.mservice.mscc.client.Bean.impl.MsccObjectSentToAction;
import solutions.legatus.mservice.mscc.client.Bean.impl.MsccObjectSentToRight;
import solutions.legatus.mservice.mscc.client.Request.impl.ApacheMsccRestClient;
import solutions.legatus.mservice.mscc.client.Request.impl.HttpResponseBean;
import solutions.legatus.mservice.mscc.client.Request.impl.MsccClientRequest;
import solutions.legatus.mservice.mscc.client.Utils.BeanUtils;

import java.sql.Timestamp;

/**
 * Created by ahou on 5/15/2016.
 */
public class MsccActionTakenRequestTest {

    private final static String BASE_URI = "http://localhost:9100";

    private MsccClientRequest.ActionService actionService;

    @Before
    public void setup() {
        actionService = MsccClientRequest.getInstance( new ApacheMsccRestClient(), BASE_URI ).new ActionService();
    }


    @Test
    public void Meta_add_test() {

//        Timestamp ts = Timestamp.from( Instant.parse("2016-05-06T06:43:57.524Z") );
//
//        ZonedDateTime utc = ZonedDateTime.now( ZoneOffset.UTC );
//
//        MsccBeanAdapter.ActionTaken.ID actionTakenID = new MsccBeanAdapter.ActionTaken.ID( "legat120", "scott214", "user114", "serious", 12, "legat120", "scott129", "ironman", BeanUtils.GetUTCTimestamp( "2016-05-15T18:22:03.224Z" ), null );
//
//        MsccBeanAdapter.ActionTaken entity  = MsccBeanAdapter.ActionTaken.getBuilder()
//                .ID( actionTakenID )
//
//                //.AccessRightSentTo(  MsccObjectSentToRight.INFORMATION )
//                .AccessRightSentTo( MsccObjectSentToRight.APPROVE  )
//                .ActionRequestedSentTo( MsccObjectSentToAction.NONE )
//                .ActionDescSentTo( "desc")
//                .ActionOrganizationID( "legat120")
//                .ActionOfficeID( "scott124")
//                .ActionUserID( "superman")
//                .ActionRefNbrID( "cloud")
//                .SuggestedNextAction( MsccObjectSentToAction.REVIEW_AND_APPROVE )
//                .build();
//
//
//        HttpResponseBean<MsccBeanAdapter.ActionTaken> actionHttpResponseBean = actionService.add( entity );
//
//
//        if( actionHttpResponseBean != null && actionHttpResponseBean.getEntity() != null) {
//
//            System.out.println( "The added entity is:" + actionHttpResponseBean.getEntity() );
//            //System.out.println(collectionHttpResponseBean.getEntity().getID());
//
//            System.out.println(actionHttpResponseBean.getStatusCode());
//        } else {
//
//            System.out.println("failed");
//        }
//
//        Assert.assertTrue(actionHttpResponseBean.getStatusCode() == 201);

    }





}
