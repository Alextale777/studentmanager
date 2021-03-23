package com.qxc.operate;

import com.qxc.domain.Course;
import com.qxc.domain.Score;

import java.util.List;
import java.util.Map;

public interface ScoreOperate {
    void Insert(
             Integer id,
             Integer studentId,
             Integer courseId,
             double score,
             String remark);
    void DeleteById(Integer id);
    void DeleteBatchId(List<Integer> list);
    void DeleteByMap(Map<String,Object> map);
    Score SelectById(Integer id);
    List<Score> SelectBatchId(List<Long> ids);
    List<Score> SelectAll();
}
