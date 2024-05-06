package com.mu.test;

import com.mu.entity.User;
import com.mu.mapper.UserMapper;
import com.mu.util.getUsersqlSession;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

import static org.apache.ibatis.io.Resources.getResourceAsStream;

public class test {
    public static void main(String[] args) throws IOException {
        getUsersqlSession GetUsersqlSession = new getUsersqlSession();
        SqlSession sqlSession = GetUsersqlSession.getSqlsession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.queryUserByName("zhangsan").getUserPassword());
    }
}
