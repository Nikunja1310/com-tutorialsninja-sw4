package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by Nikunja A Senjalia
 */
public class LaptopsAndNotebookPage extends Utility {
    HomePage homePage = new HomePage();
    By laptopAndNotebookText = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");
    String menu = "Show AllLaptops & Notebooks";

    By prices = By.linkText("//p[@class ='price']");
    By sort = By.id("input-sort");

    public void selectAllLaptopsAndNotebooksAndClick() {
        homePage.selectMenu(menu);
    }

    public String actualLaptopAndNotebookText() {
        return getTextFromElement(laptopAndNotebookText);
    }

    public List<Double> getProductPrices(){
        getTextFromElement(prices);
        /*for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",","")));
        }*/
        return new ArrayList<>();
    }

    public void sortProductPrice(String text) {
        selectByVisibleTextFromDropDown(sort,text);
    }
}