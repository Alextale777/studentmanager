package com.qxc.operate;

import com.qxc.domain.SelectedCourse;

import java.util.List;
import java.util.Map;

public interface SelectedOperate {
    void Insert( Integer id,Integer studentId,Integer courseId);
    void DeleteById(Integer id);
    void DeleteBatchId(List<Integer> list);
    SelectedCourse SelectById(String id);
    List<SelectedCourse> SelectBatchId(List<Integer> ids);
    List<SelectedCourse> Select_All();
    List<SelectedCourse> SelectMap(Map map);

}
