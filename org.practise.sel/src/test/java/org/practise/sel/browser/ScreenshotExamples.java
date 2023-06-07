package org.practise.sel.browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
	       
	       WebDriver driver= new FirefoxDriver();
	       driver.get("https://www.facebook.com");
	       driver.manage().window().maximize();
	      
	       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	       driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.findElement(By.id("email")).sendKeys("abcdefg");
			driver.findElement(By.name("pass")).sendKeys("12345");
			driver.findElement(By.name("login")).click();
			//Using File format
			//UtilsOfScreenshot.usingFileFormat(driver,"facebookFile.png");
			
			//Using Base64 format
			
		//	UtilsOfScreenshot.usingBase64Format(driver,"facebookbase64.png");
			
			//Using BYTES format
			
			UtilsOfScreenshot.usingBYTESFormat(driver,"facebookbytes.png");

	      

	}

}
