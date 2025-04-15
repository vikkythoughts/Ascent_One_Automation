package com.cfm.qa.pages.home;

import com.ascentone.qa.base.TestBase;

import common.util.ReadUtils;
import common.util.Utilities;
import io.qameta.allure.Step;

public class HomePage extends TestBase{
	
	@Step("Navigate to Base URL Page Step...")
	public static String baseURL() {
		String baseUrl = ReadUtils.getData("URL", 1, 2);
		return baseUrl;
	}
	
	@Step("Page URL: {0} Step...")
	public static String pageURL(int rowNo) throws InterruptedException {
		String pURL = ReadUtils.getData("URL", rowNo, 2);
		return pURL;
	}
	
	@Step("Navigate to Components Page Step...")
	public static void goToMyAgentPage() throws InterruptedException {
		Utilities.navigateToURL(baseURL() + pageURL(2));
	}

}
