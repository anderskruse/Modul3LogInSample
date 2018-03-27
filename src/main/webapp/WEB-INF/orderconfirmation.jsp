<%-- 
    Document   : orderconfirmation
    Created on : 26-03-2018, 09:47:32
    Author     : wtfak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    int height = ((Integer) session.getAttribute("height"));
    int width = ((Integer) session.getAttribute("width"));
    int length = ((Integer) session.getAttribute("length"));
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order created!</title>
    </head>
    <body>
        <h1>Order created!</h1>
        <%
            out.print(" Height: " + height);
            out.print(" Length " + length);
            out.print(" Width " + width);

        %>

    </body>
</html>
