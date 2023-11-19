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
    
    public String saveData(dbConnection ins) {
        try {
                Statement st = ins.getConnection().createStatement();
                String queryInsert = "INSERT INTO users (first_name, last_name) VALUES ('"
                                     + this.fname + "', '" + this.lname + "');";
                st.executeUpdate(queryInsert);
                ins.getConnection().close();
                return "Se ha agregado al usuario correctamente.";
            }
            catch (SQLException e) {
                return "No se pudo agregar al usuario a la base de datos. Error: " + e.toString();
            }
    }
    
    public String updateData(dbConnection up) {
        if (this.searchID(up)) {
            try {
                Statement st = up.getConnection().createStatement();
                String queryUpdate = "UPDATE users SET first_name = '" + this.fname
                                     + "', last_name = '" + this.lname
                                     + "' WHERE id=" + this.idUser + ";";
                st.executeUpdate(queryUpdate);
                up.getConnection().close();
                return "Se han actualizado los datos del usuario con ID " + this.idUser + " correctamente.";
            } catch(SQLException e) {
                return "No se pudieron actualizar los datos. ERROR: " + e.toString();
            }
        }
        return "No existe el usuario con la ID especificada.";
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
                sel.getConnection().close();
            }
        catch (SQLException e) {
                String data[] = new String[3];
                data[0] = "Hubo un error:";
                data[1] = e.toString();
                data[2] = ".";
                out.add(data);
            }
        return out;
    }
    
    public boolean searchID(dbConnection del) {
        int dbID;
        try {
            Statement st = del.getConnection().createStatement();
            String querySearch = "SELECT id FROM users;";
            ResultSet row = st.executeQuery(querySearch);
            while (row.next()) {
                dbID = row.getInt("id");
                if (dbID == this.idUser) {
                    del.getConnection().close();
                    return true;
                }
            }
            del.getConnection().close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }
    
    public String deleteData(dbConnection del) {
        if (this.searchID(del)) {
            try {
                Statement st = del.getConnection().createStatement();
                String queryDelete = "DELETE FROM users WHERE id='" + this.idUser + "';";
                st.executeUpdate(queryDelete);
                del.getConnection().close();
                return "Se ha eliminado al usuario correctamente.";
            } catch (SQLException e) {
                return e.toString();
            }
        }
        else
            return "No se ha encontrado el usuario con la ID especificada.";
    }
}
