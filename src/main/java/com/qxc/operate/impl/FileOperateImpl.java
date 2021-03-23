package com.qxc.operate.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qxc.mapper.HomeWorkMapper;
import com.qxc.operate.FileOperate;
import com.qxc.payload.UploadFileResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileOperateImpl extends ServiceImpl<HomeWorkMapper, UploadFileResponse> implements FileOperate {


    @Override
    public void insert(String fileName, String fileDownloadUri, String fileType, long size) {
        baseMapper.insert(new UploadFileResponse(fileName,fileDownloadUri,fileType,size));
    }

    @Override
    public List<UploadFileResponse> selectAll() {
        List<UploadFileResponse> list = baseMapper.selectList(null);
        return list;
    }
}
