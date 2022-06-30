/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.ubaya.disprog;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.Report;
import model.Reservasi;
import model.Restaurant;

/**
 *
 * @author Lenovo
 */
@WebService(serviceName = "restaurantWebService")
public class restaurantWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    @WebMethod(operationName = "insertDataRestaurant")
    public boolean insertDataRestaurant(@WebParam(name = "username") String username, @WebParam(name = "ownerName") String ownerName, @WebParam(name = "nama_resto") String nama_resto, @WebParam(name = "alamat") String alamat, @WebParam(name = "max_table") int max_table) {
        //TODO write your implementation code here:
        boolean status = true;
        Restaurant restaurant = new Restaurant(ownerName, nama_resto, alamat, max_table, username);
        status = restaurant.insertData();
        return status;
    }

    @WebMethod(operationName = "updateDataRestaurant")
    public boolean updateDataRestaurant(@WebParam(name = "ownerName") String ownerName, @WebParam(name = "nama_resto") String nama_resto, @WebParam(name = "alamat") String alamat, @WebParam(name = "max_table") int max_table, @WebParam(name = "id_restaurant") int id_restaurant) {
        boolean hasil = true;
        Restaurant restaurant = new Restaurant(id_restaurant, ownerName, nama_resto, alamat, max_table);
        hasil = restaurant.updateRestaurant();
        return hasil;
    }

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

    @WebMethod(operationName = "showReport")
    public ArrayList<Report> showReport(@WebParam(name = "idRestaurant") int idRestaurant, @WebParam(name = "accountUsername") String accountUsername) {
        Report report = new Report();
        return report.listReport(idRestaurant, accountUsername);
    }

    @WebMethod(operationName = "getStatusReservasi")
    public String statusReservasi(@WebParam(name = "idReservasi") int idReservasi) {
        String hasil = "";
        Reservasi reservasi = new Reservasi();
        hasil = reservasi.getStatusReservation(idReservasi);
        return hasil;
    }

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

    @WebMethod(operationName = "updateStatusReservasi")
    public boolean updateStatusReservasi(@WebParam(name = "status") String status, @WebParam(name = "idReservasi") int idReservasi) {
        boolean hasil = false;
        Reservasi reservasi = new Reservasi();
        hasil = reservasi.updateStatusReservasi(status, idReservasi);
        return hasil;
    }
}
