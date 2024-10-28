package SeleniumPractice;

import java.io.IOException;

import com.GenricLibrary.ExcelFile_Utility;
import com.GenricLibrary.PropertyFile_Utility;

public class Program4Test
{
  public static void main(String[] args) throws IOException 
  {
	System.out.println(PropertyFile_Utility.propertyData("url"));
	
	System.out.println(ExcelFile_Utility.Excel_Data("Sheet1", 0, 0));
  }
}
