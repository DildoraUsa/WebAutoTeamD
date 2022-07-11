package com.webAutoTeam.tests;

import com.webAutoTeam.utilities.Driver;
import com.webAutoTeam.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {


    public WebDriver driver;


    @BeforeMethod(alwaysRun = true)
    public void setupMethod(){


        driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

    }


    @AfterMethod(alwaysRun = true)
    public void tearDownMethod(){

        Driver.quitDriver();

    }

}
