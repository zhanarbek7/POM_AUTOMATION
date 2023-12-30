package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CashWiseHomePage {

    WebDriver driver;

    public CashWiseHomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "#active")
    public WebElement infographics;

    @FindBy(linkText = "Sales")
    public WebElement sales;

    @FindBy(linkText = "Expenses")
    public WebElement expenses;

    @FindBy(xpath = "//li[text()='Reports']")
    public WebElement reports;

    @FindBy(xpath = "//p[@aria-label='Account settings']/*[1]")
    public WebElement notifications;

    @FindBy(xpath = "//p[@aria-label='Account settings']/*[2]")
    public WebElement accountSettings;

}
