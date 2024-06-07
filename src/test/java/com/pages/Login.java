package com.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	public static Logger log;
	WebDriver driver;
	
	
	public Login (WebDriver driver){
		this.driver=driver;
	}
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement uname;
	@FindBy(xpath = "//input[@id='password']")
	WebElement pwds;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement lbutn;
	public void enterusername(String username) {
		uname.sendKeys(username);
		log = LogManager.getLogger();
		log.info("performed Action on uname element"); 
	}
	public void enterpassword(String password) {
		pwds.sendKeys(password);
		log.info("performed Action on password element"); 
	}
	public void clickloginbutn() {
		lbutn.click();
		log.info("performed Action on lgnbutn element"); 
	}
}
