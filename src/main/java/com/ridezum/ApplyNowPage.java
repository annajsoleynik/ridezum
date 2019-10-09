package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ApplyNowPage extends BasePage {
    public ApplyNowPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css="input[name=\"application_form[first_name]\"]")
    private WebElement firstNameField;
    @FindBy(css="input[name=\"application_form[last_name]\"]")
    private WebElement lastNameField;
    @FindBy(css="input[name=\"application_form[email]\"]")
    private WebElement emailField;
    @FindBy(css="input[name=\"application_form[phone_number]\"]")
    private WebElement phoneField;
    @FindBy(css=".main-menu__link")
    private List<WebElement> careersButton;
    @FindBy(css="#application_form_applicant_region")
    private WebElement selectAreaField;
    @FindBy(css=".help-block")
    private List<WebElement> text;
    @FindBy(css = "button[name=\"button\"]")
    private WebElement submitButton;



    public void inputFirstName(User user) {
        wait.until(ExpectedConditions.elementToBeClickable(firstNameField));
        firstNameField.sendKeys(user.getFirstName());
    }

    public void inputLastName(User user) {
        wait.until(ExpectedConditions.elementToBeClickable(lastNameField));
        lastNameField.sendKeys(user.getLastName());
    }

    public void inputEmail(User user) {
        wait.until(ExpectedConditions.elementToBeClickable(emailField));
        emailField.sendKeys(user.getEmail());
    }
    public void inputPhone(User user) {
        wait.until(ExpectedConditions.elementToBeClickable(phoneField));
        phoneField.sendKeys(user.getPhone());
    }



    public void clickCareersButton() {
        wait.until(ExpectedConditions.elementToBeClickable(careersButton.get(4)));
        careersButton.get(4).click();

    }

    public void selectArea(int i) {
        Select select = new Select(selectAreaField);
        select.selectByIndex(i);
    }

    public void selectAreaByName(String a) {
      Select select = new Select(selectAreaField);
      select.selectByVisibleText(a);



    }

    public void clickSubmitButton() {
        wait.until(ExpectedConditions.elementToBeClickable(submitButton));
        submitButton.click();
    }

    public String textVerification1() {
        wait.until(ExpectedConditions.elementToBeClickable(text.get(0)));
       return text.get(0).getText();
    }

    public String textVerification2() {
        wait.until(ExpectedConditions.elementToBeClickable(text.get(2)));
        return text.get(2).getText();
    }
    public String textVerification3() {
        wait.until(ExpectedConditions.elementToBeClickable(text.get(5)));
       return text.get(5).getText();
    }
    public String textVerification4() {
        wait.until(ExpectedConditions.elementToBeClickable(text.get(7)));
        return text.get(7).getText();
    }
}