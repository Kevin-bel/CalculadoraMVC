<%-- 
    Document   : index
    Created on : 31/07/2020, 19:58:30
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora MVC</title>
    </head>
    <body>
        <h1>CALCULADORA DE OPERACIONES BASICAS</h1><br> <br>
        <form name="principal" action="miServlet" method="POST">
            Ingrese primer numero:<input type="text" name="num1"  /><br><br>
            Ingrese segundo numero:<input type="text" name="num2"  /><br><br>
            <input type="submit" value="suma" name="accion">
            <input type="submit" value="resta" name="accion">
            <input type="submit" value="multiplicar" name="accion">
            <input type="submit" value="dividir" name="accion"><br><br>
            El Resultado de la Operacion es: <%out.print(request.getAttribute("resultado"));%>
            
        </form>
    </body>
</html>
