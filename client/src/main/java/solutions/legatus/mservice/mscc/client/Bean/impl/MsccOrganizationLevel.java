package solutions.legatus.mservice.mscc.client.Bean.impl;

/**
 * Created by ahou on 4/18/2016.
 */
public enum  MsccOrganizationLevel {
    NONE(0), NATIONAL(1), JURISDICTION(2), LOCAL(3),ALLLEVEL(4);

    int code;

    MsccOrganizationLevel(int code) {
        this.code = code;
    }
}
