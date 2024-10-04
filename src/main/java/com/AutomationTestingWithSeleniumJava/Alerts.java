package com.zSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
	public static void main(String[]args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		//accept alert box and get text from prompt box
		driver.findElement(By.id("alertBox")).click();
		driver.switchTo().alert();
		driver.switchTo().alert().accept();
		String alertboxaccept = driver.findElement(By.id("output")).getText();
		System.out.println(alertboxaccept);
		
		//conform box
		driver.findElement(By.id("confirmBox")).click();
		Alert alert =driver.switchTo().alert();
		alert.accept();
		String confirmboxaccept = driver.findElement(By.id("output")).getText();
		System.out.println(confirmboxaccept);
		
		
		driver.findElement(By.id("confirmBox")).click();
		Alert dismissalert =driver.switchTo().alert();
		dismissalert.dismiss();
		String confirmboxacceptdismiss = driver.findElement(By.id("output")).getText();
		System.out.println(confirmboxacceptdismiss);
		
		driver.findElement(By.id("promptBox")).click();
		driver.switchTo().alert().sendKeys("Naveen Kumar Reddy");
		Alert promptalert =driver.switchTo().alert();
		promptalert.accept();
		String promptboxaccept = driver.findElement(By.id("output")).getText();
		System.out.println(promptboxaccept);
		
		driver.quit();
		
	}
	
}
