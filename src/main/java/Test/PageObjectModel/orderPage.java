package Test.PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Test.AbstractComponent.AbstractComponent;
import Test.BaseComponents.BaseComponentsDemo;
import io.opentelemetry.sdk.metrics.internal.view.SumAggregation;

public class orderPage extends AbstractComponent {
	WebDriver driver;

	public orderPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public boolean getOrdersList(String productName) {
		List<WebElement> orders=driver.findElements(By.xpath("//tr//td[2]"));
		boolean  match=  orders.stream().anyMatch(p-> p.getText().equalsIgnoreCase(productName));
		return match;
		
		
	}
	
	
	

//	@FindBy(css = "div>div>h3")
//	List<WebElement> cart;
//
//	public WebElement cartMethods(String productName) {
//		List<WebElement> cartList = driver.findElements(By.cssSelector("div>div>h3"));
//		WebElement cart = cartList.stream().filter(c -> c.getText().equalsIgnoreCase(productName)).findFirst()
//				.orElse(null);
//
//		return cart;
//	}
//
//	public CheckoutPage goToCheckout() {
//		driver.findElement(By.cssSelector("div>ul>li>button")).click();
//		CheckoutPage checkout = new CheckoutPage(driver);
//		return checkout;
//	}
//
//	public void goToCart() {
//		driver.findElement(By.cssSelector("div>ul>li>button")).click();
//	}

}
