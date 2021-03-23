package com.qxc.operate.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qxc.domain.Admin;
import com.qxc.domain.Class;
import com.qxc.domain.Course;
import com.qxc.domain.Student;
import com.qxc.mapper.ClassMapper;
import com.qxc.operate.ClassOperate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ClassOperatelmpl extends ServiceImpl<ClassMapper, Class> implements ClassOperate {
    @Override
    public List<Class> selectAll() {
        List<Class> classes = baseMapper.selectList(null);
        return  classes;
    }

    @Override
    public void Insert(Integer id, String cls_name, String info) {
        this.baseMapper.insert(new Class(id, cls_name, info));
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

    }

    @Override
    public Class SelectById(Integer id) {
        Class cls =  this.baseMapper.selectById(id);
       System.out.println(cls);
       return cls;
    }


    @Override
    public List<Class> SelectBatchId(List<Long> ids) {
        List<Class> list = this.baseMapper.selectBatchIds(ids);
        list.forEach(System.out::println);
        return list;
    }

}
