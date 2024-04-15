package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.base.BasePage;

public class OpportunityPage extends BasePage {

	WebDriver driver;

	public OpportunityPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id=\"Opportunity_Tab\"]/a")
	WebElement opportunityTab;

	@FindBy(xpath = "//input[@name='new']")
	WebElement createNewOpp;

	@FindBy(id = "opp3")
	WebElement opportName;

	//@FindBy(xpath = "//*[@id=\"opp4_lkwgt\"]/img")
	@FindBy(id = "opp4")
	WebElement acctName;
	
	@FindBy(xpath="//*[@id=\"lksrch\"]")
	WebElement findAcctName;
	
	@FindBy(id = "opp9")
	WebElement closeDate;
	
	@FindBy(xpath="//*[@id=\"datePicker\"]/div[2]/div/a")
	WebElement selectTodayDate;
	
	@FindBy(xpath = "//select[@id='opp11']")
	WebElement selectStage;

	@FindBy(id = "opp12")
	WebElement probability;
		
	@FindBy(id="opp6")
	WebElement leadSource;

	@FindBy(xpath = "//input[@id='opp17']")
	WebElement primaryCamp;

	@FindBy(xpath = "//input[@name='go']")
	WebElement viewDropDown;
	
	@FindBy(xpath = "//*[@id=\"bottomButtonRow\"]/input[1]")
	WebElement saveButton;
	
	@FindBy(xpath="//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[1]/a")
	WebElement pipeLink ;
	
	@FindBy(xpath="//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[2]/a")
	WebElement stuckOppLink;
	
	@FindBy(xpath="//*[@id=\"quarter_q\"]/option[2]")
	WebElement currentFqInter;
	
	@FindBy(xpath="//*[@id=\"open\"]/option[3]")
	WebElement allOpport;
	
	@FindBy(xpath="//input[@value='Run Report']")
	WebElement runReportButt;	
	
	
	public void clickOpport() {
		waitForElement(opportunityTab);
		opportunityTab.click();
	}
	public void viewOppr() {
		waitForElement(viewDropDown);
		viewDropDown.click();
		// Select selectob = new Select(opportunityTab);
	}

	public void createNewOpport() {
		waitForElement(createNewOpp);
		createNewOpp.click();
		
		waitForElement(opportName);
		opportName.sendKeys("newTestOpp");
		
		waitForElement(acctName);
		acctName.sendKeys("TC11");
		
	//	driver.switchTo().frame("searchFrame");		
		//waitForElement(findAcctName);
		//findAcctName.sendKeys("TC1");		
		
		waitForElement(closeDate);
		closeDate.click();
		selectTodayDate.click();
		
		waitForElement(selectStage);
		Select selectob = new Select(selectStage);
		selectob.selectByVisibleText("Value Proposition");	
		
		waitForElement(probability);
		probability.sendKeys("");
		
		waitForElement(leadSource);
		Select selectob1 = new Select(leadSource);
		selectob1.selectByVisibleText("Purchased List");
		
		//driver.switchTo().frame("searchFrame");		
		//waitForElement(primaryCamp);
		//primaryCamp.sendKeys("TC1");

		waitForElement(saveButton);
		saveButton.click();
		
	}
	
	public void pipeLink() {
		waitForElement(pipeLink);
		pipeLink.click();	
		
	}
	
	public void stuckOppLink() {
		waitForElement(stuckOppLink);
		stuckOppLink.click();	
		
	}
	
	public void quartSummReport() {
		waitForElement(currentFqInter);
		currentFqInter.click();
		waitForElement(allOpport);
		allOpport.click();
		waitForElement(runReportButt);
		runReportButt.click();
		
	}

}
