package com.thapovan.reimbursify.adminReim;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QAFILEFAST {
	
	static WebDriver driver=new FirefoxDriver();
	

	public static void main(String[] args) throws InterruptedException {
		
		
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	        driver.manage().window().maximize();
	  
	        driver.get("https://qa-filefast.reimbursify.com//");
//your info //
	        driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("filefast@mailinator.com");
	        driver.findElement(By.xpath("//input[@id='userFirstName']")).sendKeys("RT-file");
	        driver.findElement(By.xpath("//input[@id='userLastName']")).sendKeys("fast");
	        driver.findElement(By.xpath("//input[@aria-label=\"Date input field\"]")).sendKeys("05/02/2001");
	        driver.findElement(By.xpath("//input[@id='userMobile']")).sendKeys("7358574155");
	     
	        System.out.println(driver.findElements(By.xpath("//*[class='btn btn-primary btn-lg active yes-btn']")).size());
	        driver.findElement(By.xpath("//*[contains(text(),'Are you the Patient?')]/parent::div[1]/following-sibling::div//*[contains(text(),'YES')]")).click();
	        
	        driver.findElement(By.xpath("//*[contains(text(),'Are you the Primary Policy Holder?')]/parent::div[1]/following-sibling::div//*[contains(text(),'YES')]")).click();
	        //driver.findElement(By.xpath("//div[@class=\"button-container mb-2\"]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//a[contains(text(),'SAVE CHANGES')]")).click();
	        driver.findElement(By.xpath("//a[@id='btn-validate']")).click();
	      //a[@id='btn-validate']
	        
}
	

	}


