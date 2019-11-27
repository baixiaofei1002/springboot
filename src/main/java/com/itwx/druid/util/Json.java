package com.itwx.druid.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Json {

    //字符串转JSONArray
    public static JSONArray toJA(String str){
        JSONArray jsonArray = new JSONArray();
        try {
            if("".equals(str)){
                str="[]";
            }
            jsonArray = JSONArray.parseArray(str);
            return jsonArray;
        } catch (Exception e) {
            log.error("JSONArray转换失败:"+str);
            return null;
        }

    }


    //字符串转JSONObject
    public static  JSONObject toJO(String str){
        JSONObject jsonObject = new JSONObject();
        try {
            if("".equals(str)){
                str="{}";
            }
            jsonObject = JSONObject.parseObject(str);
            return jsonObject;
        } catch (Exception e) {
            log.error("JSONOrray转换失败:"+str);
            return jsonObject;
        }

    }
}
