package com.crm.qa.CRMtestcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{

	LoginPage loginPage;
	
	public LoginPageTest() {
		super();	//to call constructer of base class which intialize the config properties
	}
	
	@BeforeMethod
	public void setUp() {
		Intailize();
		loginPage = new LoginPage() ;
	}
	
	@Test
	public void verifyTitle() {
		String title = loginPage.getLoginPageTitle();
		System.out.println(Thread.currentThread());
		Assert.assertEquals(title,"Cogmento CRM" );
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
}
