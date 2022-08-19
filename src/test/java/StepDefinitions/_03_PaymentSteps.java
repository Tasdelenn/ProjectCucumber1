package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class _03_PaymentSteps {

    DialogContent dc = new DialogContent();

    @Then("User should click to billPay link")
    public void userShouldClickToBillPayLink() {
        dc.findAndClick("billPayLink");
    }

    @And("Enter Payment Info {string}  {string}  {string}  {string}  {string}  {string}  {string}  {string} {string}")
    public void enterPaymentInfo(String payeeName, String payeeAddressStreet, String payeeAddressCity, String payeeAddressState, String payeeAddresszipCode, String payeePhone, String payeeAccount, String verifyAccount, String amount) {
        dc.findAndSend("payeeName", payeeName);
        dc.findAndSend("payeeAddressStreet", payeeAddressStreet);
        dc.findAndSend("payeeAddressCity", payeeAddressCity);
        dc.findAndSend("payeeAddressState", payeeAddressState);
        dc.findAndSend("payeeAddresszipCode", payeeAddresszipCode);
        dc.findAndSend("payeePhone", payeePhone);
        dc.findAndSend("payeeAccount", payeeAccount);
        dc.findAndSend("verifyAccount", verifyAccount);
        dc.findAndSend("amount", amount);
    }

    @And("click sendPayment button")
    public void clickSendPaymentButton() {
        dc.findAndClick("sendPaymentBtn");
    }

    @Then("User should billPaymentCheckMessage successfuly")
    public void userShouldBillPaymentCheckMessageSuccessfuly() {

        dc.findAndClick("billPaymentCheckMessage");

    }
}




