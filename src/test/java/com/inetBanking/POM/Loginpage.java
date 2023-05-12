package com.inetBanking.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	@FindBy(name="uid")WebElement  txtusername ;
	@FindBy(name="password") WebElement txtpassword;
	@FindBy(name="btnLogin") WebElement btnLogin;
	WebDriver driver;
	
	public Loginpage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}

	public void setUserName(String uname) {
		txtusername.sendKeys(uname);
	}
	public void setPassword(String pwd) {
		txtpassword.sendKeys(pwd);
	}
	public void clickSubmit() {
		btnLogin.click();
	}
	
	
	

}
