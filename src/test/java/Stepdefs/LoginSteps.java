package Stepdefs;

import PageFactory.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;

@Slf4j
public class LoginSteps {

    LoginPage loginPage;

    @Given("User navigates to Bookings HomePage")
    public void userNavigatesToBookingsHomePage() {
        loginPage.navigateToHomePage();
        log.info("After navigating to Bookings HomePage");
    }

    @And("User clicks on Register")
    public void userClicksOnRegister() throws InterruptedException {
        loginPage.clickOnRegister();
    }


    @Then("User enters {string} and {string}")
    public void userEntersAnd(String userName, String password) throws InterruptedException {
        loginPage.enterUserName(userName);
        loginPage.enterPassword(password);
    }

    @Then("Check against the {string}")
    public void checkAgainstThe(String strExpectedMessage) {
        Assert.assertTrue("Wrong Validation Message", loginPage.getValidationMessage().equalsIgnoreCase(strExpectedMessage));
    }
}
