package com.qa.test;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ascentone.qa.base.TestBase;
import com.cfm.qa.pages.login.LoginPage;


public class A extends TestBase{
	
	LoginPage lPage;
	
//	@BeforeClass()
	public void preRequisite() throws Exception {
		openBrowser();
		enterBaseURL();
		lPage = new LoginPage(driver);
		lPage.loginToApp();

	}
	
	@Test()
	public void launchBrowser() throws Exception {
		
		openBrowser();
		enterBaseURL();
		lPage = new LoginPage(driver);
		lPage.loginToApp();
		System.out.println("Hello");
		
		
	}

}
