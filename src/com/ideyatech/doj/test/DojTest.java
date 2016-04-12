package com.ideyatech.doj.test;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DojTest {
	
	// Instatiating Web Driver
    WebDriver driver;
    String baseUrl;
    
   /**
    * 
    */
    public DojTest(){
    	// Set Instance Variables
    	driver = new FirefoxDriver();
    	driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
    	baseUrl = "http://doj-stage.southeastasia.cloudapp.azure.com/";
    	driver.get(baseUrl);
		
		// Get Elements Email and Password
        WebElement email = driver.findElement(By.xpath("//div[@class='control-group']//input[@name='j_username']"));
        
        //Send Input to Email and Password Text Fields
        email.sendKeys("admin");
        WebElement password = driver.findElement(By.xpath("//div[@class='control-group']//input[@name='j_password']"));
     	password.sendKeys("carp3ta");
        System.out.println("CLICKING LOGIN");
        driver.findElement((By.xpath("//div[@class='row-fluid']//input[@value='Log In']"))).click();
	}   
}
