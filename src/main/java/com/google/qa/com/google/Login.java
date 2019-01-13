package com.google.qa.com.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {// POM normal approach

	WebDriver driver;// import webdriver

	By emailAddress = By.id("username");
	By password = By.id("password");
	By signIn = By.name("login");

	public Login(WebDriver driver) {// create constructor to initialize the driver

		this.driver = driver;

	}

	public void typeUsername() {

		driver.findElement(emailAddress).sendKeys("techfiosdemo@gmail.com");

	}

	public void typePassword() {

		driver.findElement(password).sendKeys("abc123");
	}

	public void typeSignIn() {

		driver.findElement(signIn).click();
	}

}
