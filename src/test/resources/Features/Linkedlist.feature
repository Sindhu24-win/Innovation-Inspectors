Feature: Linked List Navigation

  Background: The user sign in to dsAlgo Portal

  Scenario: Verify that user is able to navigate to "Introduction" page
    Given The user is in the "Linked List" page after Sign in
    When The user clicks "Introduction" link
    Then The user should be redirected to "Introduction" page

  Scenario: Verify that user is able to navigate to "Introduction" page
    Given The user is in the "Linked List" page after Sign in
    When The user clicks "Introduction" link
    Then The user should be redirected to "Introduction" page

  Scenario: Verify that user is able to navigate to "try Editor" page for "Introduction" page
    Given The user is on the "Introduction" page
    When The user clicks "Try Here" button in "Introduction" page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should be able to see error message in alert window

  Scenario: Verify that user receives error for invalid python code
    Given The user is in the tryEditor page
    When The user write the invalid python code in  Editor and click the Run Button
    Then The user should able to see an error message in alert window

  Scenario: Verify that user is able to see output for valid python code
    Given The user is in the tryEditor page
    When The user write the valid python code in  Editor and click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user is able to navigate to "Creating Linked List" page
    Given The user is on the "Creating Linked List" page
    When The user clicks "Try Here" button in "Creating Linked List" page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  Scenario: Verify that user is able to navigate to "try Editor" page for "Creating Linked List" page
    Given The user is on the "Creating Linked List" page
    When The user clicks "Try Here" button in "Creating Linked List" page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should be able to see error message in alert window

  Scenario: Verify that user receives error for invalid python code
    Given The user is in the tryEditor page
    When The user write the invalid python code in Editor and click the Run Button
    Then The user should able to see an error message in alert window

  Scenario: Verify that user is able to see output for valid python code
    Given The user is in the tryEditor page
    When The user write the valid python code in Editor and click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user is able to navigate to "Types of Linked List" page
    Given The user is on the "Types of Linked List" page
    When The user clicks "Try Here" button in "Types of Linked List" page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  Scenario: Verify that user is able to navigate to "try Editor" page for "Types of Linked List" page
    Given The user is on the "Types of Linked List" page
    When The user clicks "Try Here" button in "Types of Linked List" page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should be able to see error message in alert window

  Scenario: Verify that user receives error for invalid python code
    Given The user is in the tryEditor page
    When The user write the invalid python code in Editor and click the Run Button
    Then The user should able to see an error message in alert window

  Scenario: Verify that user is able to see output for valid python code
    Given The user is in the tryEditor page
    When The user write the valid python code in Editor and click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user is able to navigate to "Implement Linked List in Python" page
    Given The user is in the "Implement Linked List in Python" page after Sign in
    When The user clicks "Implement Linked List in Python" link
    Then The user should be redirected to "Implement Linked List in Python" page

  Scenario: Verify that user is able to navigate to "try Editor" page for "Implement Linked List in Python" page
    Given The user is on the "Implement Linked List in Python" page
    When The user clicks "Try Here" button in "Implement Linked List in Python" page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should be able to see error message in alert window

  Scenario: Verify that user receives error for invalid python code
    Given The user is in the tryEditor page
    When The user clicks the Run Button with entering the invalid python code in the Editor
    Then The user should able to see an error message in alert window

  Scenario: Verify that user is able to see output for valid python code
    Given The user is in the tryEditor page
    When The user write the valid python code in Editor and click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user is able to navigate to "Traversal" Page for "Linked List" page
    Given The user is on "Traversal" page
    When The user clicks "Traversal" link
    Then The user should be redirected to "Traversal" page

  Scenario: Verify that user is able to navigate to "try Editor " page for "Traversal" page
    Given The user is on the tryEditor  page
    When The user clicks the "Try here " button
    Then The user should be redirected to "Try Editor page "when clicking on "Try here" button

  Scenario: Verify that user receives error when click on Run button without entering code
    Given The user is on the tryEditor  page
    When The user did not  write the code in Editor and Click the Submit Button
    Then The user should be able to see error message in alert window

  Scenario: Verify that user receives error for invalid python code
    Given The user is on the tryEditor  page
    When The user write the invalid python code in Editor and Click the Run Button
    Then The user should able to see an error message in alert window

  Scenario: Verify that user is able to see output for valid python code
    Given The user is on the tryEditor  page
    When The user write the valid python code in Editor and Click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user is able to navigate to "Insertion" page from Linked List" page
    Given The user is on the "Insertion" page
    When The user clicks the "Insertion " link
    Then The user should be redirected to "Insertion" page from "Linked List" page

  Scenario: Verify that user is able to navigate to "try Editor"  page from  "Insertion" page
    Given The user is on the tryEditor  page
    When The user clicks the "Try here" button
    Then The user should be redirected to "Try Editor" page from "Insertion" page

  Scenario: Verify that user receives error when click on Run button without entering code
    Given The user is on the "Try Editor  " page
    When The user did not  write the code in Editor and Click the Submit Button
    Then The user should be able to see error message in alert window

  Scenario: Verify that user is able to see output for valid python code
    Given The user is on the "Try Editor  " page
    When The user write the valid code in Editor and Click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user receives error for invalid python code
    Given The user is on the "Try Editor  " page
    When The user write the invalid code in Editor and Click the Run Button
    Then The user should able to see an error message in alert window

  Scenario: Verify that user is able to navigate to "Deletion" Page from  "Linked List" page
    Given The user is on the "Deletion" page
    When The user clicks the "Deletion " link
    Then The user should be redirected to "Deletion" page

  Scenario: Verify that user is able to navigate to "try Editor " page for "Deletion" page
    Given The user is on the "Deletion" page
    When The user clicks the "Try Here " button
    Then The user should be redirected to "Try Editor " page

  Scenario: Verify that user receives error when click on Run button without entering code
    Given The user is on the tryEditor  page
    When The user did not  write the code in Editor and Click the Submit Button
    Then The user should be able to see error message in alert window

  Scenario: Verify that user receives error for invalid python code
    Given The user is on the "Try Editor  " page
    When The user  write the invalid python code in Editor and Click the Submit Button
    Then The user should  be able to see an error message in the alert window

  Scenario: Verify that user is able to see output for  valid python code
    Given The user is on the tryEditor  page
    When The user write the valid python code in Editor and Click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user is able to navigate to "Practice Questions " page from "Linked List" page
    Given The user is on the "Practice Questions " page
    When The user clicks on "Practice Questions" link in "Linked List" page
    Then The user should be redirected to "Practice Questions" page
