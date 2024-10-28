package SeleniumPractice;



import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.GenricLibrary.Base_Class;
import com.GenricLibrary.SelectClass_Utility;

public class SelectTest extends Base_Class
{
  @Test
  public void SkillRary() throws InterruptedException
  {
	  
	  SelectClass_Utility s1=new SelectClass_Utility(driver.findElement(By.xpath("//select[@id='cars']"))); 
	
	 
	  //select  
	  s1.Index(1);
	  //s1.Value("199");
	  //s1.VisibleText("INR 200 - INR 299 ( 3 ) ");
	  
	  
	  //deselect
	  s1.DeselectIndex(1);
	  //s1.DeselectValue("199");
	  //s1.DeselectVisibleText("INR 200 - INR 299 ( 3 ) ");
	
	 
	  
	  /**
	  
	     //to check whether it is multi selected or not
	    s1.Index(0);
	    s1.Index(2);
	    s1.Index(4);
	    
	  
	     boolean multipleSelect = s1.IsMultiSelect();
	     System.out.println(multipleSelect);
	
	   */ 
	  
	  
	/**
	//To get first selected option  
	  WebElement firstselectedoption = s1.getFirstSelect();
		  
	    s1.Index(2);
	    s1.Index(3);
	    s1.Index(0);
	    
	    System.out.println(firstselectedoption);
	 */ 
	  
	  /**
	   //To get text of selected options
	    
	    s1.Index(2);
	    s1.Index(3);
	    s1.Index(0);
	    
      List<WebElement> element = s1.getAllSelect();
		
		
		for(WebElement e: element)
		{
			String select = e.getText();
			System.out.println(select);
		}
		
		*/
	  
	  /**
	  //To get text of all options
		
		List<WebElement> alloption = s1.getAllOption();

		  for(WebElement e: alloption)
		  {
			  String option=e.getText();
			  System.out.println(option);
		  }
		*/
		
	  
	  /**
		//To clear selected options
	      s1.getAllOption();
	      Thread.sleep(3000);
	  	  s1.Clear();
	  */
	   
  }
  
}
