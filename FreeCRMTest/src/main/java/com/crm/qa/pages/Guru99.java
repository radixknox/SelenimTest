package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class Guru99 extends TestBase{
	
	public Guru99(){
		super();
	}

	public static void main(String[] args) {
		
		Guru99 g =new Guru99();
	g.Intailize();
		//Intailize();
		WebElement bigdata = driver.findElement(By.xpath("//span[contains(text(),\"Big Data\")]"));
		bigdata.click();
		driver.quit();
		
		
	}
	
	
	
	
	}
	
	
	
	


