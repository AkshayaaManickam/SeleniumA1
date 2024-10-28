package Jewelry;

import org.testng.annotations.Test;

import com.GenricLibrary.Base_Class;
import com.PomScript.JewelryPage;

public class BlackandWhiteTest extends Base_Class
{
  @Test
  public void testcase()
  {
	  JewelryPage jp=new JewelryPage(driver);
	  
	  jp.jewelryLink.click();
	  jp.jewelText.isDisplayed();
	  jp.dropdown.isDisplayed();
	  
	  jp.blackproduct.isDisplayed();
	  jp.brating.isDisplayed();
	  jp.bprice.isDisplayed();
	  jp.bcart.click();
  }
}
