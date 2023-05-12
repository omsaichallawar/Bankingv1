package com.inetBanking.POM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class closeadd {
	WebDriver driver;
	 @FindBy(xpath="//span[@class='ns-fe55h-e-16']") WebElement closebtn;
	 
	 public closeadd(WebDriver driver){
		 PageFactory.initElements(driver, this);
	 }
	  public void clk() {
		  driver.switchTo().frame(driver.findElement(By.id("ad_iframe")));       
			 driver.findElement(By.xpath("//span[@class='ns-92csq-e-7']")).click(); 
			 driver.switchTo().defaultContent();
		 // closebtn.click();
	  }
	 
	 public void btnclose() {
	/*	 try {
			Alert alert=driver.switchTo().alert();
			alert.dismiss();
			}
		 catch(NoAlertPresentException ne) {
			 System.out.println("No Alert is displayed");
			 ne.printStackTrace();
		 }*/
		/* driver.switchTo().frame(driver.findElement(By.id("ad_iframe")));       
		 driver.findElement(By.xpath("//span[@class='ns-uz24n-e-7']")).click(); 
		 driver.switchTo().defaultContent(); // Return to main window-
			
			
		 */ }
	 }
		 


