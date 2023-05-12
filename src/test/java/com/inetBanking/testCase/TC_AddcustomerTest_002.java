package com.inetBanking.testCase;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.POM.Loginpage;
import com.inetBanking.POM.addcustomerpage;
import com.inetBanking.POM.closeadd;
import com.inetBanking.POM.custinfo;

public class TC_AddcustomerTest_002 extends BaseClass {
	@Test
	public void addNewCustomer() throws InterruptedException {
		Loginpage lp=new Loginpage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		addcustomerpage add=new addcustomerpage(driver);
		add.ClickaddnewCustomer();
		
		//  closeadd cd=new closeadd(driver);
		//	 cd.btnclose();
		/* driver.switchTo().frame(driver.findElement(By.id("ad_iframe")));       
		 driver.findElement(By.xpath("//span[@class='ns-uz24n-e-7']")).click(); 
		 driver.switchTo().defaultContent();*/
		
		closeadd A=new closeadd(driver);
		A.clk();
			
			
			 
		custinfo addcust=new custinfo(driver);
		
		addcust.custName("Sai Cha");
		addcust.custgender("male");
		addcust.custdob("06","01","1998");
		addcust.custaddress("India");
		addcust.custcity("PUNE");
		addcust.custstate("MH");
		addcust.custpinno("412105");
		addcust.custtelephone("9168016260");
		addcust.custemailid("Sai@gmail.com");
		addcust.custpassword("Sai@@1212");
		addcust.custsubmit();	
		
	/*boolean res=driver.getPageSource().contains("Customer Ragistered Successfully!!!");
	
	if(res==true) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}*/
	
	}	

}
