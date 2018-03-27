<%-- 
    Document   : orderconfirmation
    Created on : 26-03-2018, 09:47:32
    Author     : wtfak
--%>

<%@page import="FunctionLayer.Brick"%>
<%@page import="FunctionLayer.House"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    int height = ((Integer) session.getAttribute("height"));
    int width = ((Integer) session.getAttribute("width"));
    int length = ((Integer) session.getAttribute("length"));
    Brick brick = (Brick) request.getAttribute("brick");

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
            
            out.print(" small bricks: " + brick.getSmallQty());
            out.print(" medium bricks: " + brick.getMediumQty());
            out.print(" large bricks: " + brick.getLargeQty());

        %>

    </body>
</html>
