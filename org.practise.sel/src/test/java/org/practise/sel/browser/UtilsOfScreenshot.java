package org.practise.sel.browser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilsOfScreenshot {
	public static void usingFileFormat(WebDriver driver, String FileName)
	{
		TakesScreenshot  ts=(TakesScreenshot) driver;
		File file1= ts.getScreenshotAs(OutputType.FILE);
	     try {
			FileUtils.copyFile(file1, new File("./screenshot/"+ FileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	}
	public static void usingBase64Format(WebDriver driver, String FileName)
	{
		TakesScreenshot  ts=(TakesScreenshot) driver;
		String file1= ts.getScreenshotAs(OutputType.BASE64);
		byte[] bytearr= Base64.getDecoder().decode(file1);
		
		try {
			FileOutputStream fos =new FileOutputStream(new File("./screenshot/"+ FileName));
			fos.write(bytearr);
			fos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		}
		
	public static void usingBYTESFormat(WebDriver driver, String FileName)
	{
		TakesScreenshot  ts=(TakesScreenshot) driver;
		byte[] bytearr= ts.getScreenshotAs(OutputType.BYTES);
	
		
		try {
			FileOutputStream fos =new FileOutputStream(new File("./screenshot/"+ FileName));
			fos.write(bytearr);
			fos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		}

	}

