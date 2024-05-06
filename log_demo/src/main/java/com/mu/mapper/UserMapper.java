package com.mu.mapper;

import com.mu.entity.User;

/*用户接口类
* */
public interface UserMapper {
    public User queryUserByName(String userName);
}
