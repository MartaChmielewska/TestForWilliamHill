package com.williamhill.promotions.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage {

    public HomePage(WebDriver webDriver) {
        driver = webDriver;
    }

    protected static WebDriver driver;

    protected String hreflink;


    public String getHreflink() {
        return hreflink;
    }

    public void iAmOnWilliamHillPromotionsWebsite() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.navigate().to("http://promotions.williamhill.com/");
        wait.until(ExpectedConditions.jsReturnsValue("return document.readyState==\"complete\";"));
        Assert.assertEquals("William Hill Promotions", driver.getTitle());
    }

    public void iClickOnSecondPromotion() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("login-form")));
        WebElement element = driver.findElement(By.xpath("(//li[(@class='ng-scope')][2]/a[(@class='wf-splash-grid__single-link')])"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//li[(@class='ng-scope')][2]/a[(@class='wf-splash-grid__single-link')])")));
        hreflink = element.getAttribute("href");
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
    }

    public void iCheckIAmOnCorrectPage() {
        String url = driver.getCurrentUrl();
        Assert.assertEquals(getHreflink(), url);
    }

    public void iLogOut() {
        driver.findElement(By.id("balance-button")).click();
        driver.findElement(By.id("logout")).click();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-button")));
    }
}
