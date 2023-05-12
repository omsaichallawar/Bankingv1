package com.inetBanking.testCase;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.observer.entity.MediaEntity.MediaEntityBuilder;
import com.inetBanking.POM.Loginpage;
import com.inetBanking.Utility.Readconfig;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() throws EncryptedDocumentException, IOException {
		//driver.get(basURL);
		logger.info("URL is Opened");
		Reporter.log("URl is Opened");
		
		Loginpage lp=new Loginpage(driver);
		lp.setUserName(Readconfig.getTD(1, 0));
		logger.info("Entered username");
		Reporter.log("Entered USername",true);
		
		lp.setPassword(Readconfig.getTD(1, 1));
		logger.info("Entered password");
		Reporter.log("Entered Password",true);
		lp.clickSubmit();
		Reporter.log("Click on submit",true);
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("login Test Passed");
			Reporter.log("log in test passed",true);
		}
		else {
			Assert.assertTrue(false);
			logger.info("login test failed");
			Reporter.log("log in test failed",true);
		}
	}

}
