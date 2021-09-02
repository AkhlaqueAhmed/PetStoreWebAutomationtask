package WebAutomationTask;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
public class Buttons extends ExtendFactory {

	
	public void ButtonsTest() 
	{	
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		
		driver.manage().window().maximize();


		//Instantiating Actions class
		Actions act = new Actions(driver);

		//Locate WebElement to perform double click 
		WebElement btnElement = driver.findElement(By.id("doubleClickBtn"));
		

		//Double Click the button
		act.doubleClick(btnElement).perform();

		System.out.println("Double click operation performed");

		Actions action = new Actions(driver);
		WebElement rightClickElement=driver.findElement(By.id("rightClickBtn"));
		
        //contextClick() method to do right click on the element
        
		
		action.contextClick(rightClickElement).build().perform();
        
		//Click on dynamic button
		WebElement SingleClick = driver.findElement(By.xpath("//button[text()='Click Me']"));
				
		Actions action1 = new Actions(driver);

		action1.moveToElement(SingleClick).click().perform();
		
		
		//driver.quit();

	}

}
