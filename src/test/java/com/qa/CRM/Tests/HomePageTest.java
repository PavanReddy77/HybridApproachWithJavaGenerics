package com.qa.CRM.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.CRM.Pages.HomePage;
import com.qa.CRM.Pages.LoginPage;

public class HomePageTest extends BaseTest
{
	@Test(priority=1)
	public void verifyHomePageTitleTest()
	{
		page.getInstance(LoginPage.class).doLogin("pavanreddy", "Saibaba77");
		String title = page.getInstance(HomePage.class).homePageTitle();
		System.out.println("The Home Page Title is ::: " +title);
		Assert.assertEquals(title, "CRMPRO");
	}
	
	@Test(priority=2)
	public void verifyHomePageHeaderTest()
	{
		page.getInstance(LoginPage.class).doLogin("pavanreddy", "Saibaba77");
		driver.switchTo().frame("mainpanel");
		String userName = page.getInstance(HomePage.class).getHomePageUserName();
		System.out.println("The Home Page UserName is ::: " +userName);
		Assert.assertEquals(userName, "  User: Pavan KrishnanReddy");
	}
}
