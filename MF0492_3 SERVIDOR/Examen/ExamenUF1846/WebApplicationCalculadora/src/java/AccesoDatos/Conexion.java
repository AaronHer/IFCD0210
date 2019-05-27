/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author aula1
 */
public class Conexion {
    
    protected Connection con;
    protected Statement stmt;
    private String serverName = "localhost";
    private String portNumber = "3306";
    private String databaseName= "recepcion";
    private String url = "jdbc:mysql://localhost:3306/" + databaseName;
    private String userName = "root";
    private String password = "";
    private String errString;
   

  public Conexion(){ // crteamos el contructor
      
  }
  
  private String getConnectionUrl(){
      return url;
  }
   public Statement getStmt(){
      return this.stmt;
  }
    
  public Connection Conectar(){
      con = null;
      try{
          Class.forName ("org.gjt.mm.mysql.Driver");
          con = (Connection) DriverManager.getConnection(getConnectionUrl(), userName, password);
          stmt = (Statement) con.createStatement();
          System.out.println("Conectado");
          
      }catch (Exception e){
          errString = "Error mientras se conecta a la base de datos";
          System.out.println(errString);
          return null;
       }
      return con;
      
    }
   
  public void Desconectar (){
      
      try{ stmt.close();
      con.close();
          
      }catch (SQLException e){
          errString = "Error al desconectar con la base de datos";        
      }
    }
  
 
    
}
