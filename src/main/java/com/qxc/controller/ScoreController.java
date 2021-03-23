package com.qxc.controller;

import com.qxc.Entity.ResultEntity;
import com.qxc.domain.Score;
import com.qxc.domain.SelectedCourse;
import com.qxc.operate.ScoreOperate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ScoreController {
    @Autowired
    ScoreOperate scoreOperate;

    @RequestMapping("/SelectScore")
    public  ResultEntity SelectAll(){
        List<Score> list = scoreOperate.SelectAll();
        return new ResultEntity(0,"ok",list);
    }

}
