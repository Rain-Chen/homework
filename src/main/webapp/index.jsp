<%--
  Created by IntelliJ IDEA.
  User: rainchen
  Date: 14-11-10
  Time: 下午7:30
  To change this template use File | Settings | File and Code Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<html>
<head>
    <title>首页</title>
</head>
<body>
<h2>演示Struts2的自定义类型转换</h2>
<s:form action="converter">
    <s:textfield name="point" label="point(x,y)"/>
    <s:submit label="submit"/>
</s:form>
</body>
</html>
