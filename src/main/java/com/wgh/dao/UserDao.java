package com.wgh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wgh.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface UserDao extends BaseMapper<User> {

}
