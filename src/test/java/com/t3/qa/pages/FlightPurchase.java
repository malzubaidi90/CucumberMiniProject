package com.t3.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.t3.qa.utils.ConstantsT3;

public class FlightPurchase {

	// Step 1. Inspect elements and locate them

	@FindBy(xpath = "//input[@id='inputName']")
	WebElement nameField;
	@FindBy(xpath = "//input[@name='address']")
	WebElement addressField;
	@FindBy(xpath = "//input[@id='city']")
	WebElement cityField;
	@FindBy(xpath = "//input[@id='state']")
	WebElement stateField;
	@FindBy(xpath = "//input[@id='zipCode']")
	WebElement zipCodeField;
	@FindBy(xpath = "//select[@id='cardType']")
	WebElement cardTypeList;
	@FindBy(xpath = "//input[@id='creditCardNumber']")
	WebElement creditCardNumberField;
	@FindBy(xpath = "//input[@id='creditCardMonth']")
	WebElement creditCardMonthField;
	@FindBy(xpath = "//input[@id='creditCardYear']")
	WebElement creditCardYearField;
	@FindBy(xpath = "//input[@id='nameOnCard']")
	WebElement nameOnCardField;
	@FindBy(xpath = "//input[@name='rememberMe']")
	WebElement rememberMeCheckBox;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement submitButton;

	// Step 2. Create a Class Constructor and pass getInit() from PageFactory Class

	public FlightPurchase() {
		PageFactory.initElements(ConstantsT3.driver, this);
	}

	// Step3. Create methods for each element

	public void enterName(String name) {
		nameField.sendKeys(name);

	}

	public void enterAddress(String address) {
		addressField.sendKeys(address);
	}

	public void enterCity(String city) {
		cityField.sendKeys(city);
	}

	public void enterState(String state) {
		stateField.sendKeys(state);
	}

	public void enterZipCode(String zipCode) {
		zipCodeField.sendKeys(zipCode);
	}

	public void selectCardType(String cardType) {
		Select select = new Select(cardTypeList);
		select.selectByVisibleText(cardType);

	}

	public void enterCardNumber(String cardNumber) {
		creditCardNumberField.sendKeys(cardNumber);
	}

	public void enterCardMonth(String cardMonth) {
		creditCardMonthField.sendKeys(cardMonth);
	}

	public void enterCardYear(String cardYear) {
		creditCardYearField.sendKeys(cardYear);
	}

	public void enterNameOnCard(String cardName) {
		nameOnCardField.sendKeys(cardName);
	}

	public void clickRememberMe() {
		rememberMeCheckBox.click();
	}

	public void clickSubmitButton() {
		submitButton.click();
	}

}