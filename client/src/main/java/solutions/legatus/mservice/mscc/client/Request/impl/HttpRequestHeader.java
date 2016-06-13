package solutions.legatus.mservice.mscc.client.Request.impl;

/**
 * Created by ahou on 2/14/2016.
 */
public class HttpRequestHeader {
    public final String key;
    public final String value;

    public HttpRequestHeader(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}