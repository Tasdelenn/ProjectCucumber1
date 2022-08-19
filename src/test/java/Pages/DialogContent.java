package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{

    /************* BUNU UNUTMA !!! :) ******************/
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this); //DON'T FORGET THIS ;)
    }


    @FindBy(linkText = "Register")
    private WebElement register;

    @FindBy(id = "customer.firstName")
    private WebElement firstName;

    @FindBy(id = "customer.lastName")
    private WebElement lastName;

    @FindBy(id = "customer.address.street")
    private WebElement adress;

    @FindBy(id = "customer.address.city")
    private WebElement city;

    @FindBy(id = "customer.address.state")
    private WebElement state;

    @FindBy(id = "customer.address.zipCode")
    private WebElement zipCode;

    @FindBy(id = "customer.phoneNumber")
    private WebElement phoneNumber;

    @FindBy(id = "customer.ssn")
    private WebElement ssn;

    @FindBy(id = "customer.username")
    private WebElement regUsername;

    @FindBy(id = "customer.password")
    private WebElement regPassword;

    @FindBy(id = "repeatedPassword")
    private WebElement confirmPassword;

    @FindBy(css = "[value=\"Register\"]")
    private WebElement registerButton;

    @FindBy(xpath = "//*[@id=\"rightPanel\"]/p")
    private WebElement registerSucces;
    @FindBy(name="username")
    private WebElement username;

    @FindBy(name="password")
    private WebElement password;

    @FindBy(css="input[value=\"Log In\"]")
    private WebElement loginButton;

    @FindBy(xpath = "//b[text()='Welcome']")
    private WebElement successMessage;

    @FindBy(css = "p.error")
    private WebElement unsuccessMessage;

    @FindBy(linkText = "Bill Pay")
    private WebElement billPayLink;

    @FindBy(name = "payee.name")
    private WebElement payeeName;

    @FindBy(name = "payee.address.street")
    private WebElement payeeAddressStreet;

    @FindBy(name = "payee.address.city")
    private WebElement payeeAddressCity;

    @FindBy(name = "payee.address.state")
    private WebElement payeeAddressState;

    @FindBy(name = "payee.address.zipCode")
    private WebElement payeeAddresszipCode;

    @FindBy(name = "payee.phoneNumber")
    private WebElement payeePhone;

    @FindBy(name = "payee.accountNumber")
    private WebElement payeeAccount;

    @FindBy(name = "verifyAccount")
    private WebElement verifyAccount;

    @FindBy(name = "amount")
    private WebElement amount;

    @FindBy(css = "input[value='Send Payment']")
    private WebElement sendPaymentBtn;

    @FindBy(xpath = "//h1[text()=\"Bill Payment Complete\"]")
    private WebElement billPaymentCheckMessage;


    @FindBy(xpath="//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath="//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;

    @FindBy(xpath="//ms-save-button//button")
    private WebElement saveButton;


    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortName;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement alreadyExist;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeDialog;


    WebElement myElement;
    public void findAndSend(String strElement, String value){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {

            case "firstName" : myElement =firstName; break;
            case "lastName" : myElement =lastName; break;
            case "adress" : myElement =adress; break;
            case "city" : myElement =city; break;
            case "state" : myElement =state; break;
            case "zipCode" : myElement =zipCode; break;
            case "phoneNumber" : myElement =phoneNumber; break;
            case "ssn" : myElement =ssn; break;
            case "regUsername" : myElement =regUsername; break;
            case "regPassword" : myElement =regPassword; break;
            case "confirmPassword" : myElement =confirmPassword; break;
            /************************************************************/
            case "username" : myElement =username; break;
            case "password" : myElement =password; break;
            case "payeeName" : myElement =payeeName; break;
            case "payeeAddressStreet" : myElement =payeeAddressStreet; break;
            case "payeeAddressCity" : myElement =payeeAddressCity; break;
            case "payeeAddressState" : myElement =payeeAddressState; break;
            case "payeeAddresszipCode" : myElement =payeeAddresszipCode; break;
            case "payeePhone" : myElement =payeePhone; break;
            case "payeeAccount" : myElement =payeeAccount; break;
            case "verifyAccount" : myElement =verifyAccount; break;
            case "amount" : myElement =amount; break;
        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "register" : myElement =register; break;
            case "registerButton" : myElement =registerButton; break;
            case "loginButton" : myElement =loginButton; break;
            case "billPayLink" : myElement =billPayLink; break;
            case "sendPaymentBtn" : myElement =sendPaymentBtn; break;
        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "registerSucces" : myElement =registerSucces; break;
            case "successMessage" : myElement =successMessage; break;
            case "unsuccessMessage" : myElement =unsuccessMessage; break;
            case "billPaymentCheckMessage" : myElement =billPaymentCheckMessage; break;
        }

        verifyContainsText(myElement,text);
    }

}
