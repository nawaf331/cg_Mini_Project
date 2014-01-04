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
    String City;
    String State;
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

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
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

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }
    
  

    public boolean insertDonor() {
        result=0;
        setInsertDonorSql("INSERT INTO Donor VALUES(?,?,?,?,?,?)");
        try {
            stmt=connection.prepareStatement(getInsertDonorSql());
            stmt.setString(1, getName());
            stmt.setString(2, getGender());
            stmt.setInt(3,getAge());
            stmt.setString(4, getPhone_no());
            stmt.setString(5, getState());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            result=stmt.executeUpdate(insertDonorSql);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        if(result==1){
            return true;
        }

        return false;
    }


  }
