package solutions.legatus.mservice.mscc.client.Bean.impl;

/**
 * Created by ahou on 4/2/2016.
 */
public enum  MsccAccessRole {
    OTHER(0),
    CREATOR(1),
    OWNER(2),
    VIEWER(3),
    ALLLEVEL(4);

    private int value;
    MsccAccessRole( int value ) {
        this.value = value;
    }
}
