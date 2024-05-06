package com.mu.entity.model;
/*
* 消息模型对象
* 状态码
*   1成功 0失败
*   提示消息
*   回写对象*/
public class MessageModel {
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    private Integer flag=1;
    private String msg = "成功";
    private Object object;
}
