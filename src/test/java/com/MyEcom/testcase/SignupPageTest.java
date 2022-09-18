package com.MyEcom.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.MyEcom.Pom.IndexPagePom;
import com.MyEcom.Pom.SignInPagemanualpom;
import com.MyEcom.Pom.signupdetailspage;
import com.MyEcom.base.BaseClass;

public class SignupPageTest extends BaseClass
{
	IndexPagePom index = new IndexPagePom();
	SignInPagemanualpom signup = new SignInPagemanualpom();
	signupdetailspage signupdetail= new signupdetailspage();
	
	
	@BeforeTest
	public void open() 
	{
		loadApplication();
		//driver.get(index.ClickOnSignIn());
		//driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
	
	@Test
	public void signup() throws InterruptedException
	{
		signup.signup();
	}
	

}
