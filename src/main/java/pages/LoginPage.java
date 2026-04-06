package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	
	private By username=By.id("user-name");
	private By password=By.id("password");
	private By loginbtn=By.name("login-button");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	/*
	 * public void enterUserName(String user) {
	 * driver.findElement(username).sendKeys(user); }
	 * 
	 * public void enterpassword(String pwd) {
	 * driver.findElement(password).sendKeys(pwd); }
	 */
	
	public void login(String uname, String pwd)
	{
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(pwd); 
		driver.findElement(loginbtn).click();
		
	}
	
	
	
	
	

}
