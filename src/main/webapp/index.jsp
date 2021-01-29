<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 1. Ejercicios intermedios</title>
    </head>
    <body>
        <h1>Hotel Bosco ~ Portal a un mundo de aventura y fantasía.</h1>
        <hr>
        <form action="servletCalcular">
            <input type="Date" name="fechaEnt"><br>
            <input type="Date" name="fechaSal"><br>
            <select name="tipo">
                <option value="normal">Normal</option>
                <option value="superior">Superior</option>
            </select>
            <hr>
            <input type="submit" value="Introducir datos">
        </form>
    </body>
</html>
