package com.williamhill.promotions.stepdefs;

import com.williamhill.promotions.pages.Footer;
import com.williamhill.promotions.pages.FooterLeftPanel;
import com.williamhill.promotions.utils.BaseTests;
import cucumber.api.java.en.And;

public class FooterStep {

    Footer footer;
    FooterLeftPanel footerLeftPanel;

    public FooterStep() {
        footer = new Footer(BaseTests.getWebDriver());
        footerLeftPanel = new FooterLeftPanel(BaseTests.getWebDriver());
    }

    @And("^I check footer display$")
    public void iCheckFooterDisplay() {
        footer.iCheckFooterDisplay();
    }

    @And("^I check links (.*?) in left footer panel have correct url (.*?)$")
    public void iCheckLinksTitleLinkInLeftFooterPanelHaveCorrectUrlExpectedURL(String linkText, String url) {
        footerLeftPanel.iCheckLinksTitleLinkInLeftFooterPanelHaveCorrectUrlExpectedURL(linkText, url);
    }
}
