package com.wgh.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wgh.dao.UserDao;
import com.wgh.pojo.User;
import com.wgh.service.UserService;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Service;

/**
 * @ClassNam UserServiceImpl
 * @Author zuijiaoshangyang
 * @Date 2023/1/13 23:18
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

    @Override
    @DS("ds1")
    public void insertUserDS1(User user) {
        save(user);
        //int i=1/0;
    }

    @Override
    @DS("ds2")
    public void insertUserDS2(User user) {
        save(user);
    }

    @Override
    public void insertUserAll(User user) {
        UserServiceImpl userService = (UserServiceImpl) AopContext.currentProxy();
        userService.insertUserDS1(user);
        userService.insertUserDS2(user);
    }
}
