package com.qa.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage
{
	public HomePage(WebDriver driver, WebDriverWait wait) 
	{
		super(driver, wait);
	}
	
	//Define Page Locators:
	//Non Page Factory with the help of By Locators is Easy and Light Weight.
	By userName = By.xpath("//td[contains(text(),'User: Pavan KrishnanReddy')]");
	
	//Define Page Actions:
	public String homePageTitle()
	{
		return driver.getTitle();
	}
	
	public String getHomePageUserName()
	{
		return doGetText(userName);
	}
}
