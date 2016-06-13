package solutions.legatus.mservice.mscc.client.Request;

/**
 * Created by ahou on 5/11/2016.
 */

import solutions.legatus.mservice.mscc.client.Bean.impl.MsccBeanAdapter;
import solutions.legatus.mservice.mscc.client.Request.impl.HttpResponseBean;

import java.util.List;

/**
 * Created by ahou on 2/17/2016.
 */
public interface IMsccFolderService {

    //public HttpResponseBean<MsccBeanAdapter.Folder> findById(MsccBeanAdapter.Folder.ID Id);

    public HttpResponseBean<MsccBeanAdapter.Collection> add(MsccBeanAdapter.Collection entity);

    public HttpResponseBean<List<MsccBeanAdapter.Collection.ID>> findCollectionById(MsccBeanAdapter.Folder.ID Id );

    //public HttpResponseBean<MsccBeanAdapter.Folder> update(MsccBeanAdapter.Folder.ID entityID, MsccBeanAdapter.Folder entity);

    public HttpResponseBean<MsccBeanAdapter.Collection> deleteById(MsccBeanAdapter.Folder.ID entityID);

//  public HttpResponseBean<List<MsccBean.User>> list( int pageNumber, int pageSize );

}
