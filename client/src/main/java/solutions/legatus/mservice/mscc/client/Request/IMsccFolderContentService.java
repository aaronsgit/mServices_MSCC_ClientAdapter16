package solutions.legatus.mservice.mscc.client.Request;

import solutions.legatus.mservice.mscc.client.Bean.impl.MsccBeanAdapter;
import solutions.legatus.mservice.mscc.client.Request.impl.HttpResponseBean;

/**
 * Created by ahou on 5/14/2016.
 */
public interface IMsccFolderContentService {

    //public HttpResponseBean<MsccBeanAdapter.Folder> findById(MsccBeanAdapter.Folder.ID Id);

    public HttpResponseBean<MsccBeanAdapter.FolderContents> add(MsccBeanAdapter.FolderContents entity);

    //public HttpResponseBean<MsccBeanAdapter.FolderContents.ID> findCollectionById( MsccBeanAdapter.FolderContents.ID Id );

    //public HttpResponseBean<MsccBeanAdapter.Folder> update(MsccBeanAdapter.Folder.ID entityID, MsccBeanAdapter.Folder entity);

    public HttpResponseBean<MsccBeanAdapter.FolderContents> deleteById(MsccBeanAdapter.FolderContents.ID entityID);

//  public HttpResponseBean<List<MsccBean.User>> list( int pageNumber, int pageSize );

}
