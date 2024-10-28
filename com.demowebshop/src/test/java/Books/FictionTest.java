package Books;

import org.testng.annotations.Test;

import com.GenricLibrary.Base_Class;
import com.PomScript.BooksPage;

public class FictionTest extends Base_Class
{
   @Test
   public void testcase()
   {
	 BooksPage bp=new BooksPage(driver);
	 
     bp.bookslink.click();
     
	 bp.fictionBook.isDisplayed();
	 bp.frating.isDisplayed();
	 bp.fprice.isDisplayed();
	 bp.fcart.click();
	 
   }
}
