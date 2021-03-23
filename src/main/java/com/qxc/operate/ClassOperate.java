package com.qxc.operate;

import com.qxc.domain.Class;

import java.util.List;
import java.util.Map;

public interface ClassOperate {
    List<Class> selectAll();
    void Insert( Integer id,String cls_name,String info);
    void DeleteById(Integer id);
    void DeleteBatchId(List<Integer> list);
    void DeleteByMap(Map<String,Object> map);
    Class SelectById(Integer id);
    List<Class> SelectBatchId(List<Long> ids);
}
