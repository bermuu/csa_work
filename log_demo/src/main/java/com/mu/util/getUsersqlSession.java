package com.mu.util;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

import static org.apache.ibatis.io.Resources.getResourceAsStream;

public class getUsersqlSession {
    public static SqlSession getSqlsession() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.sqlsession的获取
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }
}
