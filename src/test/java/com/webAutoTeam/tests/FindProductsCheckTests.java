package com.webAutoTeam.tests;

import com.webAutoTeam.pages.HomePage;
import com.webAutoTeam.pages.ProductsPage;
import com.webAutoTeam.utilities.ConfigReader;
import com.webAutoTeam.utilities.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FindProductsCheckTests extends TestBase {

    @Test
    public void findAndSortByNewest() throws InterruptedException {
        driver.get(ConfigReader.getProperty("url"));
        HomePage homePage = new HomePage();
        SeleniumUtils.scrollToElement(homePage.findWeekSales);
        homePage.findWeekSales.click();
        ProductsPage productsPage = new ProductsPage();
        Select selectSort = new Select(productsPage.clickOnSortButton);
        Thread.sleep(1000);
        selectSort.selectByVisibleText("Date Added: Newest first");
        productsPage.addToCart.click();
        SeleniumUtils.getScreenshot("NewestSort");
        productsPage.backToHomePage.click();
        Assert.assertEquals(driver.getTitle(),"WebstaurantStore: Restaurant Supplies & Foodservice Equipment");
    }
    @Test
    public void findAndFilterByQuickShipping() throws InterruptedException {
        driver.get(ConfigReader.getProperty("url"));
        HomePage homePage = new HomePage();
        SeleniumUtils.scrollToElement(homePage.findWeekSales);
        homePage.findWeekSales.click();
        ProductsPage productsPage = new ProductsPage();
        Select selectSort = new Select(productsPage.clickOnSortButton);
        selectSort.selectByVisibleText("Date Added: Newest first");
        Thread.sleep(1000);
        productsPage.filterByRestaurantSitting.click();
        productsPage.filterByQuickShipping.click();
        SeleniumUtils.getScreenshot("NewestSort");
         productsPage.backToHomePage.click();
        Assert.assertEquals(driver.getTitle(),"WebstaurantStore: Restaurant Supplies & Foodservice Equipment");
    }

    @Test(groups = {"smoke"})
    public void findAndFilterByHighPriceAddToCart() throws InterruptedException {
        driver.get(ConfigReader.getProperty("url"));
        HomePage homePage = new HomePage();
        SeleniumUtils.scrollToElement(homePage.findWeekSales);
        homePage.findWeekSales.click();
        ProductsPage productsPage = new ProductsPage();
        Select selectSort = new Select(productsPage.clickOnSortButton);
        Thread.sleep(1000);
        selectSort.selectByVisibleText("Price: High to Low ");
        Thread.sleep(1000);
        productsPage.filterByRestaurantSitting.click();
        productsPage.addToCart.click();
        SeleniumUtils.getScreenshot("HighestPriceProduct");
        productsPage.backToHomePage.sendKeys(Keys.ENTER);
        Assert.assertEquals(driver.getTitle(),"WebstaurantStore: Restaurant Supplies & Foodservice Equipment");
    }

    @Test
    public void findAndFilterByPrice() throws InterruptedException {
        driver.get(ConfigReader.getProperty("url"));
        HomePage homePage = new HomePage();
        SeleniumUtils.scrollToElement(homePage.findWeekSales);
        homePage.findWeekSales.click();
        ProductsPage productsPage = new ProductsPage();
        SeleniumUtils.scrollToElement(productsPage.filterBy$70To$100);
        Thread.sleep(2000);
        productsPage.filterBy$70To$100.click();
        SeleniumUtils.scrollToElement(productsPage.filterByRectangleShape);
        Thread.sleep(2000);
        productsPage.filterByRectangleShape.click();
        Select selectSort = new Select(productsPage.clickOnSortButton);
        Thread.sleep(1000);
        selectSort.selectByVisibleText("Price: High to Low ");
        productsPage.addToCart.click();
        SeleniumUtils.getScreenshot("Shape");
        productsPage.backToHomePage.sendKeys(Keys.ENTER);
        Assert.assertEquals(driver.getTitle(),"WebstaurantStore: Restaurant Supplies & Foodservice Equipment");
    }

    @Test
    public void findAndFilterByColor() throws InterruptedException {
        driver.get(ConfigReader.getProperty("url"));
        HomePage homePage = new HomePage();
        homePage.findRestaurantStorageTransport.click();
        Thread.sleep(1000);
        ProductsPage productsPage = new ProductsPage();
        SeleniumUtils.scrollToElement(productsPage.findFoodStorage);
         productsPage.findFoodStorage.click();
        SeleniumUtils.scrollToElement(productsPage.filterByBrandOXO);
        SeleniumUtils.waitForClickablility(productsPage.filterByBrandOXO,3);
        productsPage.filterByBrandOXO.click();
        SeleniumUtils.scrollToElement(productsPage.filterByGreenColor);
        Thread.sleep(1000);
        productsPage.filterByGreenColor.click();
        productsPage.backToHomePage.sendKeys(Keys.ENTER);
        Assert.assertEquals(driver.getTitle(),"WebstaurantStore: Restaurant Supplies & Foodservice Equipment");
    }

    @Test
    public void findAndFilterByPlastic() throws InterruptedException {
        driver.get(ConfigReader.getProperty("url"));
        HomePage homePage = new HomePage();
        homePage.findRestaurantStorageTransport.click();
        Thread.sleep(1000);
        SeleniumUtils.scrollToElement(driver.findElement(By.xpath("(//div[@data-testid='displayCategories'])[4]")));
        driver.findElement(By.xpath("(//div[@data-testid='displayCategories'])[4]")).click();
        driver.findElement(By.xpath("(//div[@data-testid='displayCategories'])[1]")).click();
        ProductsPage productsPage = new ProductsPage();
        SeleniumUtils.scrollToElement(driver.findElement(By.xpath("(//div[@class='list-check rounded-full border-solid border cursor-pointer float-left m-0 overflow-hidden pt-full relative shadow-none w-full transition-all ease-in-check duration-1100 xs:rounded bg-white border-gray-350'])[14]")));
        driver.findElement(By.xpath("(//div[@class='list-check rounded-full border-solid border cursor-pointer float-left m-0 overflow-hidden pt-full relative shadow-none w-full transition-all ease-in-check duration-1100 xs:rounded bg-white border-gray-350'])[14]")).click();
        Select selectSort = new Select(productsPage.clickOnSortButton);
        Thread.sleep(2000);
        selectSort.selectByVisibleText("Price: High to Low ");
        productsPage.backToHomePage.sendKeys(Keys.ENTER);
        Assert.assertEquals(driver.getTitle(),"WebstaurantStore: Restaurant Supplies & Foodservice Equipment");


    }

    @Test
    public void findAndFilterByControl() throws InterruptedException {
        driver.get(ConfigReader.getProperty("url"));
        HomePage homePage = new HomePage();
        homePage.findRestaurantEquipment.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[@data-testid='displayCategories'])[1]")).click();
        SeleniumUtils.scrollToElement( driver.findElement(By.xpath("(//div[@data-testid='displayCategories'])[5]")));
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[@data-testid='displayCategories'])[5]")).click();
        SeleniumUtils.scrollToElement(driver.findElement(By.xpath("(//div[@class='list-check rounded-full border-solid border cursor-pointer float-left m-0 overflow-hidden pt-full relative shadow-none w-full transition-all ease-in-check duration-1100 xs:rounded bg-white border-gray-350'])[53]")));
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[@class='list-check rounded-full border-solid border cursor-pointer float-left m-0 overflow-hidden pt-full relative shadow-none w-full transition-all ease-in-check duration-1100 xs:rounded bg-white border-gray-350'])[53]")).click();
      ProductsPage productsPage = new ProductsPage();
        Select selectSort = new Select(productsPage.clickOnSortButton);
        Thread.sleep(2000);
        selectSort.selectByVisibleText("Price: High to Low ");
        productsPage.addToCart.click();
        Thread.sleep(1000);
        SeleniumUtils.getScreenshot("SortByControl");

    }

    @Test
    public void findAndFilterByShippingAndBrand() throws InterruptedException {
        driver.get(ConfigReader.getProperty("url"));
        HomePage homePage = new HomePage();
        homePage.findRestaurantEquipment.click();
        Thread.sleep(1000);
        ProductsPage productsPage = new ProductsPage();
        productsPage.findCommercialWorksTable.click();
        productsPage.findMixerTables.click();
        SeleniumUtils.scrollToElement(productsPage.filterByQuickShipping);
        productsPage.filterByQuickShipping.click();
        driver.findElement(By.xpath("(//div[@class='list-check rounded-full border-solid border cursor-pointer float-left m-0 overflow-hidden pt-full relative shadow-none w-full transition-all ease-in-check duration-1100 xs:rounded bg-white border-gray-350'])[4]")).click();
        productsPage.addToCart.click();
        productsPage.backToHomePage.sendKeys(Keys.ENTER);
        Assert.assertEquals(driver.getTitle(),"WebstaurantStore: Restaurant Supplies & Foodservice Equipment");
    }



}
