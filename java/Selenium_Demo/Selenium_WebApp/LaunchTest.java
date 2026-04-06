package Selenium_Demo.Selenium_WebApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchTest {
	
	WebDriver driver=new ChromeDriver();
	
	@Test
	public void launch_browser()
	{
		driver.get("https://google.com");
		driver.quit();
	}

}
