package com.zSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow+driver.getTitle());
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> allWindow=driver.getWindowHandles();
		for(String windowHandle : allWindow) {
			if(!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);
				driver.manage().window().maximize();
				driver.findElement(By.id("femalerb")).click();
				Thread.sleep(3000);
				driver.close();
				break;
			}
			System.out.println(windowHandle+driver.getTitle());
	
		}
		driver.switchTo().window(parentWindow);
		driver.findElement(By.id("name")).sendKeys("ra");
		Thread.sleep(3000);
		driver.close();
		
		}

}
