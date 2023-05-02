package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.MyAccountPage;
import com.tutorialsninja.pages.RegisterPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Nikunja A Senjalia
 */

public class RegisterPageTest extends BaseTest {
    MyAccountPage myAccountPage = new MyAccountPage();
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

@Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        myAccountPage.getMyAccountPage();
        myAccountPage.selectRegisterFromMyAccountOptions();
        String actualText = myAccountPage.getActualTextForRegister();
        Assert.assertEquals(actualText,"Register Account","Register Account Text is not displayed correctly");
    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully() {
        homePage.clickOnMyAccountTab();
        homePage.clickOnRegisterLink();
        registerPage.enterFirstName("primesniks");
        registerPage.enterLastName("testsniks");
        registerPage.enterEmail("primesniksss@gmail.com");
        registerPage.enterTelephone("0770542844");
        registerPage.enterPassword("testniksss@123");
        registerPage.enterConfirmPassword("testniksss@123");
        registerPage.selectSubscribeRadioButtonYes();
        registerPage.clickOnPrivacyPolicy();
        registerPage.clickOnContinue();
        String actualText = registerPage.actualTextforYourAccountHasBeenCreated();
        Assert.assertEquals(actualText,"Your Account Has Been Created!","Text does not match!");
        registerPage.clickOnContinueToLogout();
        homePage.clickOnMyAccountTab();
        registerPage.clickOnLogout();
        String actualMessage = registerPage.actualAccountLogOutText();
        Assert.assertEquals(actualMessage,"Account Logout","Account is not logged out!");
        registerPage.clickOnContinueToLogout();

        }
}

