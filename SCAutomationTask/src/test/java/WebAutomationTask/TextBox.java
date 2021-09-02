package WebAutomationTask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextBox {
	ExtentReports report;
	ExtentTest test;
		
	
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		   driver.get("https://demoqa.com/text-box/");
			
		   // Find elements using tag name
		   List<WebElement> allInputElements = driver.findElements(By.tagName("input"));
			
		   if(allInputElements.size() != 0) 
		   {
			   System.out.println(allInputElements.size() + " Elements found by TagName as input \n");
				
			   for(WebElement inputElement : allInputElements) 
			   {
				   System.out.println(inputElement.getAttribute("placeholder"));
			   }
		   }
		   
		   //Filling the form
		   driver.findElement(By.id("userName")).sendKeys("Test User");
		   driver.findElement(By.id("userEmail")).sendKeys("TestUser@gmail.com");
		   driver.findElement(By.id("currentAddress")).sendKeys("This is the currenct addressABC");
		   driver.findElement(By.id("permanentAddress")).sendKeys("This is the permanent addressXYZ");
		   driver.findElement(By.id("submit")).click();
		  
		   //Close the browser
		   driver.close();
		   
	}

}
