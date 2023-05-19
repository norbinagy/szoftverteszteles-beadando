package hu.unideb.inf;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public abstract class AbstractStepDefs {

    private static final int WAIT_TIME = 10;
    private static final WebDriver webDriver;
    protected static HomePage homePage;

    static {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        /*
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        */
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WAIT_TIME));
        homePage = new HomePage(webDriver);
    }
}
