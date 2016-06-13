package solutions.legatus.mservice.mscc.client.Request;


import org.apache.http.HttpResponse;
import solutions.legatus.mservice.mscc.client.Bean.AbstractMsccEntity;
import solutions.legatus.mservice.mscc.client.Bean.AbstractMsccEntityID;
import solutions.legatus.mservice.mscc.client.Request.impl.HttpRequestHeader;

import java.io.IOException;
import java.util.Map;

/**
 * Created by ahou on 2/14/2016.
 */

public interface IMsccRestClient<T extends AbstractMsccEntity, ID extends AbstractMsccEntityID> {

    public HttpResponse doGet(String url, Iterable<HttpRequestHeader> headers, ID entityID ) throws IOException;
    public HttpResponse  doPost(   String url, Iterable<HttpRequestHeader> headers, T entity )     throws IOException;
    public HttpResponse  doPut(    String url, Iterable<HttpRequestHeader> headers, ID entityID, T entity ) throws IOException;
    public HttpResponse  doDelete( String url, Iterable<HttpRequestHeader> headers, ID entityID ) throws IOException;
}
