package com.abhishekjain.autogravity.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChooseDealership {

	private WebDriver driver;

	public ChooseDealership(WebDriver driver) {
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.driver = driver;
	}

	public void selectDealer() {

		WebElement dealerSelection = driver.findElement(By.cssSelector("button[data-gtm='confirmDealer']"));
		dealerSelection.click();
	}
}
