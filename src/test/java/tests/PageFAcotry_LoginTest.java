package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;
import pages.PageFacotry_LoginPage;

public class PageFAcotry_LoginTest extends BaseTest{
	
	@Test
	public void login()
	{
	PageFacotry_LoginPage lp=new PageFacotry_LoginPage(driver);
	
	lp.login("standard_user", "secret_sauce");
	HomePage homepage=new HomePage(driver);
	
	String acttitle=homepage.getPageTitle();
	Assert.assertEquals(acttitle, "Products");
	//System.out.println("username :" + username + "password : ");
	
	}

}
