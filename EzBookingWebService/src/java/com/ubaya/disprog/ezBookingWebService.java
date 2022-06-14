/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.ubaya.disprog;

import java.sql.Array;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.Restaurant;
import model.Account;
import model.Report;
import model.Reservasi;

/**
 *
 * @author ivanc
 */
@WebService(serviceName = "ezBookingWebService")
public class ezBookingWebService {

    /**
     * Web service operation
     */
    /**
     * Web service operation
     */
    @WebMethod(operationName = "updateStatusReservasi")
    public boolean updateStatusReservasi(@WebParam(name = "status") String status, @WebParam(name = "idReservasi") int idReservasi) {
        boolean hasil = false;
        Reservasi reservasi = new Reservasi();
        hasil = reservasi.updateStatusReservasi(status, idReservasi);
        return hasil;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertDataReservasi")
    public boolean insertDataReservasi(@WebParam(name = "tanggalPemesanan") String tanggalPemesanan, @WebParam(name = "jumlahMeja") int jumlahMeja, @WebParam(name = "jumlahOrang") int jumlahOrang, @WebParam(name = "status") String status, @WebParam(name = "penilaianBintang") int penilaianBintang, @WebParam(name = "restaurantId") int restaurantId, @WebParam(name = "accountUsername") String accountUsername) {
        boolean hasil = true;
        Reservasi reservasi = new Reservasi(Date.valueOf(tanggalPemesanan), jumlahMeja, jumlahOrang, status, penilaianBintang, restaurantId, accountUsername);
        hasil = reservasi.insertDataReservasi();
        return hasil;
    }

    @WebMethod(operationName = "insertDataRestaurant")
    public boolean insertDataRestaurant(@WebParam(name = "username") String username, @WebParam(name = "ownerName") String ownerName, @WebParam(name = "nama_resto") String nama_resto, @WebParam(name = "alamat") String alamat, @WebParam(name = "max_table") int max_table) {
        //TODO write your implementation code here:
        boolean status = false;
        Restaurant restaurant = new Restaurant(ownerName, nama_resto, alamat, max_table, username);
        status = restaurant.insertData();
        return status;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "updateDataRestaurant")
    public boolean updateDataRestaurant(@WebParam(name = "ownerName") String ownerName, @WebParam(name = "nama_resto") String nama_resto, @WebParam(name = "alamat") String alamat, @WebParam(name = "max_table") int max_table, @WebParam(name = "id_restaurant") int id_restaurant) {
        boolean hasil = false;
        Restaurant restaurant = new Restaurant(id_restaurant,ownerName, nama_resto, alamat, max_table);
        hasil = restaurant.updateRestaurant();
        return hasil;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "jumlahKetersediaanMeja")
    public int jumlahKetersediaanMeja(@WebParam(name = "idRestaurant") int idRestaurant){
        Restaurant restaurant = new Restaurant();
        int hasil = restaurant.jumlahMejaSaatIni(idRestaurant);
        return hasil;
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
        } else {
            status = false;
        }
        return status;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "showReservasi")
    public ArrayList<Reservasi> showReservasi(@WebParam(name = "idRestaurant") int idRestaurant) {
        ArrayList<Reservasi> collections = new ArrayList<>();
        Reservasi reservasi = new Reservasi();
        collections = reservasi.listDataReservasi(idRestaurant);
        return collections;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "showListReservasi")
    public ArrayList<Report> showListReservasi(@WebParam(name = "idRestaurant") int idRestaurant, @WebParam(name = "usernameAccount") String usernameAccount) {
        ArrayList<Report> collections = new ArrayList<>();
        Report report = new Report();
        collections = report.listReport(idRestaurant, usernameAccount);
        return collections;
    }

    /**
     * Web service operation
     */
    
    

}
