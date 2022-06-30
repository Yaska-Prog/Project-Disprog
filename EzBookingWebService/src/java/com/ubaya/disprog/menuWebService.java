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
import model.Menu;
import model.Order;
import model.Reservasi;
import model.Restaurant;

/**
 *
 * @author LENOVO
 */
@WebService(serviceName = "menuWebService")
public class menuWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     * @param nama_menu
     * @param jenis_menu
     * @param harga
     * @param resto_id
     * @return 
     */
    @WebMethod(operationName = "tambahMenu")
    public boolean tambahMenu(@WebParam(name = "nama_menu") String nama_menu, @WebParam(name = "jenis_menu") String jenis_menu, @WebParam(name = "harga") int harga, @WebParam(name = "resto_id") int resto_id) {
        //TODO write your implementation code here:
        boolean status = false;
        try {
            Menu menu = new Menu();
            status = menu.insertMenu(nama_menu, resto_id, harga, jenis_menu);
        } catch (Exception e) {
            System.out.println("Error pada webservie tambahMenu, pesan error: " + e.getMessage());
        }
        
        return status;
    }
    
     /**
     * Web service operation
     * @param nama_menu
     * @param jenis_menu
     * @param harga
     * @param resto_id
     * @return 
     */
    
    @WebMethod(operationName = "editMenu")
    public boolean editMenu(@WebParam(name = "nama_menu") String nama_menu, @WebParam(name = "jenis_menu") String jenis_menu, @WebParam(name = "harga") int harga, @WebParam(name = "resto_id") int id_menu) {
        //TODO write your implementation code here:
        boolean status = false;
        try {
            Menu menu = new Menu();
            status = menu.editMenu(id_menu, nama_menu, harga, jenis_menu);
        } catch (Exception e) {
            System.out.println("Error pada webservie edit menu, pesan error: " + e.getMessage());
        }
        
        return status;
    }

    /**
     * Web service operation
     * @param resto_id
     * @param reserve_id
     * @param jumlah_pesanan
     * @return 
     */
    @WebMethod(operationName = "tambahOrder")
    public boolean tambahOrder(@WebParam(name = "resto_id") int resto_id, @WebParam(name = "reserve_id") int reserve_id, @WebParam(name = "jumlah_pesanan") int jumlah_pesanan) {
        //TODO write your implementation code here:
        boolean status = false;
        Order o = new Order(resto_id, reserve_id, jumlah_pesanan);
        status = o.insertOrder();
        return status;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "lihatMenu")
    public ArrayList<Menu> lihatMenu(@WebParam(name = "id_resto") int id_resto, @WebParam(name = "Filter") String Filter, @WebParam(name = "Value") String Value) {
        //TODO write your implementation code here:
        Menu menu = new Menu();
        ArrayList<Menu> listMenu = menu.lihatMenu(id_resto, Filter, Value);
        return listMenu;
    }
    
    @WebMethod(operationName = "GetIdRestaurant")
    public int GetIdRestaurant(@WebParam(name = "username") String username) {
        //TODO write your implementation code here:
        Restaurant res = new Restaurant();
        return res.idResto(username);
    }
    
    
}
