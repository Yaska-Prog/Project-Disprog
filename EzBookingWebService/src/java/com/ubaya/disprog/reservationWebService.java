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
import model.Reservasi;
import model.Restaurant;

/**
 *
 * @author LENOVO
 */
@WebService(serviceName = "reservationWebService")
public class reservationWebService {

    /**
     * This is a sample web service operation
     * @param txt
     * @return 
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
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
     * @param idRestaurant
     * @return 
     */
    @WebMethod(operationName = "jumlahKetersediaanMeja")
    public int jumlahKetersediaanMeja(@WebParam(name = "idRestaurant") int idRestaurant, @WebParam(name = "tanggal_pesan") String tanggal_pesan) {
        Restaurant restaurant = new Restaurant();
        int hasil = restaurant.jumlahMejaSaatIni(idRestaurant, tanggal_pesan);
        return hasil;
    }


/**
     * Web service operation
     * @param filter
     * @param value
     * @return 
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
     * @param tanggalPemesanan
     * @param jumlahMeja
     * @param jumlahOrang
     * @param restaurantId
     * @param penilaianBintang
     * @param status
     * @param accountUsername
     * @return 
     */
    @WebMethod(operationName = "insertDataReservasi")
    public boolean insertDataReservasi(@WebParam(name = "tanggalPemesanan") String tanggalPemesanan, @WebParam(name = "jumlahMeja") int jumlahMeja, @WebParam(name = "jumlahOrang") int jumlahOrang, @WebParam(name = "status") String status, @WebParam(name = "penilaianBintang") int penilaianBintang, @WebParam(name = "restaurantId") int restaurantId, @WebParam(name = "accountUsername") String accountUsername) {
        boolean hasil = true;
        Reservasi reservasi = new Reservasi(String.valueOf(tanggalPemesanan), jumlahMeja, jumlahOrang, status, penilaianBintang, restaurantId, accountUsername);
        hasil = reservasi.insertDataReservasi();
        return hasil;
    }


    /**
     * Web service operation
     * @param username
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
     * @param accountName
     * @return 
     */
    @WebMethod(operationName = "showReservasiUser")
    public ArrayList<Reservasi> showReservasiUser(@WebParam(name = "accountName") String accountName) {
        //TODO write your implementation code here:
        Reservasi res = new Reservasi();
        ArrayList<Reservasi> coll = res.userReservasi(accountName);
        return coll;
    }
    
}
