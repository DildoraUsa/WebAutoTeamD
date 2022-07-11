package com.webAutoTeam.tests;

import com.webAutoTeam.utilities.ConfigReader;
import org.openqa.selenium.By;
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
    public void checkFacebookLinks(){

        driver.get(ConfigReader.getProperty("url"));
        scrollToElement(driver.findElement(By.xpath("//a[@href='https://www.facebook.com/WebstaurantStore']")));
        driver.findElement(By.xpath("//a[@href='https://www.facebook.com/WebstaurantStore']")).click();
        switchToWindow("WebstaurantStore - Home | Facebook");

        System.out.println(driver.getTitle());
      //  driver.findElement(By.xpath("(//div[@class='bp9cbjyn rq0escxv j83agx80 pfnyh3mw frgo5egb l9j0dhe7 cb02d2ww hv4rvrfc dati1w0a'])[4]")).click();
    }

    @Test
    public void checkTwitterLinks(){

        driver.get(ConfigReader.getProperty("url"));
        scrollToElement(driver.findElement(By.xpath("//a[@href='https://www.facebook.com/WebstaurantStore']")));
        driver.findElement(By.xpath("//a[@href='https://www.facebook.com/WebstaurantStore']")).click();
        switchToWindow("WebstaurantStore - Home | Facebook");
        System.out.println(driver.getTitle());
       // waitForVisibility(By.xpath("(//div[@class='bp9cbjyn rq0escxv j83agx80 pfnyh3mw frgo5egb l9j0dhe7 cb02d2ww hv4rvrfc dati1w0a'])[4]"),3);
        driver.findElement(By.xpath("(//div[@class='bp9cbjyn rq0escxv j83agx80 pfnyh3mw frgo5egb l9j0dhe7 cb02d2ww hv4rvrfc dati1w0a'])[4]")).click();
        driver.quit();
       // switchToWindow("WebstaurantStore: Restaurant Supplies & Foodservice Equipment");
        System.out.println(driver.getTitle());
    }
}
