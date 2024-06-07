package com.testcases;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.Login;

public class etst1 extends logintest {

	@Test
	public void logintsts() {

		Login lg = PageFactory.initElements(driver, Login.class);

		log = LogManager.getLogger();
		log.info("** Start logintests");
		log.info("enter username");
		lg.enterusername("standard_user");
		log.info("enter Password");
		lg.enterpassword("secret_sauce");
		lg.clickloginbutn();
		String title = driver.getTitle();
		log.info("Title is " + title);
		if (title.equals("Swag Labs")) {
			log.info("Title is correct");
		} else {
			log.error("Title is Wrong");
		}
		log.info("**END of the Login test");
	}
}
