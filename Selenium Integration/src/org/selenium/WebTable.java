package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTable {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=15557742954270087644&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9185283&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
		
		driver.manage().window().maximize();
		
		Actions action= new Actions(driver);
		
		WebElement action1 = driver.findElement(By.xpath("(//span[@class='a-size-small a-color-base truncate-2line'])[15]"));
		
		
		
	System.out.println();
		
		
	}

}
