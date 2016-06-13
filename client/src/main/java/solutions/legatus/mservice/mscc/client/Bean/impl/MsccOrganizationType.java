package solutions.legatus.mservice.mscc.client.Bean.impl;

/**
 * Created by ahou on 4/18/2016.
 */
public enum  MsccOrganizationType {
    NONE(0),JURMCS(1), JURIP(2), JURIFTA(3), LE(4), CARRIER(5), SHIPPER(6), REGISTRANT(7),ALLTYPE(9);

    int code;

    MsccOrganizationType(int code) {
        this.code = code;
    }
}
