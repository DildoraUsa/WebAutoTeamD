package com.webAutoTeam.tests;

import com.webAutoTeam.utilities.ConfigReader;
import com.webAutoTeam.utilities.SeleniumUtils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.webAutoTeam.utilities.SeleniumUtils.scroll;
import static com.webAutoTeam.utilities.SeleniumUtils.scrollToElement;

public class CheckAboutUsTests extends TestBase{
    @Test
    public void checkAboutUsButtonBoston() {

        driver.get(ConfigReader.getProperty("url"));
        SeleniumUtils.scroll(0,1000);
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
}
