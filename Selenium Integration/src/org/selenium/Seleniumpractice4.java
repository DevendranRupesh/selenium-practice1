package org.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Seleniumpractice4 {
	
	// webdriver methods
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
	
		driver.manage().window().maximize();
		
		WebElement Alert = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		
		Alert.click();
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert(); // Alert with ok to click
		
		alert.accept();
		
		
		
		WebElement Alert0 = driver.findElement(By.xpath("//a[@href='#CancelTab']"));
		
		Alert0.click();
		WebElement Alert1 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		
		Alert1.click();// Alert with ok cancel
		
		Thread.sleep(5000);
		
	    Alert alert2 = driver.switchTo().alert();
		
		alert2.accept();
		
		
		WebElement alert3 = driver.findElement(By.xpath("//a[@href='#Textbox']"));
		
		alert3.click();
		
		
		WebElement alert4 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		
		alert4.click();
		
		
	   Alert alert5 = driver.switchTo().alert();// Alert with prompt message
	   Thread.sleep(5000);
	   
	   alert5.sendKeys("naveen");
	   
	   alert5.accept();
		
		
	}

}
