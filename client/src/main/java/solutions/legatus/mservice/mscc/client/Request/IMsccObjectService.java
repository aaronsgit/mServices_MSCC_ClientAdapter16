package solutions.legatus.mservice.mscc.client.Request;

/**
 * Created by ahou on 5/11/2016.
 */

import solutions.legatus.mservice.mscc.client.Bean.impl.MsccBeanAdapter;
import solutions.legatus.mservice.mscc.client.Request.impl.HttpResponseBean;

import java.util.List;

/**
 * Created by ahou on 2/17/2016.
 */
public interface IMsccObjectService {

    public HttpResponseBean<MsccBeanAdapter.CollectionObject> findById( MsccBeanAdapter.CollectionObject.ID Id );

    public HttpResponseBean<MsccBeanAdapter.CollectionObject> add(MsccBeanAdapter.CollectionObject entity);

    public HttpResponseBean<List<MsccBeanAdapter.CollectionObject.ID>> findByReference(MsccBeanAdapter.QueryCriteria queryCriteria );

    public HttpResponseBean<MsccBeanAdapter.CollectionObject> update(MsccBeanAdapter.CollectionObject.ID entityID, MsccBeanAdapter.CollectionObject entity);

    public HttpResponseBean<MsccBeanAdapter.CollectionObject> deleteById(MsccBeanAdapter.CollectionObject.ID entityID);

//  public HttpResponseBean<List<MsccBean.User>> list( int pageNumber, int pageSize );

}
