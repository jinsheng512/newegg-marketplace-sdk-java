//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2019.02.27 於 01:26:44 PM CST 
//

package com.newegg.marketplace.sdk.report.model.get;


import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;


/**
 * <p>anonymous complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="IssueUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OperationType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="GetReportStatusRequest"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RequestBody"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="GetRequestStatus"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="RequestIDList" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="RequestID" maxOccurs="unbounded"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;pattern value="[0-9a-zA-Z]+"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="RequestTypeList" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="RequestType" maxOccurs="unbounded"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;enumeration value="ORDER_LIST_REPORT"/&gt;
 *                                             &lt;enumeration value="SETTLEMENT_SUMMARY_REPORT"/&gt;
 *                                             &lt;enumeration value="SETTLEMENT_TRASACTION_REPORT"/&gt;
 *                                             &lt;enumeration value="RMA_LIST_REPORT"/&gt;
 *                                             &lt;enumeration value="ITEM_LOOKUP"/&gt;
 *                                             &lt;enumeration value="INTERNATIONAL_INVENTORY_REPORT"/&gt;
 *                                             &lt;enumeration value="INTERNATIONAL_PRICE_REPORT"/&gt;
 *                                             &lt;enumeration value="PREMIER_ITEM_REPORT"/&gt;
 *                                             &lt;enumeration value="CAPROP65_REPORT"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="MaxCount" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                                   &lt;minInclusive value="0"/&gt;
 *                                   &lt;maxInclusive value="100"/&gt;
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
@JsonRootName("NeweggAPIRequest")
public class GetReportStatusRequest {

    @XmlElement(name = "IssueUser")
    @JsonProperty("IssueUser")
    protected String issueUser;
    @XmlElement(name = "OperationType", defaultValue = "GetReportStatusRequest", required = true)
    @JsonProperty("OperationType")
    protected String operationType = "GetReportStatusRequest";
    @XmlElement(name = "RequestBody", required = true)
    @JsonProperty("RequestBody")
    protected GetReportStatusRequest.RequestBody requestBody;

    /**
     * 取得 issueUser 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueUser() {
        return issueUser;
    }

    /**
     * 設定 issueUser 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueUser(String value) {
        this.issueUser = value;
    }

    /**
     * 取得 operationType 特性的值.
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
     * 設定 operationType 特性的值.
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
     * 取得 requestBody 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link GetReportStatusRequest.RequestBody }
     *     
     */
    public GetReportStatusRequest.RequestBody getRequestBody() {
        return requestBody;
    }

    /**
     * 設定 requestBody 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link GetReportStatusRequest.RequestBody }
     *     
     */
    public void setRequestBody(GetReportStatusRequest.RequestBody value) {
        this.requestBody = value;
    }


    /**
     * <p>anonymous complex type 的 Java 類別.
     * 
     * <p>下列綱要片段會指定此類別中包含的預期內容.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="GetRequestStatus"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="RequestIDList" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="RequestID" maxOccurs="unbounded"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;pattern value="[0-9a-zA-Z]+"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="RequestTypeList" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="RequestType" maxOccurs="unbounded"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;enumeration value="ORDER_LIST_REPORT"/&gt;
     *                                   &lt;enumeration value="SETTLEMENT_SUMMARY_REPORT"/&gt;
     *                                   &lt;enumeration value="SETTLEMENT_TRASACTION_REPORT"/&gt;
     *                                   &lt;enumeration value="RMA_LIST_REPORT"/&gt;
     *                                   &lt;enumeration value="ITEM_LOOKUP"/&gt;
     *                                   &lt;enumeration value="INTERNATIONAL_INVENTORY_REPORT"/&gt;
     *                                   &lt;enumeration value="INTERNATIONAL_PRICE_REPORT"/&gt;
     *                                   &lt;enumeration value="PREMIER_ITEM_REPORT"/&gt;
     *                                   &lt;enumeration value="CAPROP65_REPORT"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="MaxCount" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *                         &lt;minInclusive value="0"/&gt;
     *                         &lt;maxInclusive value="100"/&gt;
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
        "getRequestStatus"
    })
    public static class RequestBody {

        @XmlElement(name = "GetRequestStatus", required = true)
        @JsonProperty("GetRequestStatus")
        protected GetReportStatusRequest.RequestBody.GetRequestStatus getRequestStatus;

        /**
         * 取得 getRequestStatus 特性的值.
         * 
         * @return
         *     possible object is
         *     {@link GetReportStatusRequest.RequestBody.GetRequestStatus }
         *     
         */
        public GetReportStatusRequest.RequestBody.GetRequestStatus getGetRequestStatus() {
            return getRequestStatus;
        }

        /**
         * 設定 getRequestStatus 特性的值.
         * 
         * @param value
         *     allowed object is
         *     {@link GetReportStatusRequest.RequestBody.GetRequestStatus }
         *     
         */
        public void setGetRequestStatus(GetReportStatusRequest.RequestBody.GetRequestStatus value) {
            this.getRequestStatus = value;
        }


        /**
         * <p>anonymous complex type 的 Java 類別.
         * 
         * <p>下列綱要片段會指定此類別中包含的預期內容.
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
         *                 &lt;sequence&gt;
         *                   &lt;element name="RequestID" maxOccurs="unbounded"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;pattern value="[0-9a-zA-Z]+"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="RequestTypeList" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="RequestType" maxOccurs="unbounded"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;enumeration value="ORDER_LIST_REPORT"/&gt;
         *                         &lt;enumeration value="SETTLEMENT_SUMMARY_REPORT"/&gt;
         *                         &lt;enumeration value="SETTLEMENT_TRASACTION_REPORT"/&gt;
         *                         &lt;enumeration value="RMA_LIST_REPORT"/&gt;
         *                         &lt;enumeration value="ITEM_LOOKUP"/&gt;
         *                         &lt;enumeration value="INTERNATIONAL_INVENTORY_REPORT"/&gt;
         *                         &lt;enumeration value="INTERNATIONAL_PRICE_REPORT"/&gt;
         *                         &lt;enumeration value="PREMIER_ITEM_REPORT"/&gt;
         *                         &lt;enumeration value="CAPROP65_REPORT"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="MaxCount" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
         *               &lt;minInclusive value="0"/&gt;
         *               &lt;maxInclusive value="100"/&gt;
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
            protected GetReportStatusRequest.RequestBody.GetRequestStatus.RequestIDList requestIDList;
            @XmlElement(name = "RequestTypeList")
            @JsonProperty("RequestTypeList")
            protected GetReportStatusRequest.RequestBody.GetRequestStatus.RequestTypeList requestTypeList;
            @XmlElement(name = "MaxCount")
            @JsonProperty("MaxCount")
            protected Integer maxCount;
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
             * 取得 requestIDList 特性的值.
             * 
             * @return
             *     possible object is
             *     {@link GetReportStatusRequest.RequestBody.GetRequestStatus.RequestIDList }
             *     
             */
            public GetReportStatusRequest.RequestBody.GetRequestStatus.RequestIDList getRequestIDList() {
                return requestIDList;
            }

            /**
             * 設定 requestIDList 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link GetReportStatusRequest.RequestBody.GetRequestStatus.RequestIDList }
             *     
             */
            public void setRequestIDList(GetReportStatusRequest.RequestBody.GetRequestStatus.RequestIDList value) {
                this.requestIDList = value;
            }

            /**
             * 取得 requestTypeList 特性的值.
             * 
             * @return
             *     possible object is
             *     {@link GetReportStatusRequest.RequestBody.GetRequestStatus.RequestTypeList }
             *     
             */
            public GetReportStatusRequest.RequestBody.GetRequestStatus.RequestTypeList getRequestTypeList() {
                return requestTypeList;
            }

            /**
             * 設定 requestTypeList 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link GetReportStatusRequest.RequestBody.GetRequestStatus.RequestTypeList }
             *     
             */
            public void setRequestTypeList(GetReportStatusRequest.RequestBody.GetRequestStatus.RequestTypeList value) {
                this.requestTypeList = value;
            }

            /**
             * 取得 maxCount 特性的值.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMaxCount() {
                return maxCount;
            }

            /**
             * 設定 maxCount 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMaxCount(Integer value) {
                this.maxCount = value;
            }

            /**
             * 取得 requestStatus 特性的值.
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
             * 設定 requestStatus 特性的值.
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
             * 取得 requestDateFrom 特性的值.
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
             * 設定 requestDateFrom 特性的值.
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
             * 取得 requestDateTo 特性的值.
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
             * 設定 requestDateTo 特性的值.
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
             * <p>anonymous complex type 的 Java 類別.
             * 
             * <p>下列綱要片段會指定此類別中包含的預期內容.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="RequestID" maxOccurs="unbounded"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;pattern value="[0-9a-zA-Z]+"/&gt;
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

                @XmlElement(name = "RequestID", required = true)
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


            /**
             * <p>anonymous complex type 的 Java 類別.
             * 
             * <p>下列綱要片段會指定此類別中包含的預期內容.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="RequestType" maxOccurs="unbounded"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;enumeration value="ORDER_LIST_REPORT"/&gt;
             *               &lt;enumeration value="SETTLEMENT_SUMMARY_REPORT"/&gt;
             *               &lt;enumeration value="SETTLEMENT_TRASACTION_REPORT"/&gt;
             *               &lt;enumeration value="RMA_LIST_REPORT"/&gt;
             *               &lt;enumeration value="ITEM_LOOKUP"/&gt;
             *               &lt;enumeration value="INTERNATIONAL_INVENTORY_REPORT"/&gt;
             *               &lt;enumeration value="INTERNATIONAL_PRICE_REPORT"/&gt;
             *               &lt;enumeration value="PREMIER_ITEM_REPORT"/&gt;
             *               &lt;enumeration value="CAPROP65_REPORT"/&gt;
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
                "requestType"
            })
            public static class RequestTypeList {

                @XmlElement(name = "RequestType", required = true)
                @JsonProperty("RequestType")
                protected List<String> requestType;

                /**
                 * Gets the value of the requestType property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the requestType property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRequestType().add(newItem);
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
                public List<String> getRequestType() {
                    if (requestType == null) {
                        requestType = new ArrayList<String>();
                    }
                    return this.requestType;
                }

            }

        }

    }
}
