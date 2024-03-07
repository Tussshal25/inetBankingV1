package com.inetbanking.testcases;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public String BaseURL = "https://demo.guru99.com/v4/";
	public String userName = "mngr555563";
	public String Password = "EgEnUba";
	public static WebDriver driver;

	@BeforeClass
	public void setup() 
	{
		System.setProperty("wedriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
	}
	@AfterClass
	public void tearDown() {
		
		driver.quit();
	}
}
