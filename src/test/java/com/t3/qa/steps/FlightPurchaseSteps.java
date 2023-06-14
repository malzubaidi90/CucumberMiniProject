package com.t3.qa.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import com.t3.qa.pages.FlightPurchaseConfMessagePage;
import com.t3.qa.pages.FlightPurchase;
import com.t3.qa.utils.ConstantsT3;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FlightPurchaseSteps {
	FlightPurchase purchase;
	FlightPurchaseConfMessagePage messageConf;
	
	@Given("User navigates to Purchase Page {string}")
	public void userNavigatesToPurchasePage(String url) throws InterruptedException {
	    
		WebDriverManager.chromedriver().setup();
	    ConstantsT3.driver = new ChromeDriver();
	    Thread.sleep(1000);
	    ConstantsT3.driver.manage().window().maximize();
		ConstantsT3.driver.get(url);
		Thread.sleep(2000);
		ConstantsT3.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		purchase = new FlightPurchase();
		messageConf = new FlightPurchaseConfMessagePage();
	}

	@When("User enters Full Name {string}")
	public void userEntersFullName(String fullName) {
	   purchase.enterName(fullName);
		
	}

	@When("User enters Address {string}")
	public void userEntersAddress(String address) {
	    purchase.enterAddress(address);
	}

	@When("User enters City {string}")
	public void userEntersCity(String city) {
	   purchase.enterCity(city);
	}

	@When("User enters State {string}")
	public void userEntersState(String state) {
	   purchase.enterState(state);
	}

	@When("User enters Zipcode {string}")
	public void userEntersZipcode(String zipcode) {
	    purchase.enterZipCode(zipcode);
	}

	@When("User selects Card Type {string}")
	public void userSelectsCardType(String cardType) {
	    purchase.selectCardType(cardType);
	}

	@When("User enters Card Number {string}")
	public void userEntersCardNumber(String cardNumber) {
	    purchase.enterCardNumber(cardNumber);
	}

	@When("User enters Card month {string}")
	public void userEntersCardMonth(String cardMonth) {
	  purchase.enterCardMonth(cardMonth);
	}

	@When("User enters Card Year {string}")
	public void userEntersCardYear(String cardYear) {
	   purchase.enterCardYear(cardYear);
	}

	@When("User enters Name on the Card {string}")
	public void userEntersNameOnCard(String nameOnCard) {
	   purchase.enterNameOnCard(nameOnCard);
	}

	@When("User clicks on Remember Me button")
	public void userClicksRememberMeButton() {
	    purchase.clickRememberMe();
	}

	@When("User clicks on Purchase Flight button")
	public void userClicksPurchaseButton() {
	    purchase.clickSubmitButton();
	}

	@Then("User verifies success message {string}")
	public void userVerifiesMessage(String message) throws InterruptedException {
	   messageConf.verifyMessage(message);
	   
	   Thread.sleep(1000);
	   ConstantsT3.driver.quit();
	}


}