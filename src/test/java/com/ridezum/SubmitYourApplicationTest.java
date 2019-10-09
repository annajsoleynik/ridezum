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
        HomePage homePage = new HomePage(driver);
        careersPage = homePage.clickCareersButton();
        jobsLevelPage = careersPage.clickViewJobsButton();
        leadPositionPage = jobsLevelPage.clickApplyButton();
        submitYourApplicationPage = leadPositionPage.clickApplyForThisJobButton();


       homePage.clickCareersButton();
       careersPage.clickViewJobsButton();
       jobsLevelPage.clickApplyButton();
       leadPositionPage.clickApplyForThisJobButton();


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

       submitYourApplicationPage.getErrorMessage();
       String actualResult = submitYourApplicationPage.getErrorMessage();
       Assert.assertEquals("✱ Please attach a resume", actualResult);

    }
}