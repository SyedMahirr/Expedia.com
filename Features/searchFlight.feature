@FlightSearch
Feature: User Navigating to the browser,  Searching for Flight, and Reserve 

	In order to navigate to the browser, search for a flight and reserving 
	As a site visitor
	I want to browser the site, click on FLIGHTS, click on round-trip, 
	search Flying from in the box New York, search Flying to in the box Dhaka
	click on Departing, click next in the calendar, pick March 24, click Returning, 
	click next, pick April 22, select adult, click advance option, select non-stop,
	click search, Click the lowest priced airline, select the returning flight, 
	click on continue booking, enter first name, enter last name, enter phone number
	check Recieve Text Alert, choose gender, Select DOB, click on Complete Booking. 

Scenario: Positive 

Given browser the site
When click on FLIGHTS
And click on round-trip, 
And search Flying from in the box New York
And search Flying to in the box Dhaka
And click on Departing
And click next in the calendar
And pick March 24.
And click Returning
And click next
And pick April 22.
And select adult
And click advance optiona
And select non-stop
And check if the check box isDisplayed, isEnabled, isSelected
And click search
And Click the lowest priced airline
And select the returning flight
And click on continue booking
And enter first name
And enter last name
And enter phone number
And check Recieve Text Alert
And choose gender
And Select DOB
Then click on Complete Booking. 



