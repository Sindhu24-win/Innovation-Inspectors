@Regression

Feature: Data Structures - Introduction Navigation

  @DS1
  Scenario: Verify that the user can navigate to Data Structures - Introduction page
    Given The user is in the Home page after logged in the DsAlgo portal
    When The user clicks on the Getting Started button in Data Structures Introduction
    Then The user should land in Data Structures Introduction Page

  @DS2
  Scenario: Verify that the user is able to navigate to the Time Comlexity Page
    Given The user is in the Data Structure Introduction page
    When The user clicks on the Time Complexity link
    Then The user should be able to land on the Time complexity page

  @DS3
  Scenario: Verify that user is able to navigate to Practice Questions page
    Given The user is in the Time Complexity page
    When The user clicks the Practice Questions button in the DataStructure page
    Then The user should be redirected to Practice Questions of Data structures-Introduction

  @DS4
  Scenario: Verify that user is able to navigate to try Editor page
    Given The user is in the Time Complexity page
    When The user clicks Try Here button for the time complexity page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @DS5
  Scenario: Verify that user receives error when click on Run button without entering code
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the tryEditor for this dataStructure
    Then The user should able to see an error message in alert window

  @DS6
  Scenario Outline: Verify that user receives an error for invalid Python code in Try Editor page of Time Complexity
    Given The user is in the tryEditor page
    When The user reads the invalid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button
    Then The user should able to see an error message in alert window

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  @DS7
  Scenario Outline: Verify that user is able to see output for valid Python code in Try Editor page of Time Complexity
    Given The user is in the tryEditor page
    When The user reads the valid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button
    Then The user should able to see output in the console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |
