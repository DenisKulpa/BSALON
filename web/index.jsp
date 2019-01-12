<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.salonschedule.DAO.Main" %><%--
  Created by IntelliJ IDEA.
  com.salonschedule.DAO.User: Den
  Date: 18.12.2018
  Time: 18:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>user-page</title>
  </head>
  <body>
  ${Scheduler.getId()}
  <table border="1">
    <tr>
      <c:forEach var="time" items="${Scheduler.timeInterval}">
        <td><c:out value="${time}"/></td>
      </c:forEach>
    </tr>
  </table>
  <table border="1">        schedulerTime
      <tr>
          <c:forEach var="time" items="${schedulerTime}">
              <td><c:out value="${time}"/></td>
          </c:forEach>
      </tr>
  </table>
  </body>
</html>
