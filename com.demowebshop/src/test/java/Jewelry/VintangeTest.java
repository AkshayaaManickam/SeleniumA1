package Jewelry;

import org.testng.annotations.Test;

import com.GenricLibrary.Base_Class;
import com.PomScript.JewelryPage;

public class VintangeTest extends Base_Class
{
    @Test
    public void testcase()
    {
    	JewelryPage jp=new JewelryPage(driver);
    	
    	jp.jewelryLink.click();
    	
    	jp.vintageproduct.isDisplayed();
    	jp.vrating.isDisplayed();
    	jp.vprice.isDisplayed();
    	jp.vcart.isDisplayed();
    }
}
