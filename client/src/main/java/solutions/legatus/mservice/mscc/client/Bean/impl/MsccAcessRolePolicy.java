package solutions.legatus.mservice.mscc.client.Bean.impl;

/**
 * Created by ahou on 4/2/2016.
 */



public enum MsccAcessRolePolicy {
    ANYONE(0),
    ORGANIZATION(1),
    OFFICE(2),
    USER(3);

    private int value;

    MsccAcessRolePolicy( int value ) {
        this.value = value;
    }
}
