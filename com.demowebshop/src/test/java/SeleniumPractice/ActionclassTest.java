package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.GenricLibrary.Action_Class_Utility;
import com.GenricLibrary.Base_Class;

public class ActionclassTest extends Base_Class
{
  @Test
  public void testcase()
  {
	 WebElement move = driver.findElement(By.xpath("//a[contains(text(),'Computers')]"));
	  
	 Action_Class_Utility a=new Action_Class_Utility(driver);
	 
	 a.moveCursor(move).rightclick();
  }
}
