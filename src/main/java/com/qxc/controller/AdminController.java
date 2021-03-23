package com.qxc.controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.qxc.Entity.ResultEntity;
import com.qxc.domain.Admin;
import com.qxc.Entity.DeleteEntity;
import com.qxc.operate.AdminOperate;
import com.qxc.tool.Aes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;



@RestController
public class AdminController {
    @Autowired
    AdminOperate adminOperate;

    @RequestMapping("/loginAdmin")
    public ResultEntity loginAdmin(String username,String password) throws Exception {
        username = Aes.decrypt(username);
        password = Aes.decrypt(password);
        Admin admin = adminOperate.SelectByName(username);
        if(admin==null){
            return new ResultEntity(1,"没这个人，跟你妈一样，没了",false);
        }
        if(password.equals(admin.getPassword()))
        {
            ResultEntity resultEntity  = new ResultEntity(0,"获取成功",true);
            return resultEntity;
        }
        else {
            ResultEntity resultEntity  = new ResultEntity(1,"密码都记不住，你妈死了",false);
            return  resultEntity;


        }


    }


    @RequestMapping("/selectAllAdmin")
    public ResultEntity SelectAll(){
        List<Admin> list =  adminOperate.selectAll();
        list.toString();



        //Aes.encrypt(list,)
        ResultEntity resultEntity  = new ResultEntity(0,"获取成功",list);
        return resultEntity;
    }

    @RequestMapping("/insertAdmin")
    public ResultEntity insert(Long id,String name,String password){
        adminOperate.Insert(id,name,password);
        ResultEntity resultEntity=new ResultEntity(0,"插入id成功","nmsl");

        return resultEntity;
    }

    @RequestMapping("/deleteAdmin")
    public ResultEntity deleteById(Long id){
        adminOperate.DeleteById(id);
        ResultEntity resultEntity=new ResultEntity(0,"删除id成功","nmsl");
        return resultEntity;
    }

    @RequestMapping("/deleteAdminList")
    public ResultEntity deleteBatchId(@RequestBody DeleteEntity deleteEntity){
        adminOperate.DeleteBatchId(deleteEntity.getIds());
        ResultEntity resultEntity=new ResultEntity(0,"删除List成功","nmsl");
        return resultEntity;
    }

    @RequestMapping("/deleteAdminMap")
    public ResultEntity deleteMap(@RequestBody DeleteEntity deleteEntity){
        adminOperate.DeleteByMap(deleteEntity.getMap());
        ResultEntity resultEntity=new ResultEntity(0,"删除Map成功","nmsl");

        return resultEntity;
    }

    @RequestMapping("/selectAdmin")
    public ResultEntity selectById(Long id){
        Admin admin=adminOperate.SelectById(id);
        ResultEntity resultEntity=new ResultEntity(0,"ok",admin);
        return resultEntity;
    }

    @RequestMapping("/updateAdmin")
    public ResultEntity update(Long id ,String name, String password)
    {
        String ret =  adminOperate.UpdateByID(id,name,password);
        ResultEntity resultEntity = new ResultEntity(0,"已更新",ret);
        return resultEntity;
    }


}
