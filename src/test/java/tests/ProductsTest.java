package tests;

import org.testng.annotations.Test;

import Utils.DataProviderClass;
import base.BaseTest;
import pages.LoginPage;

public class ProductsTest extends BaseTest{
	@Test
	public void loginTest()
	{ 
		LoginPage lp=new LoginPage(driver);
		lp.login("srinivas", "passwrod");
		
	//	System.out.println("username :" + username + "password : " );
		
		
	}
	

}
