package com.PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JewelryPage extends BasePage
{

	public JewelryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//a[contains(text(),'Jewelry')]")
	public WebElement jewelryLink;
	
	@FindBy(xpath="//h1[contains(text(),'Jewelry')]")
	public WebElement jewelText;
	
	@FindBy(xpath="//select[@id='products-orderby']")
	public WebElement dropdown;
	
	/**
	 * Black and diamond heart
	 */
	@FindBy(xpath="//a[contains(text(),'Black & White Diamond Heart')]")
	public WebElement blackproduct;
	
	@FindBy(xpath="(//div[@class='rating'])[2]")
	public WebElement brating;
	
	@FindBy(xpath="(//span[@class='price actual-price'])[2]")
	public WebElement bprice;
	
	@FindBy(xpath="(//input[@value='Add to cart'])[2]")
	public WebElement bcart;
	
	/**
	 * Vintage
	 */
	@FindBy(xpath="//a[contains(text(),'Vintage Style')]")
	public WebElement vintageproduct;
	
	@FindBy(xpath="(//div[@class='rating'])[5]")
	public WebElement vrating;
	
	@FindBy(xpath="(//span[@class='price actual-price'])[5]")
	public WebElement vprice;
	
	@FindBy(xpath="//input[@value='Add to cart']")
	public WebElement vcart;
	
}
