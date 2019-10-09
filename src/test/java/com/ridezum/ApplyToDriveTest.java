package com.ridezum;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class ApplyToDriveTest extends BaseTest {
    private HomePage homePage;
    private ApplyNowPage applyNowPage;

    @Test
    public void testApplyToDrive() throws InterruptedException {
        homePage = new HomePage(driver);
        applyNowPage = homePage.clickApplyToDriveButton();

        String actualResult = "Zumer, Become a Driver, Drivers for Kids | Zum";
        String expectedResult = applyNowPage.driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult);


        driver.switchTo().frame(driver.findElement(By.cssSelector(".iframe-container.m-banner-drive__iframe")));

        applyNowPage.inputFirstName(user);
        applyNowPage.inputLastName(user);
        applyNowPage.inputEmail(user);
        applyNowPage.inputPhone(user);
//        applyNowPage.selectArea(3);
        applyNowPage.selectAreaByName("California");
        Thread.sleep(3000);

        driver.switchTo().defaultContent();

        applyNowPage.clickCareersButton();


    }




}
