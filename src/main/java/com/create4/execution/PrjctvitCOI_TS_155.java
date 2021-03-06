package com.create4.execution;

import java.io.FileInputStream;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.create4.scenarios.TS_155;

import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class PrjctvitCOI_TS_155  {
	@BeforeMethod
	public void beforeMethod() throws Exception, Exception {
		
		
		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Login");

		String URL = r1.getCell(1,0).getContents();
		String FirefoxBrowser = r1.getCell(1,1).getContents();
		GlobalMethods.LaunchBrowser(FirefoxBrowser, URL);

	}

	@Test(priority=0)
	public void CRe4_2085_2086_2087_2088_2089_2090_2091_2093_2094_2095() throws Exception {

		TS_155 i1 = new TS_155();
		i1.CRe4_2085_2086_2087_2088_2089_2090_2091_2093_2094_2095();

	}

 	@Test(priority=1)
	public void CRe4_2097_2098_2099_2100_2101() throws Exception {

		TS_155 i1 = new TS_155();
		i1.CRe4_2097_2098_2099_2100_2101();

	}
	
	
	@Test(priority=2)
	public void CRe4_2092_2096() throws Exception {

		TS_155 i1 = new TS_155();
		i1.CRe4_2092_2096();

	}
	
	@Test(priority=3)
	public void CRe4_2102() throws Exception {

		TS_155 i1 = new TS_155();
		i1.CRe4_2102();

	}

	/*@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();
		

	}*/

}
