package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class LeadPositionPage extends BasePage {
    public LeadPositionPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css=".postings-btn.template-btn-submit.hex-color")
    private List<WebElement> applyForThisJobButton;

    public SubmitYourApplicationPage clickApplyForThisJobButton() {
        wait.until(ExpectedConditions.elementToBeClickable(applyForThisJobButton.get(0)));
        applyForThisJobButton.get(0).click();
        return new SubmitYourApplicationPage(driver);
    }
}
