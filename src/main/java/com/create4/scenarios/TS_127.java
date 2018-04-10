package com.create4.scenarios;

import java.io.FileInputStream;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.global.methods.GlobalMethods;
import com.global.methods.GlobalWait;

import jxl.Sheet;
import jxl.Workbook;

/*
 * Check for 'Apply for PI' form functionality in Investigator login
 */

public class TS_127 {

	public TS_127() {
		PageFactory.initElements(GlobalMethods.driver, this);
	}GlobalWait GWait = new GlobalWait(GlobalMethods.driver);
	Actions action = new Actions(GlobalMethods.driver);

	@FindBy(linkText = "Dashboard")
	WebElement Menu_PI_1;

	@FindBy(linkText = "My Projects")
	WebElement Menu_PI_2;

	@FindBy(linkText = "Project Notifications")
	WebElement Menu_PI_3;

	@FindBy(linkText = "Reminders")
	WebElement Menu_PI_4;

	@FindBy(linkText = "My IEC")
	WebElement Menu_PI_5;

	@FindBy(linkText = "My Account")
	WebElement Menu_PI_6;

	@FindBy(linkText = "My Profile")
	WebElement Menu_PI_7;

	@FindBy(linkText = "Change Password")
	WebElement Menu_PI_8;

	@FindBy(xpath = "//ul[@id='accordion']/li/div/a")
	WebElement Menu_PI_9;

	@FindBy(id = "applyPI")
	WebElement Menu_PI_10;

	@FindBy(xpath = "//p/a")
	WebElement logoutt;
	
	@FindBy(xpath = ".//*[@id='applyPIWindow']/div[2]/div/div[2]")
	WebElement popuptext;
	
	@FindBy(xpath = "//html/body/div[4]/div[2]/div/div[1]")
	WebElement popupheader;

	@FindBy(css = "img")
	WebElement logo;

	// Check for Study team member login
	public void CRe4_591_592_593() throws Exception {

		GlobalMethods.Investigator_Login();

		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Data_Sheet");

		String heading = r1.getCell(2, 121).getContents();
		String text = r1.getCell(3, 121).getContents();
		
        Thread.sleep(2000);
		
		WebElement Menu_PI_6 = GWait.Wait_GetElementByLinkText("My Account");
		Menu_PI_6.click();
		
		
		WebElement Menu_PI_10 =GWait.Wait_GetElementById("applyPI"); 
		Menu_PI_10.click();
		Thread.sleep(2000);
		System.out.println(popupheader.getText());
		String heading1 = popupheader.getText();
		System.out.println(popuptext.getText());
				
		String textfile1 = heading1.substring(2);
		System.out.println(textfile1);
		
		Assert.assertEquals(textfile1, heading);
		
		Assert.assertEquals(popuptext.getText().trim(), text);
		
		WebElement logoutt1 =GWait.Wait_GetElementByXpath("//p/a");
		logoutt1.click();
						
		WebElement logo = GWait.Wait_GetElementByCSS("img");
		logo.click();
	}

	

}
