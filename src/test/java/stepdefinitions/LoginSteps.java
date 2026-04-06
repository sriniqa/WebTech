package stepdefinitions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Utils.TestContext;
import io.cucumber.java.en.*;
import hooks.Hooks;

public class LoginSteps  {
	WebDriver driver;
	//Hooks obj=new Hooks();
	TestContext context;
	
	public LoginSteps(TestContext context)
	{
		//this.context=context;
		this.driver=context.driver;
	}
	
	
	@Given("user is on login page")
	public void user_is_on_login_page()
	{
		//driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}
	
	@When("user enters username {string}")
	public void user_enters_username(String username)
	{
		driver.findElement(By.id("user-name")).sendKeys(username);
	}
	@And("user enters password {string}")
	public void user_enters_password(String password)
	{
	     driver.findElement(By.id("password")).sendKeys(password);
	}

	
	@And("user clicks login button")
	public void user_clicks_login_button()
	{
		driver.findElement(By.id("login-button")).click();
	}
	
	 
	
	@Then("user should navigate to home page")
	public void user_should_navigate_to_home_page()
	{
		String title=driver.findElement(By.xpath("//*[text()='Product']")).getText();
		System.out.print("page title : "+ title);
		Assert.assertEquals(title, "Products");
	}

}
