package com.training.testcases;

import com.training.pages.ContactsPage;
import com.training.pages.LoginPage;
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

public class ContactsTest extends BaseTest {

	LoginPage loginpage;
	static ContactsPage contactpage;
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
		contactpage = new ContactsPage(driver);
		DOMConfigurator.configure("log4j.xml");

		String username = prop.getProperties("login.valid.userid");
		loginpage.enterintoUsername(username);
		String password = prop.getProperties("login.valid.password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered the salesforce");
	}

	@Test
	public static void CreateContacts_26() {
		contactpage.clickContact();
		contactpage.clickNewContact();
		contactpage.enterlastname("");
		contactpage.enterAccountName("marchNew");
		contactpage.clickSavebutton();
		Log.info("Successfully created new contact");

	}

	@Test
	public void CreateContactsView_27() {
		contactpage.clickContact();
		contactpage.viewLink();
		contactpage.enterName();
		contactpage.enterUniqName();
		contactpage.saveButton1();
		Log.info("Successfully create new View");

	}

	@Test
	public void RecentlyCreateContacts_28() {
		contactpage.clickContact();
		contactpage.recentlyCreatedView();
	}

	@Test
	public void MyContacts_29() {
		contactpage.clickContact();
		contactpage.myContactView();
	}

	@Test
	public void ViewContacts_30() {
		contactpage.clickContact();
		contactpage.viewContactLink();
	}

	@Test
	public void CreateViewContacts_31() {
		contactpage.clickContact();
		contactpage.viewLink();
		contactpage.viewNewContact();
	}

	@Test
	public void CancelButtonContacts_32() {
		contactpage.clickContact();
		contactpage.viewLink();
		contactpage.enterName();
		contactpage.enterUniqName();
		contactpage.cancelContactButton();
		Log.info("New View not created");
	}

	@Test
	public void NewContactsPage_33() {
		contactpage.clickContact();
		contactpage.clickNewContact();
		contactpage.enterlastname("Indian");
		contactpage.enterAccountName("Global Media");
		contactpage.saveNewButton();
		Log.info("Successfully create new View");
	}

	@AfterTest
	public void tearDown() {
	screen.takeScreenShot(driver);
	close();
	}

}
