
package com.ubaya.disprog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for reservasi complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="reservasi"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://disprog.ubaya.com/}myModel"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="accountUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="jumlahMeja" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="jumlahOrang" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="penilaianBintang" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="restaurant" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="tanggalPesanan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reservasi", propOrder = {
    "accountUsername",
    "id",
    "jumlahMeja",
    "jumlahOrang",
    "penilaianBintang",
    "restaurant",
    "status",
    "tanggalPesanan"
})
public class Reservasi
    extends MyModel
{

    protected String accountUsername;
    protected int id;
    protected int jumlahMeja;
    protected int jumlahOrang;
    protected int penilaianBintang;
    protected int restaurant;
    protected String status;
    protected String tanggalPesanan;

    /**
     * Gets the value of the accountUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountUsername() {
        return accountUsername;
    }

    /**
     * Sets the value of the accountUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountUsername(String value) {
        this.accountUsername = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the jumlahMeja property.
     * 
     */
    public int getJumlahMeja() {
        return jumlahMeja;
    }

    /**
     * Sets the value of the jumlahMeja property.
     * 
     */
    public void setJumlahMeja(int value) {
        this.jumlahMeja = value;
    }

    /**
     * Gets the value of the jumlahOrang property.
     * 
     */
    public int getJumlahOrang() {
        return jumlahOrang;
    }

    /**
     * Sets the value of the jumlahOrang property.
     * 
     */
    public void setJumlahOrang(int value) {
        this.jumlahOrang = value;
    }

    /**
     * Gets the value of the penilaianBintang property.
     * 
     */
    public int getPenilaianBintang() {
        return penilaianBintang;
    }

    /**
     * Sets the value of the penilaianBintang property.
     * 
     */
    public void setPenilaianBintang(int value) {
        this.penilaianBintang = value;
    }

    /**
     * Gets the value of the restaurant property.
     * 
     */
    public int getRestaurant() {
        return restaurant;
    }

    /**
     * Sets the value of the restaurant property.
     * 
     */
    public void setRestaurant(int value) {
        this.restaurant = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the tanggalPesanan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTanggalPesanan() {
        return tanggalPesanan;
    }

    /**
     * Sets the value of the tanggalPesanan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTanggalPesanan(String value) {
        this.tanggalPesanan = value;
    }

}
