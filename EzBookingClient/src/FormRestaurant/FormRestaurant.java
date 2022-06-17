/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FormRestaurant;

import FormRegistrasiAccount.FormLogIn;

/**
 *
 * @author asus
 */
public class FormRestaurant {

    com.ubaya.disprog.EzBookingWebService_Service service;
    com.ubaya.disprog.EzBookingWebService port;

    /**
     * @param args the command line arguments
     */
    public void main() {
        //Check apakah restaurant sudah pernah mendaftar? jika blom tampilkan form input data jika sudah tampilkan form home

        service = new com.ubaya.disprog.EzBookingWebService_Service();
        port = service.getEzBookingWebServicePort();
        int id = port.getIdRestaurant(FormLogIn.txtUsername.getText());
//        if (id == null) {
//
//        } else {
//
//        }
        FormHomeRestaurant formHomeRestaurant = new FormHomeRestaurant();
        formHomeRestaurant.setVisible(true);
    }

}
