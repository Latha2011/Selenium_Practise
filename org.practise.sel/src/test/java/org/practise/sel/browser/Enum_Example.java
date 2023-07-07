package org.practise.sel.browser;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Enum_Example {
    public static  WebDriver driver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\svina\\git\\Selenium_Practise\\org.practise.sel\\src\\test\\resources\\config.properties");
		prop.load(fis);
       String b=prop.getProperty("browser");	
       System.out.println(b);
    if(b.equals(Driver_enum.firefox))
    {
		WebDriverManager.firefoxdriver().setup();
		 driver= new FirefoxDriver();
    }
    else {
    	System.out.println("Browser name is not valid"); }
    
        driver.get(prop.getProperty("url"));
	
		
		
		
		fis.close();

	}

}
