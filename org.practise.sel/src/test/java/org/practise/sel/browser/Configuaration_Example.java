package org.practise.sel.browser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Configuaration_Example {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		FileInputStream fis=new FileInputStream("C:\\Users\\svina\\git\\Selenium_Practise\\org.practise.sel\\src\\test\\resources\\config.properties");
		prop.load(fis);
		driver.get(prop.getProperty("url"));
		
		
		driver.findElement(By.id("email")).sendKeys(prop.getProperty("username"));
		fis.close();
	
	}

}
