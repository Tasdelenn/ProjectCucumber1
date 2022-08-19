package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _00_RegisterSteps {

    DialogContent dc = new DialogContent();

    @When("Click Register Button")
    public void clickRegisterButton() {
        dc.findAndClick("register");
    }

    @And("fill in registration information and register click")
    public void fillInRegistrationInformationAndRegisterClick() {
        dc.findAndSend("firstName","Ebubekir");
        dc.findAndSend("lastName","Sarigul");
        dc.findAndSend("adress","Nilufer Bursa");
        dc.findAndSend("city","Bursa");
        dc.findAndSend("state","Marmara");
        dc.findAndSend("zipCode","16130");
        dc.findAndSend("phoneNumber","13654613232");
        dc.findAndSend("ssn","12713161117");
        dc.findAndSend("regUsername","grup02");
        dc.findAndSend("regPassword","22222");
        dc.findAndSend("confirmPassword","22222");
        dc.findAndClick("registerButton");
    }

    @Then("User should be see succes")
    public void userShouldBeSeeSucces() {
        dc.findAndContainsText("registerSucces","created successfully");
    }
}
