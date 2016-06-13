package solutions.legatus.mservice.mscc.client.Request;

/**
 * Created by ahou on 5/11/2016.
 */

import solutions.legatus.mservice.mscc.client.Bean.impl.MsccBeanAdapter;
import solutions.legatus.mservice.mscc.client.Request.impl.HttpResponseBean;

/**
 * Created by ahou on 2/17/2016.
 */
public interface IMsccCollectionService {

    public HttpResponseBean<MsccBeanAdapter.Collection> findById(MsccBeanAdapter.Collection.ID Id);

    public HttpResponseBean<MsccBeanAdapter.Collection> add( MsccBeanAdapter.Collection entity );

    public HttpResponseBean<MsccBeanAdapter.Collection> update( MsccBeanAdapter.Collection.ID entityID, MsccBeanAdapter.Collection entity );

    public HttpResponseBean<MsccBeanAdapter.Collection> deleteById(  MsccBeanAdapter.Collection.ID entityID  );

//  public HttpResponseBean<List<MsccBean.User>> list( int pageNumber, int pageSize );

}
