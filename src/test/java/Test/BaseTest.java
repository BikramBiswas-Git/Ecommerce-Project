package Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import Test.AbstractComponent.AbstractComponent;
import Test.BaseComponents.BaseComponentsDemo;
import Pages.SignUpPage;
import Pages.SignUpPage;

public class BaseTest extends BaseComponentsDemo

{
	public BaseTest() {
		// Default constructor
	}

	WebDriver driver = InitializeDriver();
	// Extent Report
	private ExtentReports extent;
	private ExtentTest test;

	// Page Objects
	Pages.SignUpPage SignUp = new Pages.SignUpPage(driver);

	@Test(priority = 1)
	public void SignUpPageTest() throws InterruptedException {
		SignUp.SigningUp();
	}

}