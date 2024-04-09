package com.training.testcases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.w3c.dom.DOMConfiguration;

import com.training.base.BaseTest;
import com.training.log.Log;
import com.training.pages.LoginPage;
import com.training.utilities.PropertiesFile;
import com.training.utilities.ScreenShotUtility;

public class LoginTest extends BaseTest {

	LoginPage loginpage;
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
		DOMConfigurator.configure("log4j.xml");

	}

	@Test
	public void invalidLogin_1() {
		Log.startTestCase("Login Testcase");
		String username = prop.getProperties("login.valid.userid");
		loginpage.enterintoUsername(username);
		Log.info("entered the username" + username);		
		loginpage.enterintoBlankPassword();
		loginpage.clickLogin();
		Log.warn("Please enter the password");
		Log.endTestCase("Invalid Testcases");
	}

	@Test
	public void TC2_Validlogin() {

		String username = prop.getProperties("login.valid.userid");
		loginpage.enterintoUsername(username);
		String password = prop.getProperties("login.valid.password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered the salesforce");
	}

	@Test
	public void rememberMe_3() {
		String username = prop.getProperties("login.valid.userid");
		loginpage.enterintoUsername(username);
		String password = prop.getProperties("login.valid.password");
		loginpage.enterintoPassword(password);
		loginpage.checkRemeberMe();
		Log.info("checked the remberme option");
		loginpage.clickLogin();
		Log.info("Successfully loggedin the salesforce");
		loginpage.clickLogOut();
		Log.info("Successfully loggedout from salesforce");
	}	
	
	@Test
	public void forgotPassword_4B() {
		String username = prop.getProperties("login.valid.userid");
		loginpage.enterintoUsername(username);
		String password = prop.getProperties("");
		loginpage.forgotPass();
		Log.info("clicked on forgot password link");
	}
	
	@Test
	public void invalidLogin_5() {
		String username = prop.getProperties("login.invalid.userid");
		loginpage.enterintoUsername(username);
		String password = prop.getProperties("login.invalid.password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Unsuccesful logged in");
	}	

	//@AfterTest
	//public void tearDown() {
		//screen.takeScreenShot(driver);
		//close();
	//}
}
