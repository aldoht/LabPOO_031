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
    public Connection getConnection() {
        String myDriver = "com.mysql.cj.jdbc.Driver";
        Connection conn = null;
        try {
            String myUrl = "jdbc:mysql://localhost:3306/mydb";
            Class.forName(myDriver);
            conn = DriverManager.getConnection(myUrl, "java", "root132");
        } catch (Exception e) {
            System.out.println("No connection " + e.toString());
        }
        return conn;
    }
}
