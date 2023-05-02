package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

/**
 * Created by Nikunja A Senjalia
 */
public class LoginPage extends Utility {

    HomePage homePage = new HomePage();
    MyAccountPage myAccountPage = new MyAccountPage();

    By actualTextForReturningCustomer = By.xpath("//h2[contains(text(),'Returning Customer')]");
    By loginButton = By.xpath("//form[contains(@action,'login')]//input[@type='submit']");

    public void selectLoginOption() {
        myAccountPage.selectLoginFromMyAccountOptions("Login");
    }

    public String getActualMessageFOrReturningCustomer() {
        return getTextFromElement(actualTextForReturningCustomer);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }
}
