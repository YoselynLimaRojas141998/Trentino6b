<%-- 
    Document   : index
    Created on : 10/05/2018, 09:00:17 PM
    Author     : yoselin lima
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login del sistema</title>
    </head>
    <body>
        <!--1. Enviamos datos (peticion POST)-->
        <form action="login" method="post">
            Name:<input type="text" name="name" placeholder="Ingrese su usuario"><br>
            password:<input type="password" name="password" placeholder="ingrese su password"><br>
            <input type="submit" value="login">
        </form>
    </body>
</html>
