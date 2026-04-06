package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utils.TestContext;
import io.cucumber.java.*;

public class Hooks {
	
	TestContext context;
	
	public Hooks(TestContext context)
	{
		this.context=context;
	}
	
	public static WebDriver driver;
	
	@Before
	public void setup()
	{
		System.out.println("inside Before hook");
		context.driver=new ChromeDriver();
	}
	
	@After
	public void teardown(Scenario scenario)
	{
		
		if(scenario.isFailed())
		{
			System.out.println("Scenario failed , captruing screnshot");
			byte[] screenshot=((TakesScreenshot) context.driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/pmg", "failure screenshot");
		}
		System.out.println("inside after hook");
		context.driver.quit();
	}
	

}
