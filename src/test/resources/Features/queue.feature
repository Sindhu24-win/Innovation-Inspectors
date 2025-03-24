@Queue @Regression
Feature: Queue DataStructure

  Background: 
    The user is signed into the  DSAlgo Portal


  Scenario: Navigate to Queue Data Structure Page
    Given The user is on the Home page
    When The user selects Getting Started in Queue Panel or the user selects Queue item from the drop down menu
    Then The user should be directed to the Queue Data Structure Page

  Scenario: Navigate to Implementation of Queue in Python page
    Given The user is on the Queue page
    When The user clicks Implementation of Queue in Python button
    Then The user should be redirected to Implementation of Queue in Python page

  Scenario: Navigate to try editor page for Implementation of Queue in Python
    Given The user is on the Implementation of Queue in Python page
    When The user clicks Try Here button in Queue in Python page
    Then The user should be redirected to a page having a try Editor with a Run button to test

  Scenario: Error on clicking Run button without entering code for Implementation of Queue in Python
    Given The user is on the try editor page in the Implementation of Queue on Python page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should see an error message in the alert window

  Scenario Outline: Error for invalid Python code for Implementation of Queue in Python
    Given The user is on the try editor page in the Implementation of Queue on Python page
    When The user writes invalid python code from excel "<SheetName>" and <RowNumber> and enters in the Editor and clicks the Run Button for queue tryEditor
    Then The user should see an error message in the alert window

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: Output for valid Python code for Implementation of Queue in Python
    Given The user is on the try editor page in the Implementation of Queue in Python page
    When The user writes valid python code from excel "<SheetName>" and <RowNumber> and enters in the Editor and clicks the Run Button  for queue tryEditor
    Then The user should see the output in the console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

  Scenario: Navigate to Practice Questions Page for Implementation of Queue in Python
    Given The user is on the Queue page
    When The user clicks Practice Questions button in the Implementation of Queue in Python page
    Then The user should be redirected to the Practice Questions page

  Scenario: Navigate to Implementation using collections.deque page
    Given The user is on the Queue page
    When The user clicks Implementation using collections.deque button page
    Then The user should be redirected to the Implementation using collections.deque page

  Scenario: Navigate to try editor page for Implementation using collections.deque
    Given The user is on the Implementation using collections.deque page
    When The user clicks Try Here button in Queue in Python page
    Then The user should be redirected to a page having a try Editor with a Run button to test

  Scenario: Error on clicking Run button without entering code for Implementation using collections.deque
    Given The user is on the try editor page in the Implementation using collections.deque page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should see an error message in the alert window

  Scenario Outline: Error for invalid Python code for Implementation using collections.deque
    Given The user is on the try editor page in the Implementation using collections.deque page
    When The user writes invalid python code from excel "<SheetName>" and <RowNumber> and enters in the Editor and clicks the Run Button  for queue tryEditor
    Then The user should see an error message in the alert window

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: Output for valid Python code for Implementation using collections.deque
    Given The user is on the try editor page in the Implementation using collections.deque page
    When The user writes valid python code from excel "<SheetName>" and <RowNumber> and enters in the Editor and clicks the Run Button  for queue tryEditor
    Then The user should see the output in the console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

  Scenario: Navigate to Implementation using array page
    Given The user is on the Queue page
    When The user clicks Implementation using array button
    Then The user should be redirected to the Implementation using array page

  Scenario: Navigate to try editor page for Implementation using array page
    Given The user is on the Implementation using array page
    When The user clicks Try Here button in Queue in Python page
    Then The user should be redirected to a page having a try Editor with a Run button to test

  Scenario: Error on clicking Run button without entering code for Implementation using array page
    Given The user is on the try editor page in the Implementation using array page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should see an error message in the alert window

  Scenario Outline: Error for invalid Python code for Implementation using array page
    Given The user is on the try editor page in the Implementation using array page
    When The user writes invalid python code from excel "<SheetName>" and <RowNumber> and enters in the Editor and clicks the Run Button  for queue tryEditor
    Then The user should see an error message in the alert window

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: Output for valid Python code for Implementation using array
    Given The user is on the try editor page  in the Implementation using array page
    When The user writes valid python code from excel "<SheetName>" and <RowNumber> and enters in the Editor and clicks the Run Button  for queue tryEditor
    Then The user should see the output in the console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

  Scenario: Navigate to Queue Operations page
    Given The user is on the Queue page
    When The user clicks Queue Operations button
    Then The user should be redirected to the Queue Operations page

  Scenario: Navigate to try editor page for Queue Operations
    Given The user is on the Queue Operations page
    When The user clicks Try Here button in Queue in Python page
    Then The user should be redirected to a page having a try Editor with a Run button to test

  Scenario: Error on clicking Run button without entering code for Queue Operations
    Given The user is on the try editor page in the Queue Operations page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should see an error message in the alert window

  Scenario Outline: Error for invalid Python code for Queue Operations
    Given The user is on the try editor page in the Queue Operations page
    When The user writes invalid python code from excel "<SheetName>" and <RowNumber> and enters in the Editor and clicks the Run Button  for queue tryEditor
    Then The user should see an error message in the alert window

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: Output for valid Python code for Queue Operations
    Given The user is on the try editor page in the Queue Operations page
    When The user writes valid python code from excel "<SheetName>" and <RowNumber> and enters in the Editor and clicks the Run Button for queue tryEditor
    Then The user should see the output in the console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

  Scenario: Verify that user able to logout from the Queue data structure
    Given The user is in the Queue data structure page
    When The User clicks signout button.
    Then The user should signout successfully.
