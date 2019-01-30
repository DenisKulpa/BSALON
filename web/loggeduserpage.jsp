<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Den
  Date: 13.01.2019
  Time: 18:58
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
<h3>Hello Viktor!</h3> <h3><a href="/bsalon/logout" style="float: right">Logout</a></h3>
<h1>
    <a href="/bsalon/masterId1page">${Masters[0].getName()}&nbsp;${Masters[0].getSurname()}</a>&nbsp;&nbsp;${Masters[0].getSpeciality()}<br>
    <font size="4" color="green" face="Arial">вакантное время:</font>
    <table border="1">
        <tr>
            <c:forEach var="time" items="${masterFreeTimeId1.getTimeObj()}">
                <td><c:out value="${time.getTimeInterval()}"/></td>
            </c:forEach>
        </tr>
    </table>
    ${Masters[1].getName()}&nbsp;${Masters[1].getSurname()}&nbsp;&nbsp;${Masters[1].getSpeciality()}<br>
    <font size="4" color="green" face="Arial">вакантное время:</font>
    <table border="1">
        <tr>
            <c:forEach var="time" items="${masterFreeTimeId2.getTimeObj()}">
                <td><c:out value="${time.getTimeInterval()}"/></td>
            </c:forEach>
        </tr>
    </table>
    ${Masters[2].getName()}&nbsp;${Masters[2].getSurname()}&nbsp;&nbsp;${Masters[2].getSpeciality()}<br>
    <font size="4" color="green" face="Arial">вакантное время:</font>
    <table border="1">
        <tr>
            <c:forEach var="time" items="${masterFreeTimeId3.getTimeObj()}">
                <td><c:out value="${time.getTimeInterval()}"/></td>
            </c:forEach>
        </tr>
    </table>
    ${Masters[3].getName()}&nbsp;${Masters[3].getSurname()}&nbsp;&nbsp;${Masters[3].getSpeciality()}<br>
    <font size="4" color="green" face="Arial">вакантное время:</font>
    <table border="1">
        <tr>
            <c:forEach var="time" items="${masterFreeTimeId4.getTimeObj()}">
                <td><c:out value="${time.getTimeInterval()}"/></td>
            </c:forEach>
        </tr>
    </table>
    ${Masters[4].getName()}&nbsp;${Masters[4].getSurname()}&nbsp;&nbsp;${Masters[4].getSpeciality()}<br>
    <font size="4" color="green" face="Arial">вакантное время:</font>
    <table border="1">
        <tr>
            <c:forEach var="time" items="${masterFreeTimeId5.getTimeObj()}">
                <td><c:out value="${time.getTimeInterval()}"/></td>
            </c:forEach>
        </tr>
    </table>
    ${Masters[5].getName()}&nbsp;${Masters[5].getSurname()}&nbsp;&nbsp;${Masters[5].getSpeciality()}<br>
    <font size="4" color="green" face="Arial">вакантное время:</font>
    <table border="1">
        <tr>
            <c:forEach var="time" items="${masterFreeTimeId6.getTimeObj()}">
                <td><c:out value="${time.getTimeInterval()}"/></td>
            </c:forEach>
        </tr>
    </table>
    <br>
    <%--<a href="/bsalon/masterId1page">${Masters[0].getName()}&nbsp;${Masters[0].getSurname()}</a>--%>
</h1>
<%response.setIntHeader("Refresh", 30);%>
</body>
</html>
