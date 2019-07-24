package com.qa.HubSpot.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.HubSpot.Pages.HomePage;
import com.qa.HubSpot.Pages.LoginPage;

public class HomePageTest extends BaseTest
{
	@Test(priority=1)
	public void verifyHomePageTitleTest()
	{
		page.getInstance(LoginPage.class).doLogin("naveenanimation20@gmail.com", "Test@1234");
		String title = page.getInstance(HomePage.class).homePageTitle();
		System.out.println("The Home Page Title is ::: " +title);
		Assert.assertEquals(title, "Reports dashboard");
	}
	
	@Test(priority=2)
	public void verifyHomePageHeaderTest()
	{
		page.getInstance(LoginPage.class).doLogin("naveenanimation20@gmail.com", "Test@1234");
		String header= page.getInstance(HomePage.class).getHomePageHeader();
		System.out.println("The Home Page Header is ::: " +header);
		Assert.assertEquals(header, "Sales Dashboard");
	}
}
