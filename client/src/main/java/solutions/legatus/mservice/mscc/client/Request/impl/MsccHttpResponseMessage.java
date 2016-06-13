package solutions.legatus.mservice.mscc.client.Request.impl;

import solutions.legatus.mservice.mscc.client.Request.IMsccResponseMessage;

/**
 * Created by ahou on 2/18/2016.
 */
public class MsccHttpResponseMessage<T> implements IMsccResponseMessage {

    private T Model;

    private String requestCode;

    private int HttpStatusCode;

    private String raw;

    public MsccHttpResponseMessage() {
    }

    public MsccHttpResponseMessage(T model, String requestCode, int httpStatusCode, String raw) {
        Model = model;
        this.requestCode = requestCode;
        HttpStatusCode = httpStatusCode;
        this.raw = raw;
    }

    public T getModel() {
        return Model;
    }

    public void setModel(T model) {
        Model = model;
    }

    public String getRequestCode() {
        return requestCode;
    }

    public void setRequestCode(String requestCode) {
        this.requestCode = requestCode;
    }

    public int getHttpStatusCode() {
        return HttpStatusCode;
    }

    public void setHttpStatusCode(int httpStatusCode) {
        HttpStatusCode = httpStatusCode;
    }

    public String getRaw() {
        return raw;
    }

    public void setRaw(String raw) {
        this.raw = raw;
    }



}
