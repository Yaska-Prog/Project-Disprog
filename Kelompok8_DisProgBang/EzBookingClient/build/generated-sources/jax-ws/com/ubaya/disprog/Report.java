
package com.ubaya.disprog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for report complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="report"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://disprog.ubaya.com/}myModel"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="account_username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="foodQuality" type="{http://www.w3.org/2001/XMLSchema}double"/&amp;gt;
 *         &amp;lt;element name="idRestaurant" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="qualityOfService" type="{http://www.w3.org/2001/XMLSchema}double"/&amp;gt;
 *         &amp;lt;element name="review" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "report", propOrder = {
    "accountUsername",
    "foodQuality",
    "idRestaurant",
    "qualityOfService",
    "review"
})
public class Report
    extends MyModel
{

    @XmlElement(name = "account_username")
    protected String accountUsername;
    protected double foodQuality;
    protected int idRestaurant;
    protected double qualityOfService;
    protected String review;

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
     * Gets the value of the foodQuality property.
     * 
     */
    public double getFoodQuality() {
        return foodQuality;
    }

    /**
     * Sets the value of the foodQuality property.
     * 
     */
    public void setFoodQuality(double value) {
        this.foodQuality = value;
    }

    /**
     * Gets the value of the idRestaurant property.
     * 
     */
    public int getIdRestaurant() {
        return idRestaurant;
    }

    /**
     * Sets the value of the idRestaurant property.
     * 
     */
    public void setIdRestaurant(int value) {
        this.idRestaurant = value;
    }

    /**
     * Gets the value of the qualityOfService property.
     * 
     */
    public double getQualityOfService() {
        return qualityOfService;
    }

    /**
     * Sets the value of the qualityOfService property.
     * 
     */
    public void setQualityOfService(double value) {
        this.qualityOfService = value;
    }

    /**
     * Gets the value of the review property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReview() {
        return review;
    }

    /**
     * Sets the value of the review property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReview(String value) {
        this.review = value;
    }

}
