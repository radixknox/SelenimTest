package com.crm.qa.CRMtestcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	
	public  HomePageTest() {
		super();	
	}
	@BeforeMethod()
	public void setUp() {
		initialize();
		loginpage = new LoginPage();
		homepage=loginpage.Login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	
	@Test()
	public void usernameVerifyTest() {
		driver.switchTo().frame("downloadFrame");
		System.out.println(Thread.currentThread());
		assertEquals(homepage.VerifyUsernameTitle(),"true");
		
	}
	
	@Test()
	public void HomePageNameTest() {
		String HomePageTitle;
		HomePageTitle=homepage.HompageTitle();
		System.out.println(Thread.currentThread());
		Assert.assertEquals(HomePageTitle,"Cogmento CRM","not matched");
	}
	
	@AfterMethod()
	public void tearDown() {
		driver.quit();
	}

}
