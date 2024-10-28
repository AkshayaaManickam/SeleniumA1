package SeleniumPractice;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendTest 
{
   @Test
   public void testcase()
   {
	   ExtentSparkReporter spark=new ExtentSparkReporter("C:\\Users\\admin\\eclipse-workspace\\selenium\\com.demowebshop\\ExtendsPath\\report.html");
	   ExtentReports report=new ExtentReports();
	   
	   report.attachReporter(spark);
	   ExtentTest test = report.createTest("testcase");
	   test.log(Status.PASS, "Test case Pass");
	   report.flush();
   }
}
