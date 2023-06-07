/**
 * 
 */
package org.practise.sel.browser;

import java.util.Collection;
import java.util.Collections;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author swarna
 *
 */
public class ChromeBrowser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*"); 
		//removing Chrome being controlled by automated Browser
		// Way - 1
        //support older version of Chrome Browser
		//options.addArguments("--disable-infobars");
		//way - 2
		//using String array
		//options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation" });
		//WAY-3
		//Using Collection array
		//options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation" ));

		//options.setExperimentalOption("excludeSwitches", Collections.singleton("enable-automation" ));
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation" ));

		ChromeDriver driver=new ChromeDriver(options);
			
		driver.get("https://www.amazon.com");
		

	}

}
