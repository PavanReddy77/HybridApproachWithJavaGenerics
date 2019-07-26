package com.qa.HubSpot.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.HubSpot.Pages.Page;

public class BaseTest 
{
	public WebDriver driver;
	public WebDriverWait wait;
	public Page page;
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 15);
		driver.manage().window().maximize();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(6000);
		
		//Create the Object of Page Class >> Instantiate Page Class
		page = new Page(driver, wait);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
