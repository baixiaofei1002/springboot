package com.itwx.druid.service.user;

import com.itwx.druid.dao.ISqlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


@Service
public class UserService {

    @Autowired(required = false)
    private ISqlMapper iSqlMapper;

    @Transactional
    public Integer addUser(String id,String name){
        return iSqlMapper.insert("INSERT INTO userinfo(userid,username)VALUES('"+id+"','"+name+"')") ;
    }

    @Transactional
    public Integer deleteUser(String id){
        return iSqlMapper.delete("DELETE FROM userinfo WHERE userid='"+id+"'") ;
    }

    @Transactional
    public Integer updateUserName(String id,String name){
        return iSqlMapper.update("UPDATE userinfo SET username='"+name+"' WHERE userid='"+id+"'");
    }


    public List<Map<String, Object>> getUserInfo(String id){
        return iSqlMapper.findList("SELECT * FROM userinfo WHERE userid='"+id+"'");
    }


}
