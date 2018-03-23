<%-- 
    Document   : order
    Created on : 22-03-2018, 12:12:52
    Author     : wtfak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Order</h1>
        
        <div class="order">
            
        <p>Enter desired dimensions (dots) : </p>
        
        <form name="makeorder" action="FrontController" method="POST">
             <input type="hidden" name="command" value="createorder">
             
              Length: <input type="text" name="length" value=""><br/>
              Width: <input type="text" name="width" value><br/>
              Height: <input type="text" name="height" value=""><br/>
              <input type="submit" value="Submit">          
        </form>
        </div>
    </body>
</html>
