package com.mu.mapper;

import com.mu.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper{
    public List<User> selectUser(){
        return getSqlSession().getMapper(UserMapper.class).selectUser();
    }
}
