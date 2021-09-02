package CONEXION;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    private final String url = "//localhost:3306/dbcometohome";
    private final String user = "root";
    private final String pass = "";
    
    public Connection conectar(){
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql:" + url, user, pass);  
            return conexion;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("error al conectar con mysql " + e.toString());
        }
        return null;
    }
    
}

