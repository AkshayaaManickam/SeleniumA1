package GiftCards;

import org.testng.annotations.Test;

import com.GenricLibrary.Base_Class;
import com.PomScript.GiftCardsPage;

public class PhysicalCardTest extends Base_Class
{
	@Test
     public void testcase()
     {
       GiftCardsPage gc=new GiftCardsPage(driver);
       
       gc.giftcardLink.click();
       
       gc.dropdown.isDisplayed();
       gc.giftcardText.isDisplayed();
       
       gc.physicalcard.isDisplayed();
       gc.prating.isDisplayed();
       gc.prating.isDisplayed();
       gc.pcart.click();
       
     }
}
