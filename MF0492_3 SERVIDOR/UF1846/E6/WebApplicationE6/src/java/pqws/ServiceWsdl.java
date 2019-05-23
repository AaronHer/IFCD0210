
package pqws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @Aaron Hernandez Rodriguez
 */
@WebService(serviceName = "ServiceWsdl")
public class ServiceWsdl {

   
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "mostrarSaludo")
    public String mostrarSaludo(@WebParam(name = "nombre") String nombre) {
        //TODO write your implementation code here:
        return "Bienvenido " +  nombre;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Suma")
    public String Suma(@WebParam(name = "Valor1") int Valor1, @WebParam(name = "Valor2") int Valor2) {
        //TODO write your implementation code here:
        int resultado;
        resultado = Valor1 + Valor2;
        return "El resuelado de es: " + resultado;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "dividir")
    public String dividir(@WebParam(name = "Valor1") int Valor1, @WebParam(name = "Valor2") int Valor2) {
        //TODO write your implementation code here:
        int resultado;
        resultado = Valor1 / Valor2;
        return "El resuelado de es: " + resultado;
    }
}
