package testNGEX;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google_TestNG {
	@Test
	public void googleSearch()
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://google.com");
		driver.findElement(By.xpath("//div[@class='YacQv']/following-sibling:: textarea")).sendKeys("Selenium",Keys.ENTER);
		
	}

}
