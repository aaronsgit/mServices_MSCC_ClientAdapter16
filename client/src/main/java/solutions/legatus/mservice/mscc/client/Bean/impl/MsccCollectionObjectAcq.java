package solutions.legatus.mservice.mscc.client.Bean.impl;

/**
 * Created by ahou on 4/24/2016.
 */
public enum  MsccCollectionObjectAcq {
    NONE(0), USER(1), SERVICE(2), ALL(9);
    int value;

    MsccCollectionObjectAcq(int value) {
        this.value = value;
    }
}
