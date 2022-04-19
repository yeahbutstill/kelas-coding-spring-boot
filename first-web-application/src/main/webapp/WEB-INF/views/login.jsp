<%-- JSP JUST VIEW NOT THE LOGIC --%>
<%@ page import="java.util.Date" %><%--
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
<body>
<h2>My First JSP</h2>
<h3>My name is ${name}</h3>
<h3>My password is ${password}</h3>
<%-- Anda dapat menulis banyak kode Java di JSP bukan hal yang benar-benar direkomendasikan
tetapi ada baiknya anda tahu itu mungkin --%>
<%
    System.out.println(request.getParameter("name"));
//    System.out.println(request.getParameter("age"));
    System.out.println("--------------------------");
    Date date = new Date();
%>
<div>Current date is <%=date%></div>
<p>
<%--JSP EL (expression language)--%>
<%--    my name is ${name} and my age ${age} old--%>
</p>
</body>
</html>
