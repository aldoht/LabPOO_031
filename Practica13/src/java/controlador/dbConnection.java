/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.sql.*;

/**
 *
 * @author aldof
 */
public class dbConnection {
    public dbConnection() {
        try (Connection con = getConnection()) {
            String createQuery = "CREATE TABLE if not exists users (id INT(64) AUTO_INCREMENT NOT NULL, "
                    + "first_name VARCHAR(32) NOT NULL, "
                    + "last_name VARCHAR(32) NOT NULL, "
                    + "PRIMARY KEY (id));";
            Statement st = con.createStatement();
            st.execute(createQuery);
        } catch (SQLException e) {
            System.out.println("Hubo un error: " + e.toString());
        }
    }
    
    public Connection getConnection() {
        String myDriver = "com.mysql.cj.jdbc.Driver";
        Connection conn = null;
        try {
            String myUrl = "jdbc:mysql://localhost:3306/mydb";
            Class.forName(myDriver);
            conn = DriverManager.getConnection(myUrl, "java", "root132");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("No connection " + e.toString());
        }
        return conn;
    }
}
