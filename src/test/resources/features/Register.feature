Feature: User Registration on DS Algo Portal

Scenario: Verify that user is able to land on Register Page
  Given The user is in the home page
  When The user clicks Register link on the Home page
  Then The user should be redirected to Register form

Scenario: Verify that user receives error message for all empty fields during registration
  Given The user is on the user registration page
  When The user clicks Register button with all fields empty
  Then The error "Please fill out this field." appears below Username textbox during registration

Scenario: Verify that user receives error message for empty Password field during registration
  Given The user is on the user registration page
  When The user clicks Register button after entering Username with other fields empty
  Then The error message "Please fill out this field." appears below Password textbox during registration

Scenario: Registration fails due to username exceeding 150 characters
  Given The user is on the registration page
  When The user enters a username longer than 150 characters
  Then An error message should be displayed stating "Username must be 150 characters or fewer."

Scenario: Verify that user receives error message for empty Password Confirmation field during registration
  Given The user is on the user registration page
  When The user clicks Register button after entering Password and Password Confirmation with Username fields empty
  Then The error message "Please fill out this field." appears below Password Confirmation textbox

Scenario: Verify that user receives error message for invalid password field during registration
  Given The user is on the user registration page
  When The user clicks Register button after entering a password with numeric data
  Then An error message should be displayed stating "Your password can’t be entirely numeric."

Scenario: Registration fails due to commonly used password
  Given The user is on the registration page
  When The user enters a password that is commonly used
  Then An error message should be displayed stating "Your password can’t be a commonly used password."

Scenario: Verify that user receives error message for mismatched Password and Password Confirmation field during registration
  Given The user is on the user registration page
  When The user clicks "Register" button after entering different passwords in Password and Password Confirmation fields
  Then The user should be able to see a password warning message "password_mismatch:The two password fields didn’t match."

Scenario: Verify that user is able to land on Homepage after registration with valid fields
  Given The user is on the user registration page
  When The user clicks Register button after entering a valid username, password, and password confirmation in related textboxes
  Then The user should be redirected to Home Page of DS Algo with success message




