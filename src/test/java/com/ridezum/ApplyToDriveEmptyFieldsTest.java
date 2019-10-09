package com.ridezum;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class ApplyToDriveEmptyFieldsTest extends BaseTest {

    private HomePage homePage;
    private ApplyNowPage applyNowPage;

    @Test
    public void testApplyToDreiveEmptyFields() {

        homePage = new HomePage(driver);
        applyNowPage = homePage.clickApplyToDriveButton();




        driver.switchTo().frame(driver.findElement(By.cssSelector(".iframe-container.m-banner-drive__iframe")));
        applyNowPage.clickSubmitButton();



        String expectedText = "Please enter a value";
        String actualResult = applyNowPage.textVerification1();
        Assert.assertEquals(expectedText, actualResult);

        Assert.assertEquals(expectedText, applyNowPage.textVerification2());
        Assert.assertEquals(expectedText, applyNowPage.textVerification3());
        Assert.assertEquals(expectedText,  applyNowPage.textVerification4());

    }
}
