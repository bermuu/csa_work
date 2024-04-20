package com.mu.pojo2;

public class UserServiceProxy implements UserService{
    UserServiceImpl userService = new UserServiceImpl();

    //使用set方法注入
    public void setUserServiceProxy(UserServiceImpl userService) {
        this.userService = userService;
    }


    public void add() {
        log("add");
        userService.add();
    }

    public void delete(){
        log("delete");
        userService.delete();
    }

    public void update(){
        log("update");
        userService.update();
    }

    public void query(){
        log("query");
        userService.query();
    }
    //日志方法
    public void log(String msg){
        System.out.println("使用了"+msg+"方法");
    }
}
