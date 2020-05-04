@smoke @regression
Feature: Navigating to specific accounts in Accounts Activity

  Background:
    Given user is on "Login" page
    When user enters "username" as "user_username" on "Login" page
    And user enters "password" as "user_password" on "Login" page
    And user clicks on "login" button on "Login" page

  Scenario: Savings account redirect
    When user switch to "Savings" account
    Then "Title" should contain "Zero - Account Activity" on "Account Activity" page
    And "Account drop down default option" should contain "Savings" on "Account Activity" page

  Scenario: Brokerage account redirect
    When user switch to "Brokerage" account
    Then "Title" should contain "Zero - Account Activity" on "Account Activity" page
    And "Account drop down default option" should contain "Brokerage" on "Account Activity" page

  Scenario: Checking account redirect
    When user switch to "Checking" account
    Then "Title" should contain "Zero - Account Activity" on "Account Activity" page
    And "Account drop down default option" should contain "Checking" on "Account Activity" page

  Scenario: Credit Card account redirect
    When user switch to "Credit Card" account
    Then "Title" should contain "Zero - Account Activity" on "Account Activity" page
    And "Account drop down default option" should contain "Credit Card" on "Account Activity" page

  Scenario: Loan account redirect
    When user switch to "Loan" account
    Then "Title" should contain "Zero - Account Activity" on "Account Activity" page
    And "Account drop down default option" should contain "Loan" on "Account Activity" page