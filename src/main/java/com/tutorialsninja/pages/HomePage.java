package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Nikunja A Senjalia
 */
public class HomePage extends Utility {

    By topMenu = By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*");
    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");
    By desktopsMenu = By.linkText("Desktops");

    By laptopsAndNotebooksMenu = By.linkText("Laptops & Notebooks");

    By topMenuList = By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*");
    By componentsMenu = By.linkText("Components");
    By myAccountTab = By.xpath("//span[contains(text(),'My Account')]");
    By myAccountOptions = By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li");


    public void selectMenu(String menu) {
        List<WebElement> topMenuList = driver.findElements(topMenu);
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = getListOfElements(topMenu);
        }
    }

    public void clickOnMyAccountTab(){
        clickOnElement(myAccountTab);
    }
    public void clickOnLoginLink(){
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }

    public void mouseHoverToDesktopsAndClick(){
        mouseHoverToElementAndClick(desktopsMenu);
    }

    public void mouseHoverToLaptopsAndNotebooksAndClick(){
        mouseHoverToElementAndClick(laptopsAndNotebooksMenu);
    }
    public void mouseHoverToComponentsAndClick(){
        mouseHoverToElementAndClick(componentsMenu);
    }

    public void selectMyAccountOptions(String option) {
        List<WebElement> myAccountList = getListOfElements(myAccountOptions);
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = getListOfElements(myAccountOptions);
        }
    }

}
