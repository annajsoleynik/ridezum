package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SubmitYourApplicationPage extends BasePage {
    public SubmitYourApplicationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="input[name=\"name\"]")
    private WebElement fullName;
    @FindBy(css="input[name=\" email\"\"]")
    private WebElement email;
    @FindBy(css="input[name=\"phone \"]")
    private WebElement phone;
    @FindBy(css="input[name=\"org \"]")
    private WebElement company;
    @FindBy(css="input[name=\" urls[LinkedIn]\"]")
    private WebElement linkedInURL;
    @FindBy(css="input[name=\"urls[Portfolio]\"]")
    private WebElement portfolioURL;
    @FindBy(css="textarea[name=\" comments\"]")
    private WebElement additionalInformation;
    @FindBy(css="select[name=\"eeo[gender]\"]")
    private WebElement gender;
    @FindBy(css="select[name=\"eeo[race]\"]")
    private WebElement race;
    @FindBy(css="select[name=\"eeo[veteran]\"]")
    private WebElement veteranStatus;
    @FindBy(css=".postings-btn.template-btn-submit.hex-color")
    private  WebElement submitApplicationButton;
    @FindBy(css=".error-message")
    private List<WebElement> errorMessage;


    public void inputFullName(User user) {
        wait.until(ExpectedConditions.visibilityOf(fullName));
        fullName.sendKeys(user.getFullName());
    }

    public void inputEmail(User user) {
        wait.until(ExpectedConditions.visibilityOf(email));
        email.sendKeys(user.getEmail());
    }
    public void inputPhone(User user) {
        wait.until(ExpectedConditions.visibilityOf(phone));
        phone.sendKeys(user.getPhone());
    }

    public void inputCompany (User user) {
        wait.until(ExpectedConditions.visibilityOf(company));
        company.sendKeys(user.getCompany());
    }

    public void inputLinkedInURL(User user) {
        wait.until(ExpectedConditions.visibilityOf(linkedInURL));
        linkedInURL.sendKeys(user.getLinkedInURL());
    }

    public void inputPortfolioURL(User user) {
        wait.until(ExpectedConditions.visibilityOf(portfolioURL));
        portfolioURL.sendKeys(user.getPortfolioURL());
    }

    public void inputAdditionalInformation(User user) {
        wait.until(ExpectedConditions.visibilityOf(additionalInformation));
        additionalInformation.sendKeys(user.getAdditionalInformation());
    }

    public void selectGender(String a) {
        wait.until(ExpectedConditions.elementToBeClickable(gender));
        Select select = new Select(gender);
        select.selectByVisibleText(a);
    }

    public void selectRace(String a) {
        wait.until(ExpectedConditions.elementToBeClickable(race));
        Select select = new Select(race);
        select.selectByVisibleText(a);
    }


    public void selectVeteranStatus(String a) {
        wait.until(ExpectedConditions.elementToBeClickable(veteranStatus));
        Select select = new Select(veteranStatus);
        select.selectByVisibleText(a);
    }

    public void clickSubmitApplicationButton() {
        wait.until(ExpectedConditions.elementToBeClickable(submitApplicationButton));
        submitApplicationButton.click();
    }
    public String getErrorMessage() {
        wait.until(ExpectedConditions.visibilityOf(errorMessage.get(0)));
        return errorMessage.get(0).getText();
    }
}
