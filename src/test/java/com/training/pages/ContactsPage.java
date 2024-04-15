package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.base.BasePage;

public class ContactsPage extends BasePage {

	WebDriver driver;

	public ContactsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id=\"Contact_Tab\"]/a")
	WebElement contact;

	@FindBy(xpath = "//input[@name='new']")
	WebElement newcontact;

	@FindBy(xpath = "//input[@id='name_lastcon2']")
	WebElement lastname;

	@FindBy(xpath = "//input[@id='con4']")
	WebElement accountname;

	@FindBy(xpath = "//*[@id=\"topButtonRow\"]/input[1]")
	WebElement savebutton;

	@FindBy(xpath = "//*[@id=\"filter_element\"]/div/span/span[2]/a[2]")
	WebElement newViewLink;

	@FindBy(id = "fname")
	WebElement enterName;

	@FindBy(id = "devname")
	WebElement enteruniqname;

	@FindBy(xpath = "//input[@data-uidsfdc='4']")
	WebElement savebutton1;

	@FindBy(xpath = "//select[@name='hotlist_mode']")
	WebElement viewDropDown;

	@FindBy(xpath = "//select[@id='fcf']")
	WebElement myContact;

	@FindBy(xpath = "//*[@id=\"bodyCell\"]/div[3]/div[1]/div/div[2]/table/tbody/tr[2]/th/a")
	WebElement contactLink;

	@FindBy(xpath = "//*[@id=\"filter_element\"]/div/span/span[2]/a[2]")
	WebElement createNewViewLink;

	@FindBy(xpath = "//input[@data-uidsfdc='4']")
	WebElement saveButton2;
	
	@FindBy(xpath = "//*[@id=\"editPage\"]/div[1]/table/tbody/tr/td[2]/input[1]")
	WebElement cancelButton;
	
	@FindBy(xpath = "//input[@tabindex=32]")
	WebElement savenewbutton;

	public void clickContact() {
		waitForElement(contact);
		contact.click();
	}

	public void clickNewContact() {
		waitForElement(newcontact);
		newcontact.click();
	}

	public void enterlastname(String lstname) {
		waitForElement(lastname);
		lastname.sendKeys(lstname);
	}

	public void enterAccountName(String acctname) {
		waitForElement(accountname);
		accountname.sendKeys("acctname");
	}

	public void clickSavebutton() {
		waitForElement(savebutton);
		savebutton.click();
	}

	public void viewLink() {
		waitForElement(newViewLink);
		newViewLink.click();
	}

	public void enterName() {
		waitForElement(enterName);
		enterName.sendKeys("NewView");
	}

	public void enterUniqName() {
		waitForElement(enteruniqname);
		enteruniqname.sendKeys("");
	}

	public void saveButton1() {
		waitForElement(savebutton1);
		savebutton1.click();
	}

	public void recentlyCreatedView() {
		waitForElement(viewDropDown);
		Select selectob = new Select(viewDropDown);
		selectob.selectByVisibleText("Recently Created");
	}

	public void myContactView() {
		waitForElement(myContact);
		Select selectob = new Select(myContact);
		selectob.selectByVisibleText("My Contacts");
	}
	
	public void viewNewContact() {
		waitForElement(enteruniqname);
		enteruniqname.sendKeys("abncd");
		waitForElement(saveButton2);
		saveButton2.click();
	}	

	public void viewContactLink() {
		waitForElement(contactLink);
		contactLink.click();		
	}
	
	public void cancelContactButton() {
		waitForElement(cancelButton);
		cancelButton.click();
		}
	public void saveNewButton() {
		waitForElement(savenewbutton);
		savenewbutton.click();
		}
}
