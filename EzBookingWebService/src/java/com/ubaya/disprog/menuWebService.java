/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubaya.disprog;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.Menu;

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
}
