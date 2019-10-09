package com.ridezum;


import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected static WebDriver driver;
    protected static User user;

    @BeforeClass
    public static void setUp() {

        System.setProperty("webdriver.chrome.driver", "/Users/annaoleynik/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://ridezum.com");
        String expectedResult = "Zūm";
        String actualResult = driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult);

        user = new User("Anna Oleynik", "Anna", "Oleynik", "test@gmail.com", "4980987634",
                "Google", "www.linkedin.com", "www.portfolio.com", "Develop and implement enterprise level software systems using microservices\n" +
                "architecture ● Strong understanding of Object Oriented Development ● Experience working as a team lead, interacting with QA teams and customers ● Extensive experience in Scrum methodology");
    }

//    @AfterClass
//    public static void finish() {
//        driver.quit();
//    }
}
