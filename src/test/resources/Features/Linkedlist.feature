@LinkedList
Feature: Linked List Navigation

  Background: The user sign in to dsAlgo Portal

  Scenario: Verify the user is able to Sign in to DSAlgo Portal
    Given The user is in the Home Page
    When The user clicks the Sign in button to enter username and password
    Then The user clicks on Login and sees logged in message

  Scenario: Verify the user is able to go to LinkedList page
    Given The user is in home page after sign in
    When The user clicks Get Started button in Linkedlist panel
    Then The user should land on LinkedList page

  Scenario: Verify that user is able to navigate to Introduction page
    Given The user is in the Linked List page after Sign in
    When The user clicks Introduction link
    Then The user should be redirected to Introduction page

  Scenario: Verify that user is able to navigate to try Editor page for Introduction page
    Given The user is on the Introduction page
    When The user clicks Try Here button in Introduction page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  Scenario: Verify that user receives error for  when click on Run button without entering code
    Given The user is in the tryEditor page for Introduction
    When The user clicks the Run Button without entering the code in the Introduction Try Editor
    Then The user should be able to see error message for Introduction  in alert window

  Scenario: Verify that user is able to see output for valid python code
    Given The user is in the Introduction tryEditor page
    When The user write the valid python code in Introduction Try Editor and click the Run Button
    Then The user should able to see output for Introduction in the console

  Scenario: Verify that user receives error for invalid python code
    Given The user is in the tryEditor page for Introduction
    When The user write the invalid python code in Introduction Try Editor and click the Run Button
    Then The user should able to see an error message for Introduction in alert window

  Scenario: Verify that user is able to navigate to Creating Linked List page
    Given The user is on the Creating Linked List page
    When The user clicks Try Here button in Creating Linked List page
    Then The user should be redirected to Creating Linked list page having an try Editor with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code
    Given The user is in the tryEditor page for Creating Linked List page
    When The user clicks the Run Button without entering the code in the Creating Linked List Try Editor
    Then The user should be able to see error message for Creating Linked List  in alert window

  Scenario: Verify that user receives error for invalid python code
    Given The user is in the tryEditor page for Creating Linked List page
    When The user write the invalid python code in Creating Linked List Try Editor and click the Run Button
    Then The user should able to see an error message for Creating Linked List in alert window

  Scenario: Verify that user is able to see output for valid python code
    Given The user is in the tryEditor page for Creating Linked List page
    When The user write the valid python code in  Creating Linked List Try Editor and click the Run Button
    Then The user should able to see output for Creating Linked List  in the console

  Scenario: Verify that user is able to navigate to Types of Linked List page
    Given The user is on the Types of Linked List page
    When The user clicks Try Here button in Types of Linked List page
    Then The user should be redirected to Types of Linked List page having an try Editor with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code
    Given The user is in the tryEditor page for Types of Linked List page
    When The user clicks the Run Button without entering the code in the Creating Linked List Try Editor
    Then The user should be able to see error message for Creating Linked List  in alert window

  Scenario: Verify that user receives error for invalid python code
    Given The user is in the tryEditor page for Types of Linked List page
    When The user write the invalid python code in Types of Linked List Try Editor and click the Run Button
    Then The user should able to see an error message for Types of Linked List in alert window

  Scenario: Verify that user is able to see output for valid python code
    Given The user is in the tryEditor page for Types of Linked List page
    When The user write the valid python code in  Types of Linked List Try Editor and click the Run Button
    Then The user should able to see output for Types of Linked List  in the console

  Scenario: Verify that user is able to navigate to Implement Linked List in Python page
    Given The user is in the  Linked List  page after Sign in
    When The user clicks Implement Linked List in Python link
    Then The user should be redirected to Implement Linked List in Python page

  Scenario: Verify that user is able to navigate to try Editor page for Implement Linked List in Python page
    Given The user is on the Implement Linked List in Python page
    When The user clicks Try Here button in Implement Linked List in Python page
    Then The user should be redirected to Implement Linked List page having an try Editor with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code
    Given The user is in the tryEditor page for Implement Linked List
    When The user clicks the Run Button without entering the code in the Implement Linked List Try Editor
    Then The user should be able to see error message for Implement Linked List   in alert window

  Scenario: Verify that user receives error for invalid python code
    Given The user is in the tryEditor page for Implement Linked List
    When The user clicks the Run Button with entering the invalid python code in the Implement Linked List Try Editor
    Then The user should able to see an error message for Implement Linked List  in alert window

  Scenario: Verify that user is able to see output for valid python code
    Given The user is in the tryEditor page for Implement Linked List
    When The user write the valid python code in Implement Linked List Try Editor and click the Run Button
    Then The user should able to see output for Implement Linked List in the console

  Scenario: Verify that user is able to navigate to Traversal Page for Linked List page
    Given The user is on Traversal page
    When The user clicks Traversal link
    Then The user should be redirected to Traversal page

  Scenario: Verify that user is able to navigate to try Editor  page for Traversal page
    Given The user is on the  Traversal page
    When The user clicks the Try here  button in Traversal page
    Then The user should be redirected to Try Editor page when clicking on Try here button

  Scenario: Verify that user receives error when click on Run button without entering code
    Given The user is on the tryEditor  page for Traversal
    When The user did not  write the code in  Traversal Try Editor and Click the Submit Button
    Then The user should be able to see error message for Traversal  in alert window

  Scenario: Verify that user receives error for invalid python code
    Given The user is on the tryEditor  page for Traversal
    When The user write the invalid python code in  Traversal Try Editor and Click the Run Button
    Then The user should able to see an error message for Traversal  in alert window

  Scenario: Verify that user is able to see output for valid python code
    Given The user is on the tryEditor  page for Traversal
    When The user write the valid python code in Traversal Try Editor and Click the Run Button
    Then The user should able to see output for Traversal  in the console

  Scenario: Verify that user is able to navigate to Insertion page from Linked List page
    Given The user is on the Linked List page
    When The user clicks the Insertion  link
    Then The user should be redirected to Insertion page from Linked List page

  Scenario: Verify that user is able to navigate to try Editor page from  Insertion page
    Given The user is on the Insertion page
    When The user clicks the Try here button in Insertion page
    Then The user should be redirected to Try Editor page from Insertion page

  Scenario: Verify that user receives error when click on Run button without entering code
    Given The user is on the Try Editor page for Insertion
    When The user did not  write the code in  Insertion Try Editor and Click the Submit Button
    Then The user should be able to see error message for Insertion in alert window

  Scenario: Verify that user is able to see output for valid python code
    Given The user is on the Try Editor page for Insertion
    When The user write the valid code in Insertion Try Editor and Click the Run Button
    Then The user should able to see output for Insertion  in the console

  Scenario: Verify that user receives error for invalid python code
    Given The user is on the Try Editor page for Insertion
    When The user write the invalid code in Insertion Try Editor and Click the Run Button
    Then The user should able to see an error message for Insertion  in alert window

  Scenario: Verify that user is able to navigate to Deletion Page from  Linked List page
    Given The user is on the Deletion page
    When The user clicks the Deletion link
    Then The user should be redirected to Deletion page

  Scenario: Verify that user is able to navigate to try Editor page for Deletion page
    Given The user is on the Deletion page
    When The user clicks the Try Here  button in Deletion page
    Then The user should be redirected to Deletion  Try Editor  page

  Scenario: Verify that user receives error when click on Run button without entering code
    Given The user is on the tryEditor  page for Deletion
    When The user did not  write the code in Deletion Try Editor and Click the Submit Button
    Then The user should be able to see error message for Deletion  in alert window

  Scenario: Verify that user receives error for invalid python code
    Given The user is on the Try Editor  page for Deletion
    When The user  write the invalid python code in Deletion Try Editor and Click the Submit Button
    Then The user should  be able to see an error message for Deletion in the alert window

  Scenario: Verify that user is able to see output for  valid python code
    Given The user is on the tryEditor  page for Deletion
    When The user write the valid python code in Deletion Try Editor and Click the Run Button
    Then The user should able to see output for Deletion in the console

  Scenario: Verify that user is able to navigate to Practice Questions  page from Linked List page
    Given The user is on the Practice Questions  page
    When The user clicks on Practice Questions link in Linked List page
    Then The user should be redirected to Practice Questions page
