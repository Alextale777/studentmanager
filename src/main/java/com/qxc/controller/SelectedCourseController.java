package com.qxc.controller;

import com.qxc.Entity.ResultEntity;
import com.qxc.domain.SelectedCourse;
import com.qxc.operate.SelectedOperate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class SelectedCourseController {
    @Autowired
    SelectedOperate selectedOperate;

    @RequestMapping("/queryCourse")
    public ResultEntity SelectAll(){
        List<SelectedCourse> list = selectedOperate.Select_All();
        return new ResultEntity(0,"ok",list);
    }

    @RequestMapping("/sc")
    public ResultEntity SelectMap(String courseId,String v){
        HashMap<String,Object> map =new HashMap<>();
//        Integer i=Integer.parseInt(v);
        map.put(courseId,v);
        List<SelectedCourse> list = selectedOperate.SelectMap(map);

        return new ResultEntity(0,"ok",list);


    }

}
