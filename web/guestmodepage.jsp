<%@ page import="com.salonschedule.DAO.Scheduler" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  com.salonschedule.DAO.User: Den
  Date: 03.01.2019
  Time: 19:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        @import url('https://fonts.googleapis.com/css?family=Roboto+Condensed');
        @import url('https://fonts.googleapis.com/css?family=Asap');
        h1 {
            font-family: 'Roboto Condensed', sans-serif;
            font-size: 18pt; /* Размер шрифта в пунктах */
        }
        h2 {
            font-family: 'Asap', sans-serif;
            font-size: 15pt; /* Размер шрифта в пунктах */
        }
    </style>
</head>
<body>
<%--<h1>${Master.surname}&nbsp;${Master.name}&nbsp;${Master.patronymic}</h1>--%>
<h1>
${Masters[0].getName()}&nbsp;${Masters[0].getSurname()}&nbsp;&nbsp;${Masters[0].getSpeciality()}<br>
    <font size="3" color="green" face="Arial">вакантное время:</font>
    <table border="1">
        <tr>
            <c:forEach var="time" items="${masterFreeTimeId1}">
                <td><c:out value="${time}"/></td>
            </c:forEach>
        </tr>
    </table>
${Masters[1].getName()}&nbsp;${Masters[1].getSurname()}&nbsp;&nbsp;${Masters[1].getSpeciality()}<br>
    <font size="3" color="green" face="Arial">вакантное время:</font>
    <table border="1">
        <tr>
            <c:forEach var="time" items="${masterFreeTimeId2}">
                <td><c:out value="${time}"/></td>
            </c:forEach>
        </tr>
    </table>
${Masters[2].getName()}&nbsp;${Masters[2].getSurname()}&nbsp;&nbsp;${Masters[2].getSpeciality()}<br>
    <font size="4" color="green" face="Arial">вакантное время:</font>
    <table border="1">
        <tr>
            <c:forEach var="time" items="${masterFreeTimeId3}">
                <td><c:out value="${time}"/></td>
            </c:forEach>
        </tr>
    </table>
${Masters[3].getName()}&nbsp;${Masters[3].getSurname()}&nbsp;&nbsp;${Masters[3].getSpeciality()}<br>
    <font size="3" color="green" face="Arial">вакантное время:</font>
    <table border="1">
        <tr>
            <c:forEach var="time" items="${masterFreeTimeId4}">
                <td><c:out value="${time}"/></td>
            </c:forEach>
        </tr>
    </table>
${Masters[4].getName()}&nbsp;${Masters[4].getSurname()}&nbsp;&nbsp;${Masters[4].getSpeciality()}<br>
    <font size="3" color="green" face="Arial">вакантное время:</font>
    <table border="1">
        <tr>
            <c:forEach var="time" items="${masterFreeTimeId5}">
                <td><c:out value="${time}"/></td>
            </c:forEach>
        </tr>
    </table>
${Masters[5].getName()}&nbsp;${Masters[5].getSurname()}&nbsp;&nbsp;${Masters[5].getSpeciality()}<br>
    <font size="3" color="green" face="Arial">вакантное время:</font>
    <table border="1">
        <tr>
            <c:forEach var="time" items="${masterFreeTimeId6}">
                <td><c:out value="${time}"/></td>
            </c:forEach>
        </tr>
    </table>
    <br>
    <a href="/test/masterId1page">${Masters[0].getName()}&nbsp;${Masters[0].getSurname()}</a>
</h1>
</body>
</html>


