package Books;

import org.testng.annotations.Test;

import com.GenricLibrary.Base_Class;
import com.PomScript.BooksPage;

public class ComputingInternetTest extends Base_Class
{
  @Test
  public void testcase()
  {
	BooksPage bp=new BooksPage(driver);
	
	bp.bookslink.click();
	
	bp.dropdown.isDisplayed();
	
	bp.computingBook.isDisplayed();
	bp.crating.isDisplayed();
	bp.cprice.isDisplayed();
	bp.ccart.click();
  }
}
