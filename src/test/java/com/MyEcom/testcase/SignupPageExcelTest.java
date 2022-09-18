package com.MyEcom.testcase;

import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.MyEcom.Pom.IndexPagePom;
import com.MyEcom.Pom.SignInPagePom;
import com.MyEcom.Pom.signupdetailspage;
import com.MyEcom.Utility.ExcelSheetHandle;
import com.MyEcom.base.BaseClass;

public class SignupPageExcelTest extends BaseClass
{
	ExcelSheetHandle data = new ExcelSheetHandle();
	SignInPagePom signUpPagePom;
	IndexPagePom indexPagePom;
	signupdetailspage signupdetail = new signupdetailspage();
	SignupPageExcelTest signuppageExcetlest = new SignupPageExcelTest();
	
	
	@BeforeTest
	public void openbrowser()
	{
		loadApplication();
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
	
	@Test
	public void login() throws FileNotFoundException, InterruptedException
	{
		Sheet sh = data.getSheet(data.getexcelfile(), "login");
		Map<String, Object> logindata = data.getExcelSheetData(sh);
		IndexPagePom indexPagePom = new IndexPagePom();
		signUpPagePom = indexPagePom.ClickOnSignIn();
		signUpPagePom.setLoginData((String)logindata.get("emailid"), (String)logindata.get("password"));
		Thread.sleep(2000);
	}

	@Test
	public void signup() throws FileNotFoundException, InterruptedException
	{
		Sheet sh = data.getSheet(data.getexcelfile(), "signin");
		String signup = data.getSingleSheetData(sh, 2, 0);
		IndexPagePom indexPagePom = new IndexPagePom();
		signUpPagePom = indexPagePom.ClickOnSignIn();
		signUpPagePom.setSignUpData(signup);
		Thread.sleep(10000);
		
	}
	
	@Test
	public void signUpdetalis() throws FileNotFoundException, InterruptedException
	{		
		
	}
}
