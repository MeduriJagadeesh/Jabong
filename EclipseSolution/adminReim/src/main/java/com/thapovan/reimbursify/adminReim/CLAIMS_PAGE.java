package com.thapovan.reimbursify.adminReim;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CLAIMS_PAGE {

	public static void main(String[] args) throws InterruptedException {
		
		String RCN="16454572884567224078";
		
		 WebDriver driver=new FirefoxDriver();		  
		    driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	  
	        driver.get("https://qa-admin.reimbursify.com/");
///login////	        
	        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("schintala@thapovan-inc.com");
	        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Cool@123");
	        Thread.sleep(10000);
	        driver.findElement(By.xpath("//*[@id='login']")).click();
	        Thread.sleep(10000);

//claims ///////	         
	        driver.findElement(By.xpath("//*[@href=\"/admin/claims\"]")).click();
	        Thread.sleep(10000);
	        driver.findElement(By.xpath("//a[@href=\"quarantinedclaims\"]")).click();
	        Thread.sleep(10000);
	        driver.findElement(By.xpath("//span[@class=\"slider round\"]")).click();
	        Thread.sleep(10000);
	        driver.findElement(By.xpath("//*[@id=\'multipleQuarantinedClaimEdit\']")).click();
	        Thread.sleep(10000);
	        //driver.findElement(By.xpath("//*[@id=/'unquarantine\']")).click();
	        //Thread.sleep(10000);
	        driver.findElement(By.xpath("//input[@type='checkbox' and @data-userid='16454572883016981262']")).click();
	        Thread.sleep(10000);
	        driver.findElement(By.xpath("//*[@id=/'multipleQuarantinedClaimEdit\']")).click();
	        Thread.sleep(10000);
	        driver.findElement(By.xpath("//*[@class=\"chosen-single\"]")).click();
	        driver.quit();
	}

}
