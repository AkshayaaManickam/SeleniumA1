package SeleniumPractice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.GenricLibrary.Base_Class;
import com.GenricLibrary.TakeScreenShot_Utility;

public class Program7Test extends Base_Class
{
  @Test
  public void screenshotonWebElement() throws IOException
  {
	TakeScreenShot_Utility.takeElementShot(driver.findElement(By.xpath("//input[@id='small-searchterms']")));
	//assert.fail();  
  }
}
