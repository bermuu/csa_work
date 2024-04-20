package com.mu.mapper;

import com.mu.pojo.User;

import java.util.List;

public interface UserMapper {
     List<User> selectUser();
     void deleteUser(Integer id);
}
