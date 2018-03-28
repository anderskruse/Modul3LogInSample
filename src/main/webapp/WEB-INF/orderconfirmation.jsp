<%-- 
    Document   : orderconfirmation
    Created on : 26-03-2018, 09:47:32
    Author     : wtfak
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="FunctionLayer.Brick"%>
<%@page import="FunctionLayer.House"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<% ArrayList<Brick> brickList = ((ArrayList<Brick>) session.getAttribute("brickList"));
    int count = 1;
    int height = ((Integer) session.getAttribute("height"));
    int width = ((Integer) session.getAttribute("width"));
    int length = ((Integer) session.getAttribute("length"));
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Created!</title>

    </head>
    <body>
        <h1>Order Created!</h1>
        <div class="container">
            <div class="row">
                <div class="col-sm-12">
                    <% out.println("Your order based on these specifications: ");
                        out.print("<br>Height: " + height);
                        out.print(" | Length " + length);
                        out.print(" | Width " + width);

                    %></b>
                </div>
            </div>
        </div>
        <table class="table table-striped table-bordered">
            <thead class="thead-dark">
                <tr>
                    <th scope="cole">#</th>
                    <th scope="col">Quantity</th>
                    <th scope="col">Type</th>
                </tr>
            </thead>
            <tbody>
                <%                    for (Brick brick : brickList) { %> 
                <tr>
                    <th scope='row'><% out.print(count); %></th>
                    <td><% out.print(brick.getQty());%></td>
                    <td><% out.print(brick); %></td>
                    <% count++;
                        }
                    %>

            <a href="FrontController?command=login"> Return to user page </a>                </tr>
    </tbody>
</table>
</body>
</html>