<%-- 
    Document   : enterorder
    Created on : 27-03-2018, 13:42:38
    Author     : wtfak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ordere</title>
    </head>
    <body>
        <h1>Please select your measurements in dots</h1>

        <form name="createorder" action="FrontController" method="POST">
            <input type="hidden" name="command" value="createorder">
            <input type="number" name = "height" placeholder="Height:">
            <input type="number" name = "length" placeholder="Length:">
            <input type="number" name = "width" placeholder="Width:">
            <input type="submit" value="Submit"> 

        </form>

    </body>
</html>

