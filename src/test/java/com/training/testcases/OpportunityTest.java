package com.training.testcases;

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

public class OpportunityTest extends BaseTest {

	LoginPage loginpage;
	static OpportunityPage opportpage;
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
		opportpage = new OpportunityPage(driver);
		DOMConfigurator.configure("log4j.xml");

		String username = prop.getProperties("login.valid.userid");
		loginpage.enterintoUsername(username);
		String password = prop.getProperties("login.valid.password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered the salesforce");
	}

	@Test
	public static void OpportDropDown_16() {
		opportpage.clickOpport();
		opportpage.viewOppr();
	}

	@Test
	public static void CreateOpport_17() {
		opportpage.clickOpport();
		opportpage.createNewOpport();
	}

	@Test
	public static void ViewPipeOpport_18() {
		opportpage.clickOpport();
		opportpage.pipeLink();
	}

	@Test
	public static void ViewStuckOpport_19() {
		opportpage.clickOpport();
		opportpage.stuckOppLink();
	}

	@Test
	public static void QuaterlySummReport_20() {
		opportpage.clickOpport();
		opportpage.quartSummReport();
	}

	@AfterTest
	public void tearDown() {
		screen.takeScreenShot(driver);
		close();
	}

}
