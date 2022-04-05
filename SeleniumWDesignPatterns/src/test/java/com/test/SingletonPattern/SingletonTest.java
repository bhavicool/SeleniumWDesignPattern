package com.test.SingletonPattern;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DriverManager driverManager=DriverManager.getInstance();
		driverManager.getDriver().manage().window().maximize();
		
		DriverManager driverManager1=DriverManager.getInstance();
		driverManager1.getDriver().get("https://www.google.com");
		driverManager1.getDriver().quit();
	}

}
