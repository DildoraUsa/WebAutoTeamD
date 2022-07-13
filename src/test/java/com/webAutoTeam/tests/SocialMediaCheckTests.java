package com.webAutoTeam.tests;

import com.webAutoTeam.pages.HomePage;
import com.webAutoTeam.pages.ProductsPage;
import com.webAutoTeam.pages.SearchPage;
import com.webAutoTeam.utilities.ConfigReader;
import com.webAutoTeam.utilities.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.webAutoTeam.utilities.SeleniumUtils.*;
import static com.webAutoTeam.utilities.SeleniumUtils.switchToWindow;

public class SocialMediaCheckTests extends TestBase{

    @Test(groups = {"smoke"})
    public void checkFacebookLinks() throws InterruptedException {

        driver.get(ConfigReader.getProperty("url"));
        HomePage homePage = new HomePage();
        SeleniumUtils.scrollToElement(homePage.findFacebook);
        homePage.findFacebook.click();
        Thread.sleep(1000);
        SeleniumUtils.switchToWindow("WebstaurantStore - Home | Facebook");
        System.out.println(driver.getTitle());
        SearchPage searchPage = new SearchPage();
        searchPage.searchPhoto.click();
        SeleniumUtils.getScreenshot("FacebookScreenShot");
        switchToWindow("WebstaurantStore: Restaurant Supplies & Foodservice Equipment");
        Assert.assertEquals(driver.getTitle(),"WebstaurantStore: Restaurant Supplies & Foodservice Equipment");
    }

    @Test
    public void checkTwitterLinks() throws InterruptedException {

        driver.get(ConfigReader.getProperty("url"));
        HomePage homePage = new HomePage();
        SeleniumUtils.scrollToElement(homePage.findTwitter);
        homePage.findTwitter.click();
        Thread.sleep(2000);
        switchToWindow("WebstaurantStore (@Webstaurant) / Twitter");
        System.out.println(driver.getTitle());
        SearchPage searchPage = new SearchPage();
        searchPage.searchTweets.click();
        switchToWindow("WebstaurantStore: Restaurant Supplies & Foodservice Equipment");
        Assert.assertEquals(driver.getTitle(),"WebstaurantStore: Restaurant Supplies & Foodservice Equipment");
    }

    @Test
    public void checkInstagramLinks() throws InterruptedException {

        driver.get(ConfigReader.getProperty("url"));
        HomePage homePage = new HomePage();
        SeleniumUtils.scrollToElement(homePage.findInstagram);
        homePage.findInstagram.click();
        Thread.sleep(2000);
        SeleniumUtils.switchToWindow("Login Instagram");
        //  SeleniumUtils.switchToWindow("Webstaurantstore (@webstaurantstore) Instagram..");
        System.out.println(driver.getTitle());
//        driver.findElement(By.xpath("//span[@aria-label='Close']")).click();
//        driver.findElement(By.xpath("//span[@class='rlFg3']")).click();
        switchToWindow("WebstaurantStore: Restaurant Supplies & Foodservice Equipment");
        Assert.assertEquals(driver.getTitle(),"WebstaurantStore: Restaurant Supplies & Foodservice Equipment");
    }

    @Test
    public void checkYouTubeLinks() throws InterruptedException {

        driver.get(ConfigReader.getProperty("url"));
        HomePage homePage = new HomePage();
        SeleniumUtils.scrollToElement(homePage.findYouTube);
        homePage.findYouTube.click();
        Thread.sleep(2000);
        switchToWindow("WebstaurantStore - YouTube");
        System.out.println(driver.getTitle());
        ProductsPage productsPage = new ProductsPage();
        SeleniumUtils.waitForClickablility(productsPage.findScrollButton,3);
        WebElement element = productsPage.findScrollButton;
        Actions actions = new Actions(driver);
        actions.moveToElement(element).sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_RIGHT).build().perform();
        SeleniumUtils.getScreenshot("YouTube");
        switchToWindow("WebstaurantStore: Restaurant Supplies & Foodservice Equipment");
        Assert.assertEquals(driver.getTitle(),"WebstaurantStore: Restaurant Supplies & Foodservice Equipment");
    }
}
