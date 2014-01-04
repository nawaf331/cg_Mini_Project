/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public class DBManager implements IDBManager {
    static public Connection con=null;
    static {
        con=fnConnectionToDB();
    }

    private static Connection fnConnectionToDB() {
        
        try {
            Class.forName(DBDRIVER);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            con = DriverManager.getConnection(DBURL,USER,PASS);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }
}
