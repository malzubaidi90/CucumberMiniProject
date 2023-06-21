package com.t3.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.t3.qa.utils.ConstantsT3;

public class FlightPurchaseConfMessagePage {

	// Step 1. inspect elements and locate them
	@FindBy(xpath = "//h1[text()='Thank you for your purchase today!']")
	WebElement confirmationMessage;

	// Step 2. Create Page Constructor and calling initElements from Page Factory
	// Class

	public FlightPurchaseConfMessagePage() {
		PageFactory.initElements(ConstantsT3.driver, this);
	}

	// Step 3. Create method to perform actions on each WebElements

	public void verifyMessage(String expMessage) {

		String actualMessage = confirmationMessage.getText();
		if (actualMessage.equals(expMessage)) {
			System.out.println("PASSED...");
		} else {
			System.out.println("FAILED...");
		}
	}

}
