Feature: dsAlgo Portal Queue Functionality

  Background:
    Given the user is signed in to the dsAlgo Portal

  Scenario: Navigate to Queue Data Structure Page
    Given the user is on the Home page after signing in
    When the user clicks the "Getting Started" button in the Queue Panel or the user selects Queue from the dropdown menu
    Then the user should be directed to the "Queue" Data Structure Page

  Scenario: Navigate to "Implementation of Queue in Python" Page
    Given the user is on the Queue page after signing in
    When the user clicks the "Implementation of Queue in Python" button
    Then the user should be redirected to the "Implementation of Queue in Python" page

  Scenario: Navigate to Try Editor for "Implementation of Queue in Python"
    Given the user is on the "Implementation of Queue in Python" page
    When the user clicks the "Try Here" button
    Then the user should be redirected to a page with a try Editor and a Run button to test the code

  Scenario: Error when clicking Run without code for "Implementation of Queue in Python"
    Given the user is on the tryEditor page for "Implementation of Queue in Python"
    When the user clicks the Run Button without entering any code
    Then the user should see an error message in an alert window

  Scenario: Error for invalid Python code for "Implementation of Queue in Python"
    Given the user is on the tryEditor page for "Implementation of Queue in Python"
    When the user writes invalid code and clicks the Run Button
    Then the user should see an error message in an alert window

  Scenario: Display output for valid Python code for "Implementation of Queue in Python"
    Given the user is on the tryEditor page for "Implementation of Queue in Python"
    When the user writes valid code and clicks the Run Button
    Then the user should see output in the console

  Scenario: Navigate to "Practice Questions" Page from "Implementation of Queue in Python"
    Given the user is on the Queue page after signing in
    When the user clicks the "Practice Questions" button
    Then the user should be redirected to the "Practice Questions" page

  Scenario: Navigate to "Implementation using collections.deque" Page
    Given the user is on the Queue page after signing in
    When the user clicks the "Implementation using collections.deque" button
    Then the user should be redirected to the "Implementation using collections.deque" page

  Scenario: Navigate to Try Editor for "Implementation using collections.deque"
    Given the user is on the "Implementation using collections.deque" page
    When the user clicks the "Try Here" button
    Then the user should be redirected to a page with a try Editor and a Run button to test the code

  Scenario: Error when clicking Run without code for "Implementation using collections.deque"
    Given the user is on the tryEditor page for "Implementation using collections.deque"
    When the user clicks the Run Button without entering any code
    Then the user should see an error message in an alert window

  Scenario: Error for invalid Python code for "Implementation using collections.deque"
    Given the user is on the tryEditor page for "Implementation using collections.deque"
    When the user writes invalid code and clicks the Run Button
    Then the user should see an error message in an alert window

  Scenario: Display output for valid Python code for "Implementation using collections.deque"
    Given the user is on the tryEditor page for "Implementation using collections.deque"
    When the user writes valid code and clicks the Run Button
    Then the user should see output in the console

  Scenario: Navigate to "Practice Questions" Page from "Implementation using collections.deque"
    Given the user is on the Queue page after signing in
    When the user clicks the "Practice Questions" button
    Then the user should be redirected to the "Practice Questions" page

  Scenario: Navigate to "Implementation using array" Page
    Given the user is on the Queue page after signing in
    When the user clicks the "Implementation using array" button
    Then the user should be redirected to the "Implementation using array" page

  Scenario: Navigate to Try Editor for "Implementation using array"
    Given the user is on the "Implementation using array" page
    When the user clicks the "Try Here" button
    Then the user should be redirected to a page with a try Editor and a Run button to test the code

  Scenario: Error when clicking Run without code for "Implementation using array"
    Given the user is on the tryEditor page for "Implementation using array"
    When the user clicks the Run Button without entering any code
    Then the user should see an error message in an alert window

  Scenario: Error for invalid Python code for "Implementation using array"
    Given the user is on the tryEditor page for "Implementation using array"
    When the user writes invalid code and clicks the Run Button
    Then the user should see an error message in an alert window

  Scenario: Display output for valid Python code for "Implementation using array"
    Given the user is on the tryEditor page for "Implementation using array"
    When the user writes valid code and clicks the Run Button
    Then the user should see output in the console

  Scenario: Navigate to "Practice Questions" Page from "Implementation using array"
    Given the user is on the Queue page after signing in
    When the user clicks the "Practice Questions" button
    Then the user should be redirected to the "Practice Questions" page

  Scenario: Navigate to "Queue Operations" Page
    Given the user is on the Queue page after signing in
    When the user clicks the "Queue Operations" button
    Then the user should be redirected to the "Queue Operations" page

  Scenario: Navigate to Try Editor for "Queue Operations"
    Given the user is on the "Queue Operations" page
    When the user clicks the "Try Here" button
    Then the user should be redirected to a page with a try Editor and a Run button to test the code

  Scenario: Error when clicking Run without code for "Queue Operations"
    Given the user is on the tryEditor page for "Queue Operations"
    When the user clicks the Run Button without entering any code
    Then the user should see an error message in an alert window

  Scenario: Error for invalid Python code for "Queue Operations"
    Given the user is on the tryEditor page for "Queue Operations"
    When the user writes invalid code and clicks the Run Button
    Then the user should see an error message in an alert window

  Scenario: Display output for valid Python code for "Queue Operations"
    Given the user is on the tryEditor page for "Queue Operations"
    When the user writes valid code and clicks the Run Button
    Then the user should see output in the console

  Scenario: Navigate to "Practice Questions" Page from "Queue Operations"
    Given the user is on the Queue page after signing in
    When the user clicks the "Practice Questions" button
    Then the user should be redirected to the "Practice Questions" page
