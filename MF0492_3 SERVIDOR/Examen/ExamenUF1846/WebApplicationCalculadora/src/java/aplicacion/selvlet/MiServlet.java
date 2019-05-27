/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.selvlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import AccesoDatos.AccesoBBDD;
import AccesoDatos.CalcularSueldo;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author aula1
 */
@WebServlet(name = "SerbletOperaciones", urlPatterns = {"/SerbletOperaciones"})
public class MiServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //Creamos los abjetos para calcular el sueldo; de esta manera podemos usar los setter y getter de la clase java.
        
        
        
        
        try (PrintWriter out = response.getWriter()) {
            
            ResultSet res;
            AccesoBBDD favorite_film = new AccesoBBDD();
            int numcodigo = 0;
            String nomTitulo = "";
            /* TODO output your page here. You may use following sample code. */
            
            // * PARTE DE QUE CONECTA CON LA CALCULADORA * 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Mi Calculadora</title>"); 
            out.println("<link href=newcss.css rel=stylesheet type= text/css>");
            out.println("</head>");
            out.println("<body>");
            
            String val1 = request.getParameter("valor1");
            String val2 = request.getParameter("valor2");
            String btnSumar = request.getParameter("botonSumar");
            String btnRestar = request.getParameter("botonRestar");
            String btnDividir = request.getParameter("botonDividir");
            String btnMultiplicar = request.getParameter("botonMultiplicar");
            String btnHipo = request.getParameter("botonHipo");
            
            
            if(btnSumar != null){
            int resultado = Integer.parseInt(val1) + Integer.parseInt(val2); 
                //El integer lo ponemos porque vamos a hacer el cambio de string  entero para poder calcular los valores
            out.println("El resultado es: " + resultado);
            }
            
            if(btnRestar != null){
            int resultado = Integer.parseInt(val1) - Integer.parseInt(val2); 
            out.println("El resultado es: " + resultado);
            }
            
            if(btnDividir != null){
            int resultado = Integer.parseInt(val1) / Integer.parseInt(val2); 
            out.println("El resultado es: " + resultado);
            }
            
            if(btnMultiplicar != null){
            int resultado = Integer.parseInt(val1) * Integer.parseInt(val2); 
            out.println("El resultado es: " + resultado);
            }
            if(btnHipo != null){
                int cateto1 = Integer.parseInt(val1) * Integer.parseInt(val1);
                int cateto2 = Integer.parseInt(val2) * Integer.parseInt(val2); 
                int catetos = cateto1 + cateto2;
                float resultado = (float) Math.sqrt(catetos); 
            out.println("El resultado es: " + resultado);
            }
            

//out.println("<h1>Servlet MiServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
            
        
            String comparador1 = request.getParameter("comparar1");
            String comparador2 = request.getParameter("comparar2");
            String btnComparar = request.getParameter("botonComparar");
            
            if(btnComparar != null){
                //comparador1.compareTo(comparador2);
                
                int valor1 = Integer.parseInt(comparador1);
                int valor2 = Integer.parseInt(comparador2);
                int resultado = 0;
             
                if(valor1<valor2){
                    resultado = valor2;
                }else  if(valor1>valor2){
                    resultado = valor1;
                }
            out.println("El resultado es: " + resultado);
            }
            
            
          
            
            
            // * PARTE DE QUE CONECTA CON LA BASE DE DATOS * 
            
            out.println("<table align=center width=289 border=1 class=datos_form>");
            out.println("<tr class=titulo_tabla><td colspan=2> Peliculas favoritas</td></tr>");
            out.println("<tr><td>valor</td><td>Listado de titulos</td></tr>");
            //res =favorite_film.Listado() ;
            
            
//        }catch (Exception ex){
//            
//        }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
