/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author IVAN
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public abstract class MyModel {

    protected static Connection conn;
    protected Statement statment;
    protected ResultSet resultset;

    public MyModel() {
        this.conn = this._getConnection();
        this.statment = null;
        this.resultset = null;
    }

    private Connection _getConnection() {
        if (MyModel.conn == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                return DriverManager.getConnection("jdbc:mysql://localhost/ezbookingrestaurant","root","");

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return MyModel.conn;
    }
}
