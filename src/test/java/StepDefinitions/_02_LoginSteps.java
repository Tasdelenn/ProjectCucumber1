package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_LoginSteps {

    DialogContent dc=new DialogContent();

    @When("Enter {string} and {string} and click login button")
    public void enterAndAndClickLoginButton(String userName, String passWord) {

        dc.findAndSend("username",userName);
        dc.findAndSend("password",passWord);
        dc.findAndClick("loginButton");

    }

    @Then("User should login unsuccessfuly")
    public void userShouldLoginUnsuccessfuly() {

        dc.findAndContainsText("unsuccessMessage","error");

    }
}
