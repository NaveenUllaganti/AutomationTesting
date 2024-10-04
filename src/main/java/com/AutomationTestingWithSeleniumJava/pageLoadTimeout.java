package com.zSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pageLoadTimeout {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(1,TimeUnit.SECONDS);
		System.out.println("Page load time occurs");
		driver.get("https://github.com/login");
		driver.findElement(By.id("login_field")).sendKeys("NaveenUllaganti");
		driver.findElement(By.id("password")).sendKeys("Venkat@(143)");
		System.out.println("Page load time occurs");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("Page load time occurs");
		driver.navigate().back();
		driver.navigate().forward();
		driver.quit();
		}

}
