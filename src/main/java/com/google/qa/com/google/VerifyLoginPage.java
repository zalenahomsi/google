package com.google.qa.com.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyLoginPage {

	@Test

	public void verifyLogin() {

		// set the location of the webdriver and chromedriver

		System.setProperty("webdriver.chrome.driver", "C:\\AUTO\\chromedriver.exe");// hold shift+rightclick>copy as
																					// path

		// create new object to import webdriver and chromedriver
		WebDriver driver = new ChromeDriver();

		driver.get("http://techfios.com/test/billing/?ng=login/");// get the test case website address by using object

		Login login = new Login(driver);
		login.typeUsername();
		login.typePassword();
		login.typeSignIn();

		driver.quit();

	}

}
