/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BusinessLogic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Login {
    
    
    static Connection connection;
    Statement stmt;
    ResultSet rs;
    String sql;
    
    private String EnteredName;

    public String getEnteredName() {
        return EnteredName;
    }

    public void setEnteredName(String EnteredName) {
        this.EnteredName = EnteredName;
    }

    public String getEnteredPassword() {
        return EnteredPassword;
    }

    public void setEnteredPassword(String EnteredPassword) {
        this.EnteredPassword = EnteredPassword;
    }
    private String EnteredPassword;

    public boolean isValidLogin() {
        sql="SELECT username, password from loginTable";
        //core.DBManager connector=new core.DBManager();\
        connection=core.DBManager.con;
        try {
            stmt=connection.createStatement();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            rs=stmt.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            while(rs.next()) {
                String user=rs.getString("username");
                String pass=rs.getString("password");
                
                if(getEnteredName().equals(user) && getEnteredPassword().equals(pass)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    
}
