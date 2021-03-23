package com.qxc.operate.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qxc.domain.Admin;
import com.qxc.domain.Student;
import com.qxc.mapper.StudentMapper;
import com.qxc.operate.StudentOperate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StudentOperateImpl extends ServiceImpl<StudentMapper, Student> implements StudentOperate{
    @Override
    public void Insert(Integer id,
                       String sn,
                       String username,
                       String password,
                       Integer clazzId,
                       String sex ,
                       String mobile,
                       String qq,
                       String photo) {
        this.baseMapper.insert(new Student(id,sn,username,password,clazzId,sex,mobile,qq,photo));
    }

    @Override
    public List<Student> SelectAll() {
        List<Student> stu = baseMapper.selectList(null);
        return  stu;
    }


    @Override
    public void DeleteBatchId(List<Long> list) {
        this.baseMapper.deleteBatchIds(list);
    }

    @Override
    public void DeleteByMap(Map<String, Object> map) {
        this.baseMapper.deleteByMap(map);
    }

    @Override
    public void DeleteById(Long id) {
        this.baseMapper.deleteById(id);
    }

    @Override
    public String UpdateById(Integer id,
                           String sn,
                           String username,
                           String password,
                           Integer clazzId,
                           String sex ,
                           String mobile,
                           String qq,
                           String photo) {
        Student student1 = new Student(id,sn,username,password,clazzId,sex,mobile,qq,photo);
        int i= baseMapper.updateById(student1);
        if(i==1)
        {
            return "update successfully!";
        }
        else{
            baseMapper.insert(student1);
            return "failed,has inserted,nmsl";
        }
    }

    @Override
    public Student SelectById(Long id) {
        Student student = this.baseMapper.selectById(id);
        System.out.println(student);
        return student;
    }



    @Override
    public List<Student> SelectBatchId(List<Long> ids) {
        List<Student> list = this.baseMapper.selectBatchIds(ids);
        list.forEach(System.out::println);
        return list;
    }

    @Override
    public List<Student> SelectMap(Map<String, Object> map) {
        List<Student> list = this.baseMapper.selectByMap(map);
        return list;
    }
//    public void Insert(int id, String sn, String username, String password, int clazzId, String sex, String mobile, String qq, String photo) {
//        this.baseMapper.insert(new Student(id,sn,username,password,clazzId,sex,mobile,qq,photo));
//    }
}
