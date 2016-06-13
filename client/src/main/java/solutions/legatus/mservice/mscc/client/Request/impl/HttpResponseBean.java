package solutions.legatus.mservice.mscc.client.Request.impl;

/**
 * Created by ahou on 2/14/2016.
 */


public class HttpResponseBean<T> {

    T entity;
    int StatusCode;

    public HttpResponseBean() {
    }

    public T getEntity() {
        return entity;
    }

    public void setEntity( T entity) {
        this.entity = entity;
    }

    public int getStatusCode() {
        return StatusCode;
    }

    public void setStatusCode(int statusCode) {
        StatusCode = statusCode;
    }
}