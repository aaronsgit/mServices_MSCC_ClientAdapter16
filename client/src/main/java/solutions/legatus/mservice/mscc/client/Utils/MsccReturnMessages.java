package solutions.legatus.mservice.mscc.client.Utils;

/**
 * Created by ahou on 1/30/2016.
 */
public class MsccReturnMessages {
    public static final String duplicate  =  "DUPLICATE";
    public static final String conflict   =  "CONFLICT";
    public static final String notfound   =  "NOTFOUND";
    public static final String badrequest =  "BADREQUEST";
    public static final String accepted   =  "ACCEPTED";
    public static final String primaryKeyInvalid   =  "INVALIDPRIMARYKEY";

    public static final String notauthorized   =  "NOT_AUTHORIZED";
    public static final String notunqiue       =  "NOT_UNIQUE";
    public static final String success         =  "SUCCESS";

    public static final String succeeded  =  "SUCCEEDED";

    public static final String failed     =  "FAILED";

    public static final String internalerro =  "Internal Error!";

    public static final int  SUCCESSS    = 200;
    public static final int  CREATED     = 201;
    public static final int  ACCEPTED    = 202;
    public static final int  BAD_REQUEST = 400;
    public static final int  DUPLICATED  = 409;
    public static final int  NOT_FOUND   = 404;


}
