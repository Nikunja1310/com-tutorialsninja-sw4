package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopsAndNotebookPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Nikunja A Senjalia
 */


public class LaptopsAndNotebooksPageTest extends BaseTest {
    HomePage homePage = new HomePage();
    LaptopsAndNotebookPage laptopsAndNotebookPage = new LaptopsAndNotebookPage();

    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() {
        homePage.mouseHoverToLaptopsAndNotebooksAndClick();
        laptopsAndNotebookPage.selectAllLaptopsAndNotebooksAndClick();
        List<Double> originalProductPrices = laptopsAndNotebookPage.getProductPrices();

        // Sort By Reverse order
        Collections.sort(originalProductPrices, Collections.reverseOrder());
        //1.3 Select Sort By "Price (High > Low)"
        laptopsAndNotebookPage.sortProductPrice("Price (High > Low)");
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        Assert.assertEquals(originalProductPrices, afterSortByPrice, "Not sorted correctly");

    }
}