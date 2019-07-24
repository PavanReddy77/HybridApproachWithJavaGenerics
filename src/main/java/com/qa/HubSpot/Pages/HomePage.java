package com.qa.HubSpot.Pages;

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
	By header = By.className("private-page__title");
	
	//Define Page Actions:
	public String homePageTitle()
	{
		return driver.getTitle();
	}
	
	public String getHomePageHeader()
	{
		return doGetText(header);
	}
}
