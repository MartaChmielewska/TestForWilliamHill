package com.williamhill.promotions.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Footer {

    protected static WebDriver driver;
    private static final String FOOTER = "//div[(@class='wf-footer__wrapper')]";

    public Footer(WebDriver webDriver) {
        driver = webDriver;
    }

    public void iCheckFooterDisplay() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.jsReturnsValue("return document.readyState==\"complete\";"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(FOOTER)));
        WebElement footer = driver.findElement(By.xpath(FOOTER));
        Assert.assertTrue(footer.isDisplayed());
    }
}
