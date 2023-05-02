package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
/**
 * Created by Nikunja A Senjalia
 */
public class MyAccountPage extends Utility {

    HomePage homePage = new HomePage();
    By registerText = By.xpath("//h1[contains(text(),'Register Account')]");


    public void getMyAccountPage() {
        homePage.clickOnMyAccountTab();
    }

    public void selectRegisterFromMyAccountOptions() {
       homePage.selectMyAccountOptions("Register");
    }

    public void selectLoginFromMyAccountOptions(String option) {
        homePage.selectMyAccountOptions("Login");
    }


    public String getActualTextForRegister() {
    return getTextFromElement(registerText);
    }


}
