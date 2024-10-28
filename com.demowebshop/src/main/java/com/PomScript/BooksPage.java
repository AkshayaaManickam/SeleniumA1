package com.PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BooksPage extends BasePage
{

	public BooksPage(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//a[contains(text(),'Books')]")
	public WebElement bookslink; //books link1

	@FindBy(xpath="//select[@id='products-orderby']")
    public WebElement dropdown; //dropdownlink 1
	
	/**
	 * Computing Internet Book links are mentioned
	 */
	@FindBy(xpath="//a[contains(text(),'Computing and Internet')]")
	public WebElement computingBook; //Book link
	
	@FindBy(xpath="//div[@class='product-rating-box']")
	public WebElement crating;//rating
	
	@FindBy(xpath="//span[@class='price actual-price']")
	public WebElement cprice;
	
	@FindBy(xpath="//input[@value='Add to cart']")
	public WebElement ccart;//Add to cart button
	
	
	/**
	 * Fiction Book links are mentioned
	 */
	
	@FindBy(xpath="//a[contains(text(),'Fiction')]")
	public WebElement fictionBook; //Book link
	
	@FindBy(xpath="(//div[@class='product-rating-box'])[3]")
	public WebElement frating; //rating link
	
	@FindBy(xpath="(//div[@class='product-rating-box'])[3]")
	public WebElement fprice; //rating
	
	@FindBy(xpath="(//input[@value='Add to cart'])[2]")
	public WebElement fcart; //Add to Cart button
}
