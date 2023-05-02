package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
/**
 * Created by Nikunja A Senjalia
 */
public class RegisterPage extends Utility {

    HomePage homePage = new HomePage();
    MyAccountPage myAccountPage = new MyAccountPage();


    By firstNameField = By.id("input-firstname");
    By lastNameField = By.id("input-lastname");
    By emailField = By.id("input-email");
    By telephoneField = By.id("input-telephone");
    By passwordField = By.id("input-password");
    By confirmPasswordField = By.id("input-confirm");
    By radioButtonField = By.xpath("//fieldset[3]//input");
    By privacyPolicyCHeckBox = By.xpath("//div[@class = 'buttons']//input[@name='agree']");
    By continueButton = By.xpath("//div[@class = 'buttons']//input[@value='Continue']");
    By continueLogout = By.xpath("//a[contains(text(),'Continue')]");
    By actualTextYourAccountHasBeenCreated = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
    By actualAccountLogOutText = By.xpath("//h1[contains(text(),'Account Logout')]");

    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameField, firstName);
    }

    public void enterLastName(String lastName) {
        sendTextToElement(lastNameField,lastName);
    }

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterTelephone(String telephone) {
        sendTextToElement(telephoneField, telephone);
    }


    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        sendTextToElement(confirmPasswordField, confirmPassword);
    }


    public void selectSubscribeRadioButtonYes() {
    selectByContainsTextFromListOfElements(radioButtonField,"Yes");
    }


    public void selectSubscribeRadioButtonNo() {
        selectByContainsTextFromListOfElements(radioButtonField,"No");
    }

    public void clickOnPrivacyPolicy() {
        clickOnElement(privacyPolicyCHeckBox);
    }

    public void clickOnContinue() {
        clickOnElement(continueButton);
    }

    public String actualTextforYourAccountHasBeenCreated(){
       return getTextFromElement(actualTextYourAccountHasBeenCreated);
    }

    public void clickOnLogout(){
        homePage.selectMyAccountOptions("Logout");
    }
    public String actualAccountLogOutText(){
        return getTextFromElement(actualAccountLogOutText);
    }

    public void clickOnContinueToLogout(){
        clickOnElement(continueLogout);
    }


}