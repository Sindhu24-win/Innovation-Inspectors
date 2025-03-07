Feature: Navigation and Functionality Verification in dsAlgo Portal for Stack Data Structure

  Background:
    Given The user is signed in to dsAlgo Portal

  # Scenario 1: Navigate to "Stack" data structure page
  Scenario: Verify user is able to navigate to "Stack" data structure page
    Given The user is on the Home page after signing in
    When The user clicks the "Getting Started" button in the Stack panel or selects Stack item from the dropdown menu
    Then The user should be directed to the "Stack" Data Structure Page

  # Scenario 2: Navigate to "Operations in Stack" page
  Scenario: Verify user is able to navigate to "Operations in Stack" page
    Given The user is on the Stack page after signing in
    When The user clicks the "Operations in Stack" button
    Then The user should be redirected to the "Operations in Stack" page

  # Scenario 3: Navigate to "Try Editor" page for "Operations in Stack"
  Scenario: Verify user is able to navigate to "Try Editor" page for "Operations in Stack"
    Given The user is on the "Operations in Stack" page
    When The user clicks the "Try Here" button in Stack in Python page
    Then The user should be redirected to a page with a Try Editor and a Run button to test

  # Scenario 4: Error on clicking Run without entering code for "Operations in Stack"
  Scenario: Verify user receives error when clicking Run without entering code for "Operations in Stack"
    Given The user is in the Try Editor page
    When The user clicks the Run button without entering code in the Editor
    Then The user should see an error message in an alert window

  # Scenario 5: Error for invalid Python code for "Operations in Stack"
  Scenario: Verify user receives error for invalid Python code for "Operations in Stack"
    Given The user is in the Try Editor page
    When The user writes invalid code in the Editor and clicks the Run button
    Then The user should see an error message in an alert window

  # Scenario 6: Output for valid Python code for "Operations in Stack"
  Scenario: Verify user is able to see output for valid Python code for "Operations in Stack"
    Given The user is in the Try Editor page
    When The user writes valid code in the Editor and clicks the Run button
    Then The user should see output in the console

  # Scenario 7: Navigate to "Practice Questions" page for "Operations in Stack"
  Scenario: Verify user is able to navigate to "Practice Questions" Page for "Operations in Stack"
    Given The user is on the Stack page after signing in
    When The user clicks the "Practice Questions" button
    Then The user should be redirected to the "Practice Questions" page

  # Scenario 8: View expected content on "Practice Questions" page for "Operations in Stack"
  Scenario: Verify user is able to see the expected content on "Practice Questions" page for "Operations in Stack"
    Given The user is on the Stack page after signing in
    When The user clicks the "Practice Questions" button
    Then The user should be able to see the expected content in the "Practice Questions" page

  # Scenario 9: Navigate to "Implementation" page
  Scenario: Verify user is able to navigate to "Implementation" page
    Given The user is on the Stack page after signing in
    When The user clicks the "Implementation" button
    Then The user should be redirected to the "Implementation" page

  # Scenario 10: Navigate to "Try Editor" page for "Implementation"
  Scenario: Verify user is able to navigate to "Try Editor" page for "Implementation"
    Given The user is on the "Implementation" page
    When The user clicks the "Try Here" button in Stack in Python page
    Then The user should be redirected to a page with a Try Editor and a Run button to test

  # Scenario 11: Error on clicking Run without entering code for "Implementation"
  Scenario: Verify user receives error when clicking Run without entering code for "Implementation"
    Given The user is in the Try Editor page
    When The user clicks the Run button without entering code in the Editor
    Then The user should see an error message in an alert window

  # Scenario 12: Error for invalid Python code for "Implementation"
  Scenario: Verify user receives error for invalid Python code for "Implementation"
    Given The user is in the Try Editor page
    When The user writes invalid code in the Editor and clicks the Run button
    Then The user should see an error message in an alert window

  # Scenario 13: Output for valid Python code for "Implementation"
  Scenario: Verify user is able to see output for valid Python code for "Implementation"
    Given The user is in the Try Editor page
    When The user writes valid code in the Editor and clicks the Run button
    Then The user should see output in the console

  # Scenario 14: Navigate to "Practice Questions" page for "Implementation"
  Scenario: Verify user is able to navigate to "Practice Questions" Page for "Implementation"
    Given The user is on the Stack page after signing in
    When The user clicks the "Practice Questions" button
    Then The user should be redirected to the "Practice Questions" page

  # Scenario 15: Navigate to "Applications" page
  Scenario: Verify user is able to navigate to "Applications" page
    Given The user is on the Stack page after signing in
    When The user clicks the "Applications" button
    Then The user should be redirected to the "Applications" page

  # Scenario 16: Navigate to "Try Editor" page for "Applications"
  Scenario: Verify user is able to navigate to "Try Editor" page for "Applications"
    Given The user is on the "Applications" page
    When The user clicks the "Try Here" button in Stack in Python page
    Then The user should be redirected to a page with a Try Editor and a Run button to test

  # Scenario 17: Error on clicking Run without entering code for "Applications"
  Scenario: Verify user receives error when clicking Run without entering code for "Applications"
    Given The user is in the Try Editor page
    When The user clicks the Run button without entering code in the Editor
    Then The user should see an error message in an alert window

  # Scenario 18: Error for invalid Python code for "Applications"
  Scenario: Verify user receives error for invalid Python code for "Applications"
    Given The user is in the Try Editor page
    When The user writes invalid code in the Editor and clicks the Run button
    Then The user should see an error message in an alert window

  # Scenario 19: Output for valid Python code for "Applications"
  Scenario: Verify user is able to see output for valid Python code for "Applications"
    Given The user is in the Try Editor page
    When The user writes valid code in the Editor and clicks the Run button
    Then The user should see output in the console

  # Scenario 20: Navigate to "Practice Questions" page for "Applications"
  Scenario: Verify user is able to navigate to "Practice Questions" Page for "Applications"
    Given The user is on the Stack page after signing in
    When The user clicks the "Practice Questions" button
    Then The user should be redirected to the "Practice Questions" page

  # Scenario 21: View expected content on "Practice Questions" page for "Applications"
  Scenario: Verify user is able to see the expected content on "Practice Questions" page for "Applications"
    Given The user is on the Stack page after signing in
    When The user clicks the "Practice Questions" button
    Then The user should be able to see the expected content in the "Practice Questions" page
