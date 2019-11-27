package com.itwx.druid.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @Author:wx
 * @Date:2019/2/13 11:44
 */
@Mapper
public interface ISqlMapper {

    Integer insert(String statement);
    Integer delete(String statement);
    Integer update(String statement);
    List<Map<String, Object>> findList(String statement);
    Map<String, Object> findOne(String statement);

}
