package solutions.legatus.mservice.mscc.client.Request;

import solutions.legatus.mservice.mscc.client.Bean.AbstractMsccEntity;
import solutions.legatus.mservice.mscc.client.Bean.AbstractMsccEntityID;
import solutions.legatus.mservice.mscc.client.Request.impl.HttpResponseBean;

import java.util.List;

/**
 * Created by ahou on 2/19/2016.
 */
public interface IMsccRestService<T extends AbstractMsccEntity, EID extends AbstractMsccEntityID> {


    public HttpResponseBean<List<T>> listAllService( IMsccRestClient restClient, T entityObject, String url );


    public HttpResponseBean<T> addService( IMsccRestClient restClient,  AbstractMsccEntity entity, String url  );


    /*
    *
    *
     */
    public HttpResponseBean<T> findByIdServcice( IMsccRestClient restClient, T entity,  EID Id, String url );



    public HttpResponseBean<T> deleteByIdService( IMsccRestClient restClient, EID entityID, AbstractMsccEntity entityObject, String url  );


    public HttpResponseBean<T> updateService( IMsccRestClient restClient, EID entityID, T entity, String url);


    public HttpResponseBean<List<T>> listService(  IMsccRestClient restClient, T entityObject, String url );


}
