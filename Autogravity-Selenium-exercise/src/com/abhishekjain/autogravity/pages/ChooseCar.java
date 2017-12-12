package com.abhishekjain.autogravity.pages;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChooseCar {
	private WebDriver driver;

	public ChooseCar(WebDriver driver) {

		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (Exception e) {
			e.printStackTrace();
		}

		this.driver = driver;
	}

	public void chooseRandomCar() {
		List<WebElement> randomCarModels = driver.findElements(By.cssSelector("div[class^='window'] > div > article"));

		Random rand = new Random();
		int randomCarModel = rand.nextInt(randomCarModels.size());
		randomCarModels.get(randomCarModel).click();
	}
}