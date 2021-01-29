<%-- 
    Document   : muestraResultado.jsp
    Created on : 28-ene-2021, 21:29:35
    Author     : Piscis Xalock
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 1. Ejercicios intermedios</title>
    </head>
    <body>
        <h1>Confirmación de la reserva.</h1>
        <hr>
        <% request.getAttribute("calcular"); %>
        <!--<p>Número de días: <%--${ calcular.numDias }--%>.</p>-->
        <p>Importe: ${ calcular.importe }.</p>
        <button onclick="alert('Reserva realizada.')">Realizar reserva</button>
    </body>
</html>
