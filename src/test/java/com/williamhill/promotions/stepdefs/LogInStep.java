package com.williamhill.promotions.stepdefs;

import com.williamhill.promotions.pages.LogIn;
import com.williamhill.promotions.utils.BaseTests;
import cucumber.api.java.en.And;

public class LogInStep {

    public LogInStep() {
        logIn = new LogIn(BaseTests.getWebDriver());
    }

    LogIn logIn;

    @And("^I type my username$")
    public void iTypeMyUsername() {
        logIn.iTypeMyUsername();
    }

    @And("^I type my password$")
    public void iTypeMyPassword() {
        logIn.iTypeMyPassword();
    }


}
