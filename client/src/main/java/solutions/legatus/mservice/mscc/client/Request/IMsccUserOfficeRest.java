package solutions.legatus.mservice.mscc.client.Request;

import solutions.legatus.mservice.mscc.client.Bean.impl.MsccBeanAdapter;
import solutions.legatus.mservice.mscc.client.Request.impl.HttpResponseBean;

/**
 * Created by ahou on 2/29/2016.
 */
public interface IMsccUserOfficeRest {
    public HttpResponseBean<MsccBeanAdapter.UserOffice> findById(MsccBeanAdapter.UserOffice.ID Id);

    public HttpResponseBean<MsccBeanAdapter.UserOffice> add( MsccBeanAdapter.UserOffice entity );

    public HttpResponseBean<MsccBeanAdapter.UserOffice> update( MsccBeanAdapter.UserOffice.ID entityID, MsccBeanAdapter.UserOffice entity );

    public HttpResponseBean<MsccBeanAdapter.UserOffice> deleteById(  MsccBeanAdapter.UserOffice.ID entityID  );


}
