package com.newegg.marketplace.sdk.datafeed.inner;

import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.datafeed.Variables;
import com.newegg.marketplace.sdk.datafeed.model.ItemCAProp65FeedRequest;
import com.newegg.marketplace.sdk.datafeed.model.ItemCAProp65FeedResponse;
import com.newegg.marketplace.sdk.datafeed.model.ItemChinaTaxSettingFeedRequest;
import com.newegg.marketplace.sdk.datafeed.model.ItemChinaTaxSettingFeedResponse;
import com.newegg.marketplace.sdk.datafeed.model.ItemSubscriptionFeedRequest;
import com.newegg.marketplace.sdk.datafeed.model.ItemSubscriptionFeedResponse;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

/**
Copyright (c) 2000-present, Newegg Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

/**
 * For openfeign used
 * @author QB
 *
 */
public interface SubmitOtherCaller {

	
	/*
		Item Warranty Feed
	 */
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=ITEM_CHINATAXSETTING_DATA")
	ItemChinaTaxSettingFeedResponse itemChinaTaxSettingFeedJSON(@Param("sellerid") String sellerID,ItemChinaTaxSettingFeedRequest body);	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=ITEM_CHINATAXSETTING_DATA")
	ItemChinaTaxSettingFeedResponse itemChinaTaxSettingFeedXML(@Param("sellerid") String sellerID,ItemChinaTaxSettingFeedRequest body);
	
	default ItemChinaTaxSettingFeedResponse itemChinaTaxSettingFeed(ItemChinaTaxSettingFeedRequest body) {
		switch(Variables.MediaType){
		case JSON:			
			return itemChinaTaxSettingFeedJSON(Content.SellerID,body);
		case XML:			
			return itemChinaTaxSettingFeedXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=ITEM_CAPROP65_DATA")
	ItemCAProp65FeedResponse itemCAProp65FeedJSON(@Param("sellerid") String sellerID,ItemCAProp65FeedRequest body);	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=ITEM_CAPROP65_DATA")
	ItemCAProp65FeedResponse itemCAProp65FeedXML(@Param("sellerid") String sellerID,ItemCAProp65FeedRequest body);
	
	default ItemCAProp65FeedResponse itemCAProp65Feed(ItemCAProp65FeedRequest body) {
		switch(Variables.MediaType){
		case JSON:			
			return itemCAProp65FeedJSON(Content.SellerID,body);
		case XML:			
			return itemCAProp65FeedXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	
	
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=ITEM_SUBSCRIPTION")
	ItemSubscriptionFeedResponse itemSubscriptionFeedJSON(@Param("sellerid") String sellerID,ItemSubscriptionFeedRequest body);	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=ITEM_SUBSCRIPTION")
	ItemSubscriptionFeedResponse itemSubscriptionFeedXML(@Param("sellerid") String sellerID,ItemSubscriptionFeedRequest body);
	
	default ItemSubscriptionFeedResponse itemSubscriptionFeed(ItemSubscriptionFeedRequest body) {
		switch(Variables.MediaType){
		case JSON:			
			return itemSubscriptionFeedJSON(Content.SellerID,body);
		case XML:			
			return itemSubscriptionFeedXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	
	static SubmitOtherCaller buildJSON() {
		Variables.MediaType=MEDIA_TYPE.JSON;			
		return new CallerFactory<SubmitOtherCaller>()
		.jsonBuild(SubmitOtherCaller.class, Variables.LogLevel, Variables.Retryer,DataFeedClient.genClient());		
	}
	
	static SubmitOtherCaller buildXML() {
		Variables.MediaType=MEDIA_TYPE.XML;
		return new CallerFactory<SubmitOtherCaller>()
		.xmlBuild(SubmitOtherCaller.class, Variables.LogLevel, Variables.Retryer,DataFeedClient.genClient());		
	}
}
