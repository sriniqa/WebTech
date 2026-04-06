package Utils;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	WebDriver driver;
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	//FileUtils.copyFile(src , new File("target/" + scenario.getName() + ".png"));
	
}
