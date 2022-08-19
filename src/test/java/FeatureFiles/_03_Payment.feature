#Senaryo ;
#1- siteyi açınız.
#2- username ve password u gönderin ve Login butonuna tıklatın.
#3- Login olduğunuzu doğrulayın.

  #- Sonra Yukarıdaki Senaryoyu Gherkin dilinde yazdık.

Feature: Payment Functionality

  Background:
    Given Navigate to parabank
    When Enter username and password and click login button
    Then User should login successfuly


  Scenario Outline: Payment

    Then User should click to billPay link
    And Enter Payment Info "<payeeName>"  "<payeeAddressStreet>"  "<payeeAddressCity>"  "<payeeAddressState>"  "<payeeAddresszipCode>"  "<payeePhone>"  "<payeeAccount>"  "<verifyAccount>" "<amount>"
    And   click sendPayment button
    Then User should billPaymentCheckMessage successfuly
    Examples:
      | payeeName | payeeAddressStreet | payeeAddressCity | payeeAddressState | payeeAddresszipCode | payeePhone | payeeAccount | verifyAccount | amount |
      | Elektrik  | yesil cad          | ankara           | ege               | 12345               | 555521     | 112233       | 112233        | 85     |
      | Su        | mavi cad           | konya            | akdeniz           | 56789               | 55533      | 445566       | 445566 | 45     |
      | Dogalgaz  | mor cad            | bolu             | icanadolu         | 43219               | 555443     | 778899       | 778899 | 120    |



