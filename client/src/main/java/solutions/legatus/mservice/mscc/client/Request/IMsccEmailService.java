package solutions.legatus.mservice.mscc.client.Request;

import solutions.legatus.mservice.mscc.client.Bean.impl.MsccBeanAdapter;
import solutions.legatus.mservice.mscc.client.Request.impl.HttpResponseBean;

/**
 * Created by ahou on 5/15/2016.
 */
public interface IMsccEmailService {
    public HttpResponseBean  EmailObjects( MsccBeanAdapter.EmailFact entity );
}
