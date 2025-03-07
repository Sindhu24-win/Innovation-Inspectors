Feature: Sign In and Sign Out in dsAlgo Portal

  Scenario: Verify that the user is able to land on the Login Page
    Given The user is on the DS Algo Home Page
    When The user clicks the "Sign in" link
    Then The user should be redirected to the log in page

  Scenario: Verify that the user can navigate to registration from login
    Given The user is on the login page
    When The user clicks on the "Register" link
    Then The user should be redirected to the registration page

  Scenario: Verify that user receives an error message for all empty fields during login
    Given The user is on the DS Algo Sign in Page
    When The user clicks the login button after leaving the "Username" textbox and "Password" textbox empty
    Then The error message "Please fill out this field." appears below Username textbox during login

  Scenario: Verify that user receives an error message for empty Password field during login
    Given The user is on the DS Algo Sign in Page
    When The user clicks the login button after entering the "Username" and leaves "Password" textbox empty
    Then The error message "Please fill out this field." appears below Password textbox during login

  Scenario: Verify that user receives an error message for empty Username field during login
    Given The user is on the DS Algo Sign in Page
    When The user clicks the login button after entering the Password only
    Then The error message "Please fill out this field." appears below Username textbox

  Scenario: Verify that user receives an error message for invalid Username during login
    Given The user is on the DS Algo Sign in Page
    When The user clicks the login button after entering an invalid username and valid password
    Then The user should see an error message "Invalid username and password"

  Scenario: Verify that user is able to land on the Home page after entering valid credentials
    Given The user is on the DS Algo Sign in Page
    When The user clicks the login button after entering valid username and valid password
    Then The user should land in Data Structure Home Page with message "You are logged in"

  Scenario: Verify that user is able to sign out successfully
    Given The user is in the Home page after Sign in
    When The user clicks "Sign out" on home page
    Then The user should be redirected to the home page with message "Logged out successfully"
  