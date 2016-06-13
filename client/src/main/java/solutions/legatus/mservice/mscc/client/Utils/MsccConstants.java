package solutions.legatus.mservice.mscc.client.Utils;

import java.sql.Timestamp;

/**
 * Created by ahou on 2/6/2016.
 */
public class MsccConstants {
    public static final int PAGE_SIZE = 2;

    public static final String MSCC_MODEL_EMPTY_STRING = "";

    public static final String MSCC_TIMESTAMP_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";

    public static final int SEQUENCE_INC = 1;

    public static final int MSCC_ORGANIZATION_CODE_LEN = 8;
    public static final int MSCC_OFFICE_CODE_LEN = 8;
    public static final int MSCC_USER_CODE_LEN = 32;
    public static final int MSCC_COLLECTION_REFNBR_CODE_LEN = 32;
    public static final int MSCC_ORGANIZATION_NAME_CODE_LEN = 60;


    public static final int MSCC_OFFICE_ADDR1_LEN = 60;
    public static final int MSCC_OFFICE_ADDR2_LEN = 60;
    public static final int MSCC_OFFICE_CITY_LEN = 40;
    public static final int MSCC_OFFICE_JURIS_LEN = 40;
    public static final int MSCC_OFFICE_TELE_LEN = 20;
    public static final int MSCC_OFFICE_DESC_LEN = 32;
    public static final int MSCC_OFFICE_POSTAL_LEN = 10;
    public static final int MSCC_OFFICE_WEBSITE_LEN = 60;

    public static final int MSCC_USER_NAME_LEN = 60;
    public static final int MSCC_USER_PERSONAL_TITLE_LEN = 3;
    public static final int MSCC_USER_TELE_DAYTIME_LEN = 32;
    public static final int MSCC_USER_TELE_OFFHOURS_LEN = 32;
    public static final int MSCC_USER_TIMEZONE_LEN = 32;
    public static final int MSCC_USER_TITLE_LEN = 32;
    public static final int MSCC_USER_CREDENTIAL_LEN = 32;
    public static final int MSCC_USER_EMAIL_LEN = 1024;


    public static final int MSCC_USEROFFICE_OFFICEROLE_LEN = 32;
    public static final int MSCC_USEROFFICE_ORG_FACILIATOR_LEN = 8;
    public static final int MSCC_USEROFFICE_USER_FACILIATOR_LEN = 32;

    public static final int MSCC_FOLDER_CODE_LEN = 32;



    public static final int MSCC_OBJECT_INGESTMETHOD_LEN = 32;
    public static final int MSCC_OBJECT_INSTRUCTIONS_LEN = 80;
    public static final int MSCC_OBJECT_HANDLE_LEN = 1024;
    public static final int MSCC_OBJECT_LINK_LEN = 1024;
    public static final int MSCC_OBJECT_TYPE_LEN = 8;
    public static final int MSCC_OBJECT_SUPERSEDEDNBY_LEN = 255;
    public static final int MSCC_OBJECT_SUPERSEDES_LEN = 80;
    public static final int MSCC_OBJECT_MD5VALUE_LEN = 16;




    public static final Integer MSCC_SEARCH_RESULTSET_MAXCOUNT = 100;
    public static final Integer MSCC_SEARCH_DEFAULT_PAGESIZE = 10;
    public static final Integer MSCC_SEARCH_DEFAULT_START_QUENCE = 1;
    public static final Integer MSCC_SEARCH_DEFAULT_PAGENUMBER = 1;



    //query
    public static final String MSCC_SEARCH_DEFAULT_SORTDIRECTION = "ASC";
    public static final String MSCC_SEARCH_ORGANIZATION = "ORGANIZATION";
    public static final String MSCC_SEARCH_OFFICE = "OFFICE";
    public static final String MSCC_SEARCH_USER = "USER";
    public static final String MSCC_SEARCH_REFNBR = "REFNBR";
    public static final String MSCC_SEARCH_SEQUENCE = "SEQUENCE";

    //
    public static final String MSCC_EMPTY_STRING = "";

    public static final Timestamp MSCC_EMPTY_TIMESTAMP = new Timestamp( 0 );


    public static String DROPBOX_PREFIX_STRING = "Dropbox (Legatus)";

    //meta
    public static final int MSCC_META_TYPE_LEN = 32;
    public static final int MSCC_META_CHVALUE_LEN = 32;

    public static final String MSCC_SEARCH_META_TYPE = "META_TYPE";
    public static final String MSCC_SEARCH_META_CHVALUE = "META_CHVALUE";
    public static final String MSCC_SEARCH_META_NRVALUE = "META_NRVALUE";
    public static final String MSCC_SEARCH_META_DTVALUE = "META_DTVALUE";

    public static final String MSCC_SEARCH_DATA_STRING_TYPE = "STRING";
    public static final String MSCC_SEARCH_DATA_TIMESTAMP_TYPE = "TIMESTAMP";
    public static final String MSCC_SEARCH_DATA_INTEGER_TYPE = "INTEGER";


    //RESPONSE

}

