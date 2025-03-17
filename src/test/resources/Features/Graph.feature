Feature: Graph

  Background: The user sign in to dsAlgo Portal

  Scenario: Verify that user is able to navigate to Graph data structure page
    Given The user is in the Home page after Sign in with valid credentials.
    When The user clicks the Getting Started button in Graph Panel
    Then The user should be directed to Graph Data Structure Page

  Scenario: Verify that user is able to navigate to Graph Data Structures page
    Given The user is in the Home page after Signed in.
    When The user selects Graph item from the drop down menu.
    Then The user should land in Graph Data Structure Page

  Scenario: Verify that user is able to navigate to Graph page of Graph-Data structures page
    Given The user is in the Graph data structure page after Sign in
    When The user clicks Graph link
    Then The user should be redirected to Graph page of Graph-Data structures

  Scenario: Verify that user is able to navigate to Try Editor page of Graph
    Given The user is on the Graph page
    When The user clicks Try Here button in Graph page
    Then The user should be redirected to a page having a Try Editor with a Run button to test

  Scenario: Verify that user receives an error when clicking on Run button without entering code in Graph Try Editor page
    Given The user is in the Try Editor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should see an error message in an alert window

  Scenario: Verify that user receives an error for invalid Python code in Graph Try Editor page
    Given The user is in the Try Editor page
    When The user writes invalid code in the Editor and clicks the Run button
    Then The user should see an error message in an alert window

  Scenario: Verify that user is able to see output for valid Python code in Graph Try Editor page
    Given The user is in the Try Editor page
    When The user writes valid code in the Editor and clicks the Run button
    Then The user should see output in the console

  Scenario: Verify that user is able to navigate to Practice Questions in the Graph Data Structure page
    Given The user is in the Graph page after Sign in
    When The user clicks Practice Questions link
    Then The user should be redirected to Practice page

  Scenario: Verify that user is able to navigate to Graph Representations page
    Given The user is in the Graph data structure page after Sign in
    When The user clicks Graph Representations link
    Then The user should be redirected to Graph Representations page

  Scenario: Verify that user is able to navigate to Try Editor page for the Graph Representations page
    Given The user is on the Graph Representations page
    When The user clicks Try Here button in the Graph Representations page
    Then The user should be redirected to a page having a Try Editor with a Run button to test

  Scenario: Verify that user receives an error when clicking on Run button without entering code in Try Editor page of Graph Representations
    Given The user is in the Try Editor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should see an error message in an alert window

  Scenario: Verify that user receives an error for invalid Python code in Try Editor page of Graph Representations
    Given The user is in the Try Editor page
    When The user writes invalid code in the Editor and clicks the Run button
    Then The user should see an error message in an alert window

  Scenario: Verify that user is able to see output for valid Python code in Try Editor page of Graph Representations
    Given The user is in the Try Editor page
    When The user writes valid code in the Editor and clicks the Run button
    Then The user should see output in the console
