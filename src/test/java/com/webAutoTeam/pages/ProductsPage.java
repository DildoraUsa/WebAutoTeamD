package com.webAutoTeam.pages;

import com.webAutoTeam.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

    public ProductsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//input[@data-testid='itemAddCart'])[1]")
    public WebElement addToCart;

    @FindBy(xpath = "//a[@aria-label='WebstaurantStore']")
    public WebElement backToHomePage;

    @FindBy(xpath = "//span[.='Restaurant Seating']")
    public WebElement filterByRestaurantSitting;

    @FindBy(xpath = "(//div[@class='list-check rounded-full border-solid border cursor-pointer float-left m-0 overflow-hidden pt-full relative shadow-none w-full transition-all ease-in-check duration-1100 xs:rounded bg-white border-gray-350'])[2]")
    public WebElement filterByQuickShipping;

    @FindBy(xpath = "//select[@id='sort_options']")
     public WebElement clickOnSortButton;

   @FindBy(xpath ="(//div[@data-testid='displayCategories'])[3]" )
    public WebElement findCommercialWorksTable;

  @FindBy(xpath = "(//div[@data-testid='displayCategories'])[4]")
    public WebElement findMixerTables;

  @FindBy(xpath = "(//div[@class='ytp-scrubber-container'])[1]")
    public WebElement findScrollButton;

  @FindBy(xpath = "//span[.='$70 to $100']")
    public WebElement filterBy$70To$100;

  @FindBy(xpath = "//span[.='Rectangle']")
    public WebElement filterByRectangleShape;

  @FindBy(xpath = "//img[@src='//cdnimg.webstaurantstore.com/uploads/seo_category_toppers/2015/5/colorgreen.jpg']")
    public WebElement filterByGreenColor;

  @FindBy(xpath = "//span[.='OXO']")
    public WebElement filterByBrandOXO;

  @FindBy(xpath = "(//div[@class='grid-featured__name'])[1]")
    public WebElement findFoodStorage;
}
