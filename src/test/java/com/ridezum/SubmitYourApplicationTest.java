package com.ridezum;

import org.junit.Assert;
import org.junit.Test;

public class SubmitYourApplicationTest extends BaseTest {

    private HomePage homePage;


    private CareersPage careersPage;
    private JobsLevelPage jobsLevelPage;
    private LeadPositionPage leadPositionPage;
    private SubmitYourApplicationPage submitYourApplicationPage;



    @Test
    public void testSubmitYourApplication() {
        homePage = new HomePage(driver);
        careersPage = homePage.clickCareersButton();
      //  You can switch between windows as below:
        // Store the current window handle
        String winHandleBefore = driver.getWindowHandle();


        // Perform the click operation that opens new window  
        jobsLevelPage = careersPage.clickViewJobsButton();



        // Switch to new window opened
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
          // Perform the actions on new window
        leadPositionPage = jobsLevelPage.clickApplyButton();
        submitYourApplicationPage = leadPositionPage.clickApplyForThisJobButton();


      


       submitYourApplicationPage.inputFullName(user);
       submitYourApplicationPage.inputEmail(user);
       submitYourApplicationPage.inputPhone(user);
       submitYourApplicationPage.inputLinkedInURL(user);
       submitYourApplicationPage.inputPortfolioURL(user);
       submitYourApplicationPage.inputAdditionalInformation(user);
       submitYourApplicationPage.selectGender("Female");
       submitYourApplicationPage.selectRace("White (Not Hispanic or Latino)");
       submitYourApplicationPage.selectVeteranStatus("I am not a veteran");
       submitYourApplicationPage.clickSubmitApplicationButton();

  
       String actualResult = submitYourApplicationPage.getErrorMessage();
       Assert.assertEquals("✱ Please attach a resume", actualResult);

    }
}