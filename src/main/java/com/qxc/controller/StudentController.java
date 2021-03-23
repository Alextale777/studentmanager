package com.qxc.controller;

import com.qxc.Entity.DeleteEntity;
import com.qxc.Entity.ResultEntity;
import com.qxc.domain.Admin;
import com.qxc.domain.Student;
import com.qxc.operate.AdminOperate;
import com.qxc.operate.StudentOperate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class StudentController {
    @Autowired
    StudentOperate studentOperate;

    @RequestMapping("/selectAllStudent")
    public ResultEntity selectAll()
    {
        List<Student> students = studentOperate.SelectAll();
        return new ResultEntity(0,"查找所有",students);
    }

    @RequestMapping("/insertStudent")
    public ResultEntity insert(Integer id,
                         String sn,
                         String username,
                         String password,
                         Integer clazzId,
                         String sex ,
                         String mobile,
                         String qq,
                         String photo){
        studentOperate.Insert(id,sn,username,password,clazzId,sex,mobile,qq,photo);
        ResultEntity resultEntity=new ResultEntity(0,"插入成功","nmsl");
        return resultEntity;
    }

    @RequestMapping("/updateStudent")
    public ResultEntity update(Integer id,
                               String sn,
                               String username,
                               String password,
                               Integer clazzId,
                               String sex ,
                               String mobile,
                               String qq,
                               String photo){
        String  res = studentOperate.UpdateById(id,sn,username,password,clazzId,sex,mobile,qq,photo);
        ResultEntity resultEntity=new ResultEntity(0,"更新成功",res);
        return resultEntity;
    }


    @RequestMapping("/deleteStudentById")
    public ResultEntity deleteById(Long id){
        studentOperate.DeleteById(id);
        ResultEntity resultEntity=new ResultEntity(0,"按照id删除成功","nmsl");
        return resultEntity;
    }

    @RequestMapping("/deleteStudentBatchId")
    public ResultEntity deleteBatchId(@RequestBody DeleteEntity deleteEntity){
        studentOperate.DeleteBatchId(deleteEntity.getIds());
        ResultEntity resultEntity=new ResultEntity(0,"删除List成功","nmsl");
        return resultEntity;
    }

    @RequestMapping("/deleteStudentMap")
    public ResultEntity deleteMap( Map<String,Object> map){
        studentOperate.DeleteByMap(map);
        ResultEntity resultEntity=new ResultEntity(0,"删除Map成功","nmsl");
        return resultEntity;
    }

    @RequestMapping("/selectStudentById")
    public ResultEntity selectById(Long id){
        Student student=studentOperate.SelectById(id);
        ResultEntity resultEntity=new ResultEntity(0,"ok",student);
        return resultEntity;
    }

    @RequestMapping( "/selectStudentByIds")
    public ResultEntity selectByBatchId(@RequestParam List<Long> ids){
        List<Student> student=studentOperate.SelectBatchId(ids);
        ResultEntity resultEntity=new ResultEntity(0,"ok",student);
        return resultEntity;
    }
}
