package com.mu.servse;

import com.mu.dao.UserDao;
import com.mu.dao.UserDaoSqlimpl;
import com.mu.dao.UserDaoimpl;

public class UserServiceilpl implements UserService{
    //根据用户需求的不同，需要手动更改服务层的代码
    /*private UserDao userDao = new UserDaoSqlimpl();
    public void getUser(){userDao.getUser();}*/
    //利用set进行动态数值注入
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void getUser(){userDao.getUser();}
}
