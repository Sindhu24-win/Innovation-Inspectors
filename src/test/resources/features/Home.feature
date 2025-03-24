@Regression
Feature: Home and DS Algo Portal Navigation and Functionality

  Scenario: Verify the Home page for a user
    Given The user is on the DS Algo Portal
    When The user clicks the Get Started button
    Then The user should be navigated to the home page

  Scenario: Verify that user sees a warning message when selecting "Data Structures" from the dropdown without Sign in
    Given The user is on the Home page
    When The user selects Data Structures from the drop-down without Sign in
    Then The user should see a warning message "You are not logged in"

  Scenario: Verify that the user is able to navigate to login
    Given The user is on the Home page
    When The user clicks on Login
    Then The user should land on the login page

  Scenario: Veirfy that the user the able to login
    Given The user is on the login page for home feature
    When The user enters valid username and password
    Then The user should land on the home page with success message

  Scenario: Verify that the user is able to navigate to the Stack page
    Given The user is on the home page after logging in
    When The user clicks on the dropdown menu and selects the "Stack" tab
    Then The user lands on the Stack page

  Scenario: Verify that user is able to sign out successfully
    Given The user is on the home page after logging in
    When The user clicks Sign out on home page
    Then The user should be redirected to the home page with message "Logged out successfully"
