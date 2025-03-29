@Regression

Feature: Graph Datastructure

  Background: The user sign in to dsAlgo Portal

  @Graph1
  Scenario: Verify that user is able to navigate to Graph data structure page
    Given The user is in the Home page after Sign in with valid credentials.
    When The user clicks the Getting Started button in Graph Panel
    Then The user should be directed to Graph Data Structure Page

  @Graph2
  Scenario: Verify that user is able to navigate to Graph Data Structures page
    Given The user is in the Home page after Signed in.
    When The user selects Graph item from the drop down menu.
    Then The user should land in Graph Data Structure Page

  @Graph3
  Scenario: Verify that user is able to navigate to Graph page of Graph-Data structures page
    Given The user is in the Graph data structure page after Sign in
    When The user clicks Graph link
    Then The user should be redirected to Graph page of Graph-Data structures

  @Graph4
  Scenario: Verify that user is able to navigate to Try Editor page of Graph
    Given The user is on the Graph page
    When The user clicks Try Here button in Graph page
    Then The user should be redirected to a page having a Try Editor with a Run button to test

  @Graph5
  Scenario: Verify that user receives an error when clicking on Run button without entering code in Graph Try Editor page
    Given The user is in the Try Editor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should see an error message in an alert window

  @Graph6
  Scenario Outline: Verify that user receives an error for invalid Python code read from "<SheetName>"  and <RowNumber> in Graph Page
    Given The user is in the Try Editor page
    When The user reads the invalid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button
    Then The user should see an error message in an alert window

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  @Graph7
  Scenario Outline: Verify that user is able to see output for valid Python code from "<SheetName>"  and <RowNumber> in Graph Page
    Given The user is in the Try Editor page
    When The user reads the valid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button
    Then The user should see output in the Output console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

  @Graph8
  Scenario: Verify that user is able to navigate to Practice Questions in the Graph Data Structure page
    Given The user is in the Graph page after Sign in
    When The user clicks Practice Questions link
    Then The user should be redirected to Practice page

  @Graph9
  Scenario: Verify that user is able to navigate to Graph Representations page
    Given The user is in the Graph data structure page after Sign in
    When The user clicks Graph Representations link
    Then The user should be redirected to Graph Representations page

  @Graph10
  Scenario: Verify that user is able to navigate to Try Editor page for the Graph Representations page
    Given The user is on the Graph Representations page
    When The user clicks Try Here button in the Graph Representations page
    Then The user should be redirected to a page having a Try Editor with a Run button to test

  @Graph11
  Scenario: Verify that user receives an error when clicking on Run button without entering code in Try Editor page of Graph Representations
    Given The user is in the Try Editor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should see an error message in an alert window

  @Graph12
  Scenario Outline: Verify that user receives an error for invalid Python code in Try Editor page of Graph Representations
    Given The user is in the Try Editor page
    When The user reads the invalid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button
    Then The user should see an error message in an alert window

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  @Graph13
  Scenario Outline: Verify that user is able to see output for valid Python code in Try Editor page of Graph Representations
    Given The user is in the Try Editor page
    When The user reads the valid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button
    Then The user should see output in the Output console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

  @Graph14
  Scenario: Verify that user able to logout from the Graph data structure
    Given The user is in the Graph data structure page
    When The User clicks signout button
    Then The user should signout successfully
