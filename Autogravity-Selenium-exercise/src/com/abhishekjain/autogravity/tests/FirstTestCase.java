package com.abhishekjain.autogravity.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abhishekjain.autogravity.pages.ChooseCar;
import com.abhishekjain.autogravity.pages.ChooseCarMake;
import com.abhishekjain.autogravity.pages.ChooseCarModel;
import com.abhishekjain.autogravity.pages.ChooseDealership;
import com.abhishekjain.autogravity.pages.ChooseTrim;
import com.abhishekjain.autogravity.pages.HomePage;
import com.abhishekjain.autogravity.pages.ReviewDetails;
import com.abhishekjain.autogravity.pages.ReviewVehicle;

public class FirstTestCase {
	static WebDriver driver;
	private static ReviewDetails reviewDetails;

	private static void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Python\\mlh\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.autogravity.com");
	}

	public static void main(String[] args) {
		setup();

		HomePage home = new HomePage(driver);
		home.clickNextButton();

		ChooseCarMake carMake = new ChooseCarMake(driver);
		carMake.selectRandomCarMake();

		ChooseCarModel carModel = new ChooseCarModel(driver);
		carModel.selectRandomCarModel();
		carModel.useMyLocation();

		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (driver.findElements(By.cssSelector("div[class^='trimYearToggle']")).isEmpty()) {
			noTrimFlow();
		} else {
			trimFlow();
		}

	}

	public static void trimFlow() {
		ChooseTrim chooseTrim = new ChooseTrim(driver);
		chooseTrim.selectTrim();

		reviewDetails = new ReviewDetails(driver);
		reviewDetails.confirmDetails();

		ChooseDealership dealerSelect = new ChooseDealership(driver);
		dealerSelect.selectDealer();
	}

	private static void noTrimFlow() {

		ChooseCar car = new ChooseCar(driver);
		car.chooseRandomCar();

		ReviewVehicle reviewVehicle = new ReviewVehicle(driver);
		reviewVehicle.confirmVehicle();

		reviewDetails = new ReviewDetails(driver);
		reviewDetails.confirmDetails();

	}

}
