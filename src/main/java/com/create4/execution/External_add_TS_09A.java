package com.create4.execution;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.global.methods.*;

import jxl.Sheet;
import jxl.Workbook;

import com.create4.scenarios.*;

public class External_add_TS_09A {
	@BeforeMethod
	public void beforeMethod() throws Exception, Exception {
		//GlobalMethods g = new GlobalMethods();
		
		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Login");

		String URL = r1.getCell(1,0).getContents();
		String FirefoxBrowser = r1.getCell(1,1).getContents();
		GlobalMethods.LaunchBrowser(FirefoxBrowser, URL);

	}


	@Test
	public void CRe4_906() throws Exception{

		TS_09A i1=new TS_09A();
		i1.CRe4_906();

	}

	@Test
	public void CRe4_907() throws Exception{

		TS_09A i1=new TS_09A();
		i1.CRe4_907();


	}
	
	@Test
	public void CRe4_908() throws Exception{

		TS_09A i1=new TS_09A();
		i1.CRe4_908();


	}
	
	@Test
	public void CRe4_909() throws Exception{

		TS_09A i1=new TS_09A();
		i1.CRe4_909();

	}
	
	
	
	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.quit();

	}


}
