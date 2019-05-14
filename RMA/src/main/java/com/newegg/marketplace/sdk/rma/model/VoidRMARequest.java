//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.06 at 03:44:55 PM CST 
//

package com.newegg.marketplace.sdk.rma.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.newegg.marketplace.sdk.rma.model.bean.VoidRMAInfo;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="IssueUser" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OperationType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="EditRMARequest"/&gt;
 *               &lt;enumeration value="RejectRMARequest"/&gt;
 *               &lt;enumeration value="VoidRMARequest"/&gt;
 *               &lt;enumeration value="ReceiveRMARequest"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RequestBody"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{}EditRMAInfo"/&gt;
 *                   &lt;element ref="{}ReceiveRMAInfo"/&gt;
 *                   &lt;element ref="{}VoidRMAInfo"/&gt;
 *                   &lt;element ref="{}RejectRMAInfo"/&gt;
 *                 &lt;/choice&gt;
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
public class VoidRMARequest {

	@XmlElement(name = "IssueUser")
	@JsonProperty("IssueUser")
	protected String issueUser;

	@XmlElement(name = "OperationType", required = true)
	@JsonProperty("OperationType")
	protected String operationType = "VoidRMARequest";

	@XmlElement(name = "RequestBody", required = true)
	@JsonProperty("RequestBody")
	protected VoidRMARequest.RequestBody requestBody;

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

	public VoidRMARequest.RequestBody getRequestBody() {
		return requestBody;
	}

	public void setRequestBody(VoidRMARequest.RequestBody requestBody) {
		this.requestBody = requestBody;
	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained within
	 * this class.
	 * 
	 * <pre>
	 * &lt;complexType&gt;
	 *   &lt;complexContent&gt;
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *       &lt;choice&gt;
	 *         &lt;element ref="{}EditRMAInfo"/&gt;
	 *         &lt;element ref="{}ReceiveRMAInfo"/&gt;
	 *         &lt;element ref="{}VoidRMAInfo"/&gt;
	 *         &lt;element ref="{}RejectRMAInfo"/&gt;
	 *       &lt;/choice&gt;
	 *     &lt;/restriction&gt;
	 *   &lt;/complexContent&gt;
	 * &lt;/complexType&gt;
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "voidRMAInfo" })
	public static class RequestBody {
		/*
		 * @XmlElement(name = "EditRMAInfo")
		 * 
		 * @JsonProperty("EditRMAInfo") protected EditRMAInfo editRMAInfo;
		 * 
		 * @XmlElement(name = "ReceiveRMAInfo")
		 * 
		 * @JsonProperty("ReceiveRMAInfo") protected ReceiveRMAInfo receiveRMAInfo;
		 */
		@XmlElement(name = "VoidRMAInfo")
		@JsonProperty("VoidRMAInfo")
		protected VoidRMAInfo voidRMAInfo;

		/*
		 * @XmlElement(name = "RejectRMAInfo")
		 * 
		 * @JsonProperty("RejectRMAInfo") protected RejectRMAInfo rejectRMAInfo;
		 * 
		 * public EditRMAInfo getEditRMAInfo() { return editRMAInfo; }
		 * 
		 * public void setEditRMAInfo(EditRMAInfo editRMAInfo) { this.editRMAInfo =
		 * editRMAInfo; }
		 * 
		 * public ReceiveRMAInfo getReceiveRMAInfo() { return receiveRMAInfo; }
		 * 
		 * public void setReceiveRMAInfo(ReceiveRMAInfo receiveRMAInfo) {
		 * this.receiveRMAInfo = receiveRMAInfo; }
		 */
		public VoidRMAInfo getVoidRMAInfo() {
			return voidRMAInfo;
		}

		public void setVoidRMAInfo(VoidRMAInfo voidRMAInfo) {
			this.voidRMAInfo = voidRMAInfo;
		}
		/*
		 * public RejectRMAInfo getRejectRMAInfo() { return rejectRMAInfo; }
		 * 
		 * public void setRejectRMAInfo(RejectRMAInfo rejectRMAInfo) {
		 * this.rejectRMAInfo = rejectRMAInfo; }
		 */
	}

}
