package com.abhishekjain.autogravity.pages;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChooseCarModel {
	private WebDriver driver;

	public ChooseCarModel(WebDriver driver) {

		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (Exception e) {
			e.printStackTrace();
		}

		this.driver = driver;
	}

	public void selectRandomCarModel() {
		List<WebElement> carModels = driver.findElements(By.cssSelector("div[class^=col-sm-3]"));

		Random rand = new Random();
		int randomCarModel = rand.nextInt(carModels.size());
		carModels.get(randomCarModel).click();
	}

	public void useMyLocation() {
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (Exception e) {
			e.printStackTrace();
		}

		WebElement useMyLocation = driver.findElement(By.cssSelector("div[class^='inputRow'] > button"));
		useMyLocation.click();
	}
}
