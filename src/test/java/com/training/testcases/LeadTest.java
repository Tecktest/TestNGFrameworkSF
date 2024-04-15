package com.training.testcases;

import com.training.pages.LeadsPage;
import com.training.pages.LoginPage;
import com.training.pages.OpportunityPage;
import com.training.utilities.PropertiesFile;
import com.training.utilities.ScreenShotUtility;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.log.Log;

public class LeadTest extends BaseTest {

	LoginPage loginpage;
	static LeadsPage leadpage;
	WebDriver driver;
	PropertiesFile prop;
	ScreenShotUtility screen = new ScreenShotUtility();

	@BeforeMethod
	public void BeforeMethod() {
		driver = geDriver();
		prop = new PropertiesFile();
		String url = prop.getProperties("url");
		driver.get(url);
		loginpage = new LoginPage(driver);
		leadpage = new LeadsPage(driver);
		DOMConfigurator.configure("log4j.xml");

		String username = prop.getProperties("login.valid.userid");
		loginpage.enterintoUsername(username);
		String password = prop.getProperties("login.valid.password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered the salesforce");
	}

	@Test
	public static void LeadsTab_21() {
		leadpage.clickLead();		
	}
	
	@Test
	public static void LeadsViewDrop_22() {
		leadpage.clickLead();	
		leadpage.dropDownLead();
	}
	@Test
	public static void LeadsGoButton_23() {
		leadpage.clickLead();	
		leadpage.dropDownLead();
	}
	
	
	
	// @AfterTest
	// public void tearDown() {
	// screen.takeScreenShot(driver);
	// close();
	// }

}
