package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
/**
 * Created by Nikunja A Senjalia
 */
public class ProductPage extends Utility {
    HomePage homePage = new HomePage();
    DesktopsPage desktopsPage = new DesktopsPage();

    By currency = By.xpath("//span[contains(text(),'Currency')]");
    By currencyDropDownMenu = By.xpath("//ul[@class = 'dropdown-menu']/li");
    By actualTextForHpLo3065 = By.xpath("//h1[contains(text(),'HP LP3065')]");

    String year = "2023";
    String month = "November";
    String date = "30";

    By groupDate = By.xpath("//div[@class = 'input-group date']//button");
    By monthAndYear = By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']");
    By nextGroupDate = By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']");
    By dateField = By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']");

    By quantity = By.name("quantity");
    By addToCart = By.xpath("//button[@id='button-cart']");
    By actualTextProductAddedToShoppingCart = By.cssSelector("By.cssSelector(\"body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible");
    By shoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");
    By actualTextShoppingCart = By.xpath("//div[@id='content']//h1");
    By actualTextHPLP3065 = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    By actualTextDeliveryDate =  By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]");
    By actualModelProduct21 = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[3]");
    By actualTotal£7473 = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");

    public void clickOnCurrency(){
        clickOnElement(currency);
    }

    public void selectPoundSterling(){
     selectByContainsTextFromListOfElements(currencyDropDownMenu,"£Pound Sterling");
    }
    public String actualTextHPLP3065(){
        return getTextFromElement(actualTextForHpLo3065);
    }

    public void clickOnGroupDate(){
        clickOnElement(groupDate);
    }
    public String getTextForMonthAndYear(){
        return getTextFromElement(monthAndYear);
    }
    public void clickOnNextGroupDate(){
        clickOnElement(nextGroupDate);
    }
    public  List<WebElement>clickOnAllDates(){
        clickOnElement(dateField);
        return null;
    }

    public void enterQuantity(){
        sendTextToElement(quantity,"1");
    }

    public void clickOnAddTOCat(){
        clickOnElement(addToCart);
    }
    public String actualTextForSuccess(){
        return getTextFromElement(actualTextProductAddedToShoppingCart);
    }
    public void clickOnShoppingCartFromSuccessMessage(){
        clickOnElement(shoppingCart);
    }
    public String  setActualTextShoppingCart(){
        return getTextFromElement(actualTextShoppingCart);
    }
    public String setActualTextHPLP3065(){
        return getTextFromElement(actualTextHPLP3065);
    }
    public String setActualDeliveryDate (){
        return getTextFromElement(actualTextDeliveryDate);
    }
    public String setActualModelProduct21(){
        return getTextFromElement(actualModelProduct21);
    }

    public String setActualTotal£7473(){
        return getTextFromElement(actualTotal£7473);
    }
    public void selectDeliveryDate(String year, String month, String date){
        clickOnGroupDate();
        while (true) {
            String monthAndYear = getTextForMonthAndYear();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnNextGroupDate();
            }
        }
        //for date
        List<WebElement> allDates = clickOnAllDates();
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }
    }


}
