<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: arahansa
  Date: 2016-04-20
  Time: 오전 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${accountList}" var="item">
 username : ${item.username} , email : ${item.email} , age : ${item.age}<br>
</c:forEach>
</body>
</html>
