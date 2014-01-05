/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package BusinessLogic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public class Donor {
    String Name;
    int Age;
    String Gender;
    String Phone_no;
    String EnteredAddress;
    static Connection connection;
    PreparedStatement stmt;
    String insertDonorSql;

    public String getInsertDonorSql() {
        return insertDonorSql;
    }

    public void setInsertDonorSql(String insertDonorSql) {
        this.insertDonorSql = insertDonorSql;
    }
    int result;


    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getAddress() {
        return EnteredAddress;
    }

    public void setAddress(String City) {
        this.EnteredAddress = City;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPhone_no() {
        return Phone_no;
    }

    public void setPhone_no(String Phone_no) {
        this.Phone_no = Phone_no;
    }

    
  

    public boolean insertDonor() {
        result=0;
        setInsertDonorSql("INSERT INTO Donor VALUES(?,?,?,?,?,?)");
        try {
            stmt=connection.prepareStatement(getInsertDonorSql());
            stmt.setString(1, UserRegistration.DONOR_ID); //Static Object
            stmt.setString(2, getName());
            stmt.setString(3, getGender());
            stmt.setInt(4,getAge());
            stmt.setString(5, getPhone_no());
            stmt.setString(6, getAddress());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            result=stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        if(result==1){
            return true;
        }

        return false;
    }


  }
