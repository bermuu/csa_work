package com.mu.pojo;

import lombok.Data;

@Data
public class User {
    Integer id;
    String username;
    String passward;
    char gender;
    String addr;
}
