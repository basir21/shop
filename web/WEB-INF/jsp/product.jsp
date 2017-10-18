<%-- 
    Document   : product
    Created on : Oct 17, 2017, 4:48:07 PM
    Author     : user
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/bootstrap.css"/>
    </head>
    <body>
    <center>
        Jumlah Keranjang anda: <a href="${pageContext.request.contextPath}/products/cart/cartuser">${p.size()}</a>
    </center>
        <h1 align="center">Product List</h1>
        <div class="table-responsive">
        <table class="table table-responsive" align="center">
        <c:forEach var="p" items="${products}">
            <tr>
                <td>
                    <b>${p.description}</b>
                </td>
                <td>
                    <a href="${p.productId}">Lihat detail</a>
                </td>
            </tr>
        </c:forEach>
        </table>
            </div>
    </body>
</html>
