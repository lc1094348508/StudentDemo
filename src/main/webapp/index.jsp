<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="common/inc.jsp" %>
<html>
<head>
  <link rel="stylesheet" href="${ctx}/static/bootstrap/css/bootstrap.min.css">
  <script src="${ctx}/static/js/jquery-1.12.3.min.js"></script>
  <script src="${ctx}/static/bootstrap/js/bootstrap.min.js"></script>
  <script src="${ctx}/static/bootstrap/js/bootstrap.file-input.js"></script>
  <title>首页 - 在线考试</title>
</head>
<body>
<div class="container">
  <h1 class="text-center">首页</h1>
  <div class="container col-lg-4 col-lg-offset-4">
    <form class="form" action="/student/login" method="post">
      <input class="form-control" type="text" name="email" placeholder="email" value="student@qq.com"><br>
      <input class="form-control" type="password" name="password" placeholder="password" value="123"><br>
      <button class="btn btn-lg btn-primary btn-block">学生登陆</button>
    </form>
  </div>
  <div class="container col-lg-4 col-lg-offset-4">

    ${requestScope.message}
    <hr>
    <a class="col-lg-offset-5" href="${ctx}/class/queryAll">学生注册</a>
    <hr>
    <a class="col-lg-offset-5" href="/admin/login.jsp">管理员登录</a><br>
    <a class="col-lg-offset-5" href="/teacher/login.jsp">教师登录</a><br>
    <a class="col-lg-offset-5" href="/assistant/login.jsp">教务登录</a><br>
  </div>
</div>
</body>
</html>