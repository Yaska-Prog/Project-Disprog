/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class Menu extends MyModel {

    private int id;
    private String nama_menu;
    private String jenis_menu;
    private int resto_id;
    private int harga;

    public Menu() {
    }

    public Menu(String nama_menu, int resto_id, int harga) {
        this.nama_menu = nama_menu;
        this.resto_id = resto_id;
        this.harga = harga;
    }

    public Menu(int id, String nama_menu, String jenis_menu1, int resto_id, int harga) {
        this.id = id;
        this.nama_menu = nama_menu;
        this.jenis_menu = jenis_menu1;
        this.resto_id = resto_id;
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama_menu() {
        return nama_menu;
    }

    public void setNama_menu(String nama_menu) {
        this.nama_menu = nama_menu;
    }

    public int getResto_id() {
        return resto_id;
    }

    public void setResto_id(int resto_id) {
        this.resto_id = resto_id;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getJenis_menu() {
        return jenis_menu;
    }

    public void setJenis_menu(String jenis_menu) {
        this.jenis_menu = jenis_menu;
    }

    public boolean insertMenu(String nama_menu, int resto_id, int harga, String jenis_menu) {
        boolean status = false;
        try {
            if (!MyModel.conn.isClosed()) {
                PreparedStatement sql = (PreparedStatement) MyModel.conn.prepareStatement("insert into menus(jenis, nama, harga, restaurant_id)"
                        + " values(?,?,?,?)");
                sql.setString(1, jenis_menu);
                sql.setString(2, nama_menu);
                sql.setInt(3, harga);
                sql.setInt(4, resto_id);

                sql.executeUpdate();
                sql.close();
                status = true;
            }
        } catch (Exception e) {
            System.out.println("Error pada insertMenu, pesan kesalahan: " + e.getMessage());
        }
        return status;
    }

    public boolean editMenu(int id, String nama_menu, int harga, String jenis_menu) {
        boolean hasil = false;
        try {
            this.statment = (Statement) MyModel.conn.createStatement();
            if (!MyModel.conn.isClosed()) {
                PreparedStatement sql = (PreparedStatement) MyModel.conn.prepareStatement(
                        "update menus set jenis = ?, nama = ?, harga = ? where id= ?");
                sql.setString(1, jenis_menu);
                sql.setString(2, nama_menu);
                sql.setInt(3, harga);
                sql.setInt(4, id);

                sql.executeUpdate();
                sql.close();
                hasil = true;
            }
        } catch (SQLException e) {
            System.out.println("error pada update jenis: " + e.getMessage());
        }
        return hasil;
    }

    public ArrayList<Menu> lihatMenu(int id_resto, String filter, String value) {
        ArrayList<Menu> listMenu = new ArrayList<Menu>();
        try {
            if (filter.equals("none")) {
                this.statment = (Statement) MyModel.conn.createStatement();
                this.resultset = this.statment.executeQuery("select * from menus where restaurant_id = " + id_resto + ";");
                while (this.resultset.next()) {
                    Menu menu = new Menu(this.resultset.getInt("id"),
                            this.resultset.getString("nama"),
                            this.resultset.getString("jenis"),
                            this.resultset.getInt("restaurant_id"),
                            this.resultset.getInt("harga")
                    );
                    System.out.println(this.resultset.getString("jenis"));

                    listMenu.add(menu);
                    System.out.println("Jenis: " + menu.getJenis_menu());

                }
            } else {
                this.statment = (Statement) MyModel.conn.createStatement();
                this.resultset = this.statment.executeQuery("select * from menus where restaurant_id = " + id_resto + " AND " + filter + " LIKE '%" + value + "%'");
                while (this.resultset.next()) {
                    Menu menu = new Menu(this.resultset.getInt("id"),
                            this.resultset.getString("nama"),
                            this.resultset.getString("jenis"),
                            this.resultset.getInt("restaurant_id"),
                            this.resultset.getInt("harga")
                    );
                    System.out.println("Jenis menu: " + menu.getJenis_menu());
                    listMenu.add(menu);
                }
            }
        } catch (Exception e) {
            System.out.println("Error pada lihat menu, pesan: " + e.getMessage());
        }
        return listMenu;
    }
}
