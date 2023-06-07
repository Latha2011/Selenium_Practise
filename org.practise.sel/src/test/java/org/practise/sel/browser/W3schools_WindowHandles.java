package org.practise.sel.browser;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3schools_WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriverManager.firefoxdriver().setup();
     WebDriver driver=new FirefoxDriver();
     driver.get("https://www.w3schools.com/tags/tag_input.asp");
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     System.out.println("Parent url"+ driver.getCurrentUrl());

     String parent_id= driver.getWindowHandle();
     
     driver.findElement(By.linkText("Try it Yourself »")).click();

     Set<String> Handles=driver.getWindowHandles();
  ArrayList<String>hs=new ArrayList<String>(Handles);
  
  /* for(String id : Handles) {
    	 
    	 hs.add(id);
    	 System.out.println("Window Handles:"+ id);
     }
     */
      driver.switchTo().window(hs.get(1));
      System.out.println("Window id="+hs.get(1));
      Thread.sleep(20);
      System.out.println("current url"+driver.getCurrentUrl());

       
    driver.switchTo().window(parent_id);
    System.out.println("Parent url"+ driver.getCurrentUrl());
    
	}

}
