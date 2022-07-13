package com.webAutoTeam.tests;

import com.webAutoTeam.utilities.ConfigReader;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.webAutoTeam.utilities.SeleniumUtils.*;

public class AppButtonsCheckTests extends TestBase{
    // driver.get(ConfigReader.getProperty("url"));

    @Test
     public void checkAboutUsButtonBoston() {

        driver.get(ConfigReader.getProperty("url"));
        scroll(0,1000);
        driver.findElement(By.xpath("//a[.='About Us']")).click();
        scrollToElement(driver.findElement(By.xpath("//a[.='Boston']")));
        driver.findElement(By.xpath("//a[.='Boston']")).click();
        System.out.println(driver.getTitle());

    }

    @Test
    public void checkAboutUsButtonKansasCity() {

        driver.get(ConfigReader.getProperty("url"));
        scroll(0,1000);
        driver.findElement(By.xpath("//a[.='About Us']")).click();
        scrollToElement(driver.findElement(By.xpath("//a[.='Kansas City']")));
        driver.findElement(By.xpath("//a[.='Kansas City']")).click();
        System.out.println(driver.getTitle());

    }

    @Test
    public void checkAboutUsButtonNewYorkCity() {

        driver.get(ConfigReader.getProperty("url"));
        scroll(0,1000);
        driver.findElement(By.xpath("//a[.='About Us']")).click();
        scrollToElement(driver.findElement(By.xpath("//a[.='New York City']")));
        driver.findElement(By.xpath("//a[.='New York City']")).click();
        System.out.println(driver.getTitle());

    }

    @Test
    public void checkFacebookLinks() throws InterruptedException {

        driver.get(ConfigReader.getProperty("url"));
        scrollToElement(driver.findElement(By.xpath("//a[@href='https://www.facebook.com/WebstaurantStore']")));
        driver.findElement(By.xpath("//a[@href='https://www.facebook.com/WebstaurantStore']")).click();
        Thread.sleep(1000);
        switchToWindow("WebstaurantStore - Home | Facebook");

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
        scrollToElement(driver.findElement(By.xpath("//a[@href='https://www.instagram.com/WebstaurantStore/']")));
        driver.findElement(By.xpath("//a[@href='https://www.instagram.com/WebstaurantStore/']")).click();
        Thread.sleep(2000);
        switchToWindow("Login Instagram");
        System.out.println(driver.getTitle());
//        driver.findElement(By.xpath("//span[@aria-label='Close']")).click();
//        driver.findElement(By.xpath("//span[@class='rlFg3']")).click();
        switchToWindow("WebstaurantStore: Restaurant Supplies & Foodservice Equipment");
        Assert.assertEquals(driver.getTitle(),"WebstaurantStore: Restaurant Supplies & Foodservice Equipment");
    }
}
