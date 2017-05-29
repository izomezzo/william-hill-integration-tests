package sports.williamhill.com.integration.tests.football.model;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Ian on 28/05/2017.
 */
public class Login {

    private ChromeDriver driver;
    private By loginMenu = By.id("accountTabButton");
    private By usernameInput = By.id("loginUsernameInput");
    private By loginPasswordInput = By.id("loginPasswordInput");
    private By loginButton = By.id("loginButton");

    public Login(ChromeDriver driver){
        this.driver = driver;
    }

    public void clickLoginButton(){
        driver.findElement(loginMenu).click();
    }

    public void enterUserName(String username){
        driver.findElement(usernameInput).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(loginPasswordInput).sendKeys(password);
    }

    public void submitLogin(){
        driver.findElement(loginButton).click();
    }
}
