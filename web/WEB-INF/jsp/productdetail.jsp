<%-- 
    Document   : productdetail
    Created on : Oct 17, 2017, 5:28:50 PM
    Author     : user
--%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>${product.description}</h1>
        ${product.purchaseCost}<br/>
        <p>
            <a href="cart/${product.productId}">Masukan ke keranjang</a>
        </p>
        
    </body>
</html>
