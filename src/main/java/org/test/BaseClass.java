package org.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	 WebDriver driver;
	
	public WebDriver getWebDriver (String browserName)  {
		WebDriver driver;
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			break;
		
		case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver =new FirefoxDriver();
				break;
				
			
				
				default:
					System.out.println("Invalid Browser Name:"+ browserName);
			break;
			
			
			
		}
		return driver;		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
}









}
