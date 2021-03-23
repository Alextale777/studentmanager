package com.qxc.operate;

import com.qxc.domain.Course;

import java.util.List;
import java.util.Map;

public interface CourseOperate {
    public void Insert(int id, String name, int teacherId, String courseDate, int selectedNum, int maxNum, String info);

    
    public void DeleteById(Integer id);


    public void DeleteBatchId(List<Integer> list);
public void DeleteByMap(Map<String, Object> map);

public Course SelectById(Integer id) ;

public List<Course> SelectBatchId(List<Long> ids);

public List<Course> SelectAll();
}
