package solutions.legatus.mservice.mscc.client.Request;

import solutions.legatus.mservice.mscc.client.Bean.impl.MsccBeanAdapter;
import solutions.legatus.mservice.mscc.client.Request.impl.HttpResponseBean;

/**
 * Created by ahou on 2/17/2016.
 */
public interface IMsccOfficeRest {
    public HttpResponseBean<MsccBeanAdapter.Office> findById(MsccBeanAdapter.Office.ID Id);

//  public HttpResponseBean<List<MsccBean.Office>> listAll();

    public HttpResponseBean<MsccBeanAdapter.Office> add( MsccBeanAdapter.Office entity );

    public HttpResponseBean<MsccBeanAdapter.Office> update( MsccBeanAdapter.Office.ID entityID, MsccBeanAdapter.Office entity );

    public HttpResponseBean<MsccBeanAdapter.Office> deleteById(  MsccBeanAdapter.Office.ID entityID  );

//  public HttpResponseBean<List<MsccBean.Office>> list( int pageNumber, int pageSize );

}
