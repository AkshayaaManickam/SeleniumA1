package SeleniumPractice;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentTestscreenshot 
{
  @Test
  public void testcase()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demowebshop.tricentis.com/");
	  TakesScreenshot ts=(TakesScreenshot) driver;
	  ExtentSparkReporter spark=new ExtentSparkReporter("C:\\Users\\admin\\eclipse-workspace\\selenium\\com.demowebshop\\ExtendsPath\\report.html");
	   ExtentReports report=new ExtentReports();
	   
	   report.attachReporter(spark);
	   ExtentTest test = report.createTest("testcase");
	   test.addScreenCaptureFromBase64String(ts.getScreenshotAs(OutputType.BASE64));
	   report.flush();
  }
}
