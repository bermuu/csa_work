package com.mu.mapper;

import com.mu.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {


    public List<User> selectUser(){

        return getSqlSession().getMapper(UserMapper.class).selectUser();
    }

    public void deleteUser(Integer id){
        System.out.println("删除了id是"+id);
        getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
