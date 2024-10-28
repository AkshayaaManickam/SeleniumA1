package com.PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DigitaldownloadsPage extends BasePage
{

	public DigitaldownloadsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//a[contains(text(),'Digital downloads')]")
	public WebElement digitalLink;
	
	@FindBy(xpath="//h1[contains(text(),'Digital downloads')]")
	public WebElement digitalText;
	
	@FindBy(xpath="//select[@id='products-orderby']")
	public WebElement dropdown;
	
	/**
	 * 3rd Album product
	 */
	@FindBy(xpath="//a[contains(text(),'3rd Album')]")
	public WebElement album;
	
	@FindBy(xpath="//div[@class='rating']")
	public WebElement arating;
	
	@FindBy(xpath="//span[contains(text(),'1.00')]")
	public WebElement aprice;
	
	@FindBy(xpath="//input[@value='Add to cart']")
	public WebElement acart;
	
	/**
	 * Music 2
	 */
	@FindBy(xpath="(//a[contains(text(),'Music 2')])[3]")
	public WebElement music;
	
	@FindBy(xpath="(//div[@class='rating'])[2]")
	public WebElement mrating;
	
	@FindBy(xpath="(//span[contains(text(),'10.00')])[2]")
	public WebElement mprice;
	
	@FindBy(xpath="(//input[@value='Add to cart'])[4]")
	public WebElement mcart;
	
	
}
