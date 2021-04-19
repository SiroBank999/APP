/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class UserModel {
    private int id;
    private String displayname;
    private String username;
    private String password;
    private int level;

    public UserModel(String displayname, String username, String password, int level) {
        this.displayname = displayname;
        this.username = username;
        this.password = password;
        this.level = level;
    }

    public UserModel(int id, String displayname, String username, String password, int level) {
        this.id = id;
        this.displayname = displayname;
        this.username = username;
        this.password = password;
        this.level = level;
    }

    public UserModel() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "UserModel{" + "id=" + id + ", displayname=" + displayname + ", username=" + username + ", password=" + password + ", level=" + level + '}';
    }
    public boolean checkAccount(Connection conn){
        boolean flag = false;
        
        
        try {
            conn = Database.ketNoi();
            Statement st =conn.createStatement();
            String query = "select * from user where username = ? and password = ?";
            PreparedStatement sql = conn.prepareStatement(query);
            sql.setString(1, this.username);
            sql.setString(2, this.password);
            ResultSet rs=sql.executeQuery();
            if(rs.next()){
                flag = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
        
    }
}
