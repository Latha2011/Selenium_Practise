package org.practise.sel.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PractiseCurrentUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*"); 

		RemoteWebDriver driver=new ChromeDriver(options); 
		/* driver.get("https://www.amazon.com");
		String url= driver.getCurrentUrl();
		System.out.println("Current url "+url); */
		
		
		// Switch to frames code..
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("//html/body/a/img")).click();


	}

}
