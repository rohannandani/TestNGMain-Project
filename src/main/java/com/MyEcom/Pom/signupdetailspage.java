package com.MyEcom.Pom;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.MyEcom.base.BaseClass;

public class signupdetailspage extends BaseClass
{	
	public signupdetailspage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "id_gender1")
	WebElement title;
	
	@FindBy(id = "customer_firstname")
	WebElement fname;
	
	@FindBy(id = "customer_lastname")
	WebElement lname;
	
	@FindBy(xpath = "//input[@id ='email']")
	WebElement emailid;
	
	@FindBy(xpath = "//input[@id ='passwd']")
	WebElement passward;
	
	@FindBy(xpath = "//select[@id ='days']")
	WebElement date;
	
	@FindBy(xpath = "//select[@id ='months']")
	WebElement month;
	
	@FindBy(xpath = "//select[@id ='years']")
	WebElement year;
	
	
	public void clcik()
	{
		title.click();		
	}
	
	public void signUpData(String Fname, String Lname, String usename, String pass)
	{
		fname.sendKeys(Fname);
		lname.sendKeys(Lname);
		emailid.sendKeys(usename);
		passward.sendKeys(pass);
	}
	
	public void signUpDropDowin()
	{
		Select dates = new Select(date);
		dates.selectByIndex(20);
		
		Select months = new Select(month);
		months.selectByValue("");;
		
		Select years = new Select(year);
		years.selectByValue("2022");
	}

}
