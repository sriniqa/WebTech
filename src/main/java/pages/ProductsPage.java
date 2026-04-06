package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
	
	WebDriver driver;
	
	private By addToCart=By.id("add-to-cart-sauce-labs-backpack");
	private By carticon=By.className("shopping_cart_link");
	
	public void addProductCArt()
	{
		driver.findElement(addToCart).click();
	}

	public void clickCart()
	{
		driver.findElement(carticon).click();
	}
}
