package CONEXION;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    private final String url = "jdbc:mysql://localhost:3306/dbcometohome";
    private final String user = "root";
    private final String pass = "";
    
    public Connection conectar(){
       Connection conexion = null;
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, user, pass);
            return conexion;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("error al conectar con mysql " + e.toString());
        }
        return conexion;
    }
    
}

