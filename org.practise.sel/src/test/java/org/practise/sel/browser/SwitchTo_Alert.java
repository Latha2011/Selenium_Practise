package org.practise.sel.browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchTo_Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriverManager.firefoxdriver().setup();
       
       WebDriver driver= new FirefoxDriver();
       driver.get("https://demo.automationtesting.in/Alerts.html");
       driver.manage().window().maximize();
      
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
       driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
     WebElement e= driver.findElement(By.xpath("//div[@id='CancelTab']/button"));
    
      e.click();
    
      Thread.sleep(20);

     //  driver.switchTo().alert().accept();
      
      driver.switchTo().alert().dismiss();
     String text= driver.findElement(By.xpath("//div[@id='CancelTab']/p")).getText(); 
     if(text.contains("ok"))
     {
    	 System.out.println("you pressed ok button");
     }
     else if(text.contains("Cancel")) {
    	 System.out.println("you pressed cancel button");
    	 
    	 
     }
     
     else
    	 System.out.println("Test failed");
     
     
     driver.close();
     
     
     
     
     
     
     
	}

}
