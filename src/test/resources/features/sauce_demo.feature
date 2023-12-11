Feature: Sauce demo login feature

  Scenario: User log in into Sauce demo page
    Given user open main page
    When user logs in with credentials: "standard_user" and "secret_sauce"
    Then user is authenticated

  Scenario Outline:  User checks validation error messages
    Given user open main page
    When user logs in with credentials: "<login>" and "<password>"
    Then user see error message: "<error_message>"
    Examples:
      | login          | password     | error_message                                                             |
      |                |              | Epic sadface: Username is required                                        |
      | sauce_demo     |              | Epic sadface: Password is required                                        |
      | user_not_exist | secret_sauce | Epic sadface: Username and password do not match any user in this service |

  Scenario: User add item to basket
    Given user open main page
    And user logs in with credentials: "standard_user" and "secret_sauce"
    When user add item "Sauce Labs Backpack" to basket
    Then user see this item in the basket

  Scenario: User place an order
    Given user open main page
    And user logs in with credentials: "standard_user" and "secret_sauce"
    And user add item "Sauce Labs Backpack" to basket
    When user place an order
    Then user is redirected to the page with a message about completion of order placement
