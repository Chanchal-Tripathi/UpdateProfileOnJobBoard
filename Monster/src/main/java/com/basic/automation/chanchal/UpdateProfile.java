package com.basic.automation.chanchal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpdateProfile {
	WebDriver driver;

	public UpdateProfile(WebDriver driver) {
		this.driver = driver;
	}

	By saveProfile = By.xpath("//button[@class ='btn wt-100 medium pTB10']");

	public WebElement save()

	{
return driver.findElement(saveProfile);
	}
}
