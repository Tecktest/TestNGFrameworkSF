package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.base.BasePage;

public class LeadsPage extends BasePage {

	WebDriver driver;

	public LeadsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id=\"Lead_Tab\"]/a")
	WebElement LeadTab;
	
	@FindBy(xpath = "//*[@id=\"fcf\"]")
	WebElement validateView;
	
	public void clickLead() {
		waitForElement(LeadTab);
		LeadTab.click();
	}
	public void dropDownLead() {
		waitForElement(validateView);
		validateView.click();
	}
	
	/*driver.findElement(By.xpath("//*[@id=\"fcf\"]/option[2]")).click();	
	driver.findElement(By.xpath("//*[@id=\"userNav\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]")).click();
	Thread.sleep(4000);
	driver.findElement(By.id("username")).sendKeys("sujyot@eclerx.apm");
	driver.findElement(By.id("password")).sendKeys("testing#123");
	driver.findElement(By.id("Login")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"Lead_Tab\"]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[1]/input")).click();
*/
}

