/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Reservasi extends MyModel {

    int id;
    String tanggalPesanan;
    int jumlahMeja;
    int jumlahOrang;
    String status;
    int penilaianBintang;
    int restaurant;
    String accountUsername;

    public Reservasi() {
    }

    public Reservasi(int id, String tanggalPesanan, int jumlahMeja, int jumlahOrang, String status, int penilaianBintang, int restaurant, String accountUsername) {
        this.id = id;
        this.tanggalPesanan = tanggalPesanan;
        this.jumlahMeja = jumlahMeja;
        this.jumlahOrang = jumlahOrang;
        this.status = status;
        this.penilaianBintang = penilaianBintang;
        this.restaurant = restaurant;
        this.accountUsername = accountUsername;
    }

    public Reservasi(String tanggalPemesanan, int jumlahMeja, int jumlahOrang, String status, int penilaianBintang, int restaurant, String accountUsername) {
        this.tanggalPesanan = tanggalPemesanan;
        this.jumlahMeja = jumlahMeja;
        this.jumlahOrang = jumlahOrang;
        this.status = status;
        this.penilaianBintang = penilaianBintang;
        this.restaurant = restaurant;
        this.accountUsername = accountUsername;
    }

    public Reservasi(String accountUsername, String tanggalPemesanan, int jumlahMeja, int jumlahOrang, String status) {
        this.tanggalPesanan = tanggalPemesanan;
        this.jumlahOrang = jumlahOrang;
        this.jumlahMeja = jumlahMeja;
        this.accountUsername = accountUsername;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTanggalPesanan() {
        return tanggalPesanan;
    }

    public void setTanggalPesanan(String tanggalPesanan) {
        this.tanggalPesanan = tanggalPesanan;
    }

    public int getJumlahMeja() {
        return jumlahMeja;
    }

    public void setJumlahMeja(int jumlahMeja) {
        this.jumlahMeja = jumlahMeja;
    }

    public int getJumlahOrang() {
        return jumlahOrang;
    }

    public void setJumlahOrang(int jumlahOrang) {
        this.jumlahOrang = jumlahOrang;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPenilaianBintang() {
        return penilaianBintang;
    }

    public void setPenilaianBintang(int penilaianBintang) {
        this.penilaianBintang = penilaianBintang;
    }

    public int getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(int restaurant) {
        this.restaurant = restaurant;
    }

    public String getAccountUsername() {
        return accountUsername;
    }

    public void setAccountUsername(String accountUsername) {
        this.accountUsername = accountUsername;
    }

    public boolean insertDataReservasi() {
        boolean status1 = false;
        try {

            if (!MyModel.conn.isClosed()) {
                PreparedStatement sql = (PreparedStatement) MyModel.conn.prepareStatement("insert into reservasi(tanggalPesanan, jumlahMeja, jumlahOrang, status, penilaian, restaurant_id,account_username)"
                        + " values(?,?,?,?,?,?,?)");
                sql.setString(1, this.tanggalPesanan);
                sql.setInt(2, this.jumlahMeja);
                sql.setInt(3, this.jumlahOrang);
                sql.setString(4, ("'" + this.status + "'"));
                sql.setInt(5, this.penilaianBintang);
                sql.setInt(6, this.restaurant);

                sql.setString(7, this.accountUsername);
                sql.executeUpdate();
                sql.close();
                status1 = true;
            }
        } catch (Exception e) {
            System.out.println("Error :  " + e.getMessage());
        }
        return status1;
    }

    public ArrayList<Reservasi> listDataReservasi(int idRestaurant) {
        ArrayList<Reservasi> collections = new ArrayList<>();
        try {
            this.statment = (Statement) MyModel.conn.createStatement();
            this.resultset = this.statment.executeQuery("SELECT * FROM reservasi WHERE restaurant_id = " + idRestaurant + " AND status != 'Arrived' AND status != 'Decline'");
            while (this.resultset.next()) {
                String date = this.resultset.getString("tanggalPesanan");
                Reservasi reservasi = new Reservasi(
                        this.resultset.getInt("id"),
                        date,
                        this.resultset.getInt("jumlahMeja"),
                        this.resultset.getInt("jumlahOrang"),
                        this.resultset.getString("status"),
                        this.resultset.getInt("penilaian"),
                        this.resultset.getInt("restaurant_id"),
                        this.resultset.getString("account_username"));
                System.out.println(reservasi.getTanggalPesanan());
                collections.add(reservasi);
                System.out.println("Berhasil ");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return collections;
    }

    public boolean updateStatusReservasi(String status, int idReservasi) {
        boolean hasil = false;
        try {
            this.statment = (Statement) MyModel.conn.createStatement();
            if (!MyModel.conn.isClosed()) {
                PreparedStatement sql = (PreparedStatement) MyModel.conn.prepareStatement(
                        "update reservasi set status = ? where id= ?");
                sql.setString(1, status);
                sql.setInt(2, idReservasi);
                sql.executeUpdate();
                sql.close();
                hasil = true;
            }
        } catch (SQLException e) {
            System.out.println("error : " + e.getMessage());
        }
        return hasil;
    }

    public ArrayList<Reservasi> userReservasi(String username) {
        ArrayList<Reservasi> collections = new ArrayList<>();

        try {
            this.statment = (Statement) MyModel.conn.createStatement();
            this.resultset = this.statment.executeQuery("select account_username, tanggalPesanan, jumlahMeja, jumlahOrang, status from reservasi where account_username = '" + username + "';");
            while (this.resultset.next()) {
                System.out.println("Resultset: " + this.resultset.getString("tanggalPesanan"));
                Reservasi reservasi = new Reservasi(
                        this.resultset.getString("account_username"),
                        this.resultset.getString("tanggalPesanan"),
                        this.resultset.getInt("jumlahMeja"),
                        this.resultset.getInt("jumlahOrang"),
                        this.resultset.getString("status"));
                collections.add(reservasi);
                System.out.println("Reservasi: " + reservasi.getTanggalPesanan());
                System.out.println("Berhasil1");
            }
        } catch (SQLException e) {
            System.out.println("Error pada user reservasi, pesan: " + e.getMessage());
        }

        return collections;

    }
    
    public String getStatusReservation(int idReservasi){
        String hasil = "";
        try {
            this.statment = (Statement) MyModel.conn.createStatement();
            this.resultset = this.statment.executeQuery("select status from reservasi where id = '" + idReservasi + "';");
            while(this.resultset.next()){
                hasil = resultset.getString("status");
            }
        } catch (Exception e) {
        }
        return hasil;
    }

    @Override
    public String toString() {
        return "JavaApplication4{" + "date=" + getTanggalPesanan() + '}';
    }

}
