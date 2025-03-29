@Regression

Feature: Stack DataStructure

  Background: 
    The user has successfully logged into the dsAlgo Portal

  @Stack1
  Scenario: Navigate to Stack Data Structure Page
    Given the user is on the homepage after logging into the dsAlgo Portal
    When the user selects the Getting Started button from the Stack panel
    Then the user should be redirected to the Stack Data Structure page

  @Stack2
  Scenario: Navigate to Operations in Stack Page
    Given the user is on the Stack page
    When the user clicks the Operations in Stack link
    Then the user should be navigated to the Operations in Stack page

  @Stack3
  Scenario: Navigate to TryEditor for Operations in Stack
    Given the user is on the Operations in Stack page
    When the user clicks the Try Here button on the Operations in Stack page
    Then the user should be taken to a page containing a try editor with a Run button for testing the code

  @Stack4
  Scenario: Error on Clicking Run Without Code in Operations in Stack
    Given the user is on the TryEditor page in the Operations in Stack on Python page
    When the user clicks the Run button without any code in the editor
    Then the user should receive an error message in the alert window

  @Stack5
  Scenario Outline: Error for Invalid Python Code in Operations in Stack
    Given the user is on the TryEditor page in the Operations in Stack on Python page
    When the user types invalid python code from excel "<SheetName>" and <RowNumber> and enters in the editor and clicks the Run button for stack TryEditor
    Then the user should see an error message in the alert window

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  @Stack6
  Scenario Outline: Display Output for Valid Python Code in Operations in Stack
    Given the user is on the TryEditor page in the Operations in Stack on Python page
    When the user enters valid python code  from excel "<SheetName>" and <RowNumber> and enters in the editor and clicks the Run button for stack TryEditor
    Then the user should see the output displayed in the console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

  @Stack7
  Scenario: Navigate to Practice Questions Page for Operations in Stack
    Given the user is on the Operations in Stack page
    When the user clicks the Practice Questions button in the Operations in Stack on Python page
    Then the user should be redirected to the Practice Questions page

  @Stack8
  Scenario: Navigate to Implementation Page
    Given the user is currently on the stack page
    When the user clicks the Implementation link
    Then the user should be taken to the Implementation page

  @Stack9
  Scenario: Navigate to TryEditor for Implementation Page
    Given the user is on the Implementation page
    When the user clicks the Try Here button on the Implementation page
    Then the user should be redirected to a page containing a try editor with a Run button for testing the code

  @Stack10
  Scenario: Error on Clicking Run Without Code in Implementation Page
    Given the user is on the TryEditor page in the Implementation page
    When the user clicks the Run button without entering any code in the editor
    Then the user should see an error message in the alert window

  @Stack11
  Scenario Outline: Error for Invalid Python Code in Implementation Page
    Given the user is on the TryEditor page in the Implementation page
    When the user enters invalid python code from excel "<SheetName>" and <RowNumber> and enters in the editor and clicks the Run button for stack TryEditor
    Then the user should receive an error message in the alert window

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  @Stack12
  Scenario Outline: Display Output for Valid Python Code in Implementation Page
    Given the user is on the TryEditor page in the Implementation page
    When the user enters valid python code from excel "<SheetName>" and <RowNumber> and enters in the editor and clicks the Run button for stack TryEditor
    Then the user should see the output displayed in the console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

  @Stack13
  Scenario: Navigate to Applications Page
    Given the user is currently on the stack page
    When the user clicks the Applications link
    Then the user should be taken to the Applications page

  @Stack14
  Scenario: Navigate to TryEditor for Applications Page
    Given the user is on the Applications page
    When the user clicks the Try Here button on the Applications page
    Then the user should be redirected to a page containing a try editor with a Run button for testing the code

  @Stack15
  Scenario: Error on Clicking Run Without Code in Applications Page
    Given the user is on the TryEditor page in the Applications page
    When the user clicks the Run button without any code in the editor
    Then the user should see an error message in the alert window

  @Stack16
  Scenario Outline: Error for Invalid Python Code in Applications Page
    Given the user is on the TryEditor page in the Applications page
    When the user enters invalid python code from excel "<SheetName>" and <RowNumber> and enters in the editor and clicks the Run button for stack TryEditor
    Then the user should receive an error message in the alert window

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  @Stack17
  Scenario Outline: Display Output for Valid Python Code in Applications Page
    Given the user is on the TryEditor page in the Applications page
    When the user enters valid python code  from excel "<SheetName>" and <RowNumber> and enters in the editor and clicks the Run button for stack TryEditor
    Then the user should see the output displayed in the console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

