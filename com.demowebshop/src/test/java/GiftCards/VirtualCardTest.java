package GiftCards;

import org.testng.annotations.Test;

import com.GenricLibrary.Base_Class;
import com.PomScript.GiftCardsPage;

public class VirtualCardTest extends Base_Class
{
 @Test
 public void testcase()
 {
	 GiftCardsPage gp=new GiftCardsPage(driver);
	 
	 gp.giftcardLink.click();
	 
	 gp.virtualcard.click();
	 
	 gp.vrating.isDisplayed();
	 gp.vprice.isDisplayed();
	 gp.vcart.click();
 }
}
