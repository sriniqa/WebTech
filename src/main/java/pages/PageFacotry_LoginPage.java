package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFacotry_LoginPage {
	
	WebDriver driver;
	
	public PageFacotry_LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement inputpassword;
	
	@FindBy(id="login-button")
	WebElement loginbtn;
	
	public void enterUserName(String user)
	{
		username.sendKeys(user);
		
		
	}
	
	public void enterPassword(String pwd)
	{
		inputpassword.sendKeys(pwd);
	}
	
	public void clicklogin()
	{
		loginbtn.click();
	}
	
	public void login(String uname, String pwd)
	{
		enterUserName(uname);
		enterPassword(pwd);
		clicklogin();
		//Thread.sleep(2000);
		
	}
	
	

}
