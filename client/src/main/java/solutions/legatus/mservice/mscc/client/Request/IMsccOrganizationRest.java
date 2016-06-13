package solutions.legatus.mservice.mscc.client.Request;

import solutions.legatus.mservice.mscc.client.Bean.impl.MsccBeanAdapter;
import solutions.legatus.mservice.mscc.client.Request.impl.HttpResponseBean;

import java.util.List;

/**
 * Created by ahou on 2/14/2016.
 */
public interface IMsccOrganizationRest {

    public HttpResponseBean<MsccBeanAdapter.Organization> findById(MsccBeanAdapter.Organization.ID Id);

    public HttpResponseBean<List<MsccBeanAdapter.Organization>> listAll();

    public HttpResponseBean<MsccBeanAdapter.Organization> add( MsccBeanAdapter.Organization entity );

    public HttpResponseBean<MsccBeanAdapter.Organization> update( MsccBeanAdapter.Organization.ID entityID, MsccBeanAdapter.Organization entity );

    public HttpResponseBean<MsccBeanAdapter.Organization> deleteById(  MsccBeanAdapter.Organization.ID entityID  );

    public HttpResponseBean<List<MsccBeanAdapter.Organization>> list( int pageNumber, int pageSize );

}
