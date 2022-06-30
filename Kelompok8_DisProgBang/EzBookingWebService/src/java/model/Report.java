/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author IVAN
 */
public class Report extends MyModel {

    String account_username;
    int idRestaurant;
    double qualityOfService;
    double foodQuality;
    String review;

    public Report() {
    }

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

    public ArrayList<Report> listReport(int idRestaurant, String usernameAccount) {
        ArrayList<Report> collections = new ArrayList<Report>();
        try {
            this.statment = (Statement) MyModel.conn.createStatement();
            if (idRestaurant != 0 && usernameAccount.equals("none")) {
                this.resultset = this.statment.executeQuery("select * from report where restaurant_id = '" + idRestaurant + "'");
            } else if (idRestaurant == 0 && !usernameAccount.equals("none")) {
                this.resultset = this.statment.executeQuery("select * from report where account_username = '" + usernameAccount + "'");
            } else if (idRestaurant == 0 && usernameAccount.equals("none")) {
                this.resultset = this.statment.executeQuery("select * from report");
            } else {
                this.resultset = this.statment.executeQuery("select * from report where restaurant_id = '" + idRestaurant + "' and account_username = '" + usernameAccount + "'");
            }

            while (this.resultset.next()) {
                Report report = new Report(
                        this.resultset.getString("account_username"),
                        this.resultset.getInt("restaurant_id"),
                        this.resultset.getDouble("qualityOfService"),
                        this.resultset.getDouble("foodQuality"),
                        this.resultset.getString("Review"));
                collections.add(report);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return collections;
    }

    public boolean saveReport() {
        boolean status1 = false;
        try {
            if (!MyModel.conn.isClosed()) {
                PreparedStatement sql = (PreparedStatement) MyModel.conn.prepareStatement("INSERT INTO report(account_username, restaurant_id, qualityOfService, foodQuality, Review)"
                        + " values(?, ?, ?, ?, ?)");
                sql.setString(1, this.account_username);
                sql.setInt(2, this.idRestaurant);
                sql.setDouble(3, this.qualityOfService);
                sql.setDouble(4, this.foodQuality);
                sql.setString(5, this.review);

                sql.executeUpdate();
                sql.close();
                status1 = true;
            }
        } catch (Exception e) {
            System.out.println("Error pada insert report, pesan error: " + e.getMessage());
        }
        return status1;
    }

    public ArrayList<Report> listReportYangSudahDireport(String usernameAccount) {
        ArrayList<Report> collections = new ArrayList<Report>();
        try {
            this.statment = (Statement) MyModel.conn.createStatement();
            this.resultset = this.statment.executeQuery("select * from report where account_username = '" + usernameAccount + "'");
            while (this.resultset.next()) {
                Report report = new Report(
                        this.resultset.getString("account_username"),
                        this.resultset.getInt("restaurant_id"),
                        this.resultset.getDouble("qualityOfService"),
                        this.resultset.getDouble("foodQuality"),
                        this.resultset.getString("Review"));
                collections.add(report);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return collections;
    }

    public boolean updateReport() {
        boolean status1 = false;
        try {
            this.statment = (Statement) MyModel.conn.createStatement();
            if (!MyModel.conn.isClosed()) {
                PreparedStatement sql = (PreparedStatement) MyModel.conn.prepareStatement("update report set qualityOfService = " + this.qualityOfService + " , foodQuality = " + this.foodQuality + " , review = '" + review + "' where account_username = '"+ this.account_username + "' and restaurant_id = " + this.idRestaurant);

                sql.executeUpdate();
                sql.close();
                status1 = true;
            }
        } catch (Exception e) {
            System.out.println("Error pada update report, pesan error: " + e.getMessage());
        }
        return status1;
    }
}