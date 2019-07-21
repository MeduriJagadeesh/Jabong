package com.thapovan.reimbursify.adminReim;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class swappingoftwonumbers {
	
	public static final String FileUtils = null;
	public static final String File = null;
	

	public static void main (String args[])
	{
///////with temporary variable :-
//int x=2,y=3;
//System.out.println("before swapping x=2,y=3");
//temp=x;
//x=y;
//y=temp;
//System.out.println("after Swapping\nx="+x+"\ny="+y);

///////without temporary variable:-
//int x=2,y=3;
//System.out.println("before swapping x=2,y=3");
//x=x+y;
//y=x-y;
//x=x-y;
//System.out.println("after Swapping\nx="+x+"\ny="+y);
		
WebDriver driver = new FirefoxDriver();
driver.get("http://www.google.com/");
File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//FileUtils.copy(File,newFILE("/Users/apple/Documents/EclipseSolution/adminReim/src/main/java/com/thapovan/reimbursify/adminReim"+".jpg"));


}

	public static void file(String file2, Object newFILE) {
		// TODO Auto-generated method stub
		
	}

	public static Object newFILE(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}