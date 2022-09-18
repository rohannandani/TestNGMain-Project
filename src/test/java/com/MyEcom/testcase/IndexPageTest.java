package com.MyEcom.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.MyEcom.Pom.IndexPagePom;
import com.MyEcom.base.BaseClass;

public class IndexPageTest extends BaseClass
{
	IndexPagePom indexPagePom = new IndexPagePom();
	
	@BeforeTest
	public void open()
	{
		loadApplication();
		driver.get(prop.getProperty("baseurl"));
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
	
	@Test
	public void validlogo()
	{
		boolean res = indexPagePom.validateLogo();
		Assert.assertTrue(true);
	}
	
	@Test
	public void getTitile()
	{
		String title = indexPagePom.getTitleOfPage();
		Assert.assertEquals(title, true);
		System.out.println("Title of page "+title);
	}
	
	@Test
	public void serchProdect()
	{
		indexPagePom.SendTextToSearch();
		indexPagePom.ClickOnSearch();
	}
	
	@Test
	public SignupPageExcelTest clickOnSignIn()
	{
		indexPagePom.ClickOnSignIn();
		return new SignupPageExcelTest();
		
	}
	

}
