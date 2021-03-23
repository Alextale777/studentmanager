package com.qxc.operate;

import com.qxc.domain.Admin;
import com.qxc.domain.Teacher;

import java.util.List;
import java.util.Map;

public interface TeacherOperate {


    void Insert( int id,
                 String sn,
                 String username,
                 String password,
                 int classId,
                 String sex,
                 String mobile,
                 String qq,
                 String photo);
    void DeleteById(Long id);
    void DeleteBatchId(List<Integer> list);
    Teacher SelectById(Integer id);
    List<Teacher> SelectBatchId(List<Integer> ids);
    List<Teacher> SelectAll();

}
