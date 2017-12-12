package com.abhishekjain.autogravity.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChooseTrim {
	private WebDriver driver;

	public ChooseTrim(WebDriver driver) {
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.driver = driver;
	}

	public void selectTrim() {

		WebElement dealerSelection = driver.findElement(By.cssSelector("div[class^='trimListRow']"));
		dealerSelection.click();
	}
}
