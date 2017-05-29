package sports.williamhill.com.integration.tests.football.model;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Ian on 28/05/2017.
 */
public class Football {

    private ChromeDriver driver;
    private WebDriverWait wait;
    private By competitionsMenu = By.id("nav-football-competitions");

    public Football(ChromeDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void clickCompetitionsMenu(){
        wait.until(ExpectedConditions.presenceOfElementLocated(competitionsMenu));
        driver.findElement(competitionsMenu).click();
    }

}
