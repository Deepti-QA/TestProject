package com.vwfs.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.vwfs.qa.util.TestBase;

public class VehicleCheckPage extends TestBase{

	
	
	
	public VehicleCheckPage(){
		
		PageFactory.initElements(driver, this);
	}

 
	
	//Actions:
		
		public String getPageTitle() {
			
			return driver.getTitle();
			
			
		}
		
		public String getResult()
		{
			return driver.findElement(By.xpath("//div[@class='result']")).getText();
		}
		
		

		public void enterRegNumber(String regNumber) throws Throwable {
			
			
			driver.findElement(By.id("vehicleReg")).sendKeys(regNumber);
			driver.findElement(By.name("btnfind")).click();
		}
		
		public boolean validateResult(String expResult)
		{
			String actResult=getResult();
			return actResult.equalsIgnoreCase(expResult);			
		}
	 
		
	
}





