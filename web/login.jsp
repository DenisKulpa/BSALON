<%--
  Created by IntelliJ IDEA.
  com.salonschedule.DAO.User: Den
  Date: 06.01.2019
  Time: 18:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>loginpage</title>
</head>
<body>
<style>
    body{background-color: lightgoldenrodyellow;}
</style>
<div align="center">
    <h1>Вход в систему</h1><br>
    <form method="post" action="">
        <input type="text" required placeholder="login" name="login"><br><br>
        <input type="password" required placeholder="password" name="password"><br><br>
        <input class="button" type="submit" value="Войти">
    </form>
    <form method="post" action="">
        <input class="button" type="submit" value="Создать аккаунт">
    </form>
</div>
</body>
</html>
