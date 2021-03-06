//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.19 at 04:28:47 PM CST 
//


package com.newegg.marketplace.sdk.item.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="OperationType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="SubmitItemWarrantyRequest"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ActionType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;enumeration value="0"/&gt;
 *               &lt;enumeration value="1"/&gt;
 *               &lt;enumeration value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RequestBody"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ItemWarrantyList"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ItemWarranty" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="ItemManufacturerWarrantyID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                                       &lt;element name="SellerPartNumber"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;minLength value="0"/&gt;
 *                                             &lt;maxLength value="40"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="PartsDay" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                                             &lt;minInclusive value="0"/&gt;
 *                                             &lt;maxInclusive value="99999"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="LaborDay" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                                             &lt;minInclusive value="0"/&gt;
 *                                             &lt;maxInclusive value="99999"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="ServiceProvider"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;minLength value="0"/&gt;
 *                                             &lt;maxLength value="200"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="ProviderSupportEmail"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;minLength value="0"/&gt;
 *                                             &lt;maxLength value="100"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="ProviderSupportURL" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;minLength value="0"/&gt;
 *                                             &lt;maxLength value="250"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="ProviderCustomerServicePhone"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;minLength value="0"/&gt;
 *                                             &lt;maxLength value="40"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="CountryCode"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;length value="3"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="ApplyToAllCountryCode" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                                     &lt;/all&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "NeweggAPIRequest")
public class ItemWarrantyRequest {

    @XmlElement(name = "OperationType", required = true)
    @JsonProperty("OperationType")
    protected String operationType="SubmitItemWarrantyRequest";
    @XmlElement(name = "ActionType")
    @JsonProperty("ActionType")
    protected int actionType;
    @XmlElement(name = "RequestBody", required = true)
    @JsonProperty("RequestBody")
    protected ItemWarrantyRequest.RequestBody requestBody;

    /**
     * Gets the value of the operationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationType(String value) {
        this.operationType = value;
    }

    /**
     * Gets the value of the actionType property.
     * @return
     * possible object is 
     *     {@link int }
     * 
     */
    public int getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * @param value
     *     allowed object is
     *     {@link  }
     * 
     */
    public void setActionType(int value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the requestBody property.
     * 
     * @return
     *     possible object is
     *     {@link ItemWarrantyRequest.RequestBody }
     *     
     */
    public ItemWarrantyRequest.RequestBody getRequestBody() {
        return requestBody;
    }

    /**
     * Sets the value of the requestBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemWarrantyRequest.RequestBody }
     *     
     */
    public void setRequestBody(ItemWarrantyRequest.RequestBody value) {
        this.requestBody = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ItemWarrantyList"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ItemWarranty" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="ItemManufacturerWarrantyID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                             &lt;element name="SellerPartNumber"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;minLength value="0"/&gt;
     *                                   &lt;maxLength value="40"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="PartsDay" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *                                   &lt;minInclusive value="0"/&gt;
     *                                   &lt;maxInclusive value="99999"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="LaborDay" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *                                   &lt;minInclusive value="0"/&gt;
     *                                   &lt;maxInclusive value="99999"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="ServiceProvider"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;minLength value="0"/&gt;
     *                                   &lt;maxLength value="200"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="ProviderSupportEmail"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;minLength value="0"/&gt;
     *                                   &lt;maxLength value="100"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="ProviderSupportURL" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;minLength value="0"/&gt;
     *                                   &lt;maxLength value="250"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="ProviderCustomerServicePhone"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;minLength value="0"/&gt;
     *                                   &lt;maxLength value="40"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="CountryCode"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;length value="3"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="ApplyToAllCountryCode" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                           &lt;/all&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "itemWarrantyList"
    })
    public static class RequestBody {

        @XmlElement(name = "ItemWarrantyList", required = true)
        @JsonProperty("ItemWarrantyList")
        protected ItemWarrantyRequest.RequestBody.ItemWarrantyList itemWarrantyList;

        /**
         * Gets the value of the itemWarrantyList property.
         * 
         * @return
         *     possible object is
         *     {@link ItemWarrantyRequest.RequestBody.ItemWarrantyList }
         *     
         */
        public ItemWarrantyRequest.RequestBody.ItemWarrantyList getItemWarrantyList() {
            return itemWarrantyList;
        }

        /**
         * Sets the value of the itemWarrantyList property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItemWarrantyRequest.RequestBody.ItemWarrantyList }
         *     
         */
        public void setItemWarrantyList(ItemWarrantyRequest.RequestBody.ItemWarrantyList value) {
            this.itemWarrantyList = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="ItemWarranty" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="ItemManufacturerWarrantyID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *                   &lt;element name="SellerPartNumber"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;minLength value="0"/&gt;
         *                         &lt;maxLength value="40"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="PartsDay" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
         *                         &lt;minInclusive value="0"/&gt;
         *                         &lt;maxInclusive value="99999"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="LaborDay" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
         *                         &lt;minInclusive value="0"/&gt;
         *                         &lt;maxInclusive value="99999"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="ServiceProvider"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;minLength value="0"/&gt;
         *                         &lt;maxLength value="200"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="ProviderSupportEmail"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;minLength value="0"/&gt;
         *                         &lt;maxLength value="100"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="ProviderSupportURL" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;minLength value="0"/&gt;
         *                         &lt;maxLength value="250"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="ProviderCustomerServicePhone"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;minLength value="0"/&gt;
         *                         &lt;maxLength value="40"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="CountryCode"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;length value="3"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="ApplyToAllCountryCode" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *                 &lt;/all&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "itemWarranty"
        })
        public static class ItemWarrantyList {

            @XmlElement(name = "ItemWarranty", required = true)
            @JsonProperty("ItemWarranty")
            protected List<ItemWarrantyRequest.RequestBody.ItemWarrantyList.ItemWarranty> itemWarranty;

            /**
             * Gets the value of the itemWarranty property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the itemWarranty property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getItemWarranty().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ItemWarrantyRequest.RequestBody.ItemWarrantyList.ItemWarranty }
             * 
             * @return
             * Objects of the following type(s) are allowed in the list
             * {@link ItemWarrantyRequest.RequestBody.ItemWarrantyList.ItemWarranty }
             * 
             */
            public List<ItemWarrantyRequest.RequestBody.ItemWarrantyList.ItemWarranty> getItemWarranty() {
                if (itemWarranty == null) {
                    itemWarranty = new ArrayList<ItemWarrantyRequest.RequestBody.ItemWarrantyList.ItemWarranty>();
                }
                return this.itemWarranty;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;all&gt;
             *         &lt;element name="ItemManufacturerWarrantyID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
             *         &lt;element name="SellerPartNumber"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;minLength value="0"/&gt;
             *               &lt;maxLength value="40"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="PartsDay" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
             *               &lt;minInclusive value="0"/&gt;
             *               &lt;maxInclusive value="99999"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="LaborDay" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
             *               &lt;minInclusive value="0"/&gt;
             *               &lt;maxInclusive value="99999"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="ServiceProvider"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;minLength value="0"/&gt;
             *               &lt;maxLength value="200"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="ProviderSupportEmail"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;minLength value="0"/&gt;
             *               &lt;maxLength value="100"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="ProviderSupportURL" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;minLength value="0"/&gt;
             *               &lt;maxLength value="250"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="ProviderCustomerServicePhone"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;minLength value="0"/&gt;
             *               &lt;maxLength value="40"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="CountryCode"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;length value="3"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="ApplyToAllCountryCode" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
             *       &lt;/all&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class ItemWarranty {

                @XmlElement(name = "ItemManufacturerWarrantyID")
                @JsonProperty("ItemManufacturerWarrantyID")
                protected BigInteger itemManufacturerWarrantyID;
                @XmlElement(name = "SellerPartNumber", required = true)
                @JsonProperty("SellerPartNumber")
                protected String sellerPartNumber;
                @XmlElement(name = "PartsDay")
                @JsonProperty("PartsDay")
                protected Integer partsDay;
                @XmlElement(name = "LaborDay")
                @JsonProperty("LaborDay")
                protected Integer laborDay;
                @XmlElement(name = "ServiceProvider", required = true)
                @JsonProperty("ServiceProvider")
                protected String serviceProvider;
                @XmlElement(name = "ProviderSupportEmail", required = true)
                @JsonProperty("ProviderSupportEmail")
                protected String providerSupportEmail;                
                @XmlElement(name = "ProviderSupportURL")
                @JsonProperty("ProviderSupportURL")
                protected String providerSupportURL;
                @XmlElement(name = "ProviderCustomerServicePhone", required = true)
                @JsonProperty("ProviderCustomerServicePhone")
                protected String providerCustomerServicePhone;
                @XmlElement(name = "CountryCode", required = true)
                @JsonProperty("CountryCode")
                protected String countryCode;
                @XmlElement(name = "ApplyToAllCountryCode")
                @JsonProperty("ApplyToAllCountryCode")
                protected boolean applyToAllCountryCode;

                /**
                 * Gets the value of the itemManufacturerWarrantyID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getItemManufacturerWarrantyID() {
                    return itemManufacturerWarrantyID;
                }

                /**
                 * Sets the value of the itemManufacturerWarrantyID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setItemManufacturerWarrantyID(BigInteger value) {
                    this.itemManufacturerWarrantyID = value;
                }

                /**
                 * Gets the value of the sellerPartNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSellerPartNumber() {
                    return sellerPartNumber;
                }

                /**
                 * Sets the value of the sellerPartNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSellerPartNumber(String value) {
                    this.sellerPartNumber = value;
                }

                /**
                 * Gets the value of the partsDay property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getPartsDay() {
                    return partsDay;
                }

                /**
                 * Sets the value of the partsDay property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setPartsDay(Integer value) {
                    this.partsDay = value;
                }

                /**
                 * Gets the value of the laborDay property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getLaborDay() {
                    return laborDay;
                }

                /**
                 * Sets the value of the laborDay property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setLaborDay(Integer value) {
                    this.laborDay = value;
                }

                /**
                 * Gets the value of the serviceProvider property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getServiceProvider() {
                    return serviceProvider;
                }

                /**
                 * Sets the value of the serviceProvider property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setServiceProvider(String value) {
                    this.serviceProvider = value;
                }

                /**
                 * Gets the value of the providerSupportEmail property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProviderSupportEmail() {
                    return providerSupportEmail;
                }

                /**
                 * Sets the value of the providerSupportEmail property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProviderSupportEmail(String value) {
                    this.providerSupportEmail = value;
                }

                /**
                 * Gets the value of the providerSupportURL property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProviderSupportURL() {
                    return providerSupportURL;
                }

                /**
                 * Sets the value of the providerSupportURL property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProviderSupportURL(String value) {
                    this.providerSupportURL = value;
                }

                /**
                 * Gets the value of the providerCustomerServicePhone property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProviderCustomerServicePhone() {
                    return providerCustomerServicePhone;
                }

                /**
                 * Sets the value of the providerCustomerServicePhone property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProviderCustomerServicePhone(String value) {
                    this.providerCustomerServicePhone = value;
                }

                /**
                 * Gets the value of the countryCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCountryCode() {
                    return countryCode;
                }

                /**
                 * Sets the value of the countryCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCountryCode(String value) {
                    this.countryCode = value;
                }

                /**
                 * Gets the value of the applyToAllCountryCode property.
                 * @return
                 *     possible object is
                 *     {@link boolean}
                 */
                public boolean isApplyToAllCountryCode() {
                    return applyToAllCountryCode;
                }

                /**
                 * Sets the value of the applyToAllCountryCode property.
                 * @param value
                 *     allowed object is
                 *     {@link  }
                 * 
                 */
                public void setApplyToAllCountryCode(boolean value) {
                    this.applyToAllCountryCode = value;
                }

            }

        }

    }

}
