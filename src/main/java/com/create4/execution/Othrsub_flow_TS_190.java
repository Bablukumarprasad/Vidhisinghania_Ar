package com.create4.execution;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.create4.scenarios.TS_190;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Othrsub_flow_TS_190 {
	@BeforeMethod
	public void beforeMethod() throws Exception {

		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Login");

		String URL = r1.getCell(1, 0).getContents();
		String FirefoxBrowser = r1.getCell(1, 1).getContents();
		GlobalMethods.LaunchBrowser(FirefoxBrowser, URL);

	}

	@Test
	public void CRe4_2294() throws Exception {

		TS_190 i1 = new TS_190();
		i1.CRe4_2294();

	}

	@Test
	public void CRe4_2295_2296_2297() throws Exception {

		TS_190 i1 = new TS_190();
		i1.CRe4_2295_2296_2297();

	}

	@Test
	public void CRe4_2303_2304() throws Exception {

		TS_190 i1 = new TS_190();
		i1.CRe4_2303_2304();

	}

	@Test
	public void CRe4_2305() throws Exception {

		TS_190 i1 = new TS_190();
		i1.CRe4_2305();

	}

	@Test
	public void CRe4_2309() throws Exception {

		TS_190 i1 = new TS_190();
		i1.CRe4_2309();

	}

	@Test
	public void CRe4_2310_2336() throws Exception {

		TS_190 i1 = new TS_190();
		i1.CRe4_2310_2336();

	}
	
	@Test
	public void CRe4_2333_2334_2335() throws Exception {

		TS_190 i1 = new TS_190();
		i1.CRe4_2333_2334_2335();

	}

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();

	}

}
