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
logged secess!
${Masters[0].getName()}&nbsp;${Masters[0].getSurname()}&nbsp;&nbsp;${Masters[0].getSpeciality()}<br>
<font size="4" color="green" face="Arial">вакантное время:</font>
<table border="1">
    <tr>
        <c:forEach var="time" items="${masterFreeTimeId1.getTimeObj()}">
            <td><c:out value="${time.getTimeInterval()}"/></td>
        </c:forEach>
    </tr>
</table>
</body>
</html>
