package com.PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GiftCardsPage extends BasePage
{

	public GiftCardsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
    
	
	@FindBy(xpath="//a[contains(text(),'Gift Cards')]")
	public WebElement giftcardLink;
	
	@FindBy(xpath="//h1[contains(text(),'Gift Cards')]")
	public WebElement giftcardText;
	
	@FindBy(xpath="//select[@id='products-orderby']")
	public WebElement dropdown;
	
	/**
	 *Virtual Gift card
	 */
	@FindBy(xpath="//a[contains(text(),'$5 Virtual Gift Card')]")
	public WebElement virtualcard;
	
	@FindBy(xpath="//input[@class='recipient-name']")
	public WebElement vname;
	
	@FindBy(xpath="//input[@class='recipient-email']")
	public WebElement vmail;
	
	@FindBy(xpath="//input[@class='sender-name']")
	public WebElement vsendername;
	
	@FindBy (xpath="//input[@class='sender-email']")
	public WebElement vsendermail;
	
	@FindBy(xpath="//div[@class='rating']")
	public WebElement vrating;
	
	@FindBy(xpath="//span[contains(text(),'5.00')]")
	public WebElement vprice;
	
	@FindBy(xpath="(//input[@type='button'])[3]")
	public WebElement vcart;
	
	/**
	 * Physical gift card
	 */
	@FindBy(xpath="//a[contains(text(),'$50 Physical Gift Card')]")
	public WebElement physicalcard;
	
	@FindBy(xpath="(//div[@class='rating')[3]")
	public WebElement prating;
	
	@FindBy(xpath="//span[contains(text(),'50.00')]")
	public WebElement pprice;
	
	@FindBy(xpath="(//input[@type='button'])[5]")
	public WebElement pcart;
	
	
}
