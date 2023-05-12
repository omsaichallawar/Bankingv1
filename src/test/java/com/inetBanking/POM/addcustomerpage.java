package com.inetBanking.POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class addcustomerpage {
	WebDriver driver;
	public addcustomerpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
  @FindBy(xpath="//a[text()='New Customer']") WebElement lnkAddNewCustomer;
  
  @FindBy(xpath="//input[@name='name']") WebElement txtCustomerName;
  @FindBy(xpath="//input[@name='rad1']") WebElement rdgender;
  @FindBy(xpath="//input[@name='dob']") WebElement txtdob;
  @FindBy(xpath="//textarea[@name='addr']") WebElement txtaddress;
  @FindBy(xpath="//input[@name='city']") WebElement txtcity;
  @FindBy(xpath="//input[@name='state']") WebElement txtstate;
  @FindBy(xpath="//input[@name='pinno']") WebElement txtpinno;
  @FindBy(xpath="//input[@name='telephoneno']") WebElement txttelephone;
  @FindBy(xpath="//input[@name='emailid']") WebElement txtemailid;
  @FindBy(xpath="//input[@name='password']") WebElement txtpassword;
  @FindBy(xpath="//input[@value='Submit']") WebElement btnSubmit;
 
  
  public void ClickaddnewCustomer() throws InterruptedException {
	  lnkAddNewCustomer.click();
	  Thread.sleep(2000);
  
   }
  
    public void custName(String cname) {
	  txtCustomerName.sendKeys(cname);
	  }
  public void custgender(String cgender) {
	  rdgender.click();
	}
  public void custdob(String mm,String dd,String yy) {
	  txtdob.sendKeys(mm);
	  txtdob.sendKeys(dd);
	  txtdob.sendKeys(yy);
  }
  
  public void custaddress(String caddress) {
	  txtaddress.sendKeys(caddress);
  }
	public void custcity(String ccity) {
		txtcity.sendKeys(ccity);
	}
	public void custstate(String cstate) {
		txtstate.sendKeys(cstate);
	}
	public void custpinno(String cpinno) {
		txtpinno.sendKeys(String.valueOf(cpinno));
	}
	public void custtelephone(String ctelephoneno) {
		txttelephone.sendKeys( ctelephoneno);
	}
	public void custemailid(String cemailid) {
		txtemailid.sendKeys(cemailid);
	}
	public void custpassword(String cpassword) {
		txtpassword.sendKeys(cpassword);
	}
	public void custsubmit() {
		btnSubmit.click();
	}
	
}
