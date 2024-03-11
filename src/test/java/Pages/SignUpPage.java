package Pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import Test.BaseComponents.BaseComponentsDemo;

public class SignUpPage extends BaseComponentsDemo {
	public static WebDriver driver;

	public String UserData(String propertyName) {
		Properties properties = new Properties();
		try {
			FileInputStream fileInputStream = new FileInputStream(
					"/Users/codeclouds-bikram/Documents/Ecommerce-Automation/Automation/src/test/java/Test/resources/Globaldata.properties");
			properties.load(fileInputStream);
			fileInputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties.getProperty(propertyName);

	}

	public SignUpPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void SigningUp() {
		driver.get("https://www.demoblaze.com/index.html");
		// WebElemets related to this page
		WebElement signUpButton = driver.findElement(By.cssSelector("#signin2"));
		WebElement userNameField = driver.findElement(By.cssSelector("#sign-username"));
		WebElement passwordField = driver.findElement(By.cssSelector("#sign-password"));
		WebElement signUpButon = driver.findElement(By.xpath("//button[text()='Sign up']"));
		waitFunctionVisibility(signUpButton);
		signUpButton.click();
		String userName = UserData("username");
		String password = UserData("password");
		waitFunctionVisibility(userNameField);
		userNameField.sendKeys(userName);
		passwordField.sendKeys(password);
		signUpButon.click();

	}

}