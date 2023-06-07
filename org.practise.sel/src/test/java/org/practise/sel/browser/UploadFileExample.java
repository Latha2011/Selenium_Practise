package org.practise.sel.browser;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFileExample {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement browse=driver.findElement(By.xpath("//input[@id='imagesrc']"));
		Actions act=new Actions(driver);
		act.moveToElement(browse).click().build().perform();
		
		Thread.sleep(300);
      //  String path=System.getProperty("C:\\eclipse\\selenium\\org.practise.sel\\screenshot\\Upload_autoit.exe");
        Runtime.getRuntime().exec("C:\\eclipse\\selenium\\org.practise.sel\\screenshot\\Upload_autoit.exe");

	}

}
