
package com.ubaya.disprog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for insertDataReservasi complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="insertDataReservasi"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="tanggalPemesanan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="jumlahMeja" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="jumlahOrang" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="penilaianBintang" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="restaurantId" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="accountUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertDataReservasi", propOrder = {
    "tanggalPemesanan",
    "jumlahMeja",
    "jumlahOrang",
    "status",
    "penilaianBintang",
    "restaurantId",
    "accountUsername"
})
public class InsertDataReservasi {

    protected String tanggalPemesanan;
    protected int jumlahMeja;
    protected int jumlahOrang;
    protected String status;
    protected int penilaianBintang;
    protected int restaurantId;
    protected String accountUsername;

    /**
     * Gets the value of the tanggalPemesanan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTanggalPemesanan() {
        return tanggalPemesanan;
    }

    /**
     * Sets the value of the tanggalPemesanan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTanggalPemesanan(String value) {
        this.tanggalPemesanan = value;
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
     * Gets the value of the restaurantId property.
     * 
     */
    public int getRestaurantId() {
        return restaurantId;
    }

    /**
     * Sets the value of the restaurantId property.
     * 
     */
    public void setRestaurantId(int value) {
        this.restaurantId = value;
    }

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

}
