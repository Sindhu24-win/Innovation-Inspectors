@Regression

Feature: Sign In and Sign Out in dsAlgo Portal

  Background: The user is in the ds algo portal

  @login1
  Scenario: Verify that the user can navigate to registration from login
    Given The user is on the login page
    When The user clicks on the Register link
    Then The user should be redirected to the registration page

  @login2
  Scenario: Verify that user receives an error message for all empty fields during login
    Given The user is on the DS Algo Sign in Page
    When The user clicks the login button after leaving the "Username" textbox and "Password" textbox empty
    Then The error message Please fill out this field. appears below Username textbox during login

  @login3
  Scenario: Verify that user receives an error message for empty Password field during login
    Given The user is on the DS Algo Sign in Page
    When The user clicks the login button after entering the "Username" and leaves "Password" textbox empty
    Then The error message Please fill out this field. appears below Password textbox during login

  @login4
  Scenario: Verify that user receives an error message for empty Username field during login
    Given The user is on the DS Algo Sign in Page
    When The user clicks the login button after entering the Password only
    Then The error message appears below Username textbox

  @login5
  Scenario Outline: Verify that user receives an error message for invalid Username during login
    Given The user is on the DS Algo Sign in Page
    When The user clicks the login button after entering an invalid username and valid password from excel <rowIndex>
    Then The user should see an error message "Invalid Username and Password"

    Examples: 
      | rowIndex |
      |        1 |
      |        2 |
      |        3 |

  @login6
  Scenario Outline: Verify that user is able to land on the Home page after entering valid credentials
    Given The user is on the DS Algo Sign in Page
    When The user clicks the login button after entering valid username and valid password from excel <rowIndex>
    Then The user should land in Data Structure Home Page with message You are logged in

    Examples: 
      | rowIndex |
      |        4 |
      
