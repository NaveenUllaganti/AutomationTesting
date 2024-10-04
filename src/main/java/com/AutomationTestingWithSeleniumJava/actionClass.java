package com.zSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionClass {
	public static void main(String[]args) throws InterruptedException {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    Actions actions = new Actions(driver);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	//driver.findElement(By.className("oxd-main-menu-item toggle")).click();
	
	// Mouse over and click operation using action class
	 driver.navigate().to("https://www.amazon.in/?tag=msndeskstdin-21&ref=pd_sl_3uomlq3wa5_e&adgrpid=1323813657261162&hvadid=82738617292972&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=158279&hvtargid=kwd-82739282699753:loc-90&hydadcr=5625_2377262&msclkid=3a79471dbad51d3597ef21e88284525b");
	 actions.moveToElement(driver.findElement(By.className("nav-line-1-container")))
	 .moveToElement(driver.findElement(By.className("nav-text"))).click().perform();
	 
	 //double click
	 driver.navigate().back();
	 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("HYR");
	  actions.doubleClick(driver.findElement(By.id("twotabsearchtextbox"))).perform();
	 
	 
	
	}	

}
