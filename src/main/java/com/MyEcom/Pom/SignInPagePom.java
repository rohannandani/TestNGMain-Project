package com.MyEcom.Pom;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MyEcom.base.BaseClass;

public class SignInPagePom extends BaseClass

{
	public SignInPagePom()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "email")
	WebElement emailid;
	
	@FindBy(id = "passwd")
	WebElement lopassword;
	
	@FindBy(id ="SubmitLogin")
	WebElement signinbutton;
	
	@FindBy(id = "email_create")
	WebElement signupmailid;
	
	@FindBy(id = "SubmitCreate")
	WebElement accountcreatbutton;
	
	public void setLoginData(String username, String passward)
	{
		emailid.sendKeys(username);
		lopassword.sendKeys(passward);
	}
	
	public signupdetailspage setSignUpData(String username)
	{
		signupmailid.sendKeys(username);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(200000));
		accountcreatbutton.click();
		return new signupdetailspage();
	}
	
	

}
