package com.newegg.marketplace.sdk.report.inner;

import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.report.Variables;
import com.newegg.marketplace.sdk.report.Variables.URILock;
import com.newegg.marketplace.sdk.report.model.get.GetNeweggPremierItemReportRequest;
import com.newegg.marketplace.sdk.report.model.get.GetNeweggPremierItemReportResponse;
import com.newegg.marketplace.sdk.report.model.submit.PremierItemReportRequest;
import com.newegg.marketplace.sdk.report.model.submit.PremierItemReportResponse;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

/**
 * For openfeign used
 * @author Zack.J.Hung
 *
 */
public interface PremierItemCaller {
	/*
	 * Command define from Report API Guide
	 * JSON and XML format
	 */
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("PUT /reportmgmt/report/result?sellerid={sellerid}")
	GetNeweggPremierItemReportResponse sendPremierItemRequestJSON(@Param("sellerid") String sellerID, GetNeweggPremierItemReportRequest body);

	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /reportmgmt/report/result?sellerid={sellerid}")
	GetNeweggPremierItemReportResponse sendPremierItemRequestXML(@Param("sellerid") String sellerID, GetNeweggPremierItemReportRequest body);

	// Implement default method of interface class that according to Variables.MediaType to run at JSON or XML request.
	default GetNeweggPremierItemReportResponse sendPremierItemRequest(GetNeweggPremierItemReportRequest body) {
		switch(Variables.MediaType) {
		case JSON:			
			return sendPremierItemRequestJSON(Content.SellerID, body);
			
		case XML:			
			return sendPremierItemRequestXML(Content.SellerID, body);	
			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	// submit command
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /reportmgmt/report/submitrequest?sellerid={sellerid}")
	PremierItemReportResponse sendSubmitPremierItemRequestJSON(@Param("sellerid") String sellerID, PremierItemReportRequest body);

	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /reportmgmt/report/submitrequest?sellerid={sellerid}")
	PremierItemReportResponse sendSubmitPremierItemRequestXML(@Param("sellerid") String sellerID, PremierItemReportRequest body);

	// Implement default method of interface class that according to Variables.MediaType to run at JSON or XML request.
	default PremierItemReportResponse sendSubmitPremierItemRequest(PremierItemReportRequest body) {
		switch(Variables.MediaType) {
		case JSON:			
			return sendSubmitPremierItemRequestJSON(Content.SellerID, body);
			
		case XML:			
			return sendSubmitPremierItemRequestXML(Content.SellerID, body);	
			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	static PremierItemCaller buildJSON() {
		Variables.MediaType = MEDIA_TYPE.JSON;
		Variables.URIHash = URILock.PREMIER_ITEM;
		
		return new CallerFactory<PremierItemCaller>()
			.jsonBuild(PremierItemCaller.class, Variables.LogLevel, Variables.Retryer, ReportClient.genClient());		
	}

	static PremierItemCaller buildXML() {
		Variables.MediaType = MEDIA_TYPE.XML;
		Variables.URIHash = URILock.PREMIER_ITEM;
		
		return new CallerFactory<PremierItemCaller>()
			.xmlBuild(PremierItemCaller.class, Variables.LogLevel, Variables.Retryer, ReportClient.genClient());		
	}
}
