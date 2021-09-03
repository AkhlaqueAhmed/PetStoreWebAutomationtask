package WebAutomationTask;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowAlert {
	
	@Test
	public void WindowAlertTest() 
	{	
		

			WebDriverManager.chromedriver().setup();

			WebDriver driver = new ChromeDriver();

			driver.get("https://demoqa.com/alerts");

			driver.manage().window().maximize();

			// This step will result in an alert on screen

			WebElement element = driver.findElement(By.id("promtButton"));

			((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);

			Alert promptAlert = driver.switchTo().alert();

			String alertText = promptAlert.getText();

			// Print the alert Text
			System.out.println("Alert text is " + alertText);
		
			// Send some text to the alert
			promptAlert.sendKeys("Test User Sprite Cloud");

			promptAlert.accept();
			
			driver.close();
	}

}
