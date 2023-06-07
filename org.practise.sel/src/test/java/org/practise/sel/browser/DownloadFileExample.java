package org.practise.sel.browser;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadFileExample {
      public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// driver=chromeBrowser();
		driver=firefoxBrowser();
		driver.get("https://file-examples.com");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//h3[text()='Documents']/following-sibling:: a")).click();
         //For Firefox only
        // closing inline ads
         driver.switchTo().frame("aswift_5");
         driver.findElement(By.id("dismiss-button")).click();
         driver.switchTo().defaultContent();
        Thread.sleep(1000);
        
      JavascriptExecutor js=(JavascriptExecutor) driver;
      //locating to documents location
      js.executeScript("window.scrollBy(100,100)");
       //finding path of pdf button
       WebElement element= driver.findElement(By.xpath(" //td[text()='PDF']/following-sibling::td[2]/a"));
        //scroll into pdf link button
       //  js.executeScript("arguments[0].scrollIntoView()", element);
       element.click();
       driver.findElement(By.xpath("//a[starts-with(text(), \"Download sample\")]")).click();


	}
	public static WebDriver firefoxBrowser() {
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions options =new FirefoxOptions();
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("pdfjs.disabled", true);
		
		options.setProfile(profile);
		driver= new FirefoxDriver(options);
		return driver;
	}
	public static WebDriver chromeBrowser() {
        WebDriverManager.chromedriver().setup();
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*"); 
		
         //Removing automated testing pop up block
         options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation" ));

		
        HashMap<String,Object> prefer= new HashMap	<String,Object>();
        // To remove In lins Ads
        prefer.put("profile.managed_default_content_settings.javascript",2);
        options.setExperimentalOption("prefs", prefer);
        //downloading pdf without preview
        prefer.put("plugins.always_open_pdf_externally", true);
        
        //To save file in Desired folder
      //  prefer.put(", prefer)

		
	
		
		
        WebDriver driver= new ChromeDriver(options);
        return driver;}
        	}


