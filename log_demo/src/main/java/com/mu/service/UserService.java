package com.mu.service;

import com.mu.entity.User;
import com.mu.entity.model.MessageModel;
import com.mu.mapper.UserMapper;
import com.mu.util.StringUtil;
import com.mu.util.getUsersqlSession;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

public class UserService {
    public MessageModel userLogin(String uname, String upwd) throws IOException {

        MessageModel messageModel = new MessageModel();
        User u = new User();
        u.setUserName(uname);
        u.setUserPassword(upwd);
        messageModel.setObject(u);

        if(StringUtil.isEntpy(uname) || StringUtil.isEntpy(upwd)){
            messageModel.setFlag(0);
            messageModel.setMsg("用户名和密码不能为空！");
            return messageModel;
        }

        getUsersqlSession GetUsersqlSession = new getUsersqlSession();
        SqlSession sqlSession = GetUsersqlSession.getSqlsession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.queryUserByName(uname);

        if(user == null){
            messageModel.setFlag(0);
            messageModel.setMsg("用户不存在");
            return messageModel;
        }

        if(!upwd.equals(user.getUserPassword())){
            messageModel.setFlag(0);
            messageModel.setMsg("密码不正确");
            return messageModel;
        }

        messageModel.setObject(user);
        return messageModel;
    }
}
