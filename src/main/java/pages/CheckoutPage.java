package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CheckoutPage {

	
WebDriver driver;
	
	
	private By cartlabel=By.xpath("//*[text()='Your Cart']");
	private By removebackpack=By.id("remove-sauce-labs-backpack");
	private By checkoutbtn=By.id("checkout");
	private By continueshopping=By.id("continue-shopping");
	
	
	public void validatecartlabel() {
		
		Boolean status=driver.findElement(cartlabel).isDisplayed();
		Assert.assertTrue(status);
	}
	
	public void removeitemfromcheckout()
	{
		driver.findElement(removebackpack).click();
	}
	
	public void clickcheckoutbtn()
	{
		driver.findElement(checkoutbtn).click();
	}
	
	public void clickcontinueshoppingbtn()
	{
		driver.findElement(continueshopping).click();
	}
}

