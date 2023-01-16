package com.wgh.controller;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.dynamic.datasource.annotation.DSTransactional;
import com.wgh.pojo.User;
import com.wgh.service.UserService;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    /**
     *
     * 如何连接多个数据库? 实现spring多数据源配置！
     * @param id
     * @return
     */
    @GetMapping("/v1/user/{id}")
    @DS("ds1")
    public User getById1(@PathVariable String id) {
        return userService.getById(id);
    }

    @GetMapping(value = "/v2/user/{id}")
    @DS("ds2")
    public User getById2(@PathVariable String id) {
        return userService.getById(id);
    }

    @GetMapping("/insertUserAll")
    @DSTransactional
    public void insertUserAll(@RequestParam("name") String name, @RequestParam("age") Integer age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        System.out.println(user);
        userService.insertUserAll(user);
    }

}
