package SeleniumPractice;

import org.testng.annotations.Test;

import com.GenricLibrary.Base_Class;
import com.GenricLibrary.JavaScript_Executor;

public class Program5Test extends Base_Class
{
   @Test
   public void testcase()
   {
	   JavaScript_Executor.Scroll_BottomWebPage();
	   JavaScript_Executor.Scroll_TopWebPage();
   }
}
