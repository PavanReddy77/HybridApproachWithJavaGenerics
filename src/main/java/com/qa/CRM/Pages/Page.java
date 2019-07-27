package com.qa.CRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page 
{
	public WebDriver driver;
	public WebDriverWait wait;
	
	//Page Class Constructor to Initialize Constructor.
	public Page(WebDriver driver, WebDriverWait wait)
	{
		this.driver = driver;
		this.wait = wait;
	}
	
	//Create a Method with Java Generics and Return a New Page.
	public <TPage extends BasePage> TPage getInstance(Class<TPage> pageClass) 
	{
		try
		{
			return pageClass.getDeclaredConstructor(WebDriver.class, WebDriverWait.class).newInstance(this.driver, this.wait);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return null;
		}
	}
}
