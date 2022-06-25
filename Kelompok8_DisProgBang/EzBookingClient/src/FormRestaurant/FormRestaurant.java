/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FormRestaurant;

import FormRegistrasiAccount.FormLogIn;
import com.ubaya.disprog.Reservasi;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

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
        service = new com.ubaya.disprog.EzBookingWebService_Service();
        port = service.getEzBookingWebServicePort();
        int id = port.getIdRestaurant(FormLogIn.txtUsername.getText());

        FormHomeRestaurant formHomeRestaurant = new FormHomeRestaurant();
        formHomeRestaurant.setVisible(true);

    }

}
