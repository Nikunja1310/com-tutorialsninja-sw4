package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.ComponentsPage;
import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopsAndNotebookPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Nikunja A Senjalia
 */


public class TopMenuTest extends BaseTest {
    HomePage homePage = new HomePage();
    DesktopsPage desktopsPage = new DesktopsPage();

    LaptopsAndNotebookPage laptopsAndNotebookPage = new LaptopsAndNotebookPage();
    ComponentsPage componentsPage = new ComponentsPage();

    @Test
    public void verifyUserShouldNavigateToDesktopPageSuccessfully(){
        homePage.mouseHoverToDesktopsAndClick();
        desktopsPage.selectShowAllDesktopsFromSelectMenu();
            // 3 lines of Assert can be written in 1 single line
            //String expectedText = "Desktops";
            String actualText = desktopsPage.actualDesktopsText();

            Assert.assertEquals(actualText,"Desktops","Not navigate to Desktop page");

    }
    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        homePage.mouseHoverToLaptopsAndNotebooksAndClick();
        laptopsAndNotebookPage.selectAllLaptopsAndNotebooksAndClick();
        String actualText = laptopsAndNotebookPage.actualLaptopAndNotebookText();
        Assert.assertEquals(actualText, "Laptops & Notebooks","Not able to navigate - Laptops And Notebooks page");
    }
@Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        homePage.mouseHoverToComponentsAndClick();
        componentsPage.selectShowAllComponentsAndClick();
        String actualText = componentsPage.actualComponentsText();
        Assert.assertEquals(actualText,"Components","Not able to navigate - Components page" );

    }

}
