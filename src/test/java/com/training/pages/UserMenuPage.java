package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.training.base.BasePage;

public class UserMenuPage extends BasePage {

	WebDriver driver;
	public UserMenuPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "username")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(id = "rememberUn")
	WebElement remember;
	
	@FindBy(id= "forgot_password_link")
	WebElement forgotPassword;

	@FindBy(id = "Login")
	WebElement login;	
	
	@FindBy(xpath = "//*[@id=\"userNav\"]")
	WebElement userNav;
	
	@FindBy(xpath = "//*[@id=\"userNav-menuItems\"]/a[5]")
	WebElement logOut;	

	public void enterintoUsername(String strUsername) {
		username.sendKeys(strUsername);
	}

	public void enterintoPassword(String strPassword) {
		password.sendKeys(strPassword);
	}
	
	public void enterintoBlankPassword() {
		password.sendKeys("");
	}
	
	public void checkRemeberMe() {
		waitForElement(remember);
		remember.click();
	}
	public void forgotPass() {
		waitForElement(forgotPassword);
		forgotPassword.click();
	}
	
	public void clickLogin() {
		login.click();
	}
	
	public void clickLogOut() {
		waitForElement(userNav);
		userNav.click();
		waitForElement(logOut);
		logOut.click();
	}

}
