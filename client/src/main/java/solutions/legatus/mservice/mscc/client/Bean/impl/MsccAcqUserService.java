package solutions.legatus.mservice.mscc.client.Bean.impl;

/**
 * Created by ahou on 3/12/2016.
 */
public enum MsccAcqUserService {

    USER {
        @Override
        public String MsccAcqUserorService() {
            return "USER";
        }
    },
    SERIVE {

        @Override
        public String MsccAcqUserorService() {
            return "SERVICE";
        }
    };

    public abstract String MsccAcqUserorService();

}
