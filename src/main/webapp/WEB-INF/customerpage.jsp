<%-- 
    Document   : customerpage
    Created on : Aug 22, 2017, 2:33:37 PM
    Author     : kasper
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="FunctionLayer.User"%>
<%@page import="FunctionLayer.Order"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% ArrayList<Order> orders = ((ArrayList<Order>) session.getAttribute("orders"));
   User user = (User) session.getAttribute("user");
    int count = 1;
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer home page</title>
    </head>
    <body>
        <h1>Hello <%=request.getParameter("email")%> </h1>
        You are now logged in as a customer of our wonderful site.

        What do you wanna do?


        <a href="FrontController?command=enterorder"> Order your house here </a>
        
        <h1>Previous orders:</h1>
        <div class="container">
            <div class="row">
                <div class="col-sm-12">
                </div>
            </div>
        </div>
        <table class="table table-striped table-bordered">
            <thead class="thead-dark">
                <tr>
                    <th scope="cole">#</th>
                    <th scope="col">Order Id</th>
                    <th scope="col">Height</th>
                    <th scope="col">Length</th>
                    <th scope="col">Width</th>
                    <th scope="col">Status</th>
                </tr>
            </thead>
            <tbody>
                <% if (orders != null)
                    {
                        for (Order order : orders)
                        { %> 
                <tr>
                    <th scope='row'><% out.print(count); %></th>
                    <td><% out.print(order.getId());%></td>
                    <td><% out.print(order.getHeight()); %></td>
                    <td><% out.print(order.getLength()); %></td>
                    <td><% out.print(order.getWidth()); %></td>
                    <td><% out.print(order.getShipped());%></td>
                    <% count++;
                            }
                        }
                    %>
    </body>
</html>
