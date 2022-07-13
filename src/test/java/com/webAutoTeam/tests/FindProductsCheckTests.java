package com.webAutoTeam.tests;

import com.webAutoTeam.utilities.ConfigReader;
import com.webAutoTeam.utilities.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FindProductsCheckTests extends TestBase {

    @Test
    public void findAndSortByNewest(){
        driver.get(ConfigReader.getProperty("url"));
        SeleniumUtils.scrollToElement(driver.findElement(By.xpath("//a[.='Weekly Sales']")));
        driver.findElement(By.xpath("//a[.='Weekly Sales']")).click();
        Select selectSort = new Select(driver.findElement(By.xpath("//select[@id='sort_options']")));
        selectSort.selectByVisibleText("Date Added: Newest first");
        driver.findElement(By.xpath("(//input[@data-testid='itemAddCart'])[1]")).click();
        SeleniumUtils.getScreenshot("NewestSort");
        driver.findElement(By.xpath("//a[@aria-label='WebstaurantStore']")).sendKeys(Keys.ENTER);
        Assert.assertEquals(driver.getTitle(),"WebstaurantStore: Restaurant Supplies & Foodservice Equipment");
    }
    @Test
    public void findAndFilterByQuickShipping() throws InterruptedException {
        driver.get(ConfigReader.getProperty("url"));
        SeleniumUtils.scrollToElement(driver.findElement(By.xpath("//a[.='Weekly Sales']")));
        driver.findElement(By.xpath("//a[.='Weekly Sales']")).click();
        Select selectSort = new Select(driver.findElement(By.xpath("//select[@id='sort_options']")));
        selectSort.selectByVisibleText("Date Added: Newest first");
        driver.findElement(By.xpath("//a[@href='/specials.html?order=date_desc&category=45771']")).click();
        // SeleniumUtils.scrollToElement(driver.findElement(By.xpath("")));
        driver.findElement(By.xpath("(//div[@class='list-check rounded-full border-solid border cursor-pointer float-left m-0 overflow-hidden pt-full relative shadow-none w-full transition-all ease-in-check duration-1100 xs:rounded bg-white border-gray-350'])[2]")).click();
        SeleniumUtils.getScreenshot("NewestSort");
        driver.findElement(By.xpath("//a[@aria-label='WebstaurantStore']")).sendKeys(Keys.ENTER);
        Assert.assertEquals(driver.getTitle(),"WebstaurantStore: Restaurant Supplies & Foodservice Equipment");
    }

    @Test
    public void findAndFilterByHighPriceAddToCart() throws InterruptedException {
        driver.get(ConfigReader.getProperty("url"));
        SeleniumUtils.scrollToElement(driver.findElement(By.xpath("//a[.='Weekly Sales']")));
        driver.findElement(By.xpath("//a[.='Weekly Sales']")).click();
        Select selectSort = new Select(driver.findElement(By.xpath("//select[@id='sort_options']")));
        Thread.sleep(2000);
        selectSort.selectByVisibleText("Price: High to Low ");
        driver.findElement(By.xpath("//span[.='Restaurant Seating']")).click();
        // SeleniumUtils.scrollToElement(driver.findElement(By.xpath("")));
        driver.findElement(By.xpath("(//input[@name='addToCartButton'])[1]")).click();
        SeleniumUtils.getScreenshot("HighestPriceProduct");
        driver.findElement(By.xpath("//a[@aria-label='WebstaurantStore']")).sendKeys(Keys.ENTER);
        Assert.assertEquals(driver.getTitle(),"WebstaurantStore: Restaurant Supplies & Foodservice Equipment");
    }

    @Test
    public void findAndFilterByPrice() throws InterruptedException {
        driver.get(ConfigReader.getProperty("url"));
        SeleniumUtils.scrollToElement(driver.findElement(By.xpath("//a[.='Weekly Sales']")));
        driver.findElement(By.xpath("//a[.='Weekly Sales']")).click();
        SeleniumUtils.scrollToElement(driver.findElement(By.xpath("//span[.='$70 to $100']")));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[.='$70 to $100']")).click();
        SeleniumUtils.scrollToElement(driver.findElement(By.xpath("//span[.='Rectangle']")));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[.='Rectangle']")).click();
        Select selectSort = new Select(driver.findElement(By.xpath("//select[@id='sort_options']")));
        Thread.sleep(2000);
        selectSort.selectByVisibleText("Price: High to Low ");
        driver.findElement(By.xpath("(//input[@name='addToCartButton'])[1]")).click();
        SeleniumUtils.getScreenshot("Shape");
        driver.findElement(By.xpath("//a[@aria-label='WebstaurantStore']")).sendKeys(Keys.ENTER);
        Assert.assertEquals(driver.getTitle(),"WebstaurantStore: Restaurant Supplies & Foodservice Equipment");
    }

    @Test
    public void findAndFilterByColor() throws InterruptedException {
        driver.get(ConfigReader.getProperty("url"));
        driver.findElement(By.xpath("//a[@href='/restaurant-storage-transport.html']")).click();
        Thread.sleep(1000);
        SeleniumUtils.scrollToElement(driver.findElement(By.xpath("(//div[@class='grid-featured__name'])[1]")));
        driver.findElement(By.xpath("(//div[@class='grid-featured__name'])[1]")).click();
        SeleniumUtils.scrollToElement(driver.findElement(By.xpath("//span[.='OXO']")));
        driver.findElement(By.xpath("//span[.='OXO']")).click();
        SeleniumUtils.scrollToElement(driver.findElement(By.xpath("//img[@src='//cdnimg.webstaurantstore.com/uploads/seo_category_toppers/2015/5/colorgreen.jpg']")));
        driver.findElement(By.xpath("//img[@alt='Green']")).click();
        driver.findElement(By.xpath("//a[@aria-label='WebstaurantStore']")).sendKeys(Keys.ENTER);
        Assert.assertEquals(driver.getTitle(),"WebstaurantStore: Restaurant Supplies & Foodservice Equipment");
    }

    @Test
    public void findAndFilterByPlastic() throws InterruptedException {
        driver.get(ConfigReader.getProperty("url"));
        driver.findElement(By.xpath("//a[@href='/restaurant-storage-transport.html']")).click();
        Thread.sleep(1000);
        SeleniumUtils.scrollToElement(driver.findElement(By.xpath("(//div[@data-testid='displayCategories'])[4]")));
        driver.findElement(By.xpath("(//div[@data-testid='displayCategories'])[4]")).click();
        driver.findElement(By.xpath("(//div[@data-testid='displayCategories'])[1]")).click();
        SeleniumUtils.scrollToElement(driver.findElement(By.xpath("(//div[@class='list-check rounded-full border-solid border cursor-pointer float-left m-0 overflow-hidden pt-full relative shadow-none w-full transition-all ease-in-check duration-1100 xs:rounded bg-white border-gray-350'])[14]")));
        driver.findElement(By.xpath("(//div[@class='list-check rounded-full border-solid border cursor-pointer float-left m-0 overflow-hidden pt-full relative shadow-none w-full transition-all ease-in-check duration-1100 xs:rounded bg-white border-gray-350'])[14]")).click();
        Select selectSort = new Select(driver.findElement(By.xpath("//select[@id='sort_options']")));
        Thread.sleep(2000);
        selectSort.selectByVisibleText("Price: High to Low ");
        driver.findElement(By.xpath("//a[@aria-label='WebstaurantStore']")).sendKeys(Keys.ENTER);
        Assert.assertEquals(driver.getTitle(),"WebstaurantStore: Restaurant Supplies & Foodservice Equipment");


    }

    @Test
    public void findAndFilterByControl() throws InterruptedException {
        driver.get(ConfigReader.getProperty("url"));
        driver.findElement(By.xpath(" //a[@href='/restaurant-equipment.html']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[@data-testid='displayCategories'])[1]")).click();
        SeleniumUtils.scrollToElement( driver.findElement(By.xpath("(//div[@data-testid='displayCategories'])[5]")));
        driver.findElement(By.xpath("(//div[@data-testid='displayCategories'])[5]")).click();
        SeleniumUtils.scrollToElement(driver.findElement(By.xpath("(//div[@class='list-check rounded-full border-solid border cursor-pointer float-left m-0 overflow-hidden pt-full relative shadow-none w-full transition-all ease-in-check duration-1100 xs:rounded bg-white border-gray-350'])[53]")));
        driver.findElement(By.xpath("(//div[@class='list-check rounded-full border-solid border cursor-pointer float-left m-0 overflow-hidden pt-full relative shadow-none w-full transition-all ease-in-check duration-1100 xs:rounded bg-white border-gray-350'])[53]")).click();
        Select selectSort = new Select(driver.findElement(By.xpath("//select[@id='sort_options']")));
        Thread.sleep(2000);
        selectSort.selectByVisibleText("Price: High to Low ");
        driver.findElement(By.xpath("(//input[@name='addToCartButton'])[1]")).click();
        Thread.sleep(1000);
        SeleniumUtils.getScreenshot("SortByControl");

    }

    @Test
    public void findAndFilterByShippingAndBrand() throws InterruptedException {
        driver.get(ConfigReader.getProperty("url"));
        driver.findElement(By.xpath(" //a[@href='/restaurant-equipment.html']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[@data-testid='displayCategories'])[3]")).click();
        driver.findElement(By.xpath("(//div[@data-testid='displayCategories'])[4]")).click();
        SeleniumUtils.scrollToElement(driver.findElement(By.xpath("(//div[@class='list-check rounded-full border-solid border cursor-pointer float-left m-0 overflow-hidden pt-full relative shadow-none w-full transition-all ease-in-check duration-1100 xs:rounded bg-white border-gray-350'])[2]")));
        driver.findElement(By.xpath("(//div[@class='list-check rounded-full border-solid border cursor-pointer float-left m-0 overflow-hidden pt-full relative shadow-none w-full transition-all ease-in-check duration-1100 xs:rounded bg-white border-gray-350'])[2]")).click();
        driver.findElement(By.xpath("(//div[@class='list-check rounded-full border-solid border cursor-pointer float-left m-0 overflow-hidden pt-full relative shadow-none w-full transition-all ease-in-check duration-1100 xs:rounded bg-white border-gray-350'])[4]")).click();
        driver.findElement(By.xpath("(//input[@name='addToCartButton'])[1]")).click();
        driver.findElement(By.xpath("//a[@aria-label='WebstaurantStore']")).sendKeys(Keys.ENTER);
        Assert.assertEquals(driver.getTitle(),"WebstaurantStore: Restaurant Supplies & Foodservice Equipment");
    }



}
