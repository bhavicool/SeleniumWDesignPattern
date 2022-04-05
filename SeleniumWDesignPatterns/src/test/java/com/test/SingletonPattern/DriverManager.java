package com.test.SingletonPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	
	private static DriverManager driverManager=null;
	
	private WebDriver driver;
	
	private DriverManager() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	public static DriverManager getInstance()
	{
		if(driverManager==null)
		driverManager=new DriverManager();
		
		return driverManager;
	}
	
	public WebDriver getDriver()
	{
		return driver;
	}

}
