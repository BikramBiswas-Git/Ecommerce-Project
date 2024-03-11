package Test.AbstractComponent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class AbstractComponent {


	public static WebDriver driver;

	public AbstractComponent(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void waitFunctionVisibility(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitFunctionInVisibility(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

   

    public void waitFunctionEnabledOrDisabled(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

//	public CartPage goToCartPage() {
//		
//				driver.findElement(By.cssSelector("[routerlink='/dashboard/cart']")).click();
//				CartPage cartPage = new CartPage(driver);
//				return cartPage;
//			}
//		
//			public static orderPage orderPageClick() {
//				driver.findElement(By.cssSelector("button[routerlink$='/dashboard/myorders']")).click();
//				orderPage order = new orderPage(driver);
//				return order;
//		
//			}


}