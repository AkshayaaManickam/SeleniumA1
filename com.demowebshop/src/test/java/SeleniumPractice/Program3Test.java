package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Program3Test 
{
  @Test
  public void testcase1()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
  }
  
}
