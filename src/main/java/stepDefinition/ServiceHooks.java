package stepDefinition;

import constant.Browser;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import testBase.BaseTest;

public class ServiceHooks {

    BaseTest baseTest;

    @Before
    public void initializeTest(){
        baseTest = new BaseTest();
        baseTest.initializeWebDriver(Browser.CHROME.name());
    }

    @After
    public void endTest(Scenario sc){
        if(sc.isFailed()){
          final byte[] screenshot =  ((TakesScreenshot)BaseTest.driver).getScreenshotAs(OutputType.BYTES);
          sc.embed(screenshot,"image/png");
        }
        else{
          final byte[] screenshot =   ((TakesScreenshot) BaseTest.driver).getScreenshotAs(OutputType.BYTES);
          sc.embed(screenshot,"image/png");
        }
        BaseTest.driver.quit();
    }
}
