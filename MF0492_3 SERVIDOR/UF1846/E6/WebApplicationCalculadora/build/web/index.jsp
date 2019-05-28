<%-- 
    Document   : index
    Created on : 22-may-2019, 16:37:20
    Author     : aula1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página Calculadora</title>
        <link rel="stylesheet" href="newcss.css" />
    </head>
    <body>
        <h1>Calculadora</h1>
        <form mathod="POST" action="SerbletOperaciones">
        <br>
        <p>Valor 1 : <input type="text" name="valor1" value="" size="8" /></p>
        <br>
        <p>Valor 2 : <input type="text" name="valor2" value="" size="8" /></p>
        
        <br><br>
        <input type="submit" value="Sumar" name="botonSumar" />
        <input type="submit" value="Restar" name="botonRestar" />
        <input type="submit" value="Dividir" name="botonDividir" />
        <input type="submit" value="Multiplicar" name="botonMultiplicar" />
        <input type="submit" value="Hipotenusa" name="botonHipo" />

        </form>
        
        <br><br>
            
        <h1>Comparador el resultado mayor</h1>
        <form mathod="POST" action="SerbletOperaciones">
        <br>
        <p>Valor 1 : <input type="text" name="comparar1" value="" size="8" /></p>
        <br>
        <p>Valor 2 : <input type="text" name="comparar2" value="" size="8" /></p>
        <input type="submit" value="Mayor" name="botonComparar" />
        </form>
        
        <h1>Calcular Sueldo</h1>
        <form mathod="POST" action="SerbletOperaciones">
        <br>
        <table border="0">
            
                <tr>
                    <td>Nombre</td>
                    <td><input type="text" name="Nombre" placeholder="Nombre" size="50" /></td>
                </tr>
                <tr>
                    <td>Dirección</td>
                    <td><input type="text" name="Dirección" placeholder="Dirección" size="50" /></td>
                </tr>
                <tr>
                    <td>Dias trabajados</td>
                    <td><input type="text" name="Dias" size="50" /></td>
                </tr>
                <tr>
                    <td>Valor/hora</td>
                    <td><input type="text" name="Valor" size="50" /></td>
                </tr>
        </table>
        <br>
        <input type="submit" value="Calcular" name="botonCalcular" />
        </form>
        
    </body>
</html>
