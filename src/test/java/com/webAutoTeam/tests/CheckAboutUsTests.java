package com.webAutoTeam.tests;

import com.webAutoTeam.pages.HomePage;
import com.webAutoTeam.pages.SearchPage;
import com.webAutoTeam.utilities.ConfigReader;
import com.webAutoTeam.utilities.SeleniumUtils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.webAutoTeam.utilities.SeleniumUtils.scroll;
import static com.webAutoTeam.utilities.SeleniumUtils.scrollToElement;

public class CheckAboutUsTests extends TestBase{
    @Test(groups = {"smoke"})
    public void checkAboutUsButtonBoston() {

        driver.get(ConfigReader.getProperty("url"));
        SeleniumUtils.scroll(0,1000);
        HomePage homePage = new HomePage();
        homePage.findAboutUs.click();
        SearchPage searchPage = new SearchPage();
        SeleniumUtils.scrollToElement(searchPage.searchBoston);
        searchPage.searchBoston.click();
        System.out.println(driver.getTitle());

    }
    /// test for Jenkins

    @Test
    public void checkAboutUsButtonKansasCity() {

        driver.get(ConfigReader.getProperty("url"));
        scroll(0,1000);
        HomePage homePage = new HomePage();
        homePage.findAboutUs.click();
        SearchPage searchPage = new SearchPage();
        SeleniumUtils.scrollToElement(searchPage.searchKansasCity);
        searchPage.searchKansasCity.click();
        System.out.println(driver.getTitle());

    }

    @Test(groups = {"smoke"})
    public void checkAboutUsButtonNewYorkCity() {

        driver.get(ConfigReader.getProperty("url"));
        scroll(0,1000);
        HomePage homePage = new HomePage();
        homePage.findAboutUs.click();
        SearchPage searchPage = new SearchPage();
        SeleniumUtils.scrollToElement(searchPage.searchNewYorkCity);
        searchPage.searchNewYorkCity.click();
        System.out.println(driver.getTitle());

    }
}
