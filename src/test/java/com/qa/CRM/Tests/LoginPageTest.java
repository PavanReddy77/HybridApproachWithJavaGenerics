package com.qa.CRM.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.CRM.Pages.LoginPage;

public class LoginPageTest extends BaseTest
{
	@Test(priority=1)
	public void verifyLoginPageTitleTest()
	{
		String title = page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println("The Login Page Title is ::: " +title);
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
	}
	
	@Test(priority=2)
	public void loginTest()
	{
		page.getInstance(LoginPage.class).doLogin("pavanreddy", "Saibaba77");
	}
}
