package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumpractice3 {
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=14793065787318853013&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007809&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
		
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("laptop");
		
		WebElement btn = driver.findElement(By.id("nav-search-submit-button"));
		
		btn.click();
		
		WebElement select = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]"));
		
		select.click();
		
		WebElement select1 = driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]"));
		
		select1.click();
		
		driver.manage().window().minimize();
		
		WebElement select2 = driver.findElement(By.partialLinkText("(//span[contains(text(),'HP Laptop 15s, AMD Ryzen 3 5300U, 15.6-inch ')])[1]"));
		
		select2.click();
		
	}

}
