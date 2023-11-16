/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases;
import controlador.dbConnection;
import java.sql.*;

/**
 *
 * @author aldof
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Loading driver...");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded!");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Cannot find the driver in the classpath!", e);
        }
        
        System.out.println("Connecting database...");
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "java", "root132")) {
            System.out.println("Database connected!");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
        
        dbConnection conn = new dbConnection();
            try {
                Statement st = conn.getConnection().createStatement();
                String queryInsert = "INSERT INTO users (first_name, last_name) VALUES ('" + "Lucia" + "', '" + "Tamez" + "');";
                st.executeUpdate(queryInsert);
                conn.getConnection().close();
            }
            catch (Exception e) {
                System.err.println("Hay una excepción!");
                System.err.println(e.getMessage());
            }
    }
    
}
