package com.williamhill.promotions.stepdefs;

import com.williamhill.promotions.pages.HomePage;
import com.williamhill.promotions.utils.BaseTests;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class HomePageStep {

    HomePage homePage;

    public HomePageStep() {
        homePage = new HomePage(BaseTests.getWebDriver());
    }

    @Given("^I am on William Hill promotions website$")
    public void iAmOnWilliamHillPromotionsWebsite() {
        homePage.iAmOnWilliamHillPromotionsWebsite();
    }

    @And("^I click on second promotion$")
    public void iClickOnSecondPromotion() {
        homePage.iClickOnSecondPromotion();
    }

    @And("^I check I am on correct page$")
    public void iCheckIAmOnCorrectPage() {
        homePage.iCheckIAmOnCorrectPage();
    }

    @And("^I log out$")
    public void iLogOut() {
        homePage.iLogOut();
    }
}
