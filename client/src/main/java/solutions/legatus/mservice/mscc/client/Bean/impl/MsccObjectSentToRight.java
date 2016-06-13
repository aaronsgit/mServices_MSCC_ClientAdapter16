package solutions.legatus.mservice.mscc.client.Bean.impl;

/**
 * Created by ahou on 3/23/2016.
 */
public enum MsccObjectSentToRight {
    ZERO(0),
    INFORMATION(1),
    SUBMIT(2),
    COMMENT(3),
    APPROVE(4),
    DISTRIBUTE(5),
    FORWARD(6),
    REMOVE(7),
    ALLRIGHTS(8);

    private int value;
    MsccObjectSentToRight(int value ) {
        this.value = value;
    }
}

