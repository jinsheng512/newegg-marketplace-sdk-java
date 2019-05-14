//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.25 at 04:58:15 PM CST 
//


package com.newegg.marketplace.sdk.sbn.model;

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
 *         &lt;element name="OperationType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RequestBody"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="GetRequestStatus"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="RequestIDList" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *                                       &lt;element name="RequestID" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ActionCode" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                                   &lt;enumeration value="0"/&gt;
 *                                   &lt;enumeration value="1"/&gt;
 *                                   &lt;enumeration value="2"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="MaxCount" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                                   &lt;minInclusive value="1"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="RequestStatus" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="ALL"/&gt;
 *                                   &lt;enumeration value="SUBMITTED"/&gt;
 *                                   &lt;enumeration value="IN_PROGRESS"/&gt;
 *                                   &lt;enumeration value="FINISHED"/&gt;
 *                                   &lt;enumeration value="CANCELLED"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="RequestDateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RequestDateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
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
public class GetShipmentStatusRequest {

    @XmlElement(name = "OperationType", required = true)
    @JsonProperty("OperationType")
    protected String operationType="GetShipmentStatusRequest";
    @XmlElement(name = "RequestBody", required = true)
    @JsonProperty("RequestBody")
    protected GetShipmentStatusRequest.RequestBody requestBody;

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
     * Gets the value of the requestBody property.
     * 
     * @return
     *     possible object is
     *     {@link GetShipmentStatusRequest.RequestBody }
     *     
     */
    public GetShipmentStatusRequest.RequestBody getRequestBody() {
        return requestBody;
    }

    /**
     * Sets the value of the requestBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetShipmentStatusRequest.RequestBody }
     *     
     */
    public void setRequestBody(GetShipmentStatusRequest.RequestBody value) {
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
     *       &lt;all&gt;
     *         &lt;element name="GetRequestStatus"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="RequestIDList" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
     *                             &lt;element name="RequestID" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ActionCode" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *                         &lt;enumeration value="0"/&gt;
     *                         &lt;enumeration value="1"/&gt;
     *                         &lt;enumeration value="2"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="MaxCount" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *                         &lt;minInclusive value="1"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="RequestStatus" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="ALL"/&gt;
     *                         &lt;enumeration value="SUBMITTED"/&gt;
     *                         &lt;enumeration value="IN_PROGRESS"/&gt;
     *                         &lt;enumeration value="FINISHED"/&gt;
     *                         &lt;enumeration value="CANCELLED"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="RequestDateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RequestDateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
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
    public static class RequestBody {

        @XmlElement(name = "GetRequestStatus", required = true)
        @JsonProperty("GetRequestStatus")
        protected GetShipmentStatusRequest.RequestBody.GetRequestStatus getRequestStatus;

        /**
         * Gets the value of the getRequestStatus property.
         * 
         * @return
         *     possible object is
         *     {@link GetShipmentStatusRequest.RequestBody.GetRequestStatus }
         *     
         */
        public GetShipmentStatusRequest.RequestBody.GetRequestStatus getGetRequestStatus() {
            return getRequestStatus;
        }

        /**
         * Sets the value of the getRequestStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetShipmentStatusRequest.RequestBody.GetRequestStatus }
         *     
         */
        public void setGetRequestStatus(GetShipmentStatusRequest.RequestBody.GetRequestStatus value) {
            this.getRequestStatus = value;
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
         *         &lt;element name="RequestIDList" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
         *                   &lt;element name="RequestID" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ActionCode" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
         *               &lt;enumeration value="0"/&gt;
         *               &lt;enumeration value="1"/&gt;
         *               &lt;enumeration value="2"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="MaxCount" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
         *               &lt;minInclusive value="1"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="RequestStatus" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="ALL"/&gt;
         *               &lt;enumeration value="SUBMITTED"/&gt;
         *               &lt;enumeration value="IN_PROGRESS"/&gt;
         *               &lt;enumeration value="FINISHED"/&gt;
         *               &lt;enumeration value="CANCELLED"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="RequestDateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RequestDateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        public static class GetRequestStatus {

            @XmlElement(name = "RequestIDList")
            @JsonProperty("RequestIDList")
            protected GetShipmentStatusRequest.RequestBody.GetRequestStatus.RequestIDList requestIDList;
            @XmlElement(name = "ActionCode")
            @JsonProperty("ActionCode")
            protected BigInteger actionCode;
            @XmlElement(name = "MaxCount", defaultValue = "100")
            @JsonProperty("MaxCount")
            protected BigInteger maxCount;
            @XmlElement(name = "RequestStatus")
            @JsonProperty("RequestStatus")
            protected String requestStatus;
            @XmlElement(name = "RequestDateFrom")
            @JsonProperty("RequestDateFrom")
            protected String requestDateFrom;
            @XmlElement(name = "RequestDateTo")
            @JsonProperty("RequestDateTo")
            protected String requestDateTo;

            /**
             * Gets the value of the requestIDList property.
             * 
             * @return
             *     possible object is
             *     {@link GetShipmentStatusRequest.RequestBody.GetRequestStatus.RequestIDList }
             *     
             */
            public GetShipmentStatusRequest.RequestBody.GetRequestStatus.RequestIDList getRequestIDList() {
                return requestIDList;
            }

            /**
             * Sets the value of the requestIDList property.
             * 
             * @param value
             *     allowed object is
             *     {@link GetShipmentStatusRequest.RequestBody.GetRequestStatus.RequestIDList }
             *     
             */
            public void setRequestIDList(GetShipmentStatusRequest.RequestBody.GetRequestStatus.RequestIDList value) {
                this.requestIDList = value;
            }

            /**
             * Gets the value of the actionCode property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getActionCode() {
                return actionCode;
            }

            /**
             * Sets the value of the actionCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setActionCode(BigInteger value) {
                this.actionCode = value;
            }

            /**
             * Gets the value of the maxCount property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMaxCount() {
                return maxCount;
            }

            /**
             * Sets the value of the maxCount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMaxCount(BigInteger value) {
                this.maxCount = value;
            }

            /**
             * Gets the value of the requestStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRequestStatus() {
                return requestStatus;
            }

            /**
             * Sets the value of the requestStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRequestStatus(String value) {
                this.requestStatus = value;
            }

            /**
             * Gets the value of the requestDateFrom property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRequestDateFrom() {
                return requestDateFrom;
            }

            /**
             * Sets the value of the requestDateFrom property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRequestDateFrom(String value) {
                this.requestDateFrom = value;
            }

            /**
             * Gets the value of the requestDateTo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRequestDateTo() {
                return requestDateTo;
            }

            /**
             * Sets the value of the requestDateTo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRequestDateTo(String value) {
                this.requestDateTo = value;
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
             *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
             *         &lt;element name="RequestID" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;minLength value="1"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
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
                "requestID"
            })
            public static class RequestIDList {

                @XmlElement(name = "RequestID")
                @JsonProperty("RequestID")
                protected List<String> requestID;

                /**
                 * Gets the value of the requestID property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the requestID property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRequestID().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * @return
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 */
                public List<String> getRequestID() {
                    if (requestID == null) {
                        requestID = new ArrayList<String>();
                    }
                    return this.requestID;
                }

            }

        }

    }

}
