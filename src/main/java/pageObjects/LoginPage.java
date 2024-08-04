package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    @FindBy(id="#nav-link-accountList-nav-line-1")
    public WebElement landingPageSingInBtn;

    @FindBy(id="ap_email_login")
    public WebElement userName;

    @FindBy(xpath = "//span[@id='continue']")
    public WebElement continutBtn;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnLoginBtnFromAmazonLandingPage(){
        landingPageSingInBtn.click();
    }

    public void sendUserName(String username){
        userName.sendKeys(username);
    }

    public void clickOnContinueAfterUserName(){
        continutBtn.click();
    }
}
