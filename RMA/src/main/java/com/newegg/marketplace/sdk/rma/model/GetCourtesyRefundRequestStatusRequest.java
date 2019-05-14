//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.07 at 03:52:45 PM CST 
//

package com.newegg.marketplace.sdk.rma.model;

import java.util.ArrayList;
import java.util.List;

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
 *         &lt;element name="IssueUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OperationType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="GetCourtesyRefundStatusRequest"/&gt;
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
 *                                             &lt;maxLength value="40"/&gt;
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
 *                                   &lt;enumeration value="FAILED"/&gt;
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
public class GetCourtesyRefundRequestStatusRequest {

	@XmlElement(name = "IssueUser")
	@JsonProperty("IssueUser")
	protected String issueUser;

	@XmlElement(name = "OperationType", required = true)
	@JsonProperty("OperationType")
	protected String operationType = "GetCourtesyRefundStatusRequest";

	@XmlElement(name = "RequestBody", required = true)
	@JsonProperty("RequestBody")
	protected GetCourtesyRefundRequestStatusRequest.RequestBody requestBody;

	public String getIssueUser() {
		return issueUser;
	}

	public void setIssueUser(String issueUser) {
		this.issueUser = issueUser;
	}

	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public GetCourtesyRefundRequestStatusRequest.RequestBody getRequestBody() {
		return requestBody;
	}

	public void setRequestBody(GetCourtesyRefundRequestStatusRequest.RequestBody requestBody) {
		this.requestBody = requestBody;
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
	 *                                   &lt;maxLength value="40"/&gt;
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
	 *                         &lt;enumeration value="FAILED"/&gt;
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
		protected GetCourtesyRefundRequestStatusRequest.RequestBody.GetRequestStatus getRequestStatus;

		public GetCourtesyRefundRequestStatusRequest.RequestBody.GetRequestStatus getGetRequestStatus() {
			return getRequestStatus;
		}

		public void setGetRequestStatus(GetCourtesyRefundRequestStatusRequest.RequestBody.GetRequestStatus getRequestStatus) {
			this.getRequestStatus = getRequestStatus;
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
		 *         &lt;element name="RequestIDList" minOccurs="0"&gt;
		 *           &lt;complexType&gt;
		 *             &lt;complexContent&gt;
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
		 *                 &lt;sequence&gt;
		 *                   &lt;element name="RequestID" maxOccurs="unbounded"&gt;
		 *                     &lt;simpleType&gt;
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
		 *                         &lt;maxLength value="40"/&gt;
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
		 *               &lt;enumeration value="FAILED"/&gt;
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
			protected GetCourtesyRefundRequestStatusRequest.RequestBody.GetRequestStatus.RequestIDList requestIDList;

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

			public GetCourtesyRefundRequestStatusRequest.RequestBody.GetRequestStatus.RequestIDList getRequestIDList() {
				return requestIDList;
			}

			public void setRequestIDList(GetCourtesyRefundRequestStatusRequest.RequestBody.GetRequestStatus.RequestIDList requestIDList) {
				this.requestIDList = requestIDList;
			}

			public Integer getMaxCount() {
				return maxCount;
			}

			public void setMaxCount(Integer maxCount) {
				this.maxCount = maxCount;
			}

			public String getRequestStatus() {
				return requestStatus;
			}

			public void setRequestStatus(String requestStatus) {
				this.requestStatus = requestStatus;
			}

			public String getRequestDateFrom() {
				return requestDateFrom;
			}

			public void setRequestDateFrom(String requestDateFrom) {
				this.requestDateFrom = requestDateFrom;
			}

			public String getRequestDateTo() {
				return requestDateTo;
			}

			public void setRequestDateTo(String requestDateTo) {
				this.requestDateTo = requestDateTo;
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
			 *         &lt;element name="RequestID" maxOccurs="unbounded"&gt;
			 *           &lt;simpleType&gt;
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
			 *               &lt;maxLength value="40"/&gt;
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
				 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the requestID property.
				 * 
				 * <p>
				 * For example, to add a new item, do as follows:
				 * 
				 * <pre>
				 * getRequestID().add(newItem);
				 * </pre>
				 * 
				 * 
				 * <p>
				 * Objects of the following type(s) are allowed in the list {@link String }
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
