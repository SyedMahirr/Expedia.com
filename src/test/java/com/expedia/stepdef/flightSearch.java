package com.expedia.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.expedia.POMFactory.seachingFlight;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class flightSearch {

	WebDriver driver;

	@Given("^browser the site$")
	public void browser_the_site() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\ChromeWebdriver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://www.expedia.com/");
		
	}

	@When("^click on FLIGHTS$")
	public void click_on_FLIGHTS() throws Throwable {
		
		seachingFlight expedia = new seachingFlight(driver);
		expedia.clickOnFlight().click();
		
		
		
	}

	@When("^click on round-trip,$")
	public void click_on_round_trip() throws Throwable {
		seachingFlight expedia = new seachingFlight(driver);
		
	}

	@When("^search Flying from in the box New York$")
	public void search_Flying_from_in_the_box_New_York() throws Throwable {
		seachingFlight expedia = new seachingFlight(driver);
		expedia.flightSearchOrigin().sendKeys("New York");

		
	}

	@When("^search Flying to in the box Dhaka$")
	public void search_Flying_to_in_the_box_Dhaka() throws Throwable {
		seachingFlight expedia = new seachingFlight(driver);
		expedia.flightSearchDestination().sendKeys("Dhaka");
	}

	@When("^click on Departing$")
	public void click_on_Departing() throws Throwable {

	}

	@When("^click next in the calendar$")
	public void click_next_in_the_calendar() throws Throwable {

	}

	@When("^pick March (\\d+)$")
	public void pick_March(int arg1) throws Throwable {

	}

	@When("^click Returning$")
	public void click_Returning() throws Throwable {

	}

	@When("^click next$")
	public void click_next() throws Throwable {

	}

	@When("^pick April (\\d+)$")
	public void pick_April(int arg1) throws Throwable {

	}

	@When("^select adult$")
	public void select_adult() throws Throwable {

	}

	@When("^click advance optiona$")
	public void click_advance_optiona() throws Throwable {

	}

	@When("^select non-stop$")
	public void select_non_stop() throws Throwable {

	}

	@When("^check if the check box isDisplayed, isEnabled, isSelected$")
	public void check_if_the_check_box_isDisplayed_isEnabled_isSelected() throws Throwable {

	}

	@When("^click search$")
	public void click_search() throws Throwable {

	}

	@When("^Click the lowest priced airline$")
	public void click_the_lowest_priced_airline() throws Throwable {

	}

	@When("^select the returning flight$")
	public void select_the_returning_flight() throws Throwable {

	}

	@When("^click on continue booking$")
	public void click_on_continue_booking() throws Throwable {

	}

	@When("^enter first name$")
	public void enter_first_name() throws Throwable {

	}

	@When("^enter last name$")
	public void enter_last_name() throws Throwable {

	}

	@When("^enter phone number$")
	public void enter_phone_number() throws Throwable {

	}

	@When("^check Recieve Text Alert$")
	public void check_Recieve_Text_Alert() throws Throwable {

	}

	@When("^choose gender$")
	public void choose_gender() throws Throwable {

	}

	@When("^Select DOB$")
	public void select_DOB() throws Throwable {

	}

	@Then("^click on Complete Booking\\.$")
	public void click_on_Complete_Booking() throws Throwable {

	}
}
