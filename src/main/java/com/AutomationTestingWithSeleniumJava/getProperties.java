package com.zSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getProperties {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		
		//getTittle
		String tittle =driver.getTitle();
		System.out.println("TITLE - "+tittle);
		
		//getCurrentUrl
	String currentUrl = driver.getCurrentUrl();
	System.out.println("Current url - "+currentUrl);
	
	//getpageSource
	//System.out.println(driver.getPageSource());
	//driver.quit();
	 
	
	/// WEB ELEMENT PROPERIES TEXT TAGNAME ATTRIBUTE 
	//getText
	String text =driver.findElement(By.xpath("//input[@name='login']/preceding-sibling::label")).getText();
	System.out.println(text);
	
	//getTagName
	String tagName =driver.findElement(By.xpath("//input[@name='login']/preceding-sibling::label")).getTagName();
	System.out.println(tagName);
	
	//getAttribute       example for ="login_field" 
	String attributeValuee =driver.findElement(By.xpath("//input[@name='login']/preceding-sibling::label")).getAttribute("for");
	System.out.println(attributeValuee);
	
	driver.quit();
	
	
	
	}

}
