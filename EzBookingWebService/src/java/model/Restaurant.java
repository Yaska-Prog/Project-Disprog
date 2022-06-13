/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ivanc
 */
public class Restaurant extends MyModel {

    int id;
    String namaPemilik;
    String namaRestaurant;
    String usernameRestaurant;
    String alamatRestaurant;
    int ketersediaanMeja;

    public Restaurant(int id, String namaPemilik, String namaRestaurant, String usernameRestaurant, String alamatRestaurant, int ketersediaanMeja) {
        this.id = id;
        this.namaPemilik = namaPemilik;
        this.namaRestaurant = namaRestaurant;
        this.usernameRestaurant = usernameRestaurant;
        this.alamatRestaurant = alamatRestaurant;
        this.ketersediaanMeja = ketersediaanMeja;
    }

    public Restaurant() {
    }

    public Restaurant(String namaPemilik, String namaRestaurant, String usernameRestaurant, String alamatRestaurant, int ketersediaanMeja) {
        this.namaPemilik = namaPemilik;
        this.namaRestaurant = namaRestaurant;
        this.usernameRestaurant = usernameRestaurant;
        this.alamatRestaurant = alamatRestaurant;
        this.ketersediaanMeja = ketersediaanMeja;
    }
    public Restaurant(String namaPemilik, String namaRestaurant, String alamatRestaurant, int ketersediaanMeja) {
        this.namaPemilik = namaPemilik;
        this.namaRestaurant = namaRestaurant;
        this.usernameRestaurant = usernameRestaurant;
        this.alamatRestaurant = alamatRestaurant;
        this.ketersediaanMeja = ketersediaanMeja;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public String getNamaRestaurant() {
        return namaRestaurant;
    }

    public void setNamaRestaurant(String namaRestaurant) {
        this.namaRestaurant = namaRestaurant;
    }

    public String getUsernameRestaurant() {
        return usernameRestaurant;
    }

    public void setUsernameRestaurant(String usernameRestaurant) {
        this.usernameRestaurant = usernameRestaurant;
    }

    public String getAlamatRestaurant() {
        return alamatRestaurant;
    }

    public void setAlamatRestaurant(String alamatRestaurant) {
        this.alamatRestaurant = alamatRestaurant;
    }

    public int getKetersediaanMeja() {
        return ketersediaanMeja;
    }

    public void setKetersediaanMeja(int ketersediaanMeja) {
        this.ketersediaanMeja = ketersediaanMeja;
    }

    public boolean insertData() {
        boolean status = false;
        try {
            if (!MyModel.conn.isClosed()) {
                PreparedStatement sql = (PreparedStatement) MyModel.conn.prepareStatement("insert into restaurant(ownerName, nama, account_username, alamat, max_table)"
                        + "values (?,?,?,?,?)");

                sql.setString(1, this.namaPemilik);
                sql.setString(2, this.namaRestaurant);
                sql.setString(3, this.usernameRestaurant);
                sql.setString(4, this.alamatRestaurant);
                sql.setInt(5, this.ketersediaanMeja);
                sql.executeUpdate();
                sql.close();
                status = true;

            }
        } catch (SQLException e) {
            System.out.println("Error :  " + e.getMessage());
        }
        return status;
    }

//    public boolean reservasiRestaurant()
//    {
//        
//    }
}
