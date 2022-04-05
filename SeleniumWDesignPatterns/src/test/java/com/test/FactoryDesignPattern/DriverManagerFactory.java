package com.test.FactoryDesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManagerFactory {

	public static WebDriver getManager(BrowserTypes type) {

		WebDriver driver=null;

        switch (type) {
            case CHROME:
            	WebDriverManager.chromedriver().setup();
            	driver = new ChromeDriver();
            	break;
            case FIREFOX:
            	driver = new FirefoxDriver();
                break;
            default:
            	driver = new InternetExplorerDriver();
                break;
            
        }
        return driver;

    }
}
