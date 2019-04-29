/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_sql;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author aula1
 */
public class conexion_sql {
    Connection conectar = null;
    public Connection conexion(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/universidad_crud","root","");
            
            JOptionPane.showMessageDialog(null, "Conexión exitosa");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se puede conectar" + e.getMessage());
            
        }
        return conectar;
    }
        
}
