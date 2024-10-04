package com.zSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
 public static void main(String[] args) throws InterruptedException {
	 WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
      driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
      Thread.sleep(3000);
    WebElement courseelement = driver.findElement(By.id("course"));
    Select coursenamedrop = new Select(courseelement);
  List<WebElement> coursedropdownoptions = coursenamedrop.getOptions();
 for( WebElement options :coursedropdownoptions) { 
      
	System.out.println(options.getText());
	}
 coursenamedrop.selectByValue("net");
 
 coursenamedrop.selectByIndex(1);
 coursenamedrop.selectByValue("python");

 coursenamedrop.selectByVisibleText("Javascript");
 String selectrd = coursenamedrop.getFirstSelectedOption().getText();
 System.out.println(selectrd);
 driver.close();
	

}

 }
 


