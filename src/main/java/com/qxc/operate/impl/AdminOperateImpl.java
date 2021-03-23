package com.qxc.operate.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qxc.domain.Admin;
import com.qxc.mapper.AdminMapper;
import com.qxc.operate.AdminOperate;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class AdminOperateImpl extends ServiceImpl<AdminMapper, Admin> implements AdminOperate {
    @Override
    public void Insert(Long id, String name, String password) {
        this.baseMapper.insert(new Admin(id,name,password));
    }

    @Override
    public List<Admin> SelectAll() {

        List<Admin> res=baseMapper.selectList(null);
        return  res;
    }

    @Override
    public void DeleteById(Long id) {
        this.baseMapper.deleteById(id);
    }

    @Override
    public void DeleteBatchId(List<Long> list) {
        this.baseMapper.deleteBatchIds(list);
    }

    @Override
    public void DeleteByMap(Map<String, Object> map) {
        this.baseMapper.deleteByMap(map);
    }

    @Override
    public Admin SelectById(Long id) {
        Admin admin = this.baseMapper.selectById(id);
        System.out.println(admin);
        return admin;
    }

    @Override
    public Admin SelectByName(String id) {
        Admin admin = this.baseMapper.selectById(id);
        System.out.println(admin);
        return admin;
    }



    @Override
    public Admin UpdateByID(Admin admin) {
        baseMapper.updateById(admin);
        return admin;
    }

    @Override
    public String UpdateByID(Long id, String name, String password) {
        Admin admin =new Admin(id,name,password);
        int i= baseMapper.updateById(admin);
        if(i==1)
        {
            return "update successfully!";
        }
        else{
            baseMapper.insert(admin);
            return "failed,has inserted,nmsl";
        }
    }

    @Override
    public List<Admin> SelectBatchId(List<Long> ids) {
        List<Admin> list = this.baseMapper.selectBatchIds(ids);
        list.forEach(System.out::println);
        return list;
    }

    @Override
    public List<Admin> SelectMap(Map<String, Object> map) {
        List<Admin> list = this.baseMapper.selectByMap(map);
        return list;
    }

    @Override
    public List<Admin> selectAll() {
        List<Admin> list  = baseMapper.selectList(null);
        return list;
    }


//    @Override
//    public void Insert(Long id, String name, String password) {
//        this.baseMapper.insert(new Admin(id,name,password));
//    }
//
//    @Override
//    public void Dele

}
