package org.practise.sel.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchTo_activeElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.get("https://facebook.com");
		
		
		driver.findElement(By.id("email")).sendKeys("abcdefg");
		WebElement e=driver.switchTo().activeElement();
		//Enter password field 
		 e.sendKeys("xyz",Keys.TAB, "12345",Keys.ENTER);
		

		//driver.findElement(By.name("pass")).sendKeys("12345");
		 
		

	}

}
