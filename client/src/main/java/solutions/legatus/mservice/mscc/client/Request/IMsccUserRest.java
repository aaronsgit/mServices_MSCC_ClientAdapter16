package solutions.legatus.mservice.mscc.client.Request;

import solutions.legatus.mservice.mscc.client.Bean.impl.MsccBeanAdapter;
import solutions.legatus.mservice.mscc.client.Request.impl.HttpResponseBean;

/**
 * Created by ahou on 2/17/2016.
 */
public interface IMsccUserRest {
    public HttpResponseBean<MsccBeanAdapter.User> findById(MsccBeanAdapter.User.ID Id);

//  public HttpResponseBean<List<MsccBean.User>> listAll();

    public HttpResponseBean<MsccBeanAdapter.User> add( MsccBeanAdapter.User entity );

    public HttpResponseBean<MsccBeanAdapter.User> update( MsccBeanAdapter.User.ID entityID, MsccBeanAdapter.User entity );

    public HttpResponseBean<MsccBeanAdapter.User> deleteById(  MsccBeanAdapter.User.ID entityID  );

//  public HttpResponseBean<List<MsccBean.User>> list( int pageNumber, int pageSize );

}
