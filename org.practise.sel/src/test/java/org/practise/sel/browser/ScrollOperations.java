package org.practise.sel.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollOperations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     //Scroll Operations
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*"); 
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://dice.com");
		driver.manage().window().maximize();	
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//Scrolling to specific position
		    //js.executeScript("window.scrollTo(0,500)");

		WebElement element= driver.findElement(By.linkText("Create Your Profile"));
		 //Scrolling To particular element
		js.executeScript("arguments[0].scrollIntoView()",element );
		element.click();
		//driver.findElement(By.xpath("//a[@class=\"btn btn-primary btn-lg mr-4 ml-4\"])[2]")).click();
	    //ScrollTo bottom of page
	   // js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        
 	
	
	
	
	}

}
