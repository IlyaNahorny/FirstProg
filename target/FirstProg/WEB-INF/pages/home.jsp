<%--
  Created by IntelliJ IDEA.
  User: dulik
  Date: 13.04.2016
  Time: 19:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<jsp:useBean id="localBean" scope="application" class="localBean" >--%>
<%--&lt;%&ndash; Every time we create the bean, initialize the string &ndash;%&gt;--%>
<%--<jsp:setProperty name="localBean" property="value" value="World" />--%>
<%--</jsp:useBean>--%>
<html>
<head>
    <title>Home</title>
</head>
<body>

<c:forEach items="${users}" var="user">
    <div>
        <a>${user.id}</a>
        <a>${user.firstName}</a>
        <a>${user.lastName}</a>
        <a>${user.city}</a>
        <a>${user.age}</a>
        <a>${user.user}</a>
        <a>${user.pass}</a>
    </div>
</c:forEach>

<div style="display: flex">
    <form method="post" action="/registration_page" >
        <div style="margin: 2px 2px 2px 2px">
            <button name="registration" type="submit" style="height: 30px; width: 100px">Registration</button>
        </div>
    </form>

    <form method="post" action="/login">
        <div style="margin: 2px 2px 2px 2px">
            <button name="login" type="submit" style="height: 30px; width: 100px">Log In</button>
        </div>
    </form>
</div>


</body>
</html>
