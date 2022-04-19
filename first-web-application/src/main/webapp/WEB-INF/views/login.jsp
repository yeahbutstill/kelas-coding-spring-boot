<%--
  Created by IntelliJ IDEA.
  User: yeahbutstill
  Date: 19/04/22
  Time: 22.44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type", content="text/html; charset=UTF-8">
    <title>Yeahbutstill Yoo!!! From JSP</title>
</head>
<%-- Anda dapat menulis banyak kode Java di JSP bukan hal yang benar-benar direkomendasikan
tetapi ada baiknya anda tahu itu mungkin --%>
<%
    System.out.println();
%>
<body>
My First JSP
<p>
<%--JSP EL (expression language)--%>
    my name is ${name} and my age ${age} old
</p>
</body>
</html>
