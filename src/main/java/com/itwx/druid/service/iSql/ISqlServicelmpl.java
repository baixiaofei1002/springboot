package com.itwx.druid.service.iSql;

import com.itwx.druid.dao.ISqlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import java.util.List;
import java.util.Map;


@Service
public class ISqlServicelmpl implements ISqlService {

    @Autowired(required = false)
    private ISqlMapper iSqlMapper;

    @Transactional
    public Integer insert(String sql){
        return iSqlMapper.insert(sql) ;
    }

    @Transactional
    public Integer delete(String sql){
        return iSqlMapper.delete(sql) ;
    }

    @Transactional
    public Integer update(String sql){
        return iSqlMapper.update(sql) ;
    }


    public List<Map<String, Object>> findList(String sql){
        return iSqlMapper.findList(sql);
    }

    public Map<String, Object> findOne(String sql){
        Map<String, Object> data = iSqlMapper.findOne(sql);
        return data;
    };
}
