package com.qxc.controller;

import com.qxc.Entity.ResultEntity;
import com.qxc.domain.Teacher;
import com.qxc.operate.TeacherOperate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeacherController {
    @Autowired
    TeacherOperate  teacherOperate;

    @RequestMapping("/selectAllTea")
    public ResultEntity selectAllTeacher(){
        List<Teacher> list = teacherOperate.SelectAll();
        return  new ResultEntity(0,"ok",list);
    }
}
