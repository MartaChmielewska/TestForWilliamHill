package com.williamhill.promotions.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogIn extends HomePage {

    private static final String  USERNAME_ID = "username";
    private static final String PASSWORD_ID = "password";
    protected final String USERNAME = "JaroslawKaczka";
    protected final String PASSWORD = "Niewiemco90";

    public LogIn(WebDriver webDriver) {
        super(webDriver);
    }

    public void iTypeMyUsername() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(USERNAME_ID)));
        driver.findElement(By.id(USERNAME_ID)).sendKeys(USERNAME);
    }

    public void iTypeMyPassword() {
        driver.findElement(By.id(PASSWORD_ID)).sendKeys(PASSWORD);
    }
}
