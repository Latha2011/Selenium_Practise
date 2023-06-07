package org.practise.sel.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchTo_NewWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.get("https://facebook.com");
		//Same Window opening a new tab
		driver.switchTo().newWindow(WindowType.TAB);
	
	
		driver.get("https://google.co.in");
		//opening another window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://amazon.com");
		Thread.sleep(10);
		driver.quit();

	}

}
