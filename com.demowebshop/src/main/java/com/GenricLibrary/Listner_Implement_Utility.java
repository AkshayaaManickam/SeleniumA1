package com.GenricLibrary;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import zmq.ZError.IOException;
/**
 * @author admin
 */
public class Listner_Implement_Utility implements ITestListener
{
	/**
	 * 
	 */
   @Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Test execution Started",true);
	}
   
   /**
    * 
    */

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test execution sucess ",true);
		
	}
   /**
    * 
    */
	@Override
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("Test execution Failed",true);
		try {
			TakeScreenShot_Utility.takeErrorShot();
		} 
		catch (IOException | java.io.IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}


}
