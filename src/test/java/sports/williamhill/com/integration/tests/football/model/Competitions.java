package sports.williamhill.com.integration.tests.football.model;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Ian on 28/05/2017.
 */
public class Competitions {

    private ChromeDriver driver;
    private By championshipMatch = By.linkText("English Championship");
    // private By betMarketActions = By.className("btmarket__actions");
    private By homeBetButton = By.className("betbutton__odds");
    private WebDriverWait wait;

    public Competitions(ChromeDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void clickFirstChampionshipMatch(){

        wait.until(ExpectedConditions.presenceOfElementLocated(championshipMatch));

        for(int i =0;i < 2;i++)
            driver.findElement(championshipMatch).click(); //assume the matches are expanded, but since we
        //can't guarantee we're on championship matches
        //collapse and expand the list

    }

    public void clickHomeButton(){
        wait.until(ExpectedConditions.presenceOfElementLocated(homeBetButton));
        driver.findElement(homeBetButton).click();
    }

}
