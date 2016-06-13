import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import solutions.legatus.mservice.mscc.client.Bean.impl.MsccBeanAdapter;
import solutions.legatus.mservice.mscc.client.Request.impl.ApacheMsccRestClient;
import solutions.legatus.mservice.mscc.client.Request.impl.HttpResponseBean;
import solutions.legatus.mservice.mscc.client.Request.impl.MsccClientRequest;
import solutions.legatus.mservice.mscc.client.Utils.MsccConstants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ahou on 5/15/2016.
 */
public class MsccClientMetaRequestTest {

    private final static String BASE_URI = "http://localhost:9100";

    private MsccClientRequest.MetaService metaService;

    @Before
    public void setup() {
        metaService = MsccClientRequest.getInstance( new ApacheMsccRestClient(), BASE_URI ).new MetaService();
    }


    @Test
    public void Meta_add_test() {


        MsccBeanAdapter.CollectionObject.ID objectID =  new MsccBeanAdapter.CollectionObject.ID( "legat120", "scott214", "user114", "serious", 15  );

        MsccBeanAdapter.Meta.ID metaID = new MsccBeanAdapter.Meta.ID(  "legat120", "scott214", "user114", "serious", 15, "quality", "bad", 0, null  );

        MsccBeanAdapter.Meta entity = MsccBeanAdapter.Meta.getBuilder()
                .ID( metaID )
                .OrganizationMeta( "legat120" )
                .OfficeMeta( "scott128" )
                .UserMeta( "ironman" )
                .build();


        HttpResponseBean<MsccBeanAdapter.Meta> metaHttpResponseBean = metaService.add( entity );


        if( metaHttpResponseBean != null && metaHttpResponseBean.getEntity() != null) {

            System.out.println( "The added entity is:" + metaHttpResponseBean.getEntity() );
            //System.out.println(collectionHttpResponseBean.getEntity().getID());

            System.out.println(metaHttpResponseBean.getStatusCode());
        } else {

            System.out.println("failed");
        }

        Assert.assertTrue(metaHttpResponseBean.getStatusCode() == 201);

    }


    @Test
    public void Meta_update_test() {

        MsccBeanAdapter.CollectionObject.ID objectID =  new MsccBeanAdapter.CollectionObject.ID( "legat120", "scott214", "user114", "serious", 15  );

        MsccBeanAdapter.Meta.ID metaID = new MsccBeanAdapter.Meta.ID( "legat120", "scott214", "user114", "serious", 15, "quality", "bad", 0, null  );

        MsccBeanAdapter.Meta entity = MsccBeanAdapter.Meta.getBuilder()
                .ID( metaID )
                .OrganizationMeta( "legat120" )
                .OfficeMeta( "scott128" )
                .UserMeta( "ironman" )
                .build();


        MsccBeanAdapter.Meta.ID metaID1 = new MsccBeanAdapter.Meta.ID(  "legat120", "scott214", "user114", "serious", 15, "quality", "badtogood", 0, null  );

        MsccBeanAdapter.Meta updated = MsccBeanAdapter.Meta.getBuilder()
                .ID( metaID1 )
                .OrganizationMeta( "legat120" )
                .OfficeMeta( "scott128" )
                .UserMeta( "ironman" )
                .build();


        HttpResponseBean<MsccBeanAdapter.Meta> objectHttpResponseBean = metaService.update( entity.getID(), updated );

        if (objectHttpResponseBean != null && objectHttpResponseBean.getEntity() != null) {
            System.out.println(objectHttpResponseBean);
            System.out.println(objectHttpResponseBean.getStatusCode());
        } else {

            System.out.println("yyyy");
        }
        Assert.assertTrue(objectHttpResponseBean.getStatusCode() == 202);

    }


    @Test
    public void getObjectReferenceTest() throws Exception {

        MsccBeanAdapter.SearchTerm t1 = new MsccBeanAdapter.SearchTerm(MsccConstants.MSCC_SEARCH_META_TYPE, "quality");
        MsccBeanAdapter.SearchTerm t2 = new MsccBeanAdapter.SearchTerm(MsccConstants.MSCC_SEARCH_META_CHVALUE, "badtogood");

        MsccBeanAdapter.QueryCriteria q = new MsccBeanAdapter.QueryCriteria();
        q.addFuzzyQuery(t1);
        q.addFuzzyQuery(t2);

        List<String> orderBy = new ArrayList<String>();
        orderBy.add( "SentTs" );
//
//        List<String> groupBy = new ArrayList<String>();
//        groupBy.add( MsccConstants.MSCC_SEARCH_OFFICE);
//        q.setGroupBy( groupBy );



        HttpResponseBean<List<MsccBeanAdapter.CollectionObject.ID>> metaHttpResponseBeans = metaService.findObjectsByMeta( q );

        if( metaHttpResponseBeans.getStatusCode() == 200 ) {
            System.out.println( metaHttpResponseBeans.getEntity() );
        }

        System.out.println( metaHttpResponseBeans.getStatusCode() );

    }




}
