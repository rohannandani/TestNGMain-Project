package com.MyEcom.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MyEcom.base.BaseClass;

public class SignInPagemanualpom extends BaseClass 
{
	public SignInPagemanualpom()
		{	
			PageFactory.initElements(driver, this);
		}
		
	@FindBy(id = "email_create")
	WebElement loinmailid;
	
	@FindBy(id = "SubmitCreate")
	WebElement acountcreatbutton;	
	
	@FindBy(id = "extends")
	WebElement loginemailid;
	
	@FindBy(id = "passwd")
	WebElement loginpassword;
	
	@FindBy(id ="SubmitLogin")
	WebElement signinbutton;
	
	public String signup() throws InterruptedException
	{
		loinmailid.sendKeys("roh@abc.com");
		Thread.sleep(2000);
		acountcreatbutton.click();
		String singupdetils = driver.getCurrentUrl();
		return singupdetils;
	
	}
	
	
	
		
}
