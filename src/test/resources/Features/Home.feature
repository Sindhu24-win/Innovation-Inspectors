Feature: Home and DS Algo Portal Navigation and Functionality

  Background: The user opened DS Algo portal in the browser
 HEAD


   
 b4db99f (pushing to darshana branch)
  Scenario: Verify that user is able to sign out of the portal
    Given The user is on the home page and logged in with valid credentials
    When The user clicks on the sign out button
    Then The user should be able to sign out of the portal and see success message

  Scenario: Verify the Home page for a user without Sign in
    Given The user is on the DS Algo Portal
    When The user clicks the "Get Started" button in home page
    Then The user should be navigated to the home page, which displays the "Register" and "Sign in" links

  Scenario: Verify that user is able to view options for "Data Structures" dropdown on home page without Sign in
    Given The user is on the Home page
    When The user clicks the Data Structures dropdown
    Then The user should be able to see 6 options "Arrays, Linked List, Stack, Queue, Tree, Graph" in the dropdown menu

  Scenario: Verify that user sees a warning message when selecting "Data Structures" from the dropdown without Sign in
    Given The user is on the Home page
    When The user selects "Data Structures" from the drop-down without Sign in
    Then The user should see a warning message "You are not logged in"

  Scenario: Verify that the user is able to navigate to the Stack page
    Given The user is logged in to the DS Algo portal
    When The user clicks on the dropdown menu and selects the "Stack" tab
    Then The user lands on the Stack page

  Scenario: Verify that the user is able to open the DS Algo portal in the browser
    Given The user has the DS Algo portal link or web address
    When The user enters the DS Algo portal web address in the browser
    Then The user should land on the DS Algo portal in the browser

  Scenario: Verify that the user is able to navigate to the Array page
    Given The user is logged in to the DS Algo portal
    When The user clicks on the dropdown menu and selects the "Array" tab
    Then The user lands on the Array page

  Scenario: Verify that the user is able to navigate to the Linked List page
    Given The user is logged in to the DS Algo portal
    When The user clicks on the dropdown menu and selects the "Linked List" tab
    Then The user lands on the Linked List page

  Scenario: Verify that the user is able to navigate to the Queue page
    Given The user is logged in to the DS Algo portal
    When The user clicks on the dropdown menu and selects the "Queue" tab
    Then The user lands on the Queue page

  Scenario: Verify that the user is able to navigate to the Tree page
    Given The user is logged in to the DS Algo portal
    When The user clicks on the dropdown menu and selects the "Tree" tab
    Then The user lands on the Tree page

  Scenario: Verify that the user is able to navigate to the Graph page
    Given The user is logged in to the DS Algo portal
    When The user clicks on the dropdown menu and selects the "Graph" tab
    Then The user lands on the Graph page

    
     Scenario: Verify that user is able to sign out successfully
    Given The user is in the Home page after Sign in
    When The user clicks "Sign out" on home page
    Then The user should be redirected to the home page with message "Logged out successfully"

