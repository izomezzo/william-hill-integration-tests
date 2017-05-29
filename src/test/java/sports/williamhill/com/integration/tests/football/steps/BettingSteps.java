package sports.williamhill.com.integration.tests.football.steps;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java8.En;
import sports.williamhill.com.integration.tests.football.model.*;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Ian on 28/05/2017.
 */

public class BettingSteps extends BaseTest implements En{

    private Login login;
    private Betting betting;
    private Football football;
    private Competitions competitions;
    private BetSlip betSlip;

    @Before
    public void setup(){
        super.setup();
        driver.navigate().to("http://sports.williamhill.com/sr-admin-set-white-list-cookie.html");
        login = new Login(driver);
        betting = new Betting(driver);
        football = new Football(driver);
        competitions = new Competitions(driver);
        betSlip = new BetSlip(driver);
    }

    @After
    public void tearDown(){
        super.tearDown();
    }

    public BettingSteps() {
        Given("^I have logged in$", () -> {
            login.clickLoginButton();
            login.enterUserName("izomezzo");
            login.enterPassword("divvy123");
            login.submitLogin();
        });
        When("^I select the English Championship$", () -> {
            betting.clickFootballMenu();
            football.clickCompetitionsMenu();
            competitions.clickFirstChampionshipMatch();
        });
        And("^I select the home team to win$", () -> {
            competitions.clickHomeButton();
        });
        When("^I place a bet for \"([^\"]*)\"$", (String arg0) -> {
            betSlip.enterBetAmount(arg0);
            betSlip.clickBetButton();
        });
        Then("^the returns should be correct$", () -> {
            betSlip.expandWebReceipt();
            assertEquals("0.12",betSlip.getReturns());
            assertEquals("7/5",betSlip.getOdds());
        });
        Then("^the returns should be \"([^\"]*)\"$", (String arg0) -> {
            betSlip.expandWebReceipt();
            assertEquals(arg0,betSlip.getReturns());
        });
        And("^the odds should be \"([^\"]*)\"$", (String arg0) -> {
            assertEquals(arg0,betSlip.getOdds());
        });
    }
}
