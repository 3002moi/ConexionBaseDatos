/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author MGG
 */
public class Conexionbasedatos {
public class  conexionBD{
    private static Connection conn = null;
    private static String URL = "jbdc:mysql://localhost:3360/ConecionBasesDatos"; 
    private static String usuario = "root";
    private static String PASSWORD = "";
    
    public static Connection ObtieneConexion(){
         
        try {
            conn  = DriverManager.getConnection(URL,usuario,PASSWORD);
            
            }catch (SQLException ex ){
                System.getLogger(conexionBD.class.getName()).log(System.Logger.Level.ERROR,(String)null, ex);
            }
        return conn;
        }
}
}

            
            