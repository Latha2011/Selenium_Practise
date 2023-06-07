package org.practise.sel.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserPopUp_Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
	/**	FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("permissions.default.desktop-notification", 2);
		FirefoxOptions options=new FirefoxOptions();
		
		options.setProfile(profile);
	//	DesiredCapabilities cap =DesiredCapabilities.firefox(); */
		//WebDriver driver=new FirefoxDriver(options);
		WebDriver driver=new FirefoxDriver();
		driver.get("https://redbus.in");



	}

}
