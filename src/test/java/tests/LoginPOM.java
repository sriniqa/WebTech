package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage2;

public class LoginPOM extends BaseTest{
	
	@Test
	public void LoginTest3() throws InterruptedException
	{
		LoginPage2 lp=new LoginPage2(driver);
		lp.login("srinivas","srinivas");
				
	}

}
