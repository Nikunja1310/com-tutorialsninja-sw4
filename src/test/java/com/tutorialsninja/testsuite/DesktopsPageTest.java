package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.ProductPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Nikunja A Senjalia
 */

public class DesktopsPageTest extends BaseTest {

    HomePage homePage = new HomePage();
    DesktopsPage desktopsPage = new DesktopsPage();
    ProductPage productPage = new ProductPage();



    @Test
    public void verifyProductArrangeInAlphabeticalOrder() {
        homePage.selectMenu("Desktops");
        desktopsPage.selectShowAllDesktopsFromSelectMenu();
        ArrayList<String> originalProductsName = desktopsPage.getProductsText();
        // Sort By Reverse order
        Collections.reverse(originalProductsName);
        desktopsPage.sortProductOrderByNameZtoA();
        //1.4 Verify the Product will arrange in Descending order.
        ArrayList<String> afterSortByZToA = desktopsPage.getProductsText();
        //Compare
        Assert.assertEquals(originalProductsName, afterSortByZToA, "Not sorted in correct order");
    }


    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() {
        productPage.clickOnCurrency();
        productPage.selectPoundSterling();
        homePage.selectMenu("Desktops");
        desktopsPage.selectShowAllDesktopsFromSelectMenu();
        desktopsPage.sortProductOrderByNameAtoZ();
        String actualText = productPage.actualTextHPLP3065();
        Assert.assertEquals(actualText,"HP LP3065","HP LP3065 Product not display" );

        productPage.selectDeliveryDate("2023","November","30");
        /*productPage.clickOnGroupDate();
        productPage.getTextForMonthAndYear();*/
        productPage.enterQuantity();
        productPage.clickOnAddTOCat();
        String actualTextSuccess  = productPage.actualTextForSuccess();
        Assert.assertTrue(actualTextSuccess.contains("Success: You have added HP LP3065 to your shopping cart!"),"Product not added to cart");
        productPage.clickOnShoppingCartFromSuccessMessage();
        String actualTextShoppingCart= productPage.setActualTextShoppingCart();
        Assert.assertTrue(actualTextShoppingCart.contains("Shopping Cart"),"Text Not verified!");
        String actualTextForHpLp3065 = productPage.setActualTextHPLP3065();
        Assert.assertEquals(actualTextForHpLp3065,"HP LP3065","Product name not matched");
        Assert.assertTrue(productPage.setActualDeliveryDate().contains("2023-11-30"),"Delivery date not matched");
        Assert.assertEquals(productPage.setActualModelProduct21(),"Product 21","Model not matched");
        Assert.assertEquals(productPage.setActualTotal£7473(),"£74.73","Total not matched");

        }
    }

