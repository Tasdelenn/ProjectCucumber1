package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_LoginSteps {
    DialogContent dc=new DialogContent();


    @Given("Navigate to parabank")
    public void navigateToParabank() {
        GWD.getDriver().get("https://parabank.parasoft.com/");
        GWD.getDriver().manage().window().maximize();
        //dc.findAndClick("acceptAllCookiesButton");
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {

        dc.findAndSend("username","grup02");
        dc.findAndSend("password","22222");
        dc.findAndClick("loginButton");
    }

    @Then("User should login successfuly")
    public void userShouldLoginSuccessfuly() {
//        dc.waitUntilVisible(dc.successMessage);
//        Assert.assertTrue(dc.successMessage.getText().contains("Welcome"));

        dc.findAndContainsText("successMessage","Welcome");
    }

    @Then("User should login unsuccessfull")
    public void userShouldLoginUnsuccessfull() {

        dc.findAndSend("username","0grup2");
        dc.findAndSend("password","022222");
        dc.findAndClick("loginButton");

    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
    }
}
