/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.*;

/**
 * @author Aaron
 */
public class Conexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * host: ip local
         * nombre de base de datos
         * user:
         * pass
         * puerto
         */
      
        
        String host;
        String dbName;
        
        try {
            
            //1.- Cargar nuestro driver
            //esto se va a encargar de la conexion con al base de datos, metodo estatico 
            Class.forName("com.mysql.jdbc.Driver");
            
            //Definir la url de donde esta nuestra DB
            host= "jdbc:mysql://127.0.0.1:3306/";//127.0.0.1
            //el nombre de mi base de datos
            dbName= "alumnos_ico";
            
            //Extablecemos nuestra conexion
            
            Connection db = DriverManager.getConnection( host + dbName, "root","123456" );
            
            Statement st = db.createStatement();
            
            ResultSet  rs =st.executeQuery("SELECT * FROM productos");
            
            
            if(rs.wasNull())
                System.out.println("La tabla esta vacia");
     
            while(rs.next())
                System.out.println(rs.getString("CODIGOARTICULO")+" "+rs.getString("PRECIO")+" "+rs.getString("NOMBREARTICULO"));
            
            
            
            
        } catch (Exception e) {
            
            
            System.out.println("Error en la DB"+e);
        }
        
        
        
    }
    
}
