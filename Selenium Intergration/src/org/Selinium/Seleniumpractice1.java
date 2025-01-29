package org.Selinium;

import org.openqa.selenium.WebDriver;

public class Seleniumpractice1 {

	
	public static void main(String[] args) {
		
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.close();
		
		
	}
}
