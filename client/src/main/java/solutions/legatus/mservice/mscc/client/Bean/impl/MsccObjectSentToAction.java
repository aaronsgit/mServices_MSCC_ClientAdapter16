package solutions.legatus.mservice.mscc.client.Bean.impl;

/**
 * Created by ahou on 3/23/2016.
 */
public enum MsccObjectSentToAction {
    NONE(0),
    REVIEW_AND_APPROVE(1),
    INFORMATION(2),
    TAKE_OVER_OWNERSHIP(3),
    RESUBMIT(4),
    SUBMIT(5),
    REVIEW_AND_COMMENT(6),
    PROCESS(7),
    ALLACTIONS(8);

    int value;
    MsccObjectSentToAction(int value) {
        this.value = value;
    }
}
