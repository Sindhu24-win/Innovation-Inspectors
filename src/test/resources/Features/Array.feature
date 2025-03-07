

Feature: Array Navigation

  Background: The User sign in to dsAlgo portal

  
  Scenario: Verify the user is able to navigate to Array Data Structure page
    Given The user is in the Home page after sign in
    When The user clicks the "Getting Started" button in Array Panel
    Then The user be directed to "Array"Data Structure Page

  
  Scenario: Verify that user is able to navigate to "Arrays in Python" page
    Given The user is in the "Array" page after Sign in
    When The user clicks "Arrays in Python" link
    Then The user should be redirected to "Arrays in Python" page

  Scenario: Verify that user is able to navigate to "try Editor" page for "Arrays in Python" page
    Given The user is on the "Arrays in Python" page
    When The user clicks "Try Here" button in Arrays in Python page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should be able to see error message in alert window

  Scenario: Verify that user receives error for invalid python code
    Given The user is in the tryEditor page
    When The user write the invalid python code in Editor and click the Run Button 
    Then The user should be able to see an error message in alert window

  Scenario: Verify that user is able to see output for valid python code
    Given The user is in the tryEditor page
    When The user write the  valid python code in Editor and click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user is able to navigate to "Arrays using List" page
    Given The user is on the "Arrays using List" page
    When The user clicks "Try Here" button in "Arrays using List" page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  Scenario: Verify that user is able to navigate to "try Editor" page for "Arrays using List" page
    Given The user is on the "Arrays using List" page
    When The user clicks "Try Here" button in "Arrays using List" page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should be able to see error message in alert window

  Scenario: Verify that user receives error for invalid python code
    Given The user is in the tryEditor page
    When The user write the invalid python code in Arrays using List Editor and click the Run Button
    Then The user should able to see an error message in alert window

  Scenario Outline: Verify that user is able to see output for valid python code
    Given The user is in the tryEditor page
    When The user write the valid python code in Editor and click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user is able to navigate to "Basic Operations in Lists" page
    Given The user is on the "Basic Operations in Lists" page
    When The user clicks "Try Here" button in "Basic Operations in Lists" page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  Scenario: Verify that user is able to navigate to "try Editor" page for "Baisc Operations in  Lists" page
    Given The user is on the "Basic Operations in Lists" page
    When The user clicks "Try Here" button in "Basic Operations in Lists" page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should be able to see error message in alert window

  Scenario: Verify that user receives error for invalid python code
    Given The user is in the tryEditor page
    When The user write the invalid python code in Editor and click the Run Button
    Then The user should able to see an error message in alert window

  Scenario: Verify that user is able to see output for valid python code for "Basic Operations in Lists" page
    Given The user is in the tryEditor page
    When The user write the valid python code in Editor and click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user is able to navigate to "Applications of Array" page
    Given The user is in the "Array" page after Sign in
    When The user clicks "Applications of Array" link
    Then The user should be redirected to "Applications of Array" page

  Scenario: Verify that user is able to navigate to "try Editor" page
    Given The user is on the "Applications of Array" page
    When The user clicks "Try Here" button in "Application of Arrays" page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should be able to see error message in alert window

  Scenario Outline: Verify that user receives error for invalid python code
    Given The user is in the tryEditor page
    When The user write the invalid python code in Editor and click the Run Button
    Then The user should able to see error message in alert window

  Scenario: Verify that user is able to see output for valid python code
    Given The user is in the tryEditor page
    When The user write the valid  python code in Editor and click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Applications of Array" page
    Given The user is in the Array page after Sign in
    When The user clicks "Practice Questions" link
    Then The user should be redirected to "Practice" page

  Scenario: Verify that user is able to navigate to "Search the array" Page from Practice question page of "Applications of Array" page
    Given The user is on the "Practice Questions" page
    When The user clicks the "Search the array" link
    Then The user should be redirected to "Question" page contains a question,and try Editor with Run and Submit button

  Scenario: Verify that user receives error when click on Run button without entering code
    Given The user is on the practice question editor
    When The user did not  write the code in Editor and Click the Submit Button
    Then The user should be able to see error message in alert window

  Scenario: Verify that user is able to run valid python code
    Given The user is on the practice question editor
    When The user write the valid python code in Editor and Click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user receives error for invalid python code
    Given The user is on the practice question editor
    When The user write the invalid python code in Editor and Click the Run Button
    Then The user should able to see an error message in alert window

  Scenario: Verify that user is able to navigate to "Max Consecutive Ones" Page from Practice questions page
    Given The user is on the "Practice Questions" page
    When The user clicks the "Max ConsecutiveOnes" link
    Then The user should be redirected to "Question" page contains a question,and try Editor with Run and Submit button

  Scenario: Verify that user receives error when click on Run button without entering code
    Given The user is on the practice question editor
    When The user did not  write the code in Editor and Click the Submit Button
    Then The user should be able to see error message in alert window

  Scenario: Verify that user is able to run valid python code for "Max Consecutive Ones" question
    Given The user is on the practice question editor
    When The user write the valid python code in Editor and Click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user receives error for invalid python code on running "Max Consecutive Ones" question
    Given The user is on the practice question editor
    When The user write the invalid python code in Editor and Click the Run Button
    Then The user should able to see an error message in alert window

  Scenario: Verify that user is able to navigate to "Find Numbers with Even Number of Digits" Page from Practice questions page
    Given The user is on the "Practice Questions" page
    When The user clicks the "Find Numbers with Even Number of Digits" link
    Then The user should be redirected to "Question" page contains a question,and try Editor with Run and Submit button

  Scenario: :Verify that user receives error when click on Run button without entering code
    Given The user is on the practice question editor
    When The user did not  write the code in Editor and Click the Submit Button
    Then The user should be able to see error message in alert window

  Scenario: Verify that user is able to see output for  valid python code
    Given The user is on the practice question editor
    When The user write the valid python code in Editor and Click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user receives error for invalid python code
    Given The user is on the practice question editor
    When The user write the invalid python code in Editor and Click the Run Button
    Then The user should able to see an error message in alert window

  Scenario: Verify that user is able to navigate to "Squares of a Sorted Array" Page from Practice questions page
    Given The user is on the "Practice Questions" page
    When The user clicks the "Squares of a Sorted Array" link
    Then The user should be redirected to "Question" page contains a question,and try Editor with Run and Submit button

  Scenario: Verify that user receives error when click on Run button without entering code
    Given The user is on the practice question editor
    When The user did not  write the code in Editor and Click the Submit Button
    Then The user should be able to see error message in alert window

  Scenario: Verify that user is able to see output for valid python code
    Given The user is on the practice question editor
    When The user write the valid python code in Editor and Click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user receives error for invalid python code
    Given The user is on the practice question editor
    When The user write the invalid python code in Editor and Click the Run Button
    Then The user should able to see an error message in alert window
