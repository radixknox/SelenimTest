package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{

	//Creating Page Factory
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement loginbtn;
	
	@FindBy(xpath="//span[contains(text(),\"Log In\")]//parent::a")
	WebElement loginBtn1;
	
	@FindBy(xpath="//a[@href=\"https://api.cogmento.com/register?lang=en-GB\"]")
	WebElement signupbtn;
	
	//Initialize PageFactory(Mandatory to do when we use page factory)
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getLoginPageTitle() {
		
		return driver.getTitle();	
	}
	public HomePage Login(String un, String pwd) {
		loginBtn1.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		
		return new HomePage();
		
	}
	
	
}
