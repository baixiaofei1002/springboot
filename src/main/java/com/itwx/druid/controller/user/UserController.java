package com.itwx.druid.controller.user;

import com.alibaba.fastjson.JSONArray;
import com.itwx.druid.service.user.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@Api(value="用户controller",tags={"用户操作接口"})
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUserInfo")
    @ApiOperation("通过用户ID获取用户信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "String", paramType="query")
    public String getUserInfo(String id){
        List list = userService.getUserInfo(id);
        return JSONArray.toJSONString(list);
    }

    @DeleteMapping("/deleteUser")
    @ApiOperation("通过用户ID删除用户信息(delte类型ajax部分浏览器不兼容这里只做展示实际使用推荐post)")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "String", paramType="query")
    public Integer deleteUser(String id){
        return userService.deleteUser(id);
    }

    @PutMapping("/addUser")
    @ApiOperation("录入ID,nanme新增到用户信息(put类型ajax部分浏览器不兼容这里只做展示实际使用推荐post)")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "String", paramType="query"),
            @ApiImplicitParam(name = "name", value = "新名字", required = true, dataType = "String",paramType="query")
    })
    public Integer addUser(String id,String name){
        return userService.addUser(id,name);
    }

    @PostMapping("/updateUserName")
    @ApiOperation("通过用户ID更改用户名称信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "String", paramType="query"),
            @ApiImplicitParam(name = "name", value = "新名字", required = true, dataType = "String",paramType="query")
    })
    public Integer updateUserName(String id,String name){
        return userService.updateUserName(id,name);
    }
}
