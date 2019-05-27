/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.selvlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import AccesoDatos.CalcularSueldo;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author aula1
 */
@WebServlet(name = "ServletSueldo", urlPatterns = {"/ServletSueldo"})
public class ServletSueldo extends HttpServlet {

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
        
        CalcularSueldo obj = new CalcularSueldo();
        
        obj.setNombre(request.getParameter("Nombre"));
        obj.setDireccion(request.getParameter("Dirección"));
        obj.setNumDiasTrabajados(Integer.parseInt(request.getParameter("Dias")));
        obj.setValorDia(Double.parseDouble(request.getParameter("Valor")));
        obj.salario();
        
        request.setAttribute("respuestaSalario", obj);
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Sueldo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletSueldo at " + request.getContextPath() + "</h1>");
            
            
            // * CALCULAR TU SUELDO *
            
            RequestDispatcher a = request.getRequestDispatcher("index.jsp");
            a.forward(request, response);//es para redireccionar el contenido 
            
            
            
            out.println("</body>");
            out.println("</html>");
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
        processRequest(request, response);
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
