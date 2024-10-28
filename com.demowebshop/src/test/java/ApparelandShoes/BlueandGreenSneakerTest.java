package ApparelandShoes;

import org.testng.annotations.Test;

import com.GenricLibrary.Base_Class;
import com.PomScript.ApparelandShoesPage;

public class BlueandGreenSneakerTest extends Base_Class
{
	@Test
	public void testcase()
	{
		ApparelandShoesPage as=new ApparelandShoesPage(driver);
		
		as.Appareallink.click();
		
		boolean displayed = as.apparealText.isDisplayed();
		System.out.println(displayed);
		boolean dis1 = as.dropdownlink.isDisplayed();
		System.out.println(dis1);
		
		as.bluegreenproduct.isDisplayed();
		as.bgrating.isDisplayed();
		as.bgprice.isDisplayed();
		as.bgcart.click();
	}
   
}
