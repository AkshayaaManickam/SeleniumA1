package SeleniumPractice;

import org.testng.annotations.Test;

import com.GenricLibrary.Base_Class;
import com.PomScript.WelcomePage;

public class Program8Welcome extends Base_Class
{
	@Test
	public void testcase()
	{
		WelcomePage w=new WelcomePage(driver);
		
		w.regLink.click();
	}

}
