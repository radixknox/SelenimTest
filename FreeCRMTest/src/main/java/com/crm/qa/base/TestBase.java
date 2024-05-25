package com.crm.qa.base;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;

	public static Properties prop;


	public TestBase() {
	
		prop = new Properties();
		FileInputStream ip;
		try {
			ip = new FileInputStream(${WORKSPACE}+"\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
	public static void Intailize() {
		String browserName= prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",prop.getProperty("chromedriverlocation"));
			driver = new ChromeDriver();
		
		}
		driver.get(prop.getProperty("url"));
	}



}
