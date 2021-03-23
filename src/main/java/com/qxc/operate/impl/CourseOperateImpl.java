package com.qxc.operate.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qxc.domain.Class;
import com.qxc.domain.Course;
import com.qxc.mapper.CourseMapper;
import com.qxc.operate.CourseOperate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CourseOperateImpl extends ServiceImpl<CourseMapper, Course> implements CourseOperate {
    @Override
    public void Insert(int id, String name, int teacherId, String courseDate, int selectedNum, int maxNum, String info) {
        this.baseMapper.insert(new Course(id,name,teacherId,courseDate,selectedNum,maxNum,info));

    }

    @Override
    public void DeleteById(Integer id) {
        this.baseMapper.deleteById(id);
    }

    @Override
    public void DeleteBatchId(List<Integer> list) {
        this.baseMapper.deleteBatchIds(list);
    }

    @Override
    public void DeleteByMap(Map<String, Object> map) {
        baseMapper.deleteByMap(map);
    }

    @Override
    public Course SelectById(Integer id) {
        Course course = baseMapper.selectById(id);
        return  course;
    }

    @Override
    public List<Course> SelectBatchId(List<Long> ids) {
        List<Course> list = this.baseMapper.selectBatchIds(ids);
        list.forEach(System.out::println);
        return list;
    }

    @Override
    public List<Course> SelectAll() {
        List<Course> list = baseMapper.selectList(null);
        return  list;
    }


}
