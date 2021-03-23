package com.qxc.controller;

import com.qxc.Entity.ResultEntity;
import com.qxc.domain.Course;
import com.qxc.operate.CourseOperate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseOperate courseOperate;

    @RequestMapping("/selectAllCourse")
    public ResultEntity selectAllCourse(){
        List<Course> list = courseOperate.SelectAll();
        return new ResultEntity(0,"ok",list);
    }


}
