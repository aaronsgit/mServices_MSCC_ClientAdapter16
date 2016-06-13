import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import solutions.legatus.mservice.mscc.client.Bean.impl.MsccBeanAdapter;
import solutions.legatus.mservice.mscc.client.Request.impl.ApacheMsccRestClient;
import solutions.legatus.mservice.mscc.client.Request.impl.HttpResponseBean;
import solutions.legatus.mservice.mscc.client.Request.impl.MsccClientRequest;

import java.sql.Timestamp;

/**
 * Created by ahou on 2/21/2016.
 */
public class MsccOfficeRequestTest {

    private final static String BASE_URI = "http://localhost:9100";

    private MsccClientRequest.OfficeService officeService;

    @Before
    public void setup() {

        officeService       = MsccClientRequest.getInstance(  new ApacheMsccRestClient(), BASE_URI ).new OfficeService();

    }



    @Test
    public void Office_findone_ShouldFail_ID_NULL() {


        MsccBeanAdapter.Office entity = MsccBeanAdapter.Office.getBuilder()
                .ID(  new MsccBeanAdapter.Office.ID( "legat99", "" ) )
                .build();


        HttpResponseBean<MsccBeanAdapter.Office> officeHttpResponseBean = officeService.findById( entity.getID() );


        if( officeHttpResponseBean != null && officeHttpResponseBean.getEntity() != null ) {
            System.out.println( officeHttpResponseBean.getEntity().getID() );
            System.out.println( officeHttpResponseBean.getEntity() );
        } else {

            System.out.println( "I got null indeed." );
        }

        System.out.println( "=====================");

        Assert.assertTrue( officeHttpResponseBean.getStatusCode() == 400 );

    }



    @Test
    public void Office_findone_ShouldFail_ID_NOTFOUND() {


        MsccBeanAdapter.Office entity = MsccBeanAdapter.Office.getBuilder()
                .ID(  new MsccBeanAdapter.Office.ID( "legat99", "12345" ) )
                .build();


        HttpResponseBean<MsccBeanAdapter.Office> officeHttpResponseBean = officeService.findById( entity.getID() );


        if( officeHttpResponseBean != null  ) {
            if( officeHttpResponseBean.getEntity() != null ) {
                System.out.println( officeHttpResponseBean.getEntity() );

                if( officeHttpResponseBean.getEntity().getID() != null )  {
                    System.out.println( officeHttpResponseBean.getEntity().getID() );
                }
            }

            System.out.println( officeHttpResponseBean.getStatusCode() );

        } else {

            System.out.println( "I got null indeed." );
        }

        System.out.println( "=====================");

        Assert.assertTrue( officeHttpResponseBean.getStatusCode() == 404 );

    }



    @Test
    public void Office_findone_ShouldFindOne() {


        MsccBeanAdapter.Office entity = MsccBeanAdapter.Office.getBuilder()
                .ID(  new MsccBeanAdapter.Office.ID( "legat99", "scott991" ) )
                .build();


        HttpResponseBean<MsccBeanAdapter.Office> officeHttpResponseBean = officeService.findById( entity.getID() );

        System.out.println( "=====================");

        if( officeHttpResponseBean.getEntity() != null ) {
            System.out.println( officeHttpResponseBean.getEntity().getID() );
            System.out.println( officeHttpResponseBean.getEntity() );
        }

        System.out.println( officeHttpResponseBean.getStatusCode() );


    }

    @Test
    public void  MsccOffice_add_ShouldFail_DUPLICATE() {

        //parent key not found
        MsccBeanAdapter.Office entity = MsccBeanAdapter.Office.getBuilder()
                .ID(  new MsccBeanAdapter.Office.ID("legat120", "scott") )
                .Address1( "7580 E gray st 123 ")
                .Address2("#102123")
                .City( "Scottsdale123")
                .Jurisdiction( "ADOT123")
                .MainTele( "480-1234567123")
                .Desc("headquater123")
                .Postal("85260123")
                .Website("www.xxxx123.com")
                .build();


        HttpResponseBean<MsccBeanAdapter.Office> officeHttpResponseBean = officeService.add(  entity );


        if( officeHttpResponseBean != null  ) {

            System.out.println( officeHttpResponseBean.getStatusCode() );
            if(  officeHttpResponseBean.getEntity() != null ) {
                System.out.println( officeHttpResponseBean.getEntity() );
            }
        } else {

            System.out.println( "xxxx");
        }
        System.out.println( officeHttpResponseBean.getStatusCode() );

        Assert.assertTrue( 409 == officeHttpResponseBean.getStatusCode() );

    }



    @Test
    public void  MsccOffice_add_ShouldFail_DUPLICATE1() {

        //parent key not found
        MsccBeanAdapter.Office entity = MsccBeanAdapter.Office.getBuilder()
                .ID(  new MsccBeanAdapter.Office.ID("legat99", "scott992") )
                .Address1( "7580 E gray st 123 ")
                .Address2("#102123")
                .City( "Scottsdale123")
                .Jurisdiction( "ADOT123")
                .MainTele( "480-1234567123")
                .Desc("headquater123")
                .Postal("85260123")
                .Website("www.xxxx123.com")
                .build();


        HttpResponseBean<MsccBeanAdapter.Office> officeHttpResponseBean = officeService.add(  entity );


        if( officeHttpResponseBean != null  ) {

            System.out.println( officeHttpResponseBean.getStatusCode() );
            if(  officeHttpResponseBean.getEntity() != null ) {
                System.out.println( officeHttpResponseBean.getEntity() );
            }
        } else {

            System.out.println( "xxxx");
        }
        System.out.println( officeHttpResponseBean.getStatusCode() );

        Assert.assertTrue( 409 == officeHttpResponseBean.getStatusCode() );

    }


    @Test
    public void  MsccOffice_add_ShouldFail_Parentkey_notfound() {

        //parent key not found
        MsccBeanAdapter.Office entity = MsccBeanAdapter.Office.getBuilder()
                .ID(  new MsccBeanAdapter.Office.ID("leg72", "scott") )
                .Address1( "7580 E gray st 123 ")
                .Address2("#102123")
                .City( "Scottsdale123")
                .Jurisdiction( "ADOT123")
                .MainTele( "480-1234567123")
                .Desc("headquater123")
                .Postal("85260123")
                .Website("www.xxxx123.com")
                .build();


        HttpResponseBean<MsccBeanAdapter.Office> officeHttpResponseBean = officeService.add(  entity );


        if( officeHttpResponseBean != null  ) {

            System.out.println( officeHttpResponseBean.getStatusCode() );
            if(  officeHttpResponseBean.getEntity() != null ) {
                System.out.println( officeHttpResponseBean.getEntity() );
            }
        } else {

            System.out.println( "xxxx");
        }
        System.out.println( officeHttpResponseBean.getStatusCode() );

        Assert.assertTrue( 400 == officeHttpResponseBean.getStatusCode() );

    }

    @Test
    public void Organization_add_ShouldFaild_IDNULL() {

        //parent key not found
        MsccBeanAdapter.Office entity = MsccBeanAdapter.Office.getBuilder()
                .ID(  new MsccBeanAdapter.Office.ID("legat99", "") )
                .Address1( "7580 E gray st 123 ")
                .Address2("#102123")
                .City( "Scottsdale123")
                .Jurisdiction( "ADOT123")
                .MainTele( "480-1234567123")
                .Desc("headquater123")
                .Postal("85260123")
                .Website("www.xxxx123.com")
                .build();


        HttpResponseBean<MsccBeanAdapter.Office> officeHttpResponseBean = officeService.add(  entity );


        if( officeHttpResponseBean != null  ) {

            System.out.println( officeHttpResponseBean.getStatusCode() );
            if(  officeHttpResponseBean.getEntity() != null ) {
                System.out.println( officeHttpResponseBean.getEntity() );
            }
        } else {

            System.out.println( "xxxx");
        }


        Assert.assertTrue( 400 == officeHttpResponseBean.getStatusCode() );

    }


    @Test
    public void Office_add_Should_ok() {

        //parent key not found
        MsccBeanAdapter.Office entity = MsccBeanAdapter.Office.getBuilder()
                .ID(  new MsccBeanAdapter.Office.ID("legat99", "scott99") )
                .Address1( "7580 E gray st 123 ")
                .Address2("#102123")
                .City( "Scottsdale123")
                .Jurisdiction( "ADOT123")
                .MainTele( "480-1234567123")
                .Desc("headquater123")
                .Postal("85260123")
                .Website("www.xxxx123.com")
                .build();


        HttpResponseBean<MsccBeanAdapter.Office> officeHttpResponseBean = officeService.add(  entity );


        if( officeHttpResponseBean != null  ) {

            System.out.println( officeHttpResponseBean.getStatusCode() );
            if(  officeHttpResponseBean.getEntity() != null ) {
                System.out.println( officeHttpResponseBean.getEntity() );
            }
        } else {

            System.out.println( "xxxx");
        }


        Assert.assertTrue( 201 == officeHttpResponseBean.getStatusCode() );

    }

    @Test
    public void Office_update_test() {

        MsccBeanAdapter.Office entity = MsccBeanAdapter.Office.getBuilder()
                .ID(  new MsccBeanAdapter.Office.ID("legat99", "scott992") )
                .Address1( "7580 E gray st 123 ")
                .Address2("#102123")
                .City( "Scottsdale123")
                .Jurisdiction( "ADOT123")
                .MainTele( "480-1234567123")
                .Desc("headquater123")
                .Postal("85260123")
                .Website("www.xxxx123.com")
                .build();


        MsccBeanAdapter.Office updated = MsccBeanAdapter.Office.getBuilder()
                .ID(  new MsccBeanAdapter.Office.ID("legat99", "scott992") )
                .Address1( "7580 E gray st 456 ")
                .Address2("#102123")
                .City( "Scottsdale567")
                .Jurisdiction( "ADOT123")
                .MainTele( "480-1234567123")
                .Desc("headquater123")
                .Postal("85260123")
                .Website("www.xxxx123.com")
                .build();

        HttpResponseBean<MsccBeanAdapter.Office> officeHttpResponseBean = officeService.update(  entity.getID(), updated  );

        if( officeHttpResponseBean != null  ) {
            if( officeHttpResponseBean.getEntity() != null )
                System.out.println( officeHttpResponseBean.getEntity() );

            System.out.println( officeHttpResponseBean.getStatusCode() );
        } else {

            System.out.println( "officeHttpResponseBean is null");
        }

        Assert.assertTrue( 202 == officeHttpResponseBean.getStatusCode() );



    }

    @Test
    public void Office_deleteone_test() {

        MsccBeanAdapter.Office entity = MsccBeanAdapter.Office.getBuilder()
                .ID(  new MsccBeanAdapter.Office.ID("legat99", "scott992") )
                .Address1( "7580 E gray st 123 ")
                .Address2("#102123")
                .City( "Scottsdale123")
                .Jurisdiction( "ADOT123")
                .MainTele( "480-1234567123")
                .Desc("headquater123")
                .Postal("85260123")
                .Website("www.xxxx123.com")
                .build();
        HttpResponseBean<MsccBeanAdapter.Office> officeHttpResponseBean = officeService.deleteById( entity.getID() );

        System.out.println( "=====================" + officeHttpResponseBean );

        if( officeHttpResponseBean.getEntity() != null ) {
            System.out.println( officeHttpResponseBean.getEntity().getID() );
        }

        System.out.println( officeHttpResponseBean.getStatusCode() );

        Assert.assertTrue( 202 == officeHttpResponseBean.getStatusCode() );

    }




}
