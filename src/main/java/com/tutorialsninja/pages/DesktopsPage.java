package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

import java.util.ArrayList;
/**
 * Created by Nikunja A Senjalia
 */

public class DesktopsPage extends Utility {

    HomePage homePage = new HomePage();
    By desktopsText = By.xpath("//h2[contains(text(),'Desktops')]");
    String menu = "Show AllDesktops";


    By allProducts = By.xpath("//h4/a");
    By sort = By.cssSelector("#input-sort");


    public void selectShowAllDesktopsFromSelectMenu() {
        homePage.selectMenu(menu);
    }

    public String actualDesktopsText() {
        return getTextFromElement(desktopsText);
    }

    public ArrayList<String> getProductsText(){
     getTextFromElement(allProducts);
     return new ArrayList<>();
        }

    public void sortProductOrderByNameAtoZ() {
        selectByVisibleTextFromDropDown(sort,"Name (A - Z)");
        }


    public void sortProductOrderByNameZtoA() {
        selectByVisibleTextFromDropDown(sort,"Name (Z - A)");
    }
    }
