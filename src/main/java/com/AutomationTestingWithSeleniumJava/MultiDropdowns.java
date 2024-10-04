package com.zSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiDropdowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement dropDown = driver.findElement(By.id("ide"));
		Select multiDropDown = new Select(dropDown);
		multiDropDown.selectByIndex(3);
		Thread.sleep(3000);
		multiDropDown.selectByValue("ij");
		Thread.sleep(3000);
		System.out.println("Get All Selected Options");
		List<WebElement> dropDownSelectedOptions=multiDropDown.getAllSelectedOptions();
		for(WebElement option : dropDownSelectedOptions) {
			System.out.println(option.getText());
		}
		System.out.println("Get Otions Method");
		List<WebElement> dropDownSelectedOption=multiDropDown.getOptions();
		for(WebElement option : dropDownSelectedOption) {
			System.out.println(option.getText());
		}
		System.out.println("first Selected");
		String firstSelected = multiDropDown.getFirstSelectedOption().getText();
		System.out.println(firstSelected);
		
		multiDropDown.deselectByIndex(3);
		Thread.sleep(3000);
		multiDropDown.selectByVisibleText("Eclipse");
		multiDropDown.deselectAll(); 
		Thread.sleep(3000);
		driver.close();
		

	}

}
