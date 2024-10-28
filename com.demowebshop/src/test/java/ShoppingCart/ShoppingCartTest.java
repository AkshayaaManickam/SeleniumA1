package ShoppingCart;



import org.testng.annotations.Test;

import com.GenricLibrary.Base_Class;
import com.PomScript.ShoppingCartPage;

public class ShoppingCartTest extends Base_Class
{
	@Test
	public void testcase()
	{
		ShoppingCartPage scp=new ShoppingCartPage(driver);
		
		scp.shoppingcartlink.click();
		scp.termsandcondition.click();
		scp.checkout.click();
	
		scp.billingad.click();
		
		scp.shippingad.click();
		
		scp.shippingmode.click();
		scp.continue_s.click();
		
		scp.paymentcod.click();
		scp.paycontinue.click();
		
		scp.payInfoContinue.click();
		
		scp.confirmOrderButton.click();
		
		scp.thankyouText.isDisplayed();
		scp.Tcontinuebutton.isDisplayed();
	}

}
