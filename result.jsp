<%-- 
    Document   : newjsp
    Created on : 10 Mar, 2016, 2:41:33 AM
    Author     : Devaa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <center>
    <body background="images/images26.jpg">
        
        <div id="result">
            <h3>${requestScope["message"]}</h3>
            <br>
            <br>
            <a href="index.jsp">Go to Home Page</a>
        </div
    </body>
    </center>
</html>
