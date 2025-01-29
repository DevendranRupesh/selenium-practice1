package org.selenium;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FileUtilsTest;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Seleniumpractice1 {
	

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver= new ChromeDriver();// Syntax to call Webdriver like chrome,firefox
		
		// getting url Syntax
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
	    WebElement email = driver.findElement(By.xpath("//input[@type='text']"));// by using id
		
		email.sendKeys("rupesh");
		
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Thread.sleep(10000);
		 WebElement pass=driver.findElement(By.cssSelector("input#pass"));// by using css selector
	
	    pass.sendKeys("9087512008");
	    
	    WebElement loginbtn=driver.findElement(By.xpath("//button[contains(@class,'_42ft _4jy0 _6lth ')]"));// by using xpath
	    
	    loginbtn.click();
	    
	   //System.out.println(driver.manage().window().getSize());
	   
	   //take Screen shot
	   
	//File f= (File) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	//Files.copy(f, new File("D:\\Selenium practice\\Selenium Integration\\Screen\\facebookfile.png"));
	
	
	File f1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	Files.copy(f1, new File("D:\\Selenium practice\\Selenium Integration\\Screenshot\\shotfile.png"));
	   
	   //WebElement forgotbtn= driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	   
	   //forgotbtn.click();
	   
	   //System.out.println("Login page opened");


    }
	
}
