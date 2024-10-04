package com.zSelenium;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getScreenshotAs {
	public static void main(String[]args) throws IOException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		//File 
		TakesScreenshot takeScreenshot = (TakesScreenshot) driver;
		
		
		  File sourceFile = takeScreenshot.getScreenshotAs(OutputType.FILE); File
		  destFile = new File("./Screenshots/img1.png"); 
		  FileUtils.copyFile(sourceFile,  destFile);
		  System.out.println("Scrrenshot Sucessfully Taken Using FILE");
		 
		// BYTE ARRAY
		byte[] byteArray =takeScreenshot.getScreenshotAs(OutputType.BYTES);
		File src =new File ("./Screenshots/img2.png");
		FileOutputStream fos = new FileOutputStream(src);
		fos.write(byteArray);
		fos.close();
		System.out.println("Scrrenshot Sucessfully Taken Using Byte Array");
		//Base64
		
		  String base6 =takeScreenshot.getScreenshotAs(OutputType.BASE64);
		  byte[] base = Base64.getDecoder().decode(base6);
		  File src1 =new File ("./Screenshots/img3.png"); 
		  FileOutputStream fos1 = new FileOutputStream(src1); 
		  fos1.write(base); 
		  fos1.close();
		  System.out.println("Scrrenshot Sucessfully Taken Using Base64 is String");
		
		driver.quit();
	}

}
