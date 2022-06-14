/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author IVAN
 */
public class Report {

    String account_username;
    int idRestaurant;
    double qualityOfService;
    double foodQuality;
    String review;

    public Report(String account_username, int idRestaurant, double qualityOfService, double foodQuality, String review) {
        this.account_username = account_username;
        this.idRestaurant = idRestaurant;
        this.qualityOfService = qualityOfService;
        this.foodQuality = foodQuality;
        this.review = review;
    }

    public String getAccount_username() {
        return account_username;
    }

    public void setAccount_username(String account_username) {
        this.account_username = account_username;
    }

    public int getIdRestaurant() {
        return idRestaurant;
    }

    public void setIdRestaurant(int idRestaurant) {
        this.idRestaurant = idRestaurant;
    }

    public double getQualityOfService() {
        return qualityOfService;
    }

    public void setQualityOfService(double qualityOfService) {
        this.qualityOfService = qualityOfService;
    }

    public double getFoodQuality() {
        return foodQuality;
    }

    public void setFoodQuality(double foodQuality) {
        this.foodQuality = foodQuality;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public ArrayList<Reservasi> listDataReservasi(int idRestaurant) {
        ArrayList<Reservasi> collections = new ArrayList<Reservasi>();
        try {
            this.statment = (Statement) MyModel.conn.createStatement();
            this.resultset = this.statment.executeQuery("select * from reservasi where restaurant_id = " + idRestaurant + " and status != 'sukses'");
            while (this.resultset.next()) {
                Reservasi reservasi = new Reservasi(
                        this.resultset.getInt("id"),
                        this.resultset.getDate("tanggalPesanan"),
                        this.resultset.getInt("jumlahMeja"),
                        this.resultset.getInt("jumlahOrang"),
                        this.resultset.getString("status"),
                        this.resultset.getInt("penilaian_bintang"),
                        this.resultset.getInt("restaurant_id"),
                        this.resultset.getString("account_username"));
                collections.add(reservasi);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return collections;
    }
}
