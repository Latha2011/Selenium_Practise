package testNGEX;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM_Login {
	 public WebDriver driver;
	@BeforeMethod
     public void openApplication()
     {
		WebDriverManager.firefoxdriver().setup();
		 driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     }
	@Test
	public void Login_ValidDetails() 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
		String ExpectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String ActualUrl=driver.getCurrentUrl();
		System.out.println(ActualUrl);
		Assert.assertEquals(ExpectedUrl,ActualUrl,"Login Failed");
		
	}
	@Ignore
	@Test
	public void login_InvalidPassword() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.findElement(By.name("username")).sendKeys("Admin");
		//Enering invalid password
		driver.findElement(By.name("password")).sendKeys("Aadmin");
		driver.findElement(By.tagName("button")).click();
		
		Thread.sleep(100);
		//Error Message display
		Boolean actualresult=driver.findElement(By.xpath("(//div/p)[1]")).isDisplayed();
        assertTrue(actualresult, "Error message not Displayed");		
	}
	@Test
	public void login_InvalidUserName() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.findElement(By.name("username")).sendKeys("abcdefg");
		//Enering invalid password
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
		
		Thread.sleep(100);
		//Error Message display
		Boolean actualresult=driver.findElement(By.xpath("(//div/p)[1]")).isDisplayed();
        assertTrue(actualresult, "Error message not Displayed");		
	}
	@Test
	public void login_NoData() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.findElement(By.name("username")).sendKeys("");
		//Enering invalid password
		driver.findElement(By.name("password")).sendKeys("");
		driver.findElement(By.tagName("button")).click();
		
		Thread.sleep(100);
		//Error Message display
		Boolean actualresult=driver.findElement(By.xpath("(//div/p)[1]")).isDisplayed();
        assertTrue(actualresult, "Error message not Displayed");		
	}



    @AfterMethod
    public void closing()
    {
    	driver.quit();
    }
}
