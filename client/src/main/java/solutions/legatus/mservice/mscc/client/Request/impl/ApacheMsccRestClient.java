package solutions.legatus.mservice.mscc.client.Request.impl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.*;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;
import solutions.legatus.mservice.mscc.client.Bean.AbstractMsccEntity;
import solutions.legatus.mservice.mscc.client.Bean.AbstractMsccEntityID;
import solutions.legatus.mservice.mscc.client.Request.IMsccRestClient;
import solutions.legatus.mservice.mscc.client.Utils.BeanUtils;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

/**
 * Created by ahou on 6/5/2016.
 */
public class ApacheMsccRestClient <T extends AbstractMsccEntity,ID extends AbstractMsccEntityID> implements IMsccRestClient<T,ID> {

    private static final Logger LOGGER = LoggerFactory.getLogger( ApacheMsccRestClient.class);

    private final static String charSet                  = "utf-8";
    private final static String _CONTENT_TYPE            = "application/json";
    public  final static String _APPLICATION_JSON_UTF8   = "application/json; charset=UTF-8";

    private final static int    HTTP_STATUS_CODE_OK          = 200;
    private final static int    HTTP_STATUS_CODE_CREATED     = 201;
    private final static int    HTTP_STATUS_CODE_ACCEPT      = 202;
    private final static int    HTTP_STATUS_CODE_ERROR       = 500;
    private final static int    HTTP_STATUS_CODE_BADREQUEST  = 404;

    private CloseableHttpAsyncClient asyncHttpClient = null;

    private final int timeout = 45 * 60 * 60 * 1000; // 45 minutes

    private RequestConfig requestConfig;


    public ApacheMsccRestClient() {


//        SSLContext context = null;
//        try
//        {
//            context = SSLContext.getInstance( "TLS" );
//            context.init( new KeyManager[] {}, trustManagers, null );
//        }
//        catch ( Exception e )
//        {
//            throw new IllegalStateException( "Impossible to initialize SSL context", e );
//        }

//        CredentialsProvider provider = new BasicCredentialsProvider();
//        UsernamePasswordCredentials creds =
//                new UsernamePasswordCredentials("username", "password");
//        provider.setCredentials(AuthScope.ANY, creds);

        requestConfig = RequestConfig.custom()
                                        .setSocketTimeout(timeout)
                                        .setConnectTimeout(timeout)
                                        .setConnectionRequestTimeout(timeout)
                                        .build();

        asyncHttpClient = HttpAsyncClients.custom()
                                    .setDefaultRequestConfig(requestConfig)
                                    //.setDefaultCredentialsProvider( provider )
                                    .build();

        asyncHttpClient.start();


    }


    @Override
    public HttpResponse doGet( String url, Iterable<HttpRequestHeader> headers, ID entityID ) throws IOException {

        HttpResponse response = null;

        if( asyncHttpClient != null && isValidRestUrl( url ) ) {

            String restUrl = url;

            //Object to JSON in String
            ObjectMapper mapper = new ObjectMapper();
            String jsonInString = mapper.writeValueAsString( entityID );

            //String encoded = toObjectJsonMapper( entityID );

            if( isValidEntityID( entityID ) && jsonInString != null ) {

                //encoded = "/%7B%22OrganizationID%22:%22legat10%22,%22OfficeID%22:%22scot123%22%7D";
                restUrl = url + "/" + URLEncoder.encode( jsonInString, "UTF-8" );
            }

            //System.out.println( "The rest url is: " + restUrl );
            HttpUriRequest request = new HttpGet( restUrl  );

            response = AsyncHttpHandler( request, headers );

        }

        return response;

    }

    @Override
    public HttpResponse doPost(String url, Iterable<HttpRequestHeader> headers, T entity ) throws IOException {

        HttpResponse response = null;


        if( asyncHttpClient != null && isValidRestUrl( url ) && isValidMsccEntity( entity ) ) {

            HttpPost request = new HttpPost( url );

//            System.out.println( entity  );
//            System.out.println( new String( convertObjectToJsonBytes( entity ), "utf-8" ) );
//            System.out.println(  convertObjectToJsonString( entity ) );

            HttpEntity stringEntity = new StringEntity( convertObjectToJsonString( entity ) );

//            System.out.println( url );
//
//            System.out.println( convertObjectToJsonString( entity ) );

            request.setEntity( stringEntity );

//            AsyncHttpClient.BoundRequestBuilder builder = asyncHttpClient.preparePost(url);
//
//            builder.setBody( convertObjectToJsonBytes( entity ) );


            response = AsyncHttpHandler( request, headers );
        }

        return  response;

    }

    @Override
    public HttpResponse doPut(String url, Iterable<HttpRequestHeader> headers, ID entityID, T entity ) throws IOException {

        HttpResponse response = null;

        if( asyncHttpClient != null &&  isValidRestUrl( url ) && isValidMsccEntity( entity ) && isValidEntityID( entityID ) ) {

            String restUrl = url;
            //String encoded = toObjectJsonMapper( entityID );
            ObjectMapper mapper = new ObjectMapper();
            String jsonInString = mapper.writeValueAsString( entityID );

            if( isValidEntityID( entityID ) && jsonInString != null ) {
                //restUrl = url + "/" + jsonInString;
                restUrl = url + "/" + URLEncoder.encode( jsonInString, "UTF-8" );
            }

            HttpPut request = new HttpPut( restUrl );

            HttpEntity stringEntity = new StringEntity( convertObjectToJsonString( entity ) );

            request.setEntity( stringEntity );


            response =  AsyncHttpHandler( request, headers );
        }

        return response;

    }

    @Override
    public HttpResponse doDelete(String url, Iterable<HttpRequestHeader> headers, ID entityID ) throws IOException {

        HttpResponse response = null;

        if( asyncHttpClient != null &&  isValidRestUrl( url ) && isValidEntityID( entityID ) ) {

            String restUrl = url;

            ObjectMapper mapper = new ObjectMapper();
            String jsonInString = mapper.writeValueAsString( entityID );
            //String encoded = toObjectJsonMapper( entityID );


            if( isValidEntityID( entityID ) && jsonInString != null ) {
                //restUrl = url + "/" + jsonInString;
                restUrl = url + "/" + URLEncoder.encode( jsonInString, "UTF-8" );
            }

            HttpUriRequest request = new HttpDelete( restUrl  );

            response = AsyncHttpHandler( request, headers );
        }

        return response;

    }


    private HttpResponse AsyncHttpHandler( HttpUriRequest request, Iterable<HttpRequestHeader> headers  )  {

        HttpResponse response = null;
        boolean throwed = false;

        if( request != null ) {

            request.addHeader("Accept", _CONTENT_TYPE);
            request.addHeader("Content-Type", _APPLICATION_JSON_UTF8);  //application/json;charset=UTF-8

            if( headers != null ) {
                for (HttpRequestHeader header : headers) {
                    request.addHeader(header.getKey(), header.getValue());
                }
            }

            Future<HttpResponse> responseFuture = asyncHttpClient.execute( request, new FutureCallback<HttpResponse>() {
                @Override
                public void completed(HttpResponse result) {
                    LOGGER.info("Response received from mscc:" + result.getStatusLine().toString());
                    //return result;
                }

                @Override
                public void failed(Exception ex) {
                    LOGGER.error("Unable to fetch: " + " (" + ex.getMessage() + ")");
                    System.out.println("Unable to fetch url: " + " (" + ex.getMessage() + ")");

                }

                @Override
                public void cancelled() {

                }


            });

            try {

                if( responseFuture != null && !responseFuture.isDone() ) {

                    response = responseFuture.get();

                    //System.out.println( "IIISSS" + response.getStatusLine().getStatusCode()  );
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                LOGGER.warn("OnException", e.toString());
            } catch (ExecutionException e) {
                e.printStackTrace();
                LOGGER.error("Unable to fetch result: " + " (" + e.getMessage() + ")");
            }


        }

        return response;

    }

    public static byte[] convertObjectToJsonBytes( Object object ) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        return mapper.writeValueAsBytes( object );

    }

    public static String convertObjectToJsonString( Object object ) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        return mapper.writeValueAsString( object );

    }


    public static String createStringWithLength( int length ) {

        StringBuilder builder = new StringBuilder();

        for( int i = 0; i < length; i++ ) {
            builder.append( "a");
        }

        return  builder.toString();
    }

    public boolean isValidMsccEntity( AbstractMsccEntity entity ) {


        if( entity == null )    return  false;

        //isAssignableFrom
        //class.isInstance
        return entity instanceof AbstractMsccEntity;
    }



    public boolean isValidEntityID( AbstractMsccEntityID id ) {

        if( id == null )    return  false;
        //isAssignableFrom
        //class.isInstance
        return id instanceof AbstractMsccEntityID;
    }




    public boolean isValidRestUrl( String url ) {

        if( url == null || url.length() == 0 ) {
            return false;
        }

        if( !isNetworkUrl( url ))   return  false;

        URL u = null;

        try {
            u = new URL( url );
        } catch ( MalformedURLException e ) {
            return false;
        }

        try {
            u.toURI();
        } catch (URISyntaxException e) {
            return false;
        }

        return true;

    }


    public boolean isNetworkUrl(String url) {
        if (url == null || url.length() == 0) {
            return false;
        }
        return isHttpUrl( url) || isHttpsUrl( url );
    }


    public boolean isHttpUrl(String url) {
        return (null != url) &&
                (url.length() > 6) &&
                url.substring(0, 7).equalsIgnoreCase("http://");
    }


    public boolean isHttpsUrl( String url ) {
        return (  null != url) &&
                (url.length() > 7) &&
                url.substring(0, 8).equalsIgnoreCase("https://");
    }


    public String toObjectJsonMapper( Object object ) {

        String encoded = null;
        try {
            Gson gson = new GsonBuilder()
                    .disableHtmlEscaping()
                    .create();

            encoded = URLEncoder.encode(gson.toJson( object ).toString(), charSet);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return  encoded;
    }



}
