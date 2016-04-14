<%--
  Created by IntelliJ IDEA.
  User: dulik
  Date: 13.04.2016
  Time: 19:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--<jsp:useBean id="localBean" scope="application" class="localBean" >--%>
<%--&lt;%&ndash; Every time we create the bean, initialize the string &ndash;%&gt;--%>
<%--<jsp:setProperty name="localBean" property="value" value="World" />--%>
<%--</jsp:useBean>--%>
<html>
<head>
    <title>Home</title>
</head>
<body>
<form method="post" action="/registration_page">
    <div>
        <button name="registration" type="submit">Registration</button>
    </div>
</form>

<form method="post" action="/login">
    <div>
        <button name="login" type="submit">Log In</button>
    </div>
</form>

</body>
</html>
