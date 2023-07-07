package testNGEX;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterEx_Login {
	 WebDriver driver;
	 
	 @Parameters("url")

		@BeforeTest
		  public void launchApplication(String url)
	     {
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
			driver.get(url);
	     }
	 @Parameters({"User_Name", "Password"})
		@Test
		public void Login_ValidDetails(String uname,String pwd) 
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
			driver.findElement(By.name("username")).sendKeys(uname);
			driver.findElement(By.name("password")).sendKeys(pwd);
			driver.findElement(By.tagName("button")).click();
			String ExpectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
			String ActualUrl=driver.getCurrentUrl();
			System.out.println(ActualUrl);
			Assert.assertEquals(ExpectedUrl,ActualUrl,"Login Failed");
			
		}

     @AfterTest
     public void tearDown()
     {
    	 driver.quit();
     }
}
