package solutions.legatus.mservice.mscc.client.Request;

import solutions.legatus.mservice.mscc.client.Bean.impl.MsccBeanAdapter;
import solutions.legatus.mservice.mscc.client.Request.impl.HttpResponseBean;

/**
 * Created by ahou on 5/15/2016.
 */
public interface IMsccSentToService {

//    public HttpResponseBean<MsccBeanAdapter.SentTo> findById(MsccBeanAdapter.SentTo.ID Id);

//  public HttpResponseBean<List<MsccBean.Office>> listAll();

    public HttpResponseBean<MsccBeanAdapter.SentTo> addPermission( MsccBeanAdapter.SentTo entity );
    public HttpResponseBean<MsccBeanAdapter.SentTo> removePermission( MsccBeanAdapter.SentTo.ID entityID );

    public HttpResponseBean<MsccBeanAdapter.SentTo> addAction( MsccBeanAdapter.SentTo entity );
    public HttpResponseBean<MsccBeanAdapter.SentTo> removeAction( MsccBeanAdapter.SentTo.ID entityID );

//    public HttpResponseBean<MsccBeanAdapter.SentTo> update( MsccBeanAdapter.Office.ID entityID, MsccBeanAdapter.Office entity );

//    public HttpResponseBean<MsccBeanAdapter.SentTo> deleteById(  MsccBeanAdapter.Office.ID entityID  );

//  public HttpResponseBean<List<MsccBean.Office>> list( int pageNumber, int pageSize );
}
