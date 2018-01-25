package com.expedia.POMFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class seachingFlight {

	WebDriver driver;

	public seachingFlight(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	} 
	
	// Locating Element
	@FindBy (id = "tab-flight-tab-hp")
	WebElement flight; 
	
	@FindBy (id = "flight-origin-hp-flight")
	WebElement searchOrigin;
	
	@FindBy (id = "flight-destination-hp-flight")
	WebElement searchDestination;
	
	//Method 
	public WebElement clickOnFlight() {
		return flight; 
	}
	
	public WebElement flightSearchOrigin() {
		return searchOrigin;
	}
	
	public WebElement flightSearchDestination() {
		return searchDestination;
	}
	
	
	
}
