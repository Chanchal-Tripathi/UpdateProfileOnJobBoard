/**
 * 
 */
package com.basic.automation.chanchal;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author mr
 *
 */
@Test
public class DashboardTest {

	WebDriver driver = new ChromeDriver();

	public void db() {
		LoginTest lt = new LoginTest();
		lt.loginMethod();
		Dashboard dbobj = new Dashboard(driver);
		
		dbobj.updateProfileMethod().click();

	}
}
