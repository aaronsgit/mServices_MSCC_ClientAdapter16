import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import solutions.legatus.mservice.mscc.client.Bean.impl.MsccBeanAdapter;
import solutions.legatus.mservice.mscc.client.Bean.impl.MsccOrganizationCountry;
import solutions.legatus.mservice.mscc.client.Bean.impl.MsccOrganizationLevel;
import solutions.legatus.mservice.mscc.client.Bean.impl.MsccOrganizationType;
import solutions.legatus.mservice.mscc.client.Request.impl.ApacheMsccRestClient;
import solutions.legatus.mservice.mscc.client.Request.impl.HttpResponseBean;
import solutions.legatus.mservice.mscc.client.Request.impl.MsccClientRequest;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * Created by ahou on 2/12/2016.
 */


public class MsccClientOrganizationRequetTest {
    private final static String BASE_URI = "http://localhost:9100";

    private MsccClientRequest.OrganizationService organizationService;
    private MsccClientRequest.OfficeService officeService;

    @Before
    public void setup() {

        organizationService = MsccClientRequest.getInstance(  new ApacheMsccRestClient(), BASE_URI ).new OrganizationService();
    }


    @Test
    public void Organization_listall_test() throws ExecutionException, InterruptedException, IOException {



        HttpResponseBean<List<MsccBeanAdapter.Organization>> organizationHttpResponseBean = organizationService.listAll();

        System.out.println( "=====================");
//        System.out.println( organizationHttpResponseBean.getEntity().get(1).getID() );
//        System.out.println( organizationHttpResponseBean.getEntity().size() );
//        System.out.println( organizationHttpResponseBean.getEntity() );

        System.out.println( organizationHttpResponseBean.getStatusCode() );


    }

    @Test
    public void Organization_findone_test() {

        MsccClientRequest.OrganizationService organizationService1;

        MsccBeanAdapter.Organization entity = MsccBeanAdapter.Organization.getBuilder()
                .ID( new MsccBeanAdapter.Organization.ID( "legat120" ))
//                .Country( "United States")
//                .GovLevel( "private")
//                .Name( "Legatus Corp.")
//                .Type( "service")
                .build();
//        System.out.println( "-----" + organizationService );

        HttpResponseBean<MsccBeanAdapter.Organization> organizationHttpResponseBean = organizationService.findById( entity.getID() );

        System.out.println( organizationHttpResponseBean.getStatusCode() );

        if( organizationHttpResponseBean.getStatusCode() == 200 ) {
            System.out.println( "The result organization is: " + organizationHttpResponseBean.getEntity().toString() );

            System.out.println( "organization govlevl is : " + organizationHttpResponseBean.getEntity().getGovLevel() );
        }


    }



    @Test
    public void Organization_add_test() {

        MsccBeanAdapter.Organization entity = MsccBeanAdapter.Organization.getBuilder()
                .ID( new MsccBeanAdapter.Organization.ID( "legat588" ))
                //.Country(MsccOrganizationCountry.US)
                .Country( MsccOrganizationCountry.US )
                .GovLevel( MsccOrganizationLevel.JURISDICTION )
                .Name( "Legatus Corp 32" )
//                .DeactivatedTs(Timestamp.from(Instant.now()))
                //               .CreatedTs(Timestamp.from(Instant.now()))
                .Type( MsccOrganizationType.REGISTRANT )
                .build();


        HttpResponseBean<MsccBeanAdapter.Organization> organizationHttpResponseBean = organizationService.add(  entity );

        System.out.println( organizationHttpResponseBean);
        if( organizationHttpResponseBean != null && organizationHttpResponseBean.getEntity() != null ) {

            System.out.println( organizationHttpResponseBean.getEntity().getID() );

            System.out.println( organizationHttpResponseBean.getStatusCode() );
        } else {

            System.out.println( "xxxx");
        }

        Assert.assertTrue( organizationHttpResponseBean.getStatusCode() == 201 );

    }


    @Test
    public void Organization_update_test() {

        MsccBeanAdapter.Organization entity = MsccBeanAdapter.Organization.getBuilder()
                .ID( new MsccBeanAdapter.Organization.ID( "legat588" ))
                //.Country(MsccOrganizationCountry.US)
                .Country( MsccOrganizationCountry.US )
                .GovLevel( MsccOrganizationLevel.JURISDICTION )
                .Name( "Legatus Corp 32" )
//                .DeactivatedTs(Timestamp.from(Instant.now()))
                //               .CreatedTs(Timestamp.from(Instant.now()))
                .Type( MsccOrganizationType.REGISTRANT )
                .build();


        MsccBeanAdapter.Organization updated = MsccBeanAdapter.Organization.getBuilder()
                .ID( new MsccBeanAdapter.Organization.ID( "legat588" ))
                //.Country(MsccOrganizationCountry.US)
                .Country( MsccOrganizationCountry.US )
                .GovLevel( MsccOrganizationLevel.JURISDICTION )
                .Name( "Legatus Corp 32" )
//                .DeactivatedTs(Timestamp.from(Instant.now()))
                //               .CreatedTs(Timestamp.from(Instant.now()))
                .Type( MsccOrganizationType.REGISTRANT )
                .build();


        updated.setCountry(MsccOrganizationCountry.MEXICO);

        HttpResponseBean<MsccBeanAdapter.Organization> organizationHttpResponseBean = organizationService.update(  entity.getID(), updated  );

        if( organizationHttpResponseBean != null && organizationHttpResponseBean.getEntity() != null ) {
            System.out.println( organizationHttpResponseBean );
            System.out.println( organizationHttpResponseBean.getStatusCode() );
        } else {

            System.out.println( "yyyy");
        }

        System.out.println( organizationHttpResponseBean.getStatusCode() );

        Assert.assertTrue( organizationHttpResponseBean.getStatusCode() == 202 );
    }



    @Test
    public void Organization_deleteone_test() {

        MsccBeanAdapter.Organization entity = MsccBeanAdapter.Organization.getBuilder()
                .ID( new MsccBeanAdapter.Organization.ID( "legat588" ))
                //.Country(MsccOrganizationCountry.US)
                .Country( MsccOrganizationCountry.US )
                .GovLevel( MsccOrganizationLevel.JURISDICTION )
                .Name( "Legatus Corp 32" )
//                .DeactivatedTs(Timestamp.from(Instant.now()))
                //               .CreatedTs(Timestamp.from(Instant.now()))
                .Type( MsccOrganizationType.REGISTRANT )
                .build();

        HttpResponseBean<MsccBeanAdapter.Organization> organizationHttpResponseBean = organizationService.deleteById( entity.getID() );

        System.out.println( "=====================" + organizationHttpResponseBean );

        if( organizationHttpResponseBean.getEntity() != null ) {
            System.out.println( organizationHttpResponseBean.getEntity().getID() );
        }

        System.out.println( organizationHttpResponseBean.getStatusCode() );


        Assert.assertTrue( organizationHttpResponseBean.getStatusCode() == 202 );

    }




}
