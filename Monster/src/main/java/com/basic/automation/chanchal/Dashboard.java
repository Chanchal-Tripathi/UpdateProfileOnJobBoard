/**
 * 
 */
package com.basic.automation.chanchal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author mr
 *
 */
public class Dashboard {
	WebDriver driver;

	public Dashboard(WebDriver driver) {
		this.driver = driver;
	}

	// String s= "//a[@class='line-btn btn-update-profile w100 text-center']";
	By updateProfile = By.xpath("//span[@class='progress-bar']/following :: a[contains(text(), 'Update Profile')]");
	//By updateProfile = document.getElementsByName("Update Profile");
	//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",updateProfile);
	
	By searchSkill = By.className("fts");

	public WebElement updateProfileMethod() {
		/*
		 * WebDriverWait wait = new WebDriverWait(driver,30);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(updateProfile));
		 */

        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(updateProfile));
    	//System.out.println(element);
		
		
		return driver.findElement(updateProfile);
	

	}

	public WebElement searchSkillMethod() {
		return driver.findElement(searchSkill);
	}
}
