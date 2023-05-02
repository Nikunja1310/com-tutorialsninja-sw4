package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LoginPage;
import com.tutorialsninja.pages.MyAccountPage;
import com.tutorialsninja.pages.RegisterPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Nikunja A Senjalia
 */

public class LoginPageTest extends BaseTest {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    MyAccountPage myAccountPage = new MyAccountPage();
    RegisterPage registerPage = new RegisterPage();


    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        homePage.clickOnMyAccountTab();
        loginPage.selectLoginOption();
        String actualMessage = loginPage.getActualMessageFOrReturningCustomer();
        Assert.assertEquals(actualMessage,"Returning Customer","Login page not displayed");
        }

    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
        homePage.clickOnMyAccountTab();
        loginPage.selectLoginOption();
        registerPage.enterEmail("primesniksss@gmail.com");
        registerPage.enterPassword("testniksss@123");
        loginPage.clickOnLoginButton();
        myAccountPage.getMyAccountPage();
        homePage.selectMyAccountOptions("Logout");
        String actualText = registerPage.actualAccountLogOutText();
        Assert.assertEquals(actualText,"Account Logout","Not logged out");

    }
}
