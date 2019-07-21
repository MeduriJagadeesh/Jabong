package com.thapovan.reimbursify.adminReim;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HOMEPAGE_CLICKING_ALL_TABS_REIM {
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(Calendar.getInstance().getTime().toString().substring(0, 10));
		
		 WebDriver driver=new FirefoxDriver();		  
		 		  
	        driver.manage().window().maximize();
	        driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	        driver.get("https://qa-admin.reimbursify.com/");
///login////	        
	        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("schintala@thapovan-inc.com");
	        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Cool@123");
	        Thread.sleep(10000);
	        driver.findElement(By.xpath("//*[@id='login']")).click();
	        Thread.sleep(10000);
////tapping(clicking) all items ////	         
	        driver.findElement(By.xpath("//*[@href=\"/admin/claims\"]")).click();
	        Thread.sleep(10000);
	        driver.findElement(By.xpath("//a[@href=\"quarantinedclaims\"]")).click();
	        Thread.sleep(10000);
	        //driver.findElement(By.xpath("//@href='dashboard'\"]")).click();
	       // Thread.sleep(10000);
	        driver.findElement(By.xpath("//*[@href='claims']")).click();
	        Thread.sleep(10000);
	        driver.findElement(By.xpath("//*[@href='processclaims']")).click();
	        Thread.sleep(10000);
	        driver.findElement(By.xpath("//*[@href='archivedclaims']")).click();
	        Thread.sleep(10000);
	        driver.findElement(By.xpath("//*[@href='/admin/claim-batch']")).click();
	        Thread.sleep(10000);
	        driver.findElement(By.xpath("//*[@href='/admin/user-profile']")).click();
	        Thread.sleep(10000);
	        driver.findElement(By.xpath("//*[@href='/admin/user-profile']")).click();
	        Thread.sleep(10000);
	        driver.findElement(By.xpath("//*[@href='/admin/import']")).click();
	        Thread.sleep(10000);
	        driver.findElement(By.xpath("//*[@href='/admin/invite-code']")).click();
	        Thread.sleep(10000);
	        driver.findElement(By.xpath("//*[@href='/admin/address-book']")).click();
	        Thread.sleep(10000);
	        driver.findElement(By.xpath("//*[@href='/admin/notification-log']")).click();
	        Thread.sleep(10000);
	        driver.findElement(By.xpath("//*[@href='/admin/qikcode']")).click();
	        Thread.sleep(10000);
	        driver.findElement(By.xpath("//*[@href='/admin/discount']")).click();
	        Thread.sleep(10000);
	        driver.findElement(By.xpath("//*[@href='/admin/cpt-list']")).click();
	        Thread.sleep(10000);
	        driver.findElement(By.xpath("//*[@href='/admin/icd-list']")).click();
	        Thread.sleep(10000);
	        driver.findElement(By.xpath("//*[@href='/admin/messages']")).click();
	        Thread.sleep(10000);
	        driver.findElement(By.xpath("//*[@href='/admin/edi-claims']")).click();
	        Thread.sleep(10000);		
	        
	        driver.quit();
	}

}


