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
        Reservasi reservasi = new Reservasi(String.valueOf(tanggalPemesanan), jumlahMeja, jumlahOrang, status, penilaianBintang, restaurantId, accountUsername);
        hasil = reservasi.insertDataReservasi();
        return hasil;
    }

    @WebMethod(operationName = "insertDataRestaurant")
    public boolean insertDataRestaurant(@WebParam(name = "username") String username, @WebParam(name = "ownerName") String ownerName, @WebParam(name = "nama_resto") String nama_resto, @WebParam(name = "alamat") String alamat, @WebParam(name = "max_table") int max_table) {
        //TODO write your implementation code here:
        boolean status = true;
        Restaurant restaurant = new Restaurant(ownerName, nama_resto, alamat, max_table, username);
        status = restaurant.insertData();
        return status;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "updateDataRestaurant")
    public boolean updateDataRestaurant(@WebParam(name = "ownerName") String ownerName, @WebParam(name = "nama_resto") String nama_resto, @WebParam(name = "alamat") String alamat, @WebParam(name = "max_table") int max_table, @WebParam(name = "id_restaurant") int id_restaurant) {
        boolean hasil = true;
        Restaurant restaurant = new Restaurant(id_restaurant, ownerName, nama_resto, alamat, max_table);
        hasil = restaurant.updateRestaurant();
        return hasil;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "jumlahKetersediaanMeja")
    public int jumlahKetersediaanMeja(@WebParam(name = "idRestaurant") int idRestaurant, @WebParam(name = "tanggal_pesan") String tanggal_pesan) {
        Restaurant restaurant = new Restaurant();
        int hasil = restaurant.jumlahMejaSaatIni(idRestaurant, tanggal_pesan);
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

    @WebMethod(operationName = "showReservasiOnProcess")
    public ArrayList<Reservasi> showReservasiOnProcess(@WebParam(name = "idRestaurant") int idRestaurant) {
        ArrayList<Reservasi> collections = new ArrayList<>();
        Reservasi reservasi = new Reservasi();
        collections = reservasi.listDataReservasiOnProcess(idRestaurant);
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
    @WebMethod(operationName = "SaveReport")
    public boolean SaveReport(@WebParam(name = "account_username") String account_username, @WebParam(name = "id_resto") int id_resto, @WebParam(name = "qualityOfService") double qualityOfService, @WebParam(name = "food_quality") double food_quality, @WebParam(name = "review") String review) {
        boolean status1 = false;
        Report laporan = new Report(account_username, id_resto, qualityOfService, food_quality, review);
        status1 = laporan.saveReport();
        return status1;
    }

    @WebMethod(operationName = "UpdateReport")
    public boolean UpdateReport(@WebParam(name = "account_username") String account_username, @WebParam(name = "id_resto") int id_resto, @WebParam(name = "qualityOfService") double qualityOfService, @WebParam(name = "food_quality") double food_quality, @WebParam(name = "review") String review) {
        boolean status1 = false;
        Report laporan = new Report(account_username, id_resto, qualityOfService, food_quality, review);
        status1 = laporan.updateReport();
        return status1;
    }

    @WebMethod(operationName = "showListIdRestaurant")
    public ArrayList<String> showListIdRestaurant() {
        ArrayList<String> list = new ArrayList();
        Restaurant restaurant = new Restaurant();
        list = restaurant.listIdRestauramt();
        return list;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "showListRestaurant")
    public ArrayList<Restaurant> showListRestaurant(@WebParam(name = "filter") String filter, @WebParam(name = "value") String value) {
        //TODO write your implementation code here:
        Restaurant resto = new Restaurant();
        ArrayList<Restaurant> listResto = resto.showAllResto(filter, value);
        return listResto;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "showReservasiUser")
    public ArrayList<Reservasi> showReservasiUser(@WebParam(name = "accountName") String accountName) {
        //TODO write your implementation code here:
        Reservasi res = new Reservasi();
        ArrayList<Reservasi> coll = res.userReservasi(accountName);
        return coll;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "GetIdRestaurant")
    public int GetIdRestaurant(@WebParam(name = "username") String username) {
        //TODO write your implementation code here:
        Restaurant res = new Restaurant();
        return res.idResto(username);
    }

    @WebMethod(operationName = "showListDataRestaurant")
    public Restaurant showListDataRestaurant(@WebParam(name = "username") String username) {
        int idResto = GetIdRestaurant(username);
        Restaurant restaurant = new Restaurant();
        return restaurant.listDataRestaurant(idResto);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "showReport")
    public ArrayList<Report> showReport(@WebParam(name = "idRestaurant") int idRestaurant, @WebParam(name = "accountUsername") String accountUsername) {
        Report report = new Report();
        return report.listReport(idRestaurant, accountUsername);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ambil_id")
    public int ambil_id(@WebParam(name = "username") String username) {
        //TODO write your implementation code here:
        Restaurant resto = new Restaurant();
        int id = resto.ambilIdResto(username);
        return id;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "showRestaurantWithFilterForAdmin")
    public ArrayList<Restaurant> showRestaurantWithFilterForAdmin(@WebParam(name = "namaFilter") String namaFilter, @WebParam(name = "valueFilter") String valueFilter, @WebParam(name = "SortBy") String SortBy) {
        ArrayList<Restaurant> restaurantList = new ArrayList<>();
        Restaurant restaurant = new Restaurant();
        restaurantList = restaurant.ShowListRestaurantWithFilter(namaFilter, valueFilter, SortBy);
        return restaurantList;
    }

    @WebMethod(operationName = "showListAllIdRestaurant")
    public ArrayList<String> showListAllIdRestaurant() {
        ArrayList<String> list = new ArrayList();
        Restaurant restaurant = new Restaurant();
        list = restaurant.listAllIdRestauramt();
        return list;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listYangSudahDireport")
    public ArrayList<Report> listYangSudahDireport(@WebParam(name = "accountUsername") String accountUsername) {
        Report report = new Report();
        return report.listReportYangSudahDireport(accountUsername);
    }

    @WebMethod(operationName = "getStatusReservasi")
    public String statusReservasi(@WebParam(name = "idReservasi") int idReservasi) {
        String hasil = "";
        Reservasi reservasi = new Reservasi();
        hasil = reservasi.getStatusReservation(idReservasi);
        return hasil;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "give_rating")
    public boolean give_rating(@WebParam(name = "id_reservasi") int id_reservasi, @WebParam(name = "bintang") int bintang) {
        //TODO write your implementation code here:
        boolean status = false;
        Reservasi res = new Reservasi();
        status = res.tambah_rating(id_reservasi, bintang);
        return status;
    }
}