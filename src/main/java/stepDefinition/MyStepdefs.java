package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
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
}
