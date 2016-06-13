package solutions.legatus.mservice.mscc.client.Bean.impl;

/**
 * Created by ahou on 4/22/2016.
 */
public enum MsccCollectionDialogShare {
    NONE(0),PUBLIC(1), ASUSERSEND(2),ASOFFICESEND(3), ASORGSEND(4),ORGOWNER(5),OFFOWNER(6),FOLDER(7),PRIVATE(8), ALLSHARE(9);

    int value;

    MsccCollectionDialogShare(int value) {
        this.value = value;
    }
}
