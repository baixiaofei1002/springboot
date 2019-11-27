package com.itwx.druid.service.iSql;

import java.util.List;
import java.util.Map;


public interface ISqlService {
    Integer insert(String statement);
    Integer delete(String statement);
    Integer update(String statement);
    List<Map<String, Object>> findList(String statement);
    Map<String, Object> findOne(String statement);
}
