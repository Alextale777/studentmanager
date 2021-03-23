package com.qxc.operate;

import com.qxc.payload.UploadFileResponse;

import java.util.List;

public interface FileOperate {
    void insert(String fileName,String fileDownloadUri,String  fileType,long size);
    List<UploadFileResponse> selectAll();

}
