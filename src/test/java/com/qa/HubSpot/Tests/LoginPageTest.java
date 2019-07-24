package com.qa.HubSpot.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.HubSpot.Pages.LoginPage;

public class LoginPageTest extends BaseTest
{
	@Test(priority=1)
	public void verifyLoginPageTitleTest()
	{
		String title = page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println("The Login Page Title is ::: " +title);
		Assert.assertEquals(title, "HubSpot Login");
	}
	
	@Test(priority=2)
	public void loginTest()
	{
		page.getInstance(LoginPage.class).doLogin("naveenanimation20@gmail.com", "Test@1234");
	}
}
