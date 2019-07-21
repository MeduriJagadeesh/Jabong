package com.thapovan.reimbursify.adminReim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FORGOTPASSWORD {
	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver=new FirefoxDriver();		  
		 		  
	        driver.manage().window().maximize();
	        driver.get("https://qa-admin.reimbursify.com/");
	      ///login////	        
	      	        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("schintala@thapovan-inc.com");
	      	        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Cool@123");
	      	        Thread.sleep(10000);
	     //forgotpassword// 	        
	      	        driver.findElement(By.xpath("//*[@class='reset_pass']")).click();
	                driver.findElement(By.xpath("//input[@type='email']")).sendKeys("schintala@thapovan-inc.com");
	        //Thread.sleep(10000);
	        //driver.findElement(By.xpath("//*[@id='reset']")).click();
	        Thread.sleep(10000);
	        driver.findElement(By.xpath("//*[@id='cancel']")).click();
	        Thread.sleep(10000);
	        
	        
	        
	        
driver.quit();
}
}
