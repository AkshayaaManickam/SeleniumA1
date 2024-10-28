package com.GenricLibrary;

import java.time.LocalDateTime;

/**
 * @author admin
 */
public class Java_Utility {

	/**
	 * 
	 * @return
	 */
	public static String date() 
	{
		
		LocalDateTime date= LocalDateTime.now();
		String systemDate = date.toString().replace(":","-");
		
		return systemDate;
    }
}