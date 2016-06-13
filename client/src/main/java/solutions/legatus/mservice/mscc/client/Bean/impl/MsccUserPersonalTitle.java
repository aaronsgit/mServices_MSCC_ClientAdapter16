package solutions.legatus.mservice.mscc.client.Bean.impl;

/**
 * Created by ahou on 4/21/2016.
 */
public enum  MsccUserPersonalTitle  {
    NO(0),
    MR(1),
    MRS(2),
    MS(3),
    ALL(9);

    int value;

    MsccUserPersonalTitle( int value ) {
        this.value = value;
    }
}
