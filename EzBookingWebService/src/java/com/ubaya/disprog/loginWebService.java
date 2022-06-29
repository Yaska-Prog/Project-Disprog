/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubaya.disprog;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.Account;

/**
 *
 * @author LENOVO
 */
@WebService(serviceName = "loginWebService")
public class loginWebService {

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
    @WebMethod(operationName = "check_username")
    public boolean check_username(@WebParam(name = "username") String username) {
        //TODO write your implementation code here:
        Account acc = new Account(username);
        boolean status = acc.CheckUsername();
        return status;
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "registrasi_account")
    public boolean registrasi_account(@WebParam(name = "username") String username, @WebParam(name = "email") String email, @WebParam(name = "password") String password, @WebParam(name = "role") String role) {
        //TODO write your implementation code here:
        boolean result = check_username(username);
        boolean status;
        if (result == true) {
            Account acc = new Account(username, password, email, role);
            status = acc.register_account();
        } else {
            status = false;
        }
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
