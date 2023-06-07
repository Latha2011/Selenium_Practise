package org.practise.sel.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriverManager.firefoxdriver().setup();
		//FirefoxDriver driver=new FirefoxDriver();
		//String path="C:\\Users\\svina\\OneDrive\\Desktop\\selenium\\geckodriver-v0.29.1-win32\\geckodriver.exe";
		//System.setProperty("webdriver.gecko.driver", path);
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com");
		String url= driver.getCurrentUrl();
		System.out.println("Current url "+url);
		System.out.println("Page Source"+driver.getPageSource());
		
				
		driver.close();
	}

}
