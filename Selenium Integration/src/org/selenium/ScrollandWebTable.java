package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollandWebTable {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		//JavascriptExecutor j=(JavascriptExecutor)driver;// interface
		
		//j.executeScript("Window.Scrollby(0,600)");
		
		
		//WebElement scroll = driver.findElement(By.id("Button1"));
		
		//scroll.click();
		
		WebElement scroll1 = driver.findElement(By.xpath("//button[@id='submitbtn']"));
		

		JavascriptExecutor j=(JavascriptExecutor)driver;// interface
		
		j.executeScript("Window.Scrollby(0,600)");
		
		
		
		//JavascriptExecutor j1= (JavascriptExecutor)driver;
		
		//j1.executeScript("arguments[0].click();",scroll1);
		
		
		
		
		
		
		
		
		
		
	}

}
