package tests;

import org.testng.annotations.Test;

import Utils.DataProviderClass;
import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest{
	
	@Test(dataProvider="logindata", dataProviderClass=DataProviderClass.class)
	public void loginTest(String username, String password)
	{ 
		LoginPage lp=new LoginPage(driver);
		lp.login(username, password);
		
		System.out.println("username :" + username + "password : " );
	}
	

}
