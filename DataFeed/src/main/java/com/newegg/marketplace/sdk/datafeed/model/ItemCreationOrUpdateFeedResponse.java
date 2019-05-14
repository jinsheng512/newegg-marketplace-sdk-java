//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.06 at 09:41:17 AM CST 
//

package com.newegg.marketplace.sdk.datafeed.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

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
 *         &lt;element name="IsSuccess"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="true"/&gt;
 *               &lt;enumeration value="false"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OperationType" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="SellerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ResponseBody"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ResponseList"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ResponseInfo" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="RequestType"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;enumeration value="ITEM_DATA"/&gt;
 *                                             &lt;enumeration value="INVENTORY_AND_PRICE_DATA"/&gt;
 *                                             &lt;enumeration value="ORDER_SHIP_NOTICE_DATA"/&gt;
 *                                             &lt;enumeration value="MULTICHANNEL_ORDER_DATA"/&gt;
 *                                             &lt;enumeration value="ITEM_SUBSCRIPTION"/&gt;
 *                                             &lt;enumeration value="VOLUME_DISCOUNT_DATA"/&gt;
 *                                             &lt;enumeration value="ITEM_COUNTRY_RESTRICTION_DATA"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="RequestDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="RequestStatus"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;enumeration value="SUBMITTED"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
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
 *         &lt;element name="Memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
public class ItemCreationOrUpdateFeedResponse {

	@XmlElement(name = "IsSuccess", required = true)
	protected boolean isSuccess;
	@XmlElement(name = "OperationType", required = true)
	protected Object operationType;
	@XmlElement(name = "SellerID", required = true)
	protected String sellerID;
	@XmlElement(name = "ResponseBody", required = true)
	protected SubmitFeedResponse.ResponseBody responseBody;
	@XmlElement(name = "Memo")
	protected String memo;

	/**
	 * Gets the value of the isSuccess property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public boolean getIsSuccess() {
		return isSuccess;
	}

	/**
	 * Sets the value of the isSuccess property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIsSuccess(boolean value) {
		this.isSuccess = value;
	}

	/**
	 * Gets the value of the operationType property.
	 * 
	 * @return possible object is {@link Object }
	 * 
	 */
	public Object getOperationType() {
		return operationType;
	}

	/**
	 * Sets the value of the operationType property.
	 * 
	 * @param value
	 *            allowed object is {@link Object }
	 * 
	 */
	public void setOperationType(Object value) {
		this.operationType = value;
	}

	/**
	 * Gets the value of the sellerID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSellerID() {
		return sellerID;
	}

	/**
	 * Sets the value of the sellerID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSellerID(String value) {
		this.sellerID = value;
	}

	/**
	 * Gets the value of the responseBody property.
	 * 
	 * @return possible object is {@link SubmitFeedResponse.ResponseBody }
	 * 
	 */
	public SubmitFeedResponse.ResponseBody getResponseBody() {
		return responseBody;
	}

	/**
	 * Sets the value of the responseBody property.
	 * 
	 * @param value
	 *            allowed object is {@link SubmitFeedResponse.ResponseBody }
	 * 
	 */
	public void setResponseBody(SubmitFeedResponse.ResponseBody value) {
		this.responseBody = value;
	}

	/**
	 * Gets the value of the memo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * Sets the value of the memo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMemo(String value) {
		this.memo = value;
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
	 *       &lt;sequence&gt;
	 *         &lt;element name="ResponseList"&gt;
	 *           &lt;complexType&gt;
	 *             &lt;complexContent&gt;
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *                 &lt;sequence&gt;
	 *                   &lt;element name="ResponseInfo" maxOccurs="unbounded" minOccurs="0"&gt;
	 *                     &lt;complexType&gt;
	 *                       &lt;complexContent&gt;
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *                           &lt;all&gt;
	 *                             &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                             &lt;element name="RequestType"&gt;
	 *                               &lt;simpleType&gt;
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
	 *                                   &lt;enumeration value="ITEM_DATA"/&gt;
	 *                                   &lt;enumeration value="INVENTORY_AND_PRICE_DATA"/&gt;
	 *                                   &lt;enumeration value="ORDER_SHIP_NOTICE_DATA"/&gt;
	 *                                   &lt;enumeration value="MULTICHANNEL_ORDER_DATA"/&gt;
	 *                                   &lt;enumeration value="ITEM_SUBSCRIPTION"/&gt;
	 *                                   &lt;enumeration value="VOLUME_DISCOUNT_DATA"/&gt;
	 *                                   &lt;enumeration value="ITEM_COUNTRY_RESTRICTION_DATA"/&gt;
	 *                                 &lt;/restriction&gt;
	 *                               &lt;/simpleType&gt;
	 *                             &lt;/element&gt;
	 *                             &lt;element name="RequestDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                             &lt;element name="RequestStatus"&gt;
	 *                               &lt;simpleType&gt;
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
	 *                                   &lt;enumeration value="SUBMITTED"/&gt;
	 *                                 &lt;/restriction&gt;
	 *                               &lt;/simpleType&gt;
	 *                             &lt;/element&gt;
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
			"responseList"
	})
	public static class ResponseBody {

		@XmlElement(name = "ResponseList", required = true)
		protected SubmitFeedResponse.ResponseBody.ResponseList responseList;

		/**
		 * Gets the value of the responseList property.
		 * 
		 * @return possible object is {@link SubmitFeedResponse.ResponseBody.ResponseList }
		 * 
		 */
		public SubmitFeedResponse.ResponseBody.ResponseList getResponseList() {
			return responseList;
		}

		/**
		 * Sets the value of the responseList property.
		 * 
		 * @param value
		 *            allowed object is {@link SubmitFeedResponse.ResponseBody.ResponseList }
		 * 
		 */
		public void setResponseList(SubmitFeedResponse.ResponseBody.ResponseList value) {
			this.responseList = value;
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
		 *       &lt;sequence&gt;
		 *         &lt;element name="ResponseInfo" maxOccurs="unbounded" minOccurs="0"&gt;
		 *           &lt;complexType&gt;
		 *             &lt;complexContent&gt;
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
		 *                 &lt;all&gt;
		 *                   &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *                   &lt;element name="RequestType"&gt;
		 *                     &lt;simpleType&gt;
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
		 *                         &lt;enumeration value="ITEM_DATA"/&gt;
		 *                         &lt;enumeration value="INVENTORY_AND_PRICE_DATA"/&gt;
		 *                         &lt;enumeration value="ORDER_SHIP_NOTICE_DATA"/&gt;
		 *                         &lt;enumeration value="MULTICHANNEL_ORDER_DATA"/&gt;
		 *                         &lt;enumeration value="ITEM_SUBSCRIPTION"/&gt;
		 *                         &lt;enumeration value="VOLUME_DISCOUNT_DATA"/&gt;
		 *                         &lt;enumeration value="ITEM_COUNTRY_RESTRICTION_DATA"/&gt;
		 *                       &lt;/restriction&gt;
		 *                     &lt;/simpleType&gt;
		 *                   &lt;/element&gt;
		 *                   &lt;element name="RequestDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *                   &lt;element name="RequestStatus"&gt;
		 *                     &lt;simpleType&gt;
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
		 *                         &lt;enumeration value="SUBMITTED"/&gt;
		 *                       &lt;/restriction&gt;
		 *                     &lt;/simpleType&gt;
		 *                   &lt;/element&gt;
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
				"responseInfo"
		})
		public static class ResponseList {

			@XmlElement(name = "ResponseInfo")
			protected List<SubmitFeedResponse.ResponseBody.ResponseList.ResponseInfo> responseInfo;

			/**
			 * Gets the value of the responseInfo property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the responseInfo property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getResponseInfo().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list {@link SubmitFeedResponse.ResponseBody.ResponseList.ResponseInfo }
			 * 
			 * @return
			 * Objects of the following type(s) are allowed in the list
			 * {@link SubmitFeedResponse.ResponseBody.ResponseList.ResponseInfo }
			 * 
			 */
			public List<SubmitFeedResponse.ResponseBody.ResponseList.ResponseInfo> getResponseInfo() {
				if (responseInfo == null) {
					responseInfo = new ArrayList<SubmitFeedResponse.ResponseBody.ResponseList.ResponseInfo>();
				}
				return this.responseInfo;
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
			 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *         &lt;element name="RequestType"&gt;
			 *           &lt;simpleType&gt;
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
			 *               &lt;enumeration value="ITEM_DATA"/&gt;
			 *               &lt;enumeration value="INVENTORY_AND_PRICE_DATA"/&gt;
			 *               &lt;enumeration value="ORDER_SHIP_NOTICE_DATA"/&gt;
			 *               &lt;enumeration value="MULTICHANNEL_ORDER_DATA"/&gt;
			 *               &lt;enumeration value="ITEM_SUBSCRIPTION"/&gt;
			 *               &lt;enumeration value="VOLUME_DISCOUNT_DATA"/&gt;
			 *               &lt;enumeration value="ITEM_COUNTRY_RESTRICTION_DATA"/&gt;
			 *             &lt;/restriction&gt;
			 *           &lt;/simpleType&gt;
			 *         &lt;/element&gt;
			 *         &lt;element name="RequestDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *         &lt;element name="RequestStatus"&gt;
			 *           &lt;simpleType&gt;
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
			 *               &lt;enumeration value="SUBMITTED"/&gt;
			 *             &lt;/restriction&gt;
			 *           &lt;/simpleType&gt;
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
			public static class ResponseInfo {

				@XmlElement(name = "RequestId", required = true)
				protected String requestId;
				@XmlElement(name = "RequestType", required = true)
				protected String requestType;
				@XmlElement(name = "RequestDate", required = true)
				protected String requestDate;
				@XmlElement(name = "RequestStatus", required = true)
				protected String requestStatus;

				/**
				 * Gets the value of the requestId property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getRequestId() {
					return requestId;
				}

				/**
				 * Sets the value of the requestId property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setRequestId(String value) {
					this.requestId = value;
				}

				/**
				 * Gets the value of the requestType property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getRequestType() {
					return requestType;
				}

				/**
				 * Sets the value of the requestType property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setRequestType(String value) {
					this.requestType = value;
				}

				/**
				 * Gets the value of the requestDate property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getRequestDate() {
					return requestDate;
				}

				/**
				 * Sets the value of the requestDate property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setRequestDate(String value) {
					this.requestDate = value;
				}

				/**
				 * Gets the value of the requestStatus property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getRequestStatus() {
					return requestStatus;
				}

				/**
				 * Sets the value of the requestStatus property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setRequestStatus(String value) {
					this.requestStatus = value;
				}

			}

		}

	}

}
