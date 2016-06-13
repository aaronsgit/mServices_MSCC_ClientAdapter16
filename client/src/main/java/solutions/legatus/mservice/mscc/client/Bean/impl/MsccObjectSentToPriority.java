package solutions.legatus.mservice.mscc.client.Bean.impl;

/**
 * Created by ahou on 3/23/2016.
 */
public enum MsccObjectSentToPriority {
    LEVEL0(0),

    LEVEL1(1),
    LEVEL2(2),
    LEVEL3(3),
    LEVEL4(4),
    LEVEL5(5),
    LEVEL6(6),
    LEVEL7(7),
    LEVEL8(8),
    LEVEL9(9);

    int value;
    MsccObjectSentToPriority(int value ) {
        this.value = value;
    }
}
