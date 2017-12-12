package com.abhishekjain.autogravity.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReviewVehicle {
	private WebDriver driver;
	
	public ReviewVehicle(WebDriver driver) 
	{
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.driver = driver;
	}
	
	public void confirmVehicle() {
		WebElement nextButton = driver.findElement(By.cssSelector("div[class^='buttonNextContainer'] > button"));
		nextButton.click();
		
	}
}
