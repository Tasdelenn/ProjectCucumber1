
Feature: Login Functionality

  Background:
    Given Navigate to parabank


  Scenario: Login with valid username and password

    When Enter username and password and click login button
    Then User should login successfuly

  Scenario Outline: Login with invalid username and password

    When Enter "<userName>" and "<passWord>" and click login button
    Then User should login unsuccessfuly


    Examples:
      | userName | passWord |
      | 0grup2   | 22222    |
      | grup2    | 022222   |

