package com.thapovan.reimbursify.adminReim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 *
 */
public class LOGIN_LOGOUT_REIM 
{
	public static void main(String args[]) throws InterruptedException
    {
        

        WebDriver driver=new FirefoxDriver();
  
  
  
        driver.manage().window().maximize();
  
        driver.get("https://qa-admin.reimbursify.com/");
        
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("schintala@thapovan-inc.com");
        
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Cool@123");
        
        Thread.sleep(10000);
        
        
        driver.findElement(By.xpath("//*[@id='login']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id='userName']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='sign_out']")).click();
        
        
        
        driver.quit();
    }
}
