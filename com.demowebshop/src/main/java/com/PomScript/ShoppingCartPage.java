package com.PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage
{

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	/**
	 *shopping cart
	*/
	@FindBy(xpath="//span[contains(text(),'Shopping cart')]")
	public WebElement shoppingcartlink;
	
	@FindBy(xpath="//input[@id='termsofservice']")
	public WebElement termsandcondition;
    
	@FindBy(xpath="//button[@id='checkout']")
	public WebElement checkout;
	
	/**
	 * Billing Address
	 */
	@FindBy(xpath="//input[@title='Continue']")
	public WebElement billingad;
	
	/**
	 * Shipping Address
	 */
	@FindBy(xpath="(//input[@value='Continue'])[2]")
	public WebElement shippingad;
	
	
	/**
	 * ShippingMethod
	 */

	@FindBy(xpath="//input[@id='shippingoption_0']")
	public WebElement shippingmode;
	
	@FindBy(xpath="(//input[@value='Continue'])[3]")
	public WebElement continue_s;

	/**
	 * Payment Method
	 */
	@FindBy(xpath="//input[@name='paymentmethod']")
	public WebElement paymentcod;
  
	@FindBy(xpath="(//input[@name='paymentmethod'])[2]")
	public WebElement paymentMoneyorder;
	
	@FindBy(xpath="(//input[@name='paymentmethod'])[3]")
	public WebElement paymentcredicard;
	
	@FindBy(xpath="//input[@name='paymentmethod'])[4]")
	public WebElement paymentPurchaceorder;
	
	@FindBy(xpath="(//input[@type='button'])[5]")
	public WebElement paycontinue;
	
	

	/**
	 * Payment Info
	 */
	@FindBy(xpath="(//input[@type='button'])[6]")
	public WebElement payInfoContinue;
	

	/**
	   *Confim Order
	*/
	@FindBy(xpath="(//input[@type='button'])[7]")
	public WebElement confirmOrderButton;
	
	/**
	 * ThankYou Page
	 */
	@FindBy(xpath="//h1[contains(text(),'Thank you')]")
	public WebElement thankyouText;
	
	@FindBy(xpath="//input[@value='Continue']")
	public WebElement Tcontinuebutton;

	
}
