package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    @FindBy(xpath="//a[@id='nav-link-accountList']")
    public WebElement landingPageSingInBtn;

    @FindBy(id="ap_email_login")
    public WebElement userName;

    @FindBy(xpath="//h1[@class='a-size-medium-plus a-spacing-small']")
    public WebElement createAccountText;

    @FindBy(xpath = "//span[@id='continue']")
    public WebElement continutBtn;

    @FindBy(id="ap_password")
    public WebElement passWord;

    @FindBy(id="signInSubmit")
    public WebElement signInBtn;

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

    public void sendPassWord(String password){
        passWord.sendKeys(password);

    }

    public void clickOnSignInBtn(){
        signInBtn.click();
    }

    public void userLoginWithValidCredentials(String username, String password){
        userName.sendKeys(username);
        passWord.sendKeys(password);
        signInBtn.click();
    }

}
