import org.junit.Before;
import org.junit.Test;
import solutions.legatus.mservice.mscc.client.Bean.impl.MsccBeanAdapter;
import solutions.legatus.mservice.mscc.client.Request.impl.ApacheMsccRestClient;
import solutions.legatus.mservice.mscc.client.Request.impl.HttpResponseBean;
import solutions.legatus.mservice.mscc.client.Request.impl.MsccClientRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ahou on 5/15/2016.
 */
public class MsccEmailRequestTest {

    private final static String BASE_URI = "http://localhost:9100";

    private MsccClientRequest.EmailService emailService;

    @Before
    public void setup() {
        emailService = MsccClientRequest.getInstance( new ApacheMsccRestClient(), BASE_URI ).new EmailService();
    }


    @Test
    public void EmailObjectShouldEmailOk() throws Exception {


        List<MsccBeanAdapter.CollectionObject.ID> ids = new ArrayList<MsccBeanAdapter.CollectionObject.ID>();

        MsccBeanAdapter.CollectionObject.ID id1 = new MsccBeanAdapter.CollectionObject.ID( "legat120", "scott129", "ironman", "sky", 1 );
        MsccBeanAdapter.CollectionObject.ID id2 = new MsccBeanAdapter.CollectionObject.ID( "legat120", "scott214", "user114", "serious", 3 );
        MsccBeanAdapter.CollectionObject.ID id3 = new MsccBeanAdapter.CollectionObject.ID( "legat120", "scott214", "user114", "serious", 15 );

        ids.add( id1 );
        ids.add( id2 );
        ids.add( id3 );


        MsccBeanAdapter.EmailFact emailFact = new MsccBeanAdapter.EmailFact();
        emailFact.setProcess( "EMAIL," );

        emailFact.setOrganizationSender( "legat120");
        emailFact.setOfficeSender( "scott128");
        emailFact.setUserSender( "aaron");
        emailFact.setEmailSender( "ahou@legatus.solutions"  );

        emailFact.setOrganizationReceiver( "legat999");
        emailFact.setOfficeReceiver( "scott999");
        emailFact.setUserReceiver( "Brad");
        emailFact.setEmailReceiver( "ahou@legatus.solutions"  );

        emailFact.setObjectIDSet( ids );

        List<String> acts = new ArrayList<String>();

        acts.add( "INFORMATION");
        acts.add( "SUBMIT");
        acts.add( "APPROVE");

        emailFact.setSubject( "This is test subject");

        emailFact.setActionRequested( acts );




        HttpResponseBean<MsccBeanAdapter.ActionTaken> emailObjectsHttpResponseBean = emailService.EmailObjects( emailFact );

        System.out.println( emailObjectsHttpResponseBean );
        System.out.println( emailObjectsHttpResponseBean.getStatusCode() );
        System.out.println( emailObjectsHttpResponseBean.getEntity() );

        //Assert.assertTrue(emailObjectsHttpResponseBean.getStatusCode() == 201);


    }


}
