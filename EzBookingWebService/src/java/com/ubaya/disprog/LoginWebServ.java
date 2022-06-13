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
        }else{
            status = false;
        }
        return status;
    }

    /**
     * Web service operation
     */
//    @WebMethod(operationName = "insert_data_reservasi")
//    public boolean insert_data_reservasi(@WebParam(name = "tanggalPesanan")  tanggalPesanan, @WebParam(name = "jumlahMeja") int jumlahMeja, @WebParam(name = "jumlahOrang") int jumlahOrang, @WebParam(name = "restaurantId") int restaurantId, @WebParam(name = "accountId") int accountId) {
//        //TODO write your implementation code here:
//        
//        return false;
//    }
}
