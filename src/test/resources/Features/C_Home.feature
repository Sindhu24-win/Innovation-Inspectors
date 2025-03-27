@Regression
Feature: Home and DS Algo Portal Navigation and Functionality

  Background: The user is in the ds algo portal

  @home1
  Scenario: Verify the Home page for a user
    Given The user is on the DS Algo Portal
    When The user clicks the Get Started button
    Then The user should be navigated to the home page

  @home2
  Scenario: Verify that user sees a warning message when selecting Data Structures from the dropdown without Sign in
    Given The user is on the Home page
    When The user selects Tree Data Structures from the drop-down without Sign in
    Then The user should see a warning message

  @home3
  Scenario: Verify that user is able to navigate to Tree Data Structures page
    Given The user is on the Home page after signed in
    When The user selects Tree item from the drop-down menu
    Then The user should land on the Tree Data Structure page

 
