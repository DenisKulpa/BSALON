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
<jsp:include page="WEB-INF/jspInclude/SokolovaNataStatikInfo.jsp" />
<br>
<form action="loggedFormEvent">
    <label>Выберете услугу:</label>
    <select name="serviceKind">
        <option value="1" >Снятие гель-лака (15 мин.)</option>
        <option value="2" >Укрепление ногтей гелем (15 мин.)</option>
        <option value="3" >Покрытие гель-лак (30 мин.)</option>
        <option value="4" >Педикюр Экспресс (30 мин.)</option>
        <option value="5" >Укрепление (30 мин.)</option>
        <option value="6" >Педикюр с покрытием (30 мин.)</option>
        <option value="7" >Покрытие гель-лак (30 мин.)</option>
        <option value="8" >Педикюр без покрытия (45 мин.)</option>
        <option value="9" >Педикюр мужской (45 мин.)</option>
        <option value="10" >Классический педикюр (45 мин.)</option>
        <option value="11" >Аппаратный педикюр (45 мин.)</option>
        <option value="12" >Израильский педикюр (60 мин.)</option>
        <option value="13" >Педикюр бразильский (60 мин.)</option>
        <option value="14" >Педикюр с покрытием (60 мин.)</option>
        <option value="15" >Педикюр комбинированный (60 мин.)</option>
        <option value="16" >Укрепление + выравнивание ногтевой пластины (60 мин.)</option>
        <option value="17" >Аппаратный педикюр + покрытием гель-лак (90 мин.)</option>

    </select><br><br>

    <label>Выберете время для записи:</label>
    <select name="timeId">
        <c:forEach var="time" items="${masterFreeTimeId1.getTimeObj()}">
            <option value="${time.getId()}" >${time.getTimeInterval()}</option>
        </c:forEach>
    </select><br><br>
    <%--Напомнить:<input type="text" name="remind"><br>--%>
    <input type="submit" value="Записаться">
    <input type="hidden" name="masterIdBusy" value="id1busy">
    <input type="hidden" name="masterIdFree" value="id1free">
    <input type="hidden" name="masterIdService" value="id1service">
</form>

</body>
</html>
