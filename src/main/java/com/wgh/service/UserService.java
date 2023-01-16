package com.wgh.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wgh.pojo.User;

/**
 * @ClassNam UserService
 * @Author zuijiaoshangyang
 * @Date 2023/1/13 23:17
 **/
public interface UserService extends IService<User> {
    void insertUserDS1(User user) throws Exception;

    void insertUserDS2(User user);

    void insertUserAll(User user);
}
