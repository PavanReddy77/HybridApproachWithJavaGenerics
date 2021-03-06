package com.qa.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage
{
	public LoginPage(WebDriver driver, WebDriverWait wait) 
	{
		super(driver, wait);
	}
	
	//Define Page Locators:
	//Non Page Factory with the help of By Locators is Easy and Light Weight.
	By emailId = By.name("username");
	By password = By.name("password");
	By loginButton = By.xpath("//input[@class='btn btn-small']");
	
	//Define Page Actions:
	public String getLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public void doLogin(String userName, String passWord)
	{
		doSendKeys(emailId, userName);
		doSendKeys(password, passWord);
		click(loginButton);
		try 
		{
			Thread.sleep(6000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}
