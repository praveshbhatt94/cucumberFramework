Feature: Login to Automation PracticeTitle of your feature
  Scenario Outline: Login to Automation Practice site with invalid user 
    Given User is on login page
    When user login with "<invalidCredential>"
    Then user navigate to error page
    Examples:
    | invalidCredential |
    | abc456@gmail.com |