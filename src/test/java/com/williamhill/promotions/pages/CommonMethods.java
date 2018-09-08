package com.williamhill.promotions.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods extends HomePage {

    public CommonMethods(WebDriver webDriver) {
        super(webDriver);
    }

    public void iClickButton(String text) {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'"+ text +"') or (@value='"+ text +"')]")));
        driver.findElement(By.xpath("//*[contains(text(),'"+ text +"') or (@value='"+ text +"')]")).click();
    }
}
