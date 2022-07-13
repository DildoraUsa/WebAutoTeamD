package com.webAutoTeam.pages;

import com.webAutoTeam.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    public SearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[.='Boston']")
    public WebElement searchBoston;

    @FindBy(xpath = "//a[.='Kansas City']")
    public WebElement searchKansasCity;


    @FindBy(xpath = "//a[.='New York City']" )
    public WebElement searchNewYorkCity;

    @FindBy(xpath = "(//div[@class='bp9cbjyn rq0escxv j83agx80 pfnyh3mw frgo5egb l9j0dhe7 cb02d2ww hv4rvrfc dati1w0a'])[4]")
    public WebElement searchPhoto;

    @FindBy(xpath = "//span[.='Tweets & replies']")
    public WebElement searchTweets;
}
