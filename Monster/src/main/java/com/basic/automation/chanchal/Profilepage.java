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
public class Profilepage {

	WebDriver driver;

	public Profilepage(WebDriver driver) {
		this.driver = driver;
	}

	By editPen = By.xpath("//span[@class='btn-share-job btn-pro-share mt10']");

public WebElement Edit()
{
	return driver.findElement(editPen);
	
}
}