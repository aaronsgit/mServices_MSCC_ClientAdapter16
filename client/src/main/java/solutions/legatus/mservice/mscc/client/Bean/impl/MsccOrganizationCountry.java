package solutions.legatus.mservice.mscc.client.Bean.impl;

/**
 * Created by ahou on 4/18/2016.
 */
public enum MsccOrganizationCountry {

    NONE( 0 ), US( 1), CANADA(2), MEXICO(3),ALLCOUNTRY(9);

    int code;

    MsccOrganizationCountry(int code) {
        this.code = code;
    }
}
