/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubaya.disprog;

import java.util.ArrayList;
import model.Account;
import model.Restaurant;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author LENOVO
 */
@WebService(serviceName = "LoginWebServ")
public class LoginWebServ {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "testMultiply")
    public double testMultiply(@WebParam(name = "number1") int number1, @WebParam(name = "number2") int number2) {
        //TODO write your implementation code here:
        Restaurant acc = new Restaurant();
        return number1 * number2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "add_data_restaurant")
    public boolean add_data_restaurant(@WebParam(name = "username") String username, @WebParam(name = "ownerName") String ownerName, @WebParam(name = "nama_resto") String nama_resto, @WebParam(name = "alamat") String alamat, @WebParam(name = "max_table") int max_table) {
        //TODO write your implementation code here:
        boolean status = false;
        Restaurant res = new Restaurant(ownerName, nama_resto, username, alamat, max_table);
        status = res.insertData();

        return status;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "check_login")
    public ArrayList<Account> check_login(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        //TODO write your implementation code here:
        ArrayList<Account> collections = new ArrayList<Account>();
        Account acc = new Account(username, password);
        collections = acc.checkLogin();
        return collections;
    }
}
