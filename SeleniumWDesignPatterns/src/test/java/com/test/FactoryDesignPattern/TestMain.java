package com.test.FactoryDesignPattern;

import org.openqa.selenium.WebDriver;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=DriverManagerFactory.getManager(BrowserTypes.CHROME);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.quit();

	}

}
