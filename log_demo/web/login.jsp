<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <title>用户登录</title>
</head>

<body>

<div style="text-align: center">
    <form action="/login" method="post" id="loginForm">
        姓名：<input type="text" name="uname" id="uname" value="${MessageModel.object.userName}"> <br>
        密码：<input type="password" name="upwd" id="upwd" value="${MessageModel.object.userPassword}”> <br>
        <span id= "msg" style= "font-size: 12px;color: red" > ${MessageModel.msg} </span> <br>
        <button type="button" id="loginBtn">登录</button>
        <button type="button">注册</button>
    </form>
</div>
</body>
<%--引入jquery的js--%>
<script type="text/javascript" src="js/jquery-3.4.1.js"></script>
<script type="text/javascript">
    $("#loginBtn").click(function(){
        var uname = $("#uname").val();
        var upwd = $("#upwd").val();
        if(isEmpty(uname)){
            $("#msg").html("用户姓名不可为空！");
            return;
        }
        if(isEmpty(upwd)){
            $("#msg").html("用户密码不可为空！");
            return;
        }
        $("#loginForm").submit();
    });

    function isEmpty(str){
        if(str == null || str.trim() === ""){
            return true
        }
        return false;
    }
</script>
</html>
