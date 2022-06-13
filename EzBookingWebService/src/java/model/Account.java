/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ivanc
 */
public class Account extends MyModel {

    int id;
    String username;
    String password;
    String email;
    String role;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Account() {
        this.username = null;
        this.password = null;
        this.email = null;
        this.role = null;
    }
    
    public Account(String user_name, String _password) {
        this.password = _password;
        this.username = user_name;
    }

    public Account(String _username, String _password, String _email, String _role) {
        this.username = _username;
        this.password = _password;
        this.email = _email;
        this.role = _role;
    }

    public Account(int _id, String _username, String _password, String _email, String _role) {
        this.id = _id;
        this.username = _username;
        this.password = _password;
        this.email = _email;
        this.role = _role;
    }

    public boolean register_account() {
        boolean status = false;
        try {
            if (!MyModel.conn.isClosed()) {
                PreparedStatement sql = (PreparedStatement) MyModel.conn.prepareStatement("insert into account(username, email,password,role) "
                        + "values (?,?,?,?)");

                sql.setString(1, this.username);
                sql.setString(2, this.email);
                sql.setString(3, this.password);
                sql.setString(4, this.role);
                sql.executeUpdate();
                sql.close();
                status = true;
            }
        } catch (SQLException e) {
            System.out.println("Error :  " + e.getMessage());
        }
        return status;
    }

    public boolean CheckUsername() {
        boolean status = false;
        ArrayList<Object> collections = new ArrayList<>();
        try {
            if (!MyModel.conn.isClosed()) {
                this.statment = (Statement) this.conn.createStatement();
                this.resultset = this.statment.executeQuery("select * from account where username ='" + username + "'");
                while (this.resultset.next()) {
                    Account acc = new Account(
                            this.resultset.getString("username"),
                            this.resultset.getString("password")
                    );
                    collections.add(acc);
                }
                if(collections.isEmpty()){
                    status = true;
                }
            }
        } catch (Exception e) {
            System.out.println("error :" + e.getMessage());
        }
        return status;
    }

    public ArrayList<Account> checkLogin() {
        ArrayList<Account> collections = new ArrayList<Account>();
        try {
            this.statment = (Statement) MyModel.conn.createStatement();
            this.resultset = this.statment.executeQuery("select * from account where email = '" + this.email + "' and password ='" + this.password + "'");
            while (this.resultset.next()) {
                Account acc = new Account(
                        this.resultset.getString("username"),
                        this.resultset.getString("password"),
                        this.resultset.getString("email"),
                        this.resultset.getString("role"));
                collections.add(acc);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return collections;
    }
}
