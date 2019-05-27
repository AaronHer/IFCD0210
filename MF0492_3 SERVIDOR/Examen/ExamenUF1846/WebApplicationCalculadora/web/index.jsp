<%-- 
    Document   : index
    Created on : 22-may-2019, 16:37:20
    Author     : aula1
--%>

<%@page import="AccesoDatos.CalcularSueldo"%>
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
        
        
        <h2> Listado de peliculas favoritas</h2>
        <br>
        <table border="0">
            <thead>
                <tr>
                    <th>Codigo</th>
                    <th>Titulo</th>
                    
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><input type="text" name="CAJACODIGO"/></td>
                    <td><input type="text" name="CAJATITULO"/></td>
                    <td><input type="submit" value="Enviar Consulta" name="Buscar"/></td>
                </tr>
                
            </tbody>
        </table>
        
        <br><br><br>
        
        <h1>Calcular Sueldo</h1>
        
    <form action="ServletSueldo" method="POST">
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
                <tr>
                    <td><input type="submit" value="calcular" name="Calcular" /></td>
                    <td></td>
                </tr>
        </table>
        
        <% // con estra estructuras indicamos que vamos a crear una respuesta del servlet de manera que
           // creamos un objeto respuesta con la misma estructura que la tabla, y haciendo el calculo del salario tras la peticion del servlet. 
            CalcularSueldo obj = new CalcularSueldo();
            obj = (CalcularSueldo)request.getAttribute("respuestaSalario");//nos retorna un objeto con los datos que tiene la clase CalcularSueldo
            if(obj!=null){
                out.println("Nombre: " + obj.getNombre() + "<br/>");
                out.println("Dirección: " + obj.getDireccion() + "<br/>");
                out.println("Dias trabajados: " + obj.getNumDiasTrabajados() + "<br/>");
                out.println("El día se cobra a: " + obj.getValorDia()+ "€"+ "<br/>");
                out.println("El salario será de: " + obj.getSalario() + "€" + "<br/>");
                
                
            }
        %>
    </form>

    </body>
</html>
