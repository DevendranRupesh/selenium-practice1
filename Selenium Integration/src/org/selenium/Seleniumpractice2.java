package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Seleniumpractice2 {
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		driver.manage().window().fullscreen();
		
		WebElement dropdown = driver.findElement(By.tagName("select"));
		
		Select s= new Select(dropdown);
		
		s.selectByIndex(4);
		
		s.selectByValue("ALB");
		
		s.selectByVisibleText("Afghanistan");
		
		s.deselectByIndex(2);
	}

}
