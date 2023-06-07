package org.practise.sel.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTMLControls_Select {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		DesiredCapabilities des= new DesiredCapabilities();
		des.setAcceptInsecureCerts(true); 
		WebDriver driver= new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//div[@class='_6ltg']/a[@role='button']")).click();
		Thread.sleep(30);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Testing");
		driver.findElement(By.name("lastname")).sendKeys("last Testing");
		driver.findElement(By.name("reg_email__")).sendKeys("123456789");
		driver.findElement(By.name("reg_passwd__")).sendKeys("testpwd");
	    WebElement Birthmonth = driver.findElement(By.id("month"));
	    Select month= new Select(Birthmonth);
	    month.selectByVisibleText("Jun");
	   Select BirthDay= new Select(driver.findElement(By.id("day")));
	   
	   BirthDay.selectByValue("6");
	   Select Year= new Select(driver.findElement(By.id("year")));
	   Year.selectByValue("2000");
	   driver.findElement(By.xpath("//input[@type='radio' and  @ value='1']")).click();
	   driver.findElement(By.name("websubmit")).click();
	   driver.close();
	    

			
	}

}
