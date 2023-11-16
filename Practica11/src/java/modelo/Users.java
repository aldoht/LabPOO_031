/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import controlador.dbConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aldof
 */
public class Users {

    /**
     * @return the idUser
     */
    public int getIdUser() {
        return idUser;
    }

    /**
     * @param idUser the idUser to set
     */
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    /**
     * @return the fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * @return the lname
     */
    public String getLname() {
        return lname;
    }

    /**
     * @param lname the lname to set
     */
    public void setLname(String lname) {
        this.lname = lname;
    }
    
    private int idUser;
    private String fname;
    private String lname;
    
    public void insertData(dbConnection ins, String nombre1, String nombre2) {
        try {
                Statement st = ins.getConnection().createStatement();
                String queryInsert = "INSERT INTO users (first_name, last_name) VALUES ('" + nombre1 + "', '" + nombre2 + "');";
                st.executeUpdate(queryInsert);
                ins.getConnection().close();
            }
            catch (Exception e) {
                System.err.println("Hay una excepción!");
                System.err.println(e.getMessage());
            }
    }
    
    public List<String[]> selectData(dbConnection sel) {
        List<String[]> out = new ArrayList<>();
        try {
                Statement st0 = sel.getConnection().createStatement();
                String querySelect = "SELECT id, first_name, last_name FROM users;";
                ResultSet rs = st0.executeQuery(querySelect);
                while (rs.next()) {
                    String data[] = new String[3];
                    data[0] = rs.getString("id");
                    data[1] = rs.getString("first_name");
                    data[2] = rs.getString("last_name");
                    out.add(data);
                }
            }
        catch (Exception e) {
                String data[] = new String[3];
                data[0] = "Hubo un error!";
                data[1] = "Mensaje " + e.toString();
            }
        return out;
    }
}
