package com.webAutoTeam.tests;

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

    @Test
    public void checkFacebookLinks() throws InterruptedException {

        driver.get(ConfigReader.getProperty("url"));
        SeleniumUtils.scrollToElement(driver.findElement(By.xpath("//a[@href='https://www.facebook.com/WebstaurantStore']")));
        driver.findElement(By.xpath("//a[@href='https://www.facebook.com/WebstaurantStore']")).click();
        Thread.sleep(1000);
        SeleniumUtils.switchToWindow("WebstaurantStore - Home | Facebook");
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("(//div[@class='bp9cbjyn rq0escxv j83agx80 pfnyh3mw frgo5egb l9j0dhe7 cb02d2ww hv4rvrfc dati1w0a'])[4]")).click();
        getScreenshot("FacebookScreenShot");
        switchToWindow("WebstaurantStore: Restaurant Supplies & Foodservice Equipment");
        Assert.assertEquals(driver.getTitle(),"WebstaurantStore: Restaurant Supplies & Foodservice Equipment");
    }

    @Test
    public void checkTwitterLinks() throws InterruptedException {

        driver.get(ConfigReader.getProperty("url"));
        scrollToElement(driver.findElement(By.xpath("//a[@href='https://twitter.com/Webstaurant']")));
        driver.findElement(By.xpath("//a[@href='https://twitter.com/Webstaurant']")).click();
        Thread.sleep(2000);
        switchToWindow("WebstaurantStore (@Webstaurant) / Twitter");
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//span[.='Tweets & replies']")).click();
        switchToWindow("WebstaurantStore: Restaurant Supplies & Foodservice Equipment");
        Assert.assertEquals(driver.getTitle(),"WebstaurantStore: Restaurant Supplies & Foodservice Equipment");
    }

    @Test
    public void checkInstagramLinks() throws InterruptedException {

        driver.get(ConfigReader.getProperty("url"));
        SeleniumUtils.scrollToElement(driver.findElement(By.xpath("//a[@href='https://www.instagram.com/WebstaurantStore/']")));
        driver.findElement(By.xpath("//a[@href='https://www.instagram.com/WebstaurantStore/']")).click();
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
        scrollToElement(driver.findElement(By.xpath("//a[@href='https://www.youtube.com/user/WebstaurantStore']")));
        driver.findElement(By.xpath("//a[@href='https://www.youtube.com/user/WebstaurantStore']")).click();
        Thread.sleep(2000);
        switchToWindow("WebstaurantStore - YouTube");
        System.out.println(driver.getTitle());
        waitForClickablility(driver.findElement(By.xpath("(//div[@class='ytp-scrubber-container'])[1]")),3);
        WebElement element = driver.findElement(By.xpath("(//div[@class='ytp-scrubber-container'])[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_RIGHT).build().perform();
        SeleniumUtils.getScreenshot("YouTube");
        switchToWindow("WebstaurantStore: Restaurant Supplies & Foodservice Equipment");
        Assert.assertEquals(driver.getTitle(),"WebstaurantStore: Restaurant Supplies & Foodservice Equipment");
    }
}
