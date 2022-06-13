/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ezbookingdisprogserver;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.MyModel;
import model.Restaurant;

/**
 *
 * @author ivanc
 */
public class EzBookingDisprogServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            DatagramSocket serversocket = new DatagramSocket(1000);
            byte[] receivedData, sendData;
            DatagramPacket incomingPacket, repliedPacket;

            while (true) {
                receivedData = new byte[2048];
                sendData = new byte[2048];

                incomingPacket = new DatagramPacket(receivedData, receivedData.length);
                serversocket.receive(incomingPacket);

                String message = new String(incomingPacket.getData(), incomingPacket.getOffset(), incomingPacket.getLength());
                String[] messages = null;
                messages = message.split("/");
                String result = "";

                if (messages[0].equals("LOGIN")) {
                    Account acc = new Account(messages[1], messages[2]);
                    ArrayList<Account> login = acc.checkLogin();

                    if (!login.isEmpty()) {
                        acc = login.get(0);
                        result = acc.getRole();

                    } else {
                        result = "FAILED";
                    }

                } else if (messages[0].equals("REGISTER")) {
                    Account acc = new Account(messages[1], messages[3], messages[2], messages[4]);
                    if (acc.CheckEmail().isEmpty()) {
                        acc.insertData();
                        result = "SUKSES";
                    } else {
                        result = "EMAILUSE";
                    }
                } else if (messages[0].equals("ADDRESTAURANT")) {
                    Restaurant restaurant = new Restaurant(messages[1], messages[2], messages[3], messages[4], Integer.parseInt(messages[5]));
                    restaurant.insertData();
                    result = "Restauran Berhasil Diinput, Terima Kasih";
                }
                sendData = (result).getBytes();

                InetAddress ipClient = incomingPacket.getAddress();
                int portClient = incomingPacket.getPort();
                repliedPacket = new DatagramPacket(sendData, sendData.length, ipClient, portClient);

                serversocket.send(repliedPacket);
            }
        } catch (Exception ex) {
            Logger.getLogger(EzBookingDisprogServer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
