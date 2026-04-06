package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage2 {
	
	WebDriver driver;
	
	
	private By username=By.id("user-name");
	private By password=By.id("password");
	private By loginbtn=By.name("login-button");
	
	public LoginPage2(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void enterUserName(String user)
	{
		driver.findElement(username).sendKeys(user);
		
		
	}
	
	public void enterPassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clicklogin()
	{
		driver.findElement(loginbtn).click();
	}
	
	public void login(String user, String pwd) throws InterruptedException
	{
		enterUserName(user);
		enterPassword(pwd);
		clicklogin();
		Thread.sleep(2000);
	}
	
	
	
	

}
