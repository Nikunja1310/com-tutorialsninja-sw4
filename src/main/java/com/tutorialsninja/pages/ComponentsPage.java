package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
/**
 * Created by Nikunja A Senjalia
 */

public class ComponentsPage extends Utility {
    HomePage homePage = new HomePage();
    By componentsText = By.xpath("//h2[contains(text(),'Components')]");
    String menu = "Show AllComponents";

    public void selectShowAllComponentsAndClick(){
        homePage.selectMenu(menu);
    }

    public String actualComponentsText (){
        return getTextFromElement(componentsText);
    }
}
