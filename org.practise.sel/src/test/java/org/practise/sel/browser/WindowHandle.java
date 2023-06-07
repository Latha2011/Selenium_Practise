package org.practise.sel.browser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.get("https://facebook.com");
		String WID1= driver.getWindowHandle();
		System.out.println("Parent id="+ WID1);
		driver.findElement(By.id("email")).sendKeys("ancdefg");
		

		driver.findElement(By.name("pass")).sendKeys("12345");
		
		driver.findElement(By.linkText("Forgot password?")).click();
		Set<String> Handles= driver.getWindowHandles();
		for(String id : Handles)
		{
			System.out.println("Window id="+ id);
		}
		
	

	}

}
