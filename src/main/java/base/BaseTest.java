package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://saucedemo.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	public void registration(String name, String emailid)
	{
		
	}

}
