package com.abhishekjain.autogravity.pages;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChooseCarMake {
	private WebDriver driver;

	public ChooseCarMake(WebDriver driver) {

		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (Exception e) {
			e.printStackTrace();
		}

		this.driver = driver;
	}

	public void selectRandomCarMake() {
		List<WebElement> carMakes = driver.findElements(By.cssSelector("div[class^='row makes'] > div"));

		Random rand = new Random();
		int randomCarMake = rand.nextInt(carMakes.size());
		carMakes.get(randomCarMake).click();
	}

}
