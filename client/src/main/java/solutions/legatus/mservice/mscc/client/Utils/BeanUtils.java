package solutions.legatus.mservice.mscc.client.Utils;

import org.apache.http.HttpResponse;
import sun.util.resources.TimeZoneNames_en_IE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * Created by ahou on 5/15/2016.
 */
public class BeanUtils {

    //jdk 1.8
//    public static Timestamp GetUTCTimestamp(String ts ) {
//
//        ZonedDateTime utc = ZonedDateTime.ofInstant( Instant.parse( ts ), ZoneOffset.UTC );
//
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS" );
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
//
//        String asIsoDateTime =utc.format( formatter );
//
//        return Timestamp.valueOf( asIsoDateTime  );
//
//    }

    public static Timestamp GetUTCTimestamp(String ts) {


        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

        Timestamp t2 = Timestamp.valueOf(ts);

        System.out.println("t2 is :" + t2);

        TimeZone utc = TimeZone.getTimeZone("UTC");
        dateFormat.setTimeZone(utc);

        String asIsoDateTime = dateFormat.format(ts);

        return Timestamp.valueOf(asIsoDateTime);

    }

    // ts format example "2020-10-23 17:12:35.000"
    public static Timestamp GetSimpleUTCTimestamp( String ts ) {


        try {

            //Timestamp ts = Timestamp.from( Instant.parse("2020-10-23T10:12:35Z") );
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");

            java.util.Date parsedDate = dateFormat.parse( ts );

            Timestamp timestamp = new Timestamp( parsedDate.getTime() );

            return timestamp;

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;

    }

    public static boolean isValidRestUrl(String url) {

        if (url == null || url.length() == 0) {
            return false;
        }

        if (!isNetworkUrl(url)) return false;

        URL u = null;

        try {
            u = new URL(url);
        } catch (MalformedURLException e) {
            return false;
        }

        try {
            u.toURI();
        } catch (URISyntaxException e) {
            return false;
        }

        return true;

    }

    public static boolean isNetworkUrl(String url) {
        if (url == null || url.length() == 0) {
            return false;
        }
        return isHttpUrl(url) || isHttpsUrl(url);
    }


    public static boolean isHttpUrl(String url) {
        return (null != url) &&
                (url.length() > 6) &&
                url.substring(0, 7).equalsIgnoreCase("http://");
    }


    public static boolean isHttpsUrl(String url) {
        return (null != url) &&
                (url.length() > 7) &&
                url.substring(0, 8).equalsIgnoreCase("https://");


    }

    public static StringBuffer convertResponseToString( HttpResponse response ) {

        StringBuffer responseHttp = new StringBuffer();

        BufferedReader rd = null;
        try {
            rd = new BufferedReader(
                    new InputStreamReader( response.getEntity().getContent() ) );

            String line="";

            while( (line=rd.readLine() )  != null )
                responseHttp.append( line );


            //String encoded = toObjectJsonMapper( entityID );

        } catch (IOException e) {
            e.printStackTrace();
        }

        return responseHttp;

    }

}
