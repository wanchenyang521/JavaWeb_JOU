<%@page import="com.wcy.demo.vo.Product"%>
<%@page import="com.wcy.demo.dao.ProductDaoImpl"%>
<%@page import="com.wcy.demo.dao.ProductDao"%>
<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <%
    ProductDao dao = new ProductDaoImpl();
    List<Product> list = dao.findAll();
    for(Product pro:list ) {
    	out.println(pro.getProductCode()+"--"+pro.getProductName()+"--"+pro.getProductVendor()+"\n");
    	%>
    	<br>
    	<%
    }
    %>
  </body>
</html>
