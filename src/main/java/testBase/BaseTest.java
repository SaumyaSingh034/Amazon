package testBase;

import constant.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

    public static WebDriver driver;

    public WebDriver initializeWebDriver(String browser){
        if(browser.equalsIgnoreCase(Browser.CHROME.name())){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if(browser.equalsIgnoreCase(Browser.FIREFOX.name())){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else {
            System.out.println("Please check the browser....."+browser);
        }
        return driver;
    }
}
