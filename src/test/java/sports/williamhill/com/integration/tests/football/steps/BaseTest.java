package sports.williamhill.com.integration.tests.football.steps;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Ian on 28/05/2017.
 */
public abstract class BaseTest {

    protected ChromeDriver driver;

    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        this.driver = new ChromeDriver();
        //  driver.navigate().to("http://sports.williamhill.com/sr-admin-set-white-list-cookie.html");
    }

    public void tearDown() {
        driver.close();
    }
}


