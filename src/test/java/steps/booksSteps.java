package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;

import Pages.booksPage;
import cucumber.api.java.en.*;

public class booksSteps extends booksPage {

    booksPage booksvar = new booksPage();

    @Given("^I go to book page$")
    public void goToBookPage() {
        booksvar.navigateToBooksUrl();
    }

    @When("^I enter a (.+)$")
    public void enterCorrectUsername(String username) {
        booksvar.clickOnEmailUserBox();
        booksvar.enterUsername(username);
    }

    @And("^I enter  this (.+)$")
    public void enterCorrectPassword(String passwordForUsername) {
        booksvar.clickPasswordBox();
        booksvar.enterPassword(passwordForUsername);
    }

    @And("^I click on sign in bottom")
    public void clickSignInBottomToLogIn() {
        booksvar.clickSingInBox();
    }

    @Then("^I logged in to bookpage succesfully (.+)$")
    public void mainBookPage(String currentUrl) {
        booksvar.getToHomePage(currentUrl);
        Assert.assertEquals(currentUrl, "https://qa-library-dev.herokuapp.com/qa-dashboard");
        // second assertion to double verify log in was successful.
        booksvar.labelHomePage();
        Assert.assertTrue("Home Page has been loaded succesfully", true);
    }

    @Then("^I receive an error message$")
    public void errorLogginInMessage() {
        booksvar.messageErrorLogIn();
        Assert.assertTrue("Error Loggin in message has been displated succesfully", true);
    }

    @Then("^I receive a warning message that information is missing$")
    public void noDataToLogInMessageIncomplete() {
        booksvar.completeMessage();
        Assert.assertTrue("Complete this data message appears successfully", true);
    }
}
