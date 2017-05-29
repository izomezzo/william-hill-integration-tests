package sports.williamhill.com.integration.tests.football.model;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Ian on 28/05/2017.
 */
public class Betting {

    private ChromeDriver driver;
    private By footballMenu = By.id("nav-football");

    public Betting(ChromeDriver driver){
        this.driver = driver;
    }

    public void clickFootballMenu(){
        driver.findElement(footballMenu).click();
    }
}
