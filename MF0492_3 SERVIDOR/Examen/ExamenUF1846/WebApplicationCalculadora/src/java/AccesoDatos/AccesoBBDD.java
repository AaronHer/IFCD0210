/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import java.sql.ResultSet;

/**
 *
 * @author aula1
 */
public class AccesoBBDD extends Conexion {
    
    private int calcodigo;
    private String calnombre;
    private ResultSet resultado;
    
    public AccesoBBDD (){
        Conectar();
    }
    
    public ResultSet Listado () throws Exception{ // metodo que nos hace recorrer la bbdd
        try{
            getStmt();
            resultado = stmt.executeQuery("SELECT * FROM FAVORITE_FILM");
            return resultado;
        }catch (Exception ex){
            System.err.println("SQLException: " + ex.getMessage());
            return null;   
        }
    }
    
    public ResultSet BuscarExistente (int Codigo){
        
        try{
            getStmt();
            resultado = stmt.executeQuery("SELECT * FAVORITE_FILM WHERE CAJACODIGO LIKE'" +  Codigo + "%'" );
            return resultado;           
            
        }catch (Exception ex){
            System.err.println("SQLException: " + ex.getMessage());
            return null;
        }
    }
    
    
    public ResultSet BuscarPorTitulo (String title) throws Exception{
        
        try{
            getStmt();
            resultado = stmt.executeQuery("SELECT * FAVORITE_FILM WHERE CAJATITULO LIKE'" +  title + "%')" );
            return resultado;           
            
        }catch (Exception ex){
            System.err.println("SQLException: " + ex.getMessage());
            return null;
        }
    } 
    
    
    
    
    
    
}
