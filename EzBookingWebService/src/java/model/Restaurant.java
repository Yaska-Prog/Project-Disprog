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

    public int jumlahMejaSaatIni(int restaurantId, String tanggal) {
        int jumlah = 0;
        try {
            if (!MyModel.conn.isClosed()) {
                this.statment = (Statement) MyModel.conn.createStatement();
                this.resultset = this.statment.executeQuery("SELECT (ra.max_table - sum(ri.jumlahMeja)) as jumlah from restaurant ra inner join reservasi ri on ri.restaurant_id = ra.id where ri.restaurant_id = " + restaurantId + " and (ri.tanggalPesanan = '" + tanggal + "') and (ri.status='Confirmed' OR ri.status='On Process')");
                if (resultset.next()) {
                    jumlah += this.resultset.getInt("jumlah");
                    if (jumlah == 0) {
                        this.statment = (Statement) MyModel.conn.createStatement();
                        this.resultset = this.statment.executeQuery("select max_table as tabel from restaurant where id = " + restaurantId);
                        if (resultset.next()) {
                            jumlah += this.resultset.getInt("tabel");
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        }
        return jumlah;
    }

    public int idResto(String usernameRestaurant) {
        int id = 0;
        try {
            if (!MyModel.conn.isClosed()) {
                this.statment = (Statement) MyModel.conn.createStatement();
                this.resultset = this.statment.executeQuery("select id from restaurant where account_username = '" + usernameRestaurant + "'");
                if (resultset.next()) {
                    id = this.resultset.getInt("id");
                }
            }
        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        }
        return id;

    }

    public Restaurant listDataRestaurant(int idResto) {
        Restaurant res = new Restaurant();
        try {
            this.statment = (Statement) MyModel.conn.createStatement();
            this.resultset = this.statment.executeQuery("select * from restaurant where id = '" + idResto + "'");
            if (this.resultset.next()) {
                res.setNamaRestaurant(this.resultset.getString("nama"));
                res.setAlamatRestaurant(this.resultset.getString("alamat"));
                res.setNamaPemilik(this.resultset.getString("ownerName"));
                res.setMax_table(this.resultset.getInt("max_table"));
                res.setTotal_Pelanggan(this.resultset.getInt("total_pelanggaan"));
                res.setTotalBintang(this.resultset.getInt("overall_rating"));
            }
        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        }
        return res;
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

    public ArrayList<String> listAllIdRestauramt() {
        ArrayList<String> collections = new ArrayList<>();
        try {
            this.statment = (Statement) MyModel.conn.createStatement();
            this.resultset = this.statment.executeQuery("select id from restaurant order by id asc");
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
        try {
            if (filter.equals("none")) {
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
                }
            } else if (filter.equals("total_pelanggaan") || filter.equals("max_table")) {
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
                }
            } else if (filter.equals("overall_rating")) {
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
                }
            } else {
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
                }
            }
        } catch (Exception e) {
            System.out.println("error pada show restoran, pesan: " + e.getMessage());
        }
        return collections;
    }

    public int ambilIdResto(String username) {
        int id = 0;
        try {
            this.statment = (Statement) MyModel.conn.createStatement();
            this.resultset = this.statment.executeQuery("select id from restaurant where nama = '" + username + "';");
            if (this.resultset.next()) {
                id = this.resultset.getInt("id");
            }
        } catch (Exception e) {
            System.out.println("Error pada ambil id, pesan: " + e.getMessage());
        }
        return id;
    }

    public ArrayList<Restaurant> ShowListRestaurantWithFilter(String filter, String valueFilter, String sortBy) {
        ArrayList<Restaurant> collections = new ArrayList<>();
        try {

            this.statment = (Statement) MyModel.conn.createStatement();
            if (filter.equals("All")) {
                this.resultset = this.statment.executeQuery("select * from restaurant");
            } else {
                this.resultset = this.statment.executeQuery("select * from restaurant where " + filter + " LIKE'%" + valueFilter + "%' order by " + filter + " " + sortBy);
            }

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
            }
        } catch (Exception e) {
            System.out.println("error pada show restoran, pesan: " + e.getMessage());
        }
        return collections;
    }

}
