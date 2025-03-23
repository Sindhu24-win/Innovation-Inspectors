@Regression
Feature: User Registration on DS Algo Portal

  Scenario: Verify that user receives error message for all empty fields during registration
    Given The user is on the user registration page
    When The user clicks Register button with "username" , "password" and "confirm_password" empty
    Then The error message should be displayed under username

  Scenario Outline: Verify that user receives error message for empty Username Confirmation field during registration
    Given The user is on the user registration page
    When The user clicks Register button after entering Password and Password Confirmation with Username field empty <rowIndex>
    Then The error message should be displayed "password_mismatch:The two password fields didn’t match."

    Examples: 
      | rowIndex |
      |        1 |

  Scenario Outline: Verify that user receives error message for mismatched Password and Password Confirmation field during registration
    Given The user is on the user registration page
    When The user clicks Register button after entering different passwords in Password and Password Confirmation fields <rowIndex>
    Then The user should be able to see a password warning "password_mismatch:The two password fields didn’t match."

    Examples: 
      | rowIndex |
      |        2 |

  Scenario Outline: Verify that user is able to land on Homepage after registration with valid fields
    Given The user is on the user registration page
    When The user clicks Register button after entering a valid username, password, and password confirmation in related textboxes <rowIndex>
    Then The user should be redirected to Home Page of DS Algo with success message

    Examples: 
      | rowIndex |
      |        3 |
