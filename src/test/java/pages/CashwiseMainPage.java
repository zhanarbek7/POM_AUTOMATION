package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CashwiseMainPage {

    WebDriver driver;

    public CashwiseMainPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[text()='Sign in']")
    public WebElement signInButton;

    @FindBy(xpath = "(//button[text()='Sign up'])[2]")
    public WebElement signUpButton;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement emailBox;

    @FindBy(id = ":r4:")
    public WebElement passwordBox;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement signInButton2;

    public void enterEmail(String email){
        emailBox.sendKeys(email);
    }

    public void enterPassword(String password){
        passwordBox.sendKeys(password);
    }

    public void clickSignIn(){
        signInButton2.click();
    }


}
