package com.abhishekjain.autogravity.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReviewDetails {

	private WebDriver driver;

	public ReviewDetails(WebDriver driver) {
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.driver = driver;
	}

	public void confirmDetails() {
		WebElement nextButton = driver.findElement(By.cssSelector("button[data-gtm='confirmDetails']"));
		nextButton.click();
	}

}
