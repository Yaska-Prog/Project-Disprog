/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ivanc
 */
public class Restaurant extends MyModel {

    int id;
    String namaPemilik;
    String namaRestaurant;
    String alamatRestaurant;
    int max_table;
    int total_Pelanggan;
    String usernameAccount;
    int totalBintang;

    public Restaurant() {
    }

    public Restaurant(String namaRestaurant, String alamatRestaurant, int max_table, int total_Pelanggan, String usernameRestaurant, int totalBintang) {
        this.namaRestaurant = namaRestaurant;
        this.alamatRestaurant = alamatRestaurant;
        this.max_table = max_table;
        this.total_Pelanggan = total_Pelanggan;
        this.usernameAccount = usernameRestaurant;
        this.totalBintang = totalBintang;
    }

    public Restaurant(int idRestaurant, String namaPemilik, String namaRestaurant, String alamatRestaurant, int max_table) {
        this.id = idRestaurant;
        this.namaPemilik = namaPemilik;
        this.namaRestaurant = namaRestaurant;
        this.alamatRestaurant = alamatRestaurant;
        this.max_table = max_table;
    }

    public Restaurant(String namaPemilik, String namaRestaurant, String alamatRestaurant, int max_table, String usernameRestaurant) {
        this.namaPemilik = namaPemilik;
        this.namaRestaurant = namaRestaurant;
        this.alamatRestaurant = alamatRestaurant;
        this.max_table = max_table;
        this.usernameAccount = usernameRestaurant;
    }

    public Restaurant(int id, String namaPemilik, String namaRestaurant, String alamatRestaurant, int max_table, int total_Pelanggan, String usernameRestaurant, int totalBintang) {
        this.id = id;
        this.namaPemilik = namaPemilik;
        this.namaRestaurant = namaRestaurant;
        this.alamatRestaurant = alamatRestaurant;
        this.max_table = max_table;
        this.total_Pelanggan = total_Pelanggan;
        this.usernameAccount = usernameRestaurant;
        this.totalBintang = totalBintang;
    }

    public Restaurant(String namaPemilik, String namaRestaurant, String alamatRestaurant, int max_table, int total_Pelanggan, String usernameRestaurant, int totalBintang) {
        this.namaPemilik = namaPemilik;
        this.namaRestaurant = namaRestaurant;
        this.alamatRestaurant = alamatRestaurant;
        this.max_table = max_table;
        this.total_Pelanggan = total_Pelanggan;
        this.usernameAccount = usernameRestaurant;
        this.totalBintang = totalBintang;
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

    public String getAlamatRestaurant() {
        return alamatRestaurant;
    }

    public void setAlamatRestaurant(String alamatRestaurant) {
        this.alamatRestaurant = alamatRestaurant;
    }

    public int getMax_table() {
        return max_table;
    }

    public void setMax_table(int max_table) {
        this.max_table = max_table;
    }

    public int getTotal_Pelanggan() {
        return total_Pelanggan;
    }

    public void setTotal_Pelanggan(int total_Pelanggan) {
        this.total_Pelanggan = total_Pelanggan;
    }

    public String getUsernameRestaurant() {
        return usernameAccount;
    }

    public void setUsernameRestaurant(String usernameRestaurant) {
        this.usernameAccount = usernameRestaurant;
    }

    public int getTotalBintang() {
        return totalBintang;
    }

    public void setTotalBintang(int totalBintang) {
        this.totalBintang = totalBintang;
    }

    public boolean insertData() {
        boolean status = false;
        try {
            if (!MyModel.conn.isClosed()) {
                PreparedStatement sql = (PreparedStatement) MyModel.conn.prepareStatement("insert into restaurant(ownerName, nama, account_username, alamat, max_table)"
                        + "values (?,?,?,?,?)");

                sql.setString(1, this.namaPemilik);
                sql.setString(2, this.namaRestaurant);
                sql.setString(3, this.usernameAccount);
                sql.setString(4, this.alamatRestaurant);
                sql.setInt(5, this.max_table);
                sql.executeUpdate();
                sql.close();
                status = true;

            }
        } catch (SQLException e) {
            System.out.println("Error :  " + e.getMessage());
        }
        return status;
    }

    public boolean updateRestaurant() {
        boolean hasil = false;
        try {
            this.statment = (Statement) MyModel.conn.createStatement();
            if (!MyModel.conn.isClosed()) {
                PreparedStatement sql = (PreparedStatement) MyModel.conn.prepareStatement(
                        "update restaurant set ownerName = ?, nama = ?, alamat = ?, max_table = ? where id = ?");
                sql.setString(1, this.namaPemilik);
                sql.setString(2, this.namaRestaurant);
                sql.setString(3, this.alamatRestaurant);
                sql.setInt(4, this.max_table);
                sql.setInt(5, this.id);
                sql.executeUpdate();
                sql.close();
                hasil = true;
            }
        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        }
        return hasil;
    }

    public int jumlahMejaSaatIni(int restaurantId) {
        int jumlah = 0;
        try {
            if (!MyModel.conn.isClosed()) {
                this.statment = (Statement) MyModel.conn.createStatement();
                this.resultset = this.statment.executeQuery("select ra.max_table - (sum(ri.jumlahMeja)) as jumlah\n"
                        + "from reservasi ri inner join restaurant ra on ra.id = ri.restaurant_id\n"
                        + "where date(tanggalPesanan) = date(now()) and ra.id = + " + restaurantId + " and (status = 'On Process' or status = 'Confirm')");
                if (resultset.next()) {
                    jumlah += this.resultset.getInt("jumlah");
                }
            }
        } catch (Exception e) {
            System.out.println("error :: " + e.getMessage());
        }
        return jumlah;
    }

    public ArrayList<String> listIdRestauramt() {
        ArrayList<String> collections = new ArrayList<>();
        try {
            this.statment = (Statement) MyModel.conn.createStatement();
            this.resultset = this.statment.executeQuery("select distinct(ra.id) as id\n"
                    + "from restaurant ra inner join reservasi ri on ra.id = ri.restaurant_id");
            while (this.resultset.next()) {
                collections.add(this.resultset.getString("id"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return collections;
    }

    public ArrayList<Restaurant> showAllResto(String filter, String value) {
        ArrayList<Restaurant> collections = new ArrayList<Restaurant>();
        System.out.println(filter);
        try {
            System.out.println("Berhasil masuk kedalam try");
            if (filter.equals("none")) {
                System.out.println("Berhasil masuk kedalam none");
                this.statment = (Statement) MyModel.conn.createStatement();
                this.resultset = this.statment.executeQuery("select * from restaurant");
                while (this.resultset.next()) {
                    Restaurant resto = new Restaurant(
                            this.resultset.getInt("id"),
                            this.resultset.getString("ownerName"),
                            this.resultset.getString("nama"),
                            this.resultset.getString("alamat"),
                            this.resultset.getInt("max_table"),
                            this.resultset.getInt("total_pelanggaan"),
                            this.resultset.getString("account_username"),
                            this.resultset.getInt("overall_rating")
                    );
                    collections.add(resto);
                    System.out.println("Berhasil");
                }
            } else if (filter.equals("total_pelanggaan") || filter.equals("max_table")) {
                System.out.println("Berhasil masuk kedalam int");
                this.statment = (Statement) MyModel.conn.createStatement();
                this.resultset = this.statment.executeQuery("select * from restaurant where " + filter + " = " + Integer.parseInt(value));
                while (this.resultset.next()) {
                    Restaurant resto = new Restaurant(
                            this.resultset.getInt("id"),
                            this.resultset.getString("ownerName"),
                            this.resultset.getString("nama"),
                            this.resultset.getString("alamat"),
                            this.resultset.getInt("max_table"),
                            this.resultset.getInt("total_pelanggaan"),
                            this.resultset.getString("account_username"),
                            this.resultset.getInt("overall_rating")
                    );
                    collections.add(resto);
                    System.out.println("Berhasil");
                }
            } else if (filter.equals("overall_rating")) {
                System.out.println("Berhasil masuk kedalam float");
                this.statment = (Statement) MyModel.conn.createStatement();
                this.resultset = this.statment.executeQuery("select * from restaurant where " + filter + " = " + Float.parseFloat(value));
                while (this.resultset.next()) {
                    Restaurant resto = new Restaurant(
                            this.resultset.getInt("id"),
                            this.resultset.getString("ownerName"),
                            this.resultset.getString("nama"),
                            this.resultset.getString("alamat"),
                            this.resultset.getInt("max_table"),
                            this.resultset.getInt("total_pelanggaan"),
                            this.resultset.getString("account_username"),
                            this.resultset.getInt("overall_rating")
                    );
                    collections.add(resto);
                    System.out.println("Berhasil");
                }
            } else {
                System.out.println("Berhasil masuk kedalam string");
                this.statment = (Statement) MyModel.conn.createStatement();
                this.resultset = this.statment.executeQuery("select * from restaurant where " + filter + " = '" + value + "';");
                while (this.resultset.next()) {
                    Restaurant resto = new Restaurant(
                            this.resultset.getInt("id"),
                            this.resultset.getString("ownerName"),
                            this.resultset.getString("nama"),
                            this.resultset.getString("alamat"),
                            this.resultset.getInt("max_table"),
                            this.resultset.getInt("total_pelanggaan"),
                            this.resultset.getString("account_username"),
                            this.resultset.getInt("overall_rating")
                    );
                    collections.add(resto);
                    System.out.println("Berhasil");
                }
            }
        } catch (Exception e) {
            System.out.println("error pada show restoran, pesan: " + e.getMessage());
        }
        return collections;
    }    
}
