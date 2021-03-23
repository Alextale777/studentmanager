package com.qxc.controller;

import com.qxc.Entity.ResultEntity;
import com.qxc.domain.Admin;
import com.qxc.domain.Class;
import com.qxc.operate.ClassOperate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClassController {

    @Autowired
    ClassOperate classOperate;

    @RequestMapping("/selectAllClass")
    public ResultEntity SelectAll(){
        List<Class> list =  classOperate.selectAll();
        ResultEntity resultEntity  = new ResultEntity(0,"获取成功",list);
        return resultEntity;
    }



}
