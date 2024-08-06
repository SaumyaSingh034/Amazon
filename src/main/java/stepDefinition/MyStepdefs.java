package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPage;
import testBase.BaseTest;

public class MyStepdefs extends BaseTest {

    LoginPage lp = new LoginPage(driver);
    @Given("^I am on the Login Page \"([^\"]*)\"$")
    public void i_am_on_the_Login_Page(String arg1){
        driver.get(arg1);
        driver.manage().window().maximize();
    }

    @Then("^I should click on The Sign In button$")
    public void i_should_click_on_The_Sign_In_button() {
        lp.clickOnLoginBtnFromAmazonLandingPage();
    }

    @Then("^I should see create account Page$")
    public void iShouldSeeCreateAccountPage() {
        lp.createAccountText.isDisplayed();

        
    }

    @When("^I enter username as \"([^\"]*)\"$")
    public void iEnterUsernameAs(String userName)   {
        lp.sendUserName(userName);
    }

    @And("^click on continue$")
    public void clickOnContinue() {
        lp.clickOnContinueAfterUserName();
    }

    @And("^I entered password as \"([^\"]*)\"$")
    public void iEnteredPasswordAs(String password) {
        lp.sendPassWord(password);
    }

    @And("^click on Sign In$")
    public void clickOnSignIn() {
        lp.clickOnSignInBtn();
    }

    @Then("^I am Logged In$")
    public void iAmLoggedIn() {
        System.out.println(driver.getTitle());
    }
}
