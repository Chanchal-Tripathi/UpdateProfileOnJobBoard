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

public class LoginTest {

	@Test

	public void loginMethod() {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.monsterindia.com/rio/login");
		Login lg = new Login(driver);
		driver.manage().window().maximize();
		lg.emailId().sendKeys("chanchal.tripathi0@gmail.com");
		lg.Password().sendKeys("Iam@3475#");
		lg.signIn().click();
		Dashboard dbobj = new Dashboard(driver);

		dbobj.updateProfileMethod().click();
		Profilepage pp = new Profilepage(driver);
		pp.Edit().click();
		System.out.print("Object clicked");
		UpdateProfile up = new UpdateProfile(driver);
		up.save().click();
		System.out.print("Profile is updated successfully");

		driver.close();
	}
}
