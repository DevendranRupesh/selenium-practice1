package org.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Seleniumexample {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();// webdriver interface refname = new chrome browser
		
		//WebDriver driver = new EdgeDriver();// using edge driver
		
		//WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.google.co.in/");// get current url
		
		System.out.println(driver.getTitle()); // get url title
		
		System.out.println(driver.getPageSource()); // get pageSourse prints in console
		
	      //navigation commands
		
		driver.navigate().to("https://www.facebook.com/");// navgate from current to particular url
		
		driver.navigate().back(); //navigate back to previous page
		
		driver.navigate().forward();// navigate to forward page
		
		driver.navigate().refresh();// referesh the page
		
		
		//manage commands
		
		driver.manage().window().fullscreen();// To maximize the Screen
		
		driver.manage().window().minimize();// to minimize the screen
		
		driver.manage().window().getSize();// to get size of particular window
		
		System.out.println(driver.manage().window().getSize());
		
		driver.manage().window().setSize(new Dimension(500,500));
		
		driver.manage().deleteAllCookies();// to delete all pop up cookies
		
		//driver.close();// to close all windows 
		
	   // driver.quit();
		
		
		
		
		
		
		
		
	}

}
