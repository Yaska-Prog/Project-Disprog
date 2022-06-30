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

    com.ubaya.disprog.RestaurantWebService_Service service;
    com.ubaya.disprog.RestaurantWebService port;

    /**
     * @param args the command line arguments
     */
    public void main() {
        service = new com.ubaya.disprog.RestaurantWebService_Service();
        port = service.getRestaurantWebServicePort();
        int id = port.getIdRestaurant(FormLogIn.txtUsername.getText());

        FormHomeRestaurant formHomeRestaurant = new FormHomeRestaurant();
        formHomeRestaurant.setVisible(true);

    }

}
