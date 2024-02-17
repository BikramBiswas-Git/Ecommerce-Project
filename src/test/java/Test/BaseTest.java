package Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import Test.AbstractComponent.AbstractComponent;
import Test.BaseComponents.BaseComponentsDemo;

public class BaseTest extends BaseComponentsDemo

{

	public BaseTest() {
		// Default constructor
	}

	WebDriver driver = InitializeDriver();
	// Extent Report
	private ExtentReports extent;
	private ExtentTest test;

	@Test
	public void Tracking() throws InterruptedException {
		for (int i = 0; i < 2; i++) {
			driver.get("https://google.com");
			System.out.println("URL got hit " + i + "times");
		}
		assertEquals(false, true);

	}

}
