package WebAutomationTask;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendFactory 
{

public static ExtentSparkReporter htmlReporter;
public static ExtentReports extent;
public static ExtentTest test;

@BeforeSuite
public  void setUp()
{
	htmlReporter = new ExtentSparkReporter(System.getProperty("C://Users//JODAYN 480TP025//Desktop"));
	extent = new ExtentReports();
	extent.attachReporter(htmlReporter);
	
}


	
	

}
