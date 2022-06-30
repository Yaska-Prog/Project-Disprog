/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;

/**
 *
 * @author LENOVO
 */
public class Menu extends MyModel{

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

    public Menu(int id, String nama_menu, int resto_id, int harga) {
        this.id = id;
        this.nama_menu = nama_menu;
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
                System.out.println("Masuk1");
                PreparedStatement sql = (PreparedStatement) MyModel.conn.prepareStatement("insert into menus(jenis, nama, harga, restaurant_id)"
                        + " values(?,?,?,?)");
                sql.setString(1, jenis_menu);
                System.out.println("Berhasil jenis menu");
                sql.setString(2, nama_menu);
                System.out.println("Berhasil nama menu");
                sql.setInt(3, harga);
                System.out.println("Berhasil harga menu");
                sql.setInt(4, resto_id);
                System.out.println("Berhasil id resto");

                sql.executeUpdate();
                sql.close();
                status = true;
            }
        } catch (Exception e) {
            System.out.println("Error pada insertMenu, pesan kesalahan: " + e.getMessage());
        }
        return status;
    }

}