package com.abhishekjain.autogravity.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	private WebDriver driver;

	private static String PAGE_URL = "https://www.autogravity.com";

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickNextButton() {
		WebElement nextButton = driver.findElement(By.cssSelector("button[data-googlekey='Hero Next']"));
		nextButton.click();
	}

}
