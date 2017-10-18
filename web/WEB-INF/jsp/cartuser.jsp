<%-- 
    Document   : cartuser
    Created on : Oct 17, 2017, 6:22:57 PM
    Author     : user
--%>
<%@ page language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Keranjang Anda berisi: ${p.size()}</h1>
        <c:forEach var="c" items="${p}">
            <p>${c.description}</p>
            ${c.purchaseCost}<br/>
        </c:forEach>
        <a href="${pageContext.request.contextPath}/products/all">Kembali Berbelanja</a>
        
    </body>
</html>
