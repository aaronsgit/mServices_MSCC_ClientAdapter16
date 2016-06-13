package solutions.legatus.mservice.mscc.client.Request;

import solutions.legatus.mservice.mscc.client.Bean.impl.MsccBeanAdapter;
import solutions.legatus.mservice.mscc.client.Request.impl.HttpResponseBean;

import java.util.List;

/**
 * Created by ahou on 5/15/2016.
 */
public interface IMsccMetaService {

    public HttpResponseBean<List<MsccBeanAdapter.CollectionObject.ID>> findObjectsByMeta(MsccBeanAdapter.QueryCriteria queryCriteria );

    public HttpResponseBean<MsccBeanAdapter.Meta> add( MsccBeanAdapter.Meta entity );

    public HttpResponseBean<MsccBeanAdapter.Meta> update( MsccBeanAdapter.Meta.ID entityID, MsccBeanAdapter.Meta entity );

//    public HttpResponseBean<MsccBeanAdapter.Meta> deleteById(  MsccBeanAdapter.Meta.ID entityID  );

//  public HttpResponseBean<List<MsccBean.Office>> list( int pageNumber, int pageSize );

}
