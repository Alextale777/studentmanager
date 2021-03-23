package com.qxc.operate;


import com.qxc.domain.Admin;
import com.qxc.domain.Student;

import java.util.List;
import java.util.Map;

public interface StudentOperate {
     void Insert(Integer id,
                 String sn,
                 String username,
                 String password,
                 Integer clazzId,
                 String sex ,
                 String mobile,
                 String qq,
                 String photo);
     List<Student> SelectAll();
     void DeleteBatchId(List<Long> list);
     void DeleteByMap(Map<String,Object> map);
     void  DeleteById(Long id);
     String  UpdateById(Integer id,
                        String sn,
                        String username,
                        String password,
                        Integer clazzId,
                        String sex ,
                        String mobile,
                        String qq,
                        String photo);
     Student SelectById(Long id);

     List<Student> SelectBatchId(List<Long> ids);
     List<Student> SelectMap(Map<String,Object> map);

//    void insert(Student student);
}
