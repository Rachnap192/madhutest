package com.org.learningMaven.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.org.learningMaven.StepDefinition.StepDefinition_login;

public class dummy {
	

	public  WebDriver driver = null;
    {
	  
	    driver = new FirefoxDriver();
	}
    
	/*public WebDriver getDriver(String Browser)
	{
		
		try {
			if (Browser.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver","D:\\webdriver\\geckodriver.exe");
			    driver = new FirefoxDriver();
			} else if (Browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"D:\\webdriver\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (Browser.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver",
						"D:\\webdriver\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
		
		} catch (WebDriverException e) {
			System.out.println(e.getMessage());
		}
		return driver;
	}*/

}
