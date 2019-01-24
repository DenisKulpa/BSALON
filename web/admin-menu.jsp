<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  com.salonschedule.DAO.User: Den
  Date: 11.01.2019
  Time: 13:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        body{background-color: lightgoldenrodyellow;}

        @import url('https://fonts.googleapis.com/css?family=Roboto+Condensed');
        @import url('https://fonts.googleapis.com/css?family=Asap');
        h1 {
            font-family: 'Roboto Condensed', sans-serif;
            font-size: 18pt; /* Размер шрифта в пунктах */
        }
    </style>
</head>
<body>
<h3>Hello Admin!</h3> <h2><a href="/bsalon/logout" style="float: left">Logout</a></h2>
<table border="1" align="center">
    <tr>
        <%--<th>id</th>--%>
        <th>Time</th>
        <th>Соколова Н.В.</th><th>&nbsp;</th>
        <th>Лебедева О.В.</th><th>&nbsp;</th>
        <th>Петрова И.Л.</th><th>&nbsp;</th>
        <th>Новиков О.О.</th><th>&nbsp;</th>
        <th>Зайцев Д.Н.</th><th>&nbsp;</th>
        <th>Павленко Л.А.</th><th>&nbsp;</th>
    </tr>
    <c:forEach items="${commonSchedule}" var="commonSchedule">
        <tr>
            <%--<td>${commonSchedule.getId()}--%>
            <td>${commonSchedule.getTimeInterval()}</td>
            <td>${commonSchedule.getId1service()}</td>
            <td><a href="delete?idService=id1service&id=${commonSchedule.getId()}" ><img src="Delete.png"></a></td>
            <td>${commonSchedule.getId2service()}</td>
            <td><a href="delete?idService=id2service&id=${commonSchedule.getId()}" ><img src="Delete.png"></a></td>
            <td>${commonSchedule.getId3service()}</td>
            <td><a href="delete?idService=id3service&id=${commonSchedule.getId()}" ><img src="Delete.png"></a></td>
            <td>${commonSchedule.getId4service()}</td>
            <td><a href="delete?idService=id4service&id=${commonSchedule.getId()}" ><img src="Delete.png"></a></td>
            <td>${commonSchedule.getId5service()}</td>
            <td><a href="delete?idService=id5service&id=${commonSchedule.getId()}" ><img src="Delete.png"></a></td>
            <td>${commonSchedule.getId6service()}</td>
            <td><a href="delete?idService=id6service&id=${commonSchedule.getId()}" ><img src="Delete.png"></a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
