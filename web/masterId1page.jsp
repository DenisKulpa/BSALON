<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Den
  Date: 13.01.2019
  Time: 20:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="WEB-INF/jspInclude/SokolovaNataStatikInfo.jsp" />
<br>
<form action="loggedFormEvent">
    <label>Выберете услугу:</label>
    <select name="service">
        <option value="1" >Классический педикюр</option>
        <option value="2" >Педикюр без покрытия</option>
        <option value="3" >Педикюр с покрытием</option>
        <option value="4" >Покрытие гель-лак</option>
        <option value="5" >Снятие гель-лака</option>
        <option value="6" >Аппаратный педикюр + покрытием гель-лак</option>
    </select><br>
    <label>Выберете время:</label>
    <select name="time">
        <option value="1"  >09:30</option>
        <option value="2" >09:45</option>
        <option value="3" >10:00</option>
        <option value="4" >10:15</option>
        <option value="5" >10:30</option>
        <option value="6" >10:45</option>
        <option value="7" >11:00</option>
        <option value="8" >11:15</option>
        <option value="9" >11:30</option>
        <option value="10" >11:45</option>
        <option value="11" >12:00</option>
        <option value="12" >13:00</option>
        <option value="13" >13:15</option>
        <option value="14" >13:30</option>
        <option value="15" >13:45</option>
        <option value="16" >14:00</option>
        <option value="17" >14:15</option>
        <option value="18" >14:30</option>
        <option value="19" >14:45</option>
        <option value="20" >15:00</option>
        <option value="21" >15:15</option>
        <option value="22" >15:30</option>
        <option value="23" >15:45</option>
        <option value="24" >16:00</option>
        <option value="25" >16:15</option>
        <option value="26" >16:30</option>
        <option value="27" >16:45</option>
        <option value="28" >17:00</option>
        <option value="29" >17:15</option>
        <option value="30" >17:30</option>

    </select><br>
    Время: <input type="text" name="time"><br>
    Напомнить:<input type="text" name="remind"><br>
    <input type="submit" value="Отправить">
</form>

</body>
</html>
