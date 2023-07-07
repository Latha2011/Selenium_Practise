package testNGEX;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.practise.sel.browser.UtilsOfScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestFailure_Listener extends DataProvider_Excel  implements ITestListener {

	public void onTestFailure(ITestResult result) {
		//Creating FileName Using MethodName
		String FileName=result.getMethod().getMethodName();
	    LocalDateTime myDateObj = LocalDateTime.now();
	   // System.out.println("Before formatting: " + myDateObj);
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");

	    String formattedDate = myDateObj.format(myFormatObj);
	    //FileName with date n time to skip Overriding
	    FileName=FileName+formattedDate+".png";
	   // System.out.println("After formatting: " + formattedDate);
	   


		UtilsOfScreenshot.usingFileFormat(driver,FileName );
	}

}
