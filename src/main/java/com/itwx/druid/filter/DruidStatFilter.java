package com.itwx.druid.filter;


import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * @Author:wx
 * @Date:2019/2/13 11:03
 * 配置监控拦截器
 */
@WebFilter(filterName = "druidWebStatFilter",
        urlPatterns = "/*",
        initParams = {
                //定义可以忽略的资源文件
                @WebInitParam(name="exclusion",value = "*.js,*gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")
        })
public class DruidStatFilter extends WebStatFilter {
}