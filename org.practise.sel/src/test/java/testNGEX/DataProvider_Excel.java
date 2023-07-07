package testNGEX;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(testNGEX.TestFailure_Listener.class)
public class DataProvider_Excel {
	public static WebDriver driver;

	@BeforeMethod
    public void openApplication()
    {
		WebDriverManager.firefoxdriver().setup();
		 driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

   @Test(dataProvider ="logindata_excel")
	public void Login(String uname,String pwd)
	{
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.tagName("button")).click();
		String ExpectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String ActualUrl=driver.getCurrentUrl();
		//System.out.println(ActualUrl);
		Assert.assertEquals(ExpectedUrl,ActualUrl,"Login Failed");
		
	}
	
 /**   @DataProvider(name="logindata_excel")
	public Object[][] readExcelData() 
	{
		Object[][] ob=null;
		try {
			 ob=com.util.Login_DataProvider.readLogin_Data();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ob;
	}
    */
    @DataProvider(name="logindata_excel" ,parallel = true)

  public Iterator<Object[]> readExcel() throws Exception
  {
	  return(com.util.Login_DataProvider.readIterator());
  }
  

@AfterMethod
public void closing()
{
	driver.quit();
}
}