package sports.williamhill.com.integration.tests.football.model;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Ian on 28/05/2017.
 */
public class BetSlip {

    private ChromeDriver driver;
    private By inputField = By.className("betslip-selection__stake-input");
    private By betButton = By.id("place-bet-button");
    private By betReceiptExpand = By.className("icon-arrow-down-slim");
    private By receiptReturn = By.id("total-to-return-price");
    private By receiptOdds = By.className("betslip-selection__price");
    private WebDriverWait wait;

    public BetSlip(ChromeDriver driver){

        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void enterBetAmount(String amount){
        wait.until(ExpectedConditions.presenceOfElementLocated(inputField)).sendKeys(amount);
    }

    public void clickBetButton(){
        driver.findElement(betButton).click();
    }

    public void expandWebReceipt(){
        wait.until(ExpectedConditions.presenceOfElementLocated(betReceiptExpand)).click();
    }

    public String getReturns(){
        return wait.until(ExpectedConditions.presenceOfElementLocated(receiptReturn)).getText();
    }

    public String getOdds(){
        return wait.until(ExpectedConditions.presenceOfElementLocated(receiptOdds)).getText();
    }
}
