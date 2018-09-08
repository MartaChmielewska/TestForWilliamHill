package com.williamhill.promotions.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FooterLeftPanel extends Footer {

    public FooterLeftPanel(WebDriver webDriver) {
        super(webDriver);
    }

    public void iCheckLinksTitleLinkInLeftFooterPanelHaveCorrectUrlExpectedURL(String linkText, String url) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement waitElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(getTitleXPath(linkText))));
        WebElement element = driver.findElement(By.xpath(getTitleXPath(linkText)));
        Assert.assertEquals(url, element.getAttribute("href"));
    }

    private String getTitleXPath(String title) {
        return "//a[(@title='"+ title +"')]";
    }
}
