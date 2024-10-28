package ApparelandShoes;

import org.testng.annotations.Test;

import com.GenricLibrary.Base_Class;
import com.PomScript.ApparelandShoesPage;

public class LeatherBagTest extends Base_Class
{
    @Test
    public void testcase()
     {
    	ApparelandShoesPage ap=new ApparelandShoesPage(driver);
    	ap.Appareallink.click();
    	ap.bagproduct.isDisplayed();
    	ap.bagrating.isDisplayed();
    	ap.bagprice.isDisplayed();
    	ap.bagcart.click();
    	
     }
   
}
