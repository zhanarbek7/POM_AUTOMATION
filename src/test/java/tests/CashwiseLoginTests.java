package tests;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import pages.CashwiseMainPage;
import utilities.Config;
import utilities.Driver;

public class CashwiseLoginTests {

    CashwiseMainPage cashwiseMainPage = new CashwiseMainPage(Driver.getDriver());

    @Test
    public void happySignIn() throws InterruptedException {
        Driver.getDriver().get(Config.getValue("cashwise.url"));
        cashwiseMainPage.signInButton.click();
        cashwiseMainPage.enterEmail(Config.getValue("cashwise.email"));
        cashwiseMainPage.enterPassword(Config.getValue("cashwise.password"));
        cashwiseMainPage.clickSignIn();
        Thread.sleep(1500);
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("https://cashwise.us/dashboard/infographics", actualUrl);
    }

    @Test
    public void noPasswordSignIn() throws InterruptedException {
        Driver.getDriver().get(Config.getValue("cashwise.url"));
        cashwiseMainPage.signInButton.click();
        cashwiseMainPage.enterEmail(Config.getValue("cashwise.email"));
        cashwiseMainPage.clickSignIn();
        Thread.sleep(1000);
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertNotEquals("https://cashwise.us/dashboard/infographics", actualUrl);
    }

    @Test
    public void noEmailSignIn() throws InterruptedException {
        Driver.getDriver().get(Config.getValue("cashwise.url"));
        cashwiseMainPage.signInButton.click();
        cashwiseMainPage.enterPassword(Config.getValue("cashwise.password"));
        cashwiseMainPage.clickSignIn();
        Thread.sleep(1000);
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertNotEquals("https://cashwise.us/dashboard/infographics", actualUrl);
    }

    @Test
    public void noCredentialSignIn() throws InterruptedException {
        Driver.getDriver().get(Config.getValue("cashwise.url"));
        cashwiseMainPage.signInButton.click();
        cashwiseMainPage.clickSignIn();
        Thread.sleep(1000);
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertNotEquals("https://cashwise.us/dashboard/infographics", actualUrl);
    }


    @AfterClass
    public static void cleanUp(){
        Driver.quitBrowser();
    }


}
