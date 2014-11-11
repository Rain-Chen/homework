<%--
  Created by IntelliJ IDEA.
  User: rainchen
  Date: 14-11-10
  Time: 下午7:49
  To change this template use File | Settings | File and Code Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<html>
<head>
    <title></title>
</head>
<body>

<c:if test="${msg != null}">
<h1 style="color: red">
    ${msg}
</h1>
</c:if>
x坐标:<input type="text" value="${xcoor}"><br/>
y坐标:<input type="text" value="${ycoor}">
</body>
</html>
