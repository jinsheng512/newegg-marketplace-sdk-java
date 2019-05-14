//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.06 at 03:45:30 PM CST 
//

package com.newegg.marketplace.sdk.rma.model;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="IsSuccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="OperationType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SellerID"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ResponseBody"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="RMAInfo"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="RMANumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                             &lt;element name="RMAType"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                                   &lt;minInclusive value="1"/&gt;
 *                                   &lt;maxInclusive value="2"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="RMATypeDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="SourceSONumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="SellerRMANumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="RMAShipMethod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="RMAShipMethodDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="RMANote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="IssueUser"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="RMATransactionList"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence maxOccurs="unbounded"&gt;
 *                                       &lt;element name="RMATransaction"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;all&gt;
 *                                                 &lt;element name="SellerPartNumber"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="ReturnQuantity"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                                                       &lt;minInclusive value="1"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="ReturnUnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                                 &lt;element name="RefundShippingPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                                 &lt;element name="RMAReason"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                                                       &lt;minInclusive value="1"/&gt;
 *                                                       &lt;maxInclusive value="9"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="RMAReasonDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                               &lt;/all&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
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
 *         &lt;element name="Memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResponseDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlRootElement(name = "NeweggAPIResponse")
public class VoidRMAResponse {

	@XmlElement(name = "IsSuccess")
	@JsonProperty("IsSuccess")
	protected String isSuccess;

	@XmlElement(name = "OperationType", required = true)
	@JsonProperty("OperationType")
	protected String operationType = "VoidRMAResponse";

	@XmlElement(name = "SellerID", required = true)
	@JsonProperty("SellerID")
	protected String sellerID;

	@XmlElement(name = "ResponseBody", required = true)
	@JsonProperty("ResponseBody")
	protected VoidRMAResponse.ResponseBody responseBody;

	@XmlElement(name = "Memo")
	@JsonProperty("Memo")
	protected String memo;

	@XmlElement(name = "ResponseDate", required = true)
	@JsonProperty("ResponseDate")
	protected String responseDate;

	public String getIsSuccess() {
		return isSuccess;
	}

	public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getSellerID() {
		return sellerID;
	}

	public void setSellerID(String sellerID) {
		this.sellerID = sellerID;
	}

	public VoidRMAResponse.ResponseBody getResponseBody() {
		return responseBody;
	}

	public void setResponseBody(VoidRMAResponse.ResponseBody responseBody) {
		this.responseBody = responseBody;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getResponseDate() {
		return responseDate;
	}

	public void setResponseDate(String responseDate) {
		this.responseDate = responseDate;
	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained within this class.
	 * 
	 * <pre>
	 * &lt;complexType&gt;
	 *   &lt;complexContent&gt;
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *       &lt;all&gt;
	 *         &lt;element name="RMAInfo"&gt;
	 *           &lt;complexType&gt;
	 *             &lt;complexContent&gt;
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *                 &lt;all&gt;
	 *                   &lt;element name="RMANumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
	 *                   &lt;element name="RMAType"&gt;
	 *                     &lt;simpleType&gt;
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
	 *                         &lt;minInclusive value="1"/&gt;
	 *                         &lt;maxInclusive value="2"/&gt;
	 *                       &lt;/restriction&gt;
	 *                     &lt;/simpleType&gt;
	 *                   &lt;/element&gt;
	 *                   &lt;element name="RMATypeDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                   &lt;element name="SourceSONumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
	 *                   &lt;element name="SellerRMANumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                   &lt;element name="RMAShipMethod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                   &lt;element name="RMAShipMethodDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                   &lt;element name="RMANote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *                   &lt;element name="IssueUser"&gt;
	 *                     &lt;simpleType&gt;
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
	 *                       &lt;/restriction&gt;
	 *                     &lt;/simpleType&gt;
	 *                   &lt;/element&gt;
	 *                   &lt;element name="RMATransactionList"&gt;
	 *                     &lt;complexType&gt;
	 *                       &lt;complexContent&gt;
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *                           &lt;sequence maxOccurs="unbounded"&gt;
	 *                             &lt;element name="RMATransaction"&gt;
	 *                               &lt;complexType&gt;
	 *                                 &lt;complexContent&gt;
	 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *                                     &lt;all&gt;
	 *                                       &lt;element name="SellerPartNumber"&gt;
	 *                                         &lt;simpleType&gt;
	 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
	 *                                           &lt;/restriction&gt;
	 *                                         &lt;/simpleType&gt;
	 *                                       &lt;/element&gt;
	 *                                       &lt;element name="ReturnQuantity"&gt;
	 *                                         &lt;simpleType&gt;
	 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
	 *                                             &lt;minInclusive value="1"/&gt;
	 *                                           &lt;/restriction&gt;
	 *                                         &lt;/simpleType&gt;
	 *                                       &lt;/element&gt;
	 *                                       &lt;element name="ReturnUnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
	 *                                       &lt;element name="RefundShippingPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
	 *                                       &lt;element name="RMAReason"&gt;
	 *                                         &lt;simpleType&gt;
	 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
	 *                                             &lt;minInclusive value="1"/&gt;
	 *                                             &lt;maxInclusive value="9"/&gt;
	 *                                           &lt;/restriction&gt;
	 *                                         &lt;/simpleType&gt;
	 *                                       &lt;/element&gt;
	 *                                       &lt;element name="RMAReasonDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
	public static class ResponseBody {

		@XmlElement(name = "RMAInfo", required = true)
		@JsonProperty("RMAInfo")
		protected VoidRMAResponse.ResponseBody.RMAInfo rmaInfo;

		public VoidRMAResponse.ResponseBody.RMAInfo getRmaInfo() {
			return rmaInfo;
		}

		public void setRmaInfo(VoidRMAResponse.ResponseBody.RMAInfo rmaInfo) {
			this.rmaInfo = rmaInfo;
		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType&gt;
		 *   &lt;complexContent&gt;
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
		 *       &lt;all&gt;
		 *         &lt;element name="RMANumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
		 *         &lt;element name="RMAType"&gt;
		 *           &lt;simpleType&gt;
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
		 *               &lt;minInclusive value="1"/&gt;
		 *               &lt;maxInclusive value="2"/&gt;
		 *             &lt;/restriction&gt;
		 *           &lt;/simpleType&gt;
		 *         &lt;/element&gt;
		 *         &lt;element name="RMATypeDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *         &lt;element name="SourceSONumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
		 *         &lt;element name="SellerRMANumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *         &lt;element name="RMAShipMethod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *         &lt;element name="RMAShipMethodDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *         &lt;element name="RMANote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
		 *         &lt;element name="IssueUser"&gt;
		 *           &lt;simpleType&gt;
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
		 *             &lt;/restriction&gt;
		 *           &lt;/simpleType&gt;
		 *         &lt;/element&gt;
		 *         &lt;element name="RMATransactionList"&gt;
		 *           &lt;complexType&gt;
		 *             &lt;complexContent&gt;
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
		 *                 &lt;sequence maxOccurs="unbounded"&gt;
		 *                   &lt;element name="RMATransaction"&gt;
		 *                     &lt;complexType&gt;
		 *                       &lt;complexContent&gt;
		 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
		 *                           &lt;all&gt;
		 *                             &lt;element name="SellerPartNumber"&gt;
		 *                               &lt;simpleType&gt;
		 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
		 *                                 &lt;/restriction&gt;
		 *                               &lt;/simpleType&gt;
		 *                             &lt;/element&gt;
		 *                             &lt;element name="ReturnQuantity"&gt;
		 *                               &lt;simpleType&gt;
		 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
		 *                                   &lt;minInclusive value="1"/&gt;
		 *                                 &lt;/restriction&gt;
		 *                               &lt;/simpleType&gt;
		 *                             &lt;/element&gt;
		 *                             &lt;element name="ReturnUnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
		 *                             &lt;element name="RefundShippingPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
		 *                             &lt;element name="RMAReason"&gt;
		 *                               &lt;simpleType&gt;
		 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
		 *                                   &lt;minInclusive value="1"/&gt;
		 *                                   &lt;maxInclusive value="9"/&gt;
		 *                                 &lt;/restriction&gt;
		 *                               &lt;/simpleType&gt;
		 *                             &lt;/element&gt;
		 *                             &lt;element name="RMAReasonDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
		public static class RMAInfo {

			@XmlElement(name = "RMANumber")
			@JsonProperty("RMANumber")
			protected Integer rmaNumber;

			@XmlElement(name = "RMAType")
			@JsonProperty("RMAType")
			protected int rmaType;

			@XmlElement(name = "RMATypeDescription", required = true)
			@JsonProperty("RMATypeDescription")
			protected String rmaTypeDescription;

			@XmlElement(name = "SourceSONumber")
			@JsonProperty("SourceSONumber")
			protected int sourceSONumber;

			@XmlElement(name = "SellerRMANumber", required = true)
			@JsonProperty("SellerRMANumber")
			protected String sellerRMANumber;

			@XmlElement(name = "RMAShipMethod", required = true)
			@JsonProperty("RMAShipMethod")
			protected String rmaShipMethod;

			@XmlElement(name = "RMAShipMethodDescription", required = true)
			@JsonProperty("RMAShipMethodDescription")
			protected String rmaShipMethodDescription;

			@XmlElement(name = "RMANote")
			@JsonProperty("RMANote")
			protected String rmaNote;

			@XmlElement(name = "IssueUser", required = true)
			@JsonProperty("IssueUser")
			protected String issueUser;

			@XmlElement(name = "RMATransactionList", required = true)
			@JsonProperty("RMATransactionList")
			protected VoidRMAResponse.ResponseBody.RMAInfo.RMATransactionList rmaTransactionList;

			public Integer getRmaNumber() {
				return rmaNumber;
			}

			public void setRmaNumber(Integer rmaNumber) {
				this.rmaNumber = rmaNumber;
			}

			public int getRmaType() {
				return rmaType;
			}

			public void setRmaType(int rmaType) {
				this.rmaType = rmaType;
			}

			public String getRmaTypeDescription() {
				return rmaTypeDescription;
			}

			public void setRmaTypeDescription(String rmaTypeDescription) {
				this.rmaTypeDescription = rmaTypeDescription;
			}

			public int getSourceSONumber() {
				return sourceSONumber;
			}

			public void setSourceSONumber(int sourceSONumber) {
				this.sourceSONumber = sourceSONumber;
			}

			public String getSellerRMANumber() {
				return sellerRMANumber;
			}

			public void setSellerRMANumber(String sellerRMANumber) {
				this.sellerRMANumber = sellerRMANumber;
			}

			public String getRmaShipMethod() {
				return rmaShipMethod;
			}

			public void setRmaShipMethod(String rmaShipMethod) {
				this.rmaShipMethod = rmaShipMethod;
			}

			public String getRmaShipMethodDescription() {
				return rmaShipMethodDescription;
			}

			public void setRmaShipMethodDescription(String rmaShipMethodDescription) {
				this.rmaShipMethodDescription = rmaShipMethodDescription;
			}

			public String getRmaNote() {
				return rmaNote;
			}

			public void setRmaNote(String rmaNote) {
				this.rmaNote = rmaNote;
			}

			public String getIssueUser() {
				return issueUser;
			}

			public void setIssueUser(String issueUser) {
				this.issueUser = issueUser;
			}

			public VoidRMAResponse.ResponseBody.RMAInfo.RMATransactionList getRmaTransactionList() {
				return rmaTransactionList;
			}

			public void setRmaTransactionList(VoidRMAResponse.ResponseBody.RMAInfo.RMATransactionList rmaTransactionList) {
				this.rmaTransactionList = rmaTransactionList;
			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType&gt;
			 *   &lt;complexContent&gt;
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
			 *       &lt;sequence maxOccurs="unbounded"&gt;
			 *         &lt;element name="RMATransaction"&gt;
			 *           &lt;complexType&gt;
			 *             &lt;complexContent&gt;
			 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
			 *                 &lt;all&gt;
			 *                   &lt;element name="SellerPartNumber"&gt;
			 *                     &lt;simpleType&gt;
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
			 *                       &lt;/restriction&gt;
			 *                     &lt;/simpleType&gt;
			 *                   &lt;/element&gt;
			 *                   &lt;element name="ReturnQuantity"&gt;
			 *                     &lt;simpleType&gt;
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
			 *                         &lt;minInclusive value="1"/&gt;
			 *                       &lt;/restriction&gt;
			 *                     &lt;/simpleType&gt;
			 *                   &lt;/element&gt;
			 *                   &lt;element name="ReturnUnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
			 *                   &lt;element name="RefundShippingPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
			 *                   &lt;element name="RMAReason"&gt;
			 *                     &lt;simpleType&gt;
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
			 *                         &lt;minInclusive value="1"/&gt;
			 *                         &lt;maxInclusive value="9"/&gt;
			 *                       &lt;/restriction&gt;
			 *                     &lt;/simpleType&gt;
			 *                   &lt;/element&gt;
			 *                   &lt;element name="RMAReasonDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
					"rmaTransaction"
			})
			public static class RMATransactionList {

				@XmlElement(name = "RMATransaction", required = true)
				@JsonProperty("RMATransaction")
				protected VoidRMAResponse.ResponseBody.RMAInfo.RMATransactionList.RMATransaction rmaTransaction;

				/**
				 * Gets the value of the rmaTransaction property.
				 * 
				 * <p>
				 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the rmaTransaction property.
				 * 
				 * <p>
				 * For example, to add a new item, do as follows:
				 * 
				 * <pre>
				 * getRMATransaction().add(newItem);
				 * </pre>
				 * 
				 * 
				 * <p>
				 * Objects of the following type(s) are allowed in the list {@link VoidRMAResponse.ResponseBody.RMAInfo.RMATransactionList.RMATransaction }
				 * 
				 * @return
				 * possible object is 
				 *     {@link VoidRMAResponse.ResponseBody.RMAInfo.RMATransactionList.RMATransaction }
				 * 
				 */
				public VoidRMAResponse.ResponseBody.RMAInfo.RMATransactionList.RMATransaction getRmaTransaction() {
					return this.rmaTransaction;
				}

				/**
				 * <p>
				 * Java class for anonymous complex type.
				 * 
				 * <p>
				 * The following schema fragment specifies the expected content contained within this class.
				 * 
				 * <pre>
				 * &lt;complexType&gt;
				 *   &lt;complexContent&gt;
				 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
				 *       &lt;all&gt;
				 *         &lt;element name="SellerPartNumber"&gt;
				 *           &lt;simpleType&gt;
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
				 *             &lt;/restriction&gt;
				 *           &lt;/simpleType&gt;
				 *         &lt;/element&gt;
				 *         &lt;element name="ReturnQuantity"&gt;
				 *           &lt;simpleType&gt;
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
				 *               &lt;minInclusive value="1"/&gt;
				 *             &lt;/restriction&gt;
				 *           &lt;/simpleType&gt;
				 *         &lt;/element&gt;
				 *         &lt;element name="ReturnUnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
				 *         &lt;element name="RefundShippingPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
				 *         &lt;element name="RMAReason"&gt;
				 *           &lt;simpleType&gt;
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
				 *               &lt;minInclusive value="1"/&gt;
				 *               &lt;maxInclusive value="9"/&gt;
				 *             &lt;/restriction&gt;
				 *           &lt;/simpleType&gt;
				 *         &lt;/element&gt;
				 *         &lt;element name="RMAReasonDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
				public static class RMATransaction {

					@XmlElement(name = "SellerPartNumber", required = true)
					@JsonProperty("SellerPartNumber")
					protected String sellerPartNumber;

					@XmlElement(name = "ReturnQuantity", required = true, defaultValue = "1")
					@JsonProperty("ReturnQuantity")
					protected BigInteger returnQuantity;

					@XmlElement(name = "ReturnUnitPrice", defaultValue = "0.00")
					@JsonProperty("ReturnUnitPrice")
					protected BigDecimal returnUnitPrice;

					@XmlElement(name = "RefundShippingPrice", required = true)
					@JsonProperty("RefundShippingPrice")
					protected BigDecimal refundShippingPrice;

					@XmlElement(name = "RMAReason")
					@JsonProperty("RMAReason")
					protected int rmaReason;

					@XmlElement(name = "RMAReasonDescription", required = true)
					@JsonProperty("RMAReasonDescription")
					protected String rmaReasonDescription;

					public String getSellerPartNumber() {
						return sellerPartNumber;
					}

					public void setSellerPartNumber(String sellerPartNumber) {
						this.sellerPartNumber = sellerPartNumber;
					}

					public BigInteger getReturnQuantity() {
						return returnQuantity;
					}

					public void setReturnQuantity(BigInteger returnQuantity) {
						this.returnQuantity = returnQuantity;
					}

					public BigDecimal getReturnUnitPrice() {
						return returnUnitPrice;
					}

					public void setReturnUnitPrice(BigDecimal returnUnitPrice) {
						this.returnUnitPrice = returnUnitPrice;
					}

					public BigDecimal getRefundShippingPrice() {
						return refundShippingPrice;
					}

					public void setRefundShippingPrice(BigDecimal refundShippingPrice) {
						this.refundShippingPrice = refundShippingPrice;
					}

					public int getRmaReason() {
						return rmaReason;
					}

					public void setRmaReason(int rmaReason) {
						this.rmaReason = rmaReason;
					}

					public String getRmaReasonDescription() {
						return rmaReasonDescription;
					}

					public void setRmaReasonDescription(String rmaReasonDescription) {
						this.rmaReasonDescription = rmaReasonDescription;
					}

				}

			}

		}

	}

}
