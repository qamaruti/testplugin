package com.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class logintest {

	WebDriver driver;
public static Logger log;
	@BeforeTest
	public void setup() {
		log = LogManager.getLogger();
log.info("Launch chrome browser");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
	}

	@AfterTest
	public void teardowm() {

		driver.quit();
	}

}
