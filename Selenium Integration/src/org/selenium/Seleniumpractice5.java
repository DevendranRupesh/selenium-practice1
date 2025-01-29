package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumpractice5 {

	
	public static void main(String[] args) throws InterruptedException { //main crtl+space
		
		//driver
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");// getting url
		
		driver.manage().window().maximize();
		
		
		
//locators id name classname tagname css-Selector Xpath Linktext partially link text
	
	 WebElement user = driver.findElement(By.id("email"));
	 user.sendKeys("rajesh");
	 
	 WebElement pass = driver.findElement(By.name("pass"));
	 
	 pass.sendKeys("rajesh12345#");
		
		
		
		
		
	}
}
