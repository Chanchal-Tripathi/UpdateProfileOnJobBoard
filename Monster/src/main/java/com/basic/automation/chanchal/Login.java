/**
 * 
 */
package com.basic.automation.chanchal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author mr
 *
 */
public class Login {
	WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
	}

	By userName = By.id("signInName");
	By paswd = By.id("password");
	By signInButton = By.id("signInbtn");

	public WebElement emailId() {
		return driver.findElement(userName);

	}

	public WebElement Password() {
		return driver.findElement(paswd);

	}

	public WebElement signIn() {
		return driver.findElement(signInButton);

	}

}
