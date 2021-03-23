package com.qxc.operate.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qxc.domain.Admin;
import com.qxc.domain.Teacher;
import com.qxc.mapper.TeacherMapper;
import com.qxc.operate.TeacherOperate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TeacherOperateImpl  extends ServiceImpl<TeacherMapper, Teacher> implements TeacherOperate {
    @Override
    public void Insert(int id, String sn, String username, String password, int classId, String sex, String mobile, String qq, String photo) {
        baseMapper.insert(new Teacher(id,sn,username,password,classId,sex,mobile,qq,photo));
    }

    @Override
    public void DeleteById(Long id) {
        baseMapper.deleteById(id);
    }

    @Override
    public void DeleteBatchId(List<Integer> list) {
        baseMapper.deleteBatchIds(list);
    }

    @Override
    public Teacher SelectById(Integer id) {
        Teacher teacher = baseMapper.selectById(id);
        return teacher;
    }

    @Override
    public List<Teacher> SelectBatchId(List<Integer> ids) {
        List<Teacher> list = baseMapper.selectBatchIds(ids);
        return list;
    }

    @Override
    public List<Teacher> SelectAll() {
        List<Teacher> list = baseMapper.selectList(null);
        return  list;
    }
}
