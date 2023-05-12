package com.inetBanking.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readconfig {
	
	Properties pro;
	public Readconfig() {
		File src=new File("G:\\Eclips\\JFiles\\Bankingvv1\\configration\\config.properties");
		
		try {
			FileInputStream fis =new FileInputStream(src);
			pro =new Properties();
			pro.load(fis);
		}catch(Exception e) {
			System.out.println("Exception is "+e.getMessage());
		}
			
	}
	public String getApplication() {
		String url=pro.getProperty("basURL");
		return url;
	}
	public String getUsername() {
		String username=pro.getProperty("username");
		return username;
	}
	public String getpassword() {
		String password=pro.getProperty("password");
		return password;
	}
	public static String getTD(int rowIndex, int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("G:\\Eclips\\JFiles\\Bankingvv1\\Testdata\\TestData.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		String value=sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
		return value;
		
		
	}
}
