package com.williamhill.promotions.stepdefs;

import com.williamhill.promotions.pages.CommonMethods;
import com.williamhill.promotions.utils.BaseTests;
import cucumber.api.java.en.When;

public class CommonStep {

    CommonMethods commonMethods;

    public CommonStep() {
        commonMethods = new CommonMethods(BaseTests.getWebDriver());
    }

    @When("^I click \"([^\"]*)\" button$")
    public void iClickButton(String text) {
        commonMethods.iClickButton(text);
    }
}
