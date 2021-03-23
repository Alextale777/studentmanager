package com.qxc.operate;


import com.qxc.domain.Admin;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AdminOperate  {
     void Insert( Long id,String name,String password);
     List<Admin> SelectAll();
     void DeleteById(Long id);
     void DeleteBatchId(List<Long> list);
     void DeleteByMap(Map<String,Object> map);
     Admin SelectById(Long id);
     Admin SelectByName(String id);

     Admin UpdateByID(Admin admin);
     String UpdateByID(Long id, String name, String password);

     List<Admin> SelectBatchId(List<Long> ids);
     List<Admin> SelectMap(Map<String,Object> map);
     List<Admin> selectAll();
}
