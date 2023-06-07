package org.practise.sel.browser;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*"); 
		//Closing Notification POP Up
		//options.addArguments("--disable-notifications"); //older version only supports
		HashMap<String,Object> prefer=new HashMap<String,Object>();
		 prefer.put("profile.default_content_setting_values.notifications", 2);
		 options.setExperimentalOption("prefs", prefer); 
		

		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		String Selectedday="25";
		String Selectedmonth="April";
		String Selectedyear="2024";
		
		driver.findElement(By.xpath("//label[@for=\"departure\"]")).click();
		Thread.sleep(100);
		while(true)
		{		
	List<WebElement>Display_Dates =driver.findElements(By.xpath("//div[@class='DayPicker-Caption']"));
	
	 String firstdate=Display_Dates.get(0).getText();
	 
	 String seconddate=Display_Dates.get(1).getText();
	 String first[]=firstdate.split(" ");
	 String First_Display_Month=first[0];
	 String Display_year=first[1];
	 String second[]=seconddate.split(" ");
	 String Second_Display_Month=second[0];
	
	 
	 if(Selectedyear.equals(Display_year))
	 {  
		if(First_Display_Month.equalsIgnoreCase(Selectedmonth)) {
		driver.findElement(By.xpath("(//p[text()="+Selectedday+"])[1]")).click();
		  break;
		}
		else if (Second_Display_Month.equalsIgnoreCase(Selectedmonth)) {
			driver.findElement(By.xpath("(//p[text()="+Selectedday+"])[2]")).click();
			  break;
			}

		
			
	 
		}//if
	 Thread.sleep(100);
	 driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		
	 }//while
	} //main
	
}//class
