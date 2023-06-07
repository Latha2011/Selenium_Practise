package org.practise.sel.browser;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingBrowserPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*"); 
        HashMap<String,Integer> content= new HashMap<String,Integer>();
        
        HashMap<String, Object> prof= new HashMap<String,Object>();
        HashMap<String,Object> prefer= new HashMap<String,Object>();
        //Locationbased pop up
       // content.put("geolocation", 2);
        //Notifications
        content.put("notifications", 2);
        prof.put("managed_default_content_settings", content);
        prefer.put("Profile",prof);
        options.setExperimentalOption("prefs", prefer);
         WebDriver driver= new ChromeDriver(options);
         //Location
        // driver.get("https://whatmylocation.com");
         //Notification pop ups
         driver.get("https://web-push-book.gauntface.com/demos/notification-examples/");
         driver.findElement(By.xpath("//input")).click();
        

	}

}
