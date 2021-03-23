package com.qxc.operate.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qxc.domain.SelectedCourse;
import com.qxc.mapper.SelectedMapper;
import com.qxc.operate.SelectedOperate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SelectedOperateImpl extends ServiceImpl<SelectedMapper, SelectedCourse>implements SelectedOperate {
    @Override
    public void Insert(Integer id, Integer studentId, Integer courseId) {
        baseMapper.insert(new SelectedCourse(id,studentId,courseId));
    }

    @Override
    public void DeleteById(Integer id) {
        baseMapper.deleteById(id);
    }

    @Override
    public void DeleteBatchId(List<Integer> list) {
        baseMapper.deleteBatchIds(list);
    }

    @Override
    public SelectedCourse SelectById(String id) {
        SelectedCourse selected_course =  baseMapper.selectById(id);
        return  selected_course;
    }

    @Override
    public List<SelectedCourse> SelectBatchId(List<Integer> ids) {
        List<SelectedCourse> list = baseMapper.selectBatchIds(ids);
        return list;
    }

    @Override
    public List<SelectedCourse> Select_All() {
        List<SelectedCourse> list = baseMapper.selectList(null);
        return list;
    }

    @Override
    public List<SelectedCourse> SelectMap(Map map) {
        List<SelectedCourse> list = baseMapper.selectByMap(map);
        return list;
    }


}
