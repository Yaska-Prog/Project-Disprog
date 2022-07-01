/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 *
 * @author LENOVO
 */
public class Orders extends MyModel {

    private int menu_id;
    private int resto_id;
    private int reservasi_id;
    private int jumlah_pesanan;

    public Orders(int menu_id, int resto_id,  int reservasi_id, int jumlah_pesanan) {
        this.menu_id = menu_id;
        this.reservasi_id = reservasi_id;
        this.jumlah_pesanan = jumlah_pesanan;
        this.resto_id = resto_id;
    }

    public Orders(int menu_id, int reservasi_id, int jumlah_pesanan) {
        this.menu_id = menu_id;
        this.reservasi_id = reservasi_id;
        this.jumlah_pesanan = jumlah_pesanan;
    }

    public Orders() {
    }

    public int getMenu_id() {
        return menu_id;
    }

    public int getResto_id() {
        return resto_id;
    }

    public void setResto_id(int resto_id) {
        this.resto_id = resto_id;
    }

    public void setMenu_id(int menu_id) {
        this.menu_id = menu_id;
    }

    public int getReservasi_id() {
        return reservasi_id;
    }

    public void setReservasi_id(int reservasi_id) {
        this.reservasi_id = reservasi_id;
    }

    public int getJumlah_pesanan() {
        return jumlah_pesanan;
    }

    public void setJumlah_pesanan(int jumlah_pesanan) {
        this.jumlah_pesanan = jumlah_pesanan;
    }

    public boolean insertOrder(){
        boolean status = false;
        try {
            if (!MyModel.conn.isClosed()) {
                System.out.println("Masuk1");
                PreparedStatement sql = (PreparedStatement) MyModel.conn.prepareStatement("insert into orders(menus_id, reservasi_id, jumlah_pesanan)"
                        + " values(?,?,?)");
                sql.setInt(1, this.getMenu_id());
                sql.setInt(2, this.getReservasi_id());
                sql.setInt(3, this.getJumlah_pesanan());
                sql.executeUpdate();
                sql.close();
                status = true;
            }
        } catch (Exception e) {
            System.out.println("Error pada pemasukkan order, pesan: " + e.getMessage());
        }
        return status;
    }
    
    public int subTotal(){
        int harga = 0;
        try {
            this.statment = (Statement) MyModel.conn.createStatement();
            this.resultset = this.statment.executeQuery("SELECT SUM(o.jumlah_pesanan * m.harga) FROM menus m INNER join orders o on o.menus_id = m.id WHERE o.reservasi_id = " + this.getReservasi_id());
        } catch (Exception e) {
        }
        return harga;
    }
    
}
