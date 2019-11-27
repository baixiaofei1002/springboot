package com.itwx.druid.servlet;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * @Author:wx
 * @Date:2019/2/13 11:12
 * 监控视图配置
 */
@WebServlet(urlPatterns = "/druid/*",initParams = {
        @WebInitParam(name="allow",value = ""),//IP白名单（没有设置或者为空，则允许所有访问）
        @WebInitParam(name="deny",value = "192.168.16.111"),//IP黑名单（存在时，deny优于allow）
        @WebInitParam(name="loginUsername",value = "zhuyunlong"),
        @WebInitParam(name="loginPassword",value = "123456"),
        @WebInitParam(name="resetEnable",value = "true")//禁用HTML页面上的Reset All
})
public class DruidStatServlet extends StatViewServlet {
}
