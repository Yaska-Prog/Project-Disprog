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
 * @author ivanc
 */
@WebService(serviceName = "adminWebService")
public class adminWebService {

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
}

