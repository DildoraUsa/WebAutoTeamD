package com.webAutoTeam.pages;

import com.webAutoTeam.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[.='Weekly Sales']")
    public WebElement findWeekSales;

    @FindBy(xpath = "//a[@href='/restaurant-storage-transport.html']")
    public WebElement findRestaurantStorageTransport;

    @FindBy(xpath = " //a[@href='/restaurant-equipment.html']" )
    public WebElement findRestaurantEquipment;

    @FindBy(xpath = "//a[.='About Us']")
    public WebElement findAboutUs;

    @FindBy(xpath = "//a[@href='https://www.facebook.com/WebstaurantStore']")
    public WebElement findFacebook;

    @FindBy(xpath = "//a[@href='https://twitter.com/Webstaurant']")
    public WebElement findTwitter;

    @FindBy(xpath = "//a[@href='https://www.instagram.com/WebstaurantStore/']")
    public WebElement findInstagram;

    @FindBy(xpath = "//a[@href='https://www.youtube.com/user/WebstaurantStore']")
    public WebElement findYouTube;
}

