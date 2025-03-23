@Regression
Feature: Tree Data Structure

  Background: The user sign in to dsAlgo Portal

  Scenario: Verify that user is able to navigate to Tree data structure page
    Given The user is in the Home page after Sign in
    When The user clicks the Getting Started button in Tree Panel
    And The user select Tree item from the drop down menu
    Then The user be directed to Tree Data Structure Page

  Scenario: Verify that user is able to navigate to Tree Data Structures page
    Given The user is on the Home page after signed in
    When The user selects Tree item from the drop-down menu
    Then The user should land on the Tree Data Structure page

  Scenario: Verify that user is able to navigate to Overview of Trees page
    Given The user is on the Tree Data Structure page after signing in
    When The user clicks Overview of Trees link
    Then The user should be redirected to Overview of Trees page

  Scenario: Verify that user is able to navigate to try Editor page for Overview of Trees page
    Given The user is on the Overview of Trees page
    When The user clicks Try Here button in the Overview of Trees page
    Then The user should be redirected to a TryEditor page with a Run button to test.

  Scenario: Verify that user receives error when click on Run button without entering code in Overview of Trees TryEditor page
    Given The user is on the TryEditor page.
    When The user clicks the Run button without entering code in the TryEditor.
    Then The user should see an error message in a pop-up alert box

  Scenario Outline: Verify that user receives error for invalid python code in Overview of Trees TryEditor page
    Given The user is on the TryEditor page
    When The user reads the invalid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see an error message in a pop-up alert box

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: Verify that user is able to see output for valid python code in Overview of Trees TryEditor page
    Given The user is on the TryEditor page
    When The user reads the valid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see output in the Output console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

  Scenario: Verify that user is able to navigate to Practice Questions inthe Trees Data Structure page
    Given The user is on the Tree page after signing in
    When The user clicks Practice Questions link of the Tree data structure
    Then The user should be redirected to Practice page of the Tree data structure

  Scenario: Verify that user is able to navigate to Terminologies page
    Given The user is on the Tree Data Structure page after signing in
    When The user clicks Terminologies link
    Then The user should be redirected to Terminologies page

  Scenario: Verify that user is able to navigate to try Editor page for Terminologies page
    Given The user is on the Terminologies page
    When The user clicks Try Here button in the Terminologies page
    Then The user should be redirected to a TryEditor page with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code in Terminologies TryEditor page
    Given The user is on the TryEditor page
    When The user clicks the Run button without entering code in the TryEditor
    Then The user should see an error message in a pop-up alert box

  Scenario Outline: Verify that user receives error for invalid python code in Terminologies TryEditor page
    Given The user is on the TryEditor page
    When The user reads the invalid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see an error message in an pop-up alert box

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: Verify that user is able to see output for valid python code in Terminologies TryEditor page
    Given The user is on the TryEditor page
    When The user reads the valid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see output in the Output console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

  Scenario: Verify that user is able to navigate to Types of Trees page
    Given The user is on the Tree Data Structure page after signing in
    When The user clicks Types of Trees link
    Then The user should be redirected to Types of Trees page

  Scenario: Verify that user is able to navigate to try Editor page for  Types of Trees page
    Given The user is on the Types of Trees page
    When The user clicks Try Here button in the Types of Trees page
    Then The user should be redirected to a TryEditor page with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code in Types of Trees TryEditor page
    Given The user is on the TryEditor page
    When The user clicks the Run button without entering code in the TryEditor
    Then The user should see an error message in a pop-up alert box

  Scenario Outline: Verify that user receives error for invalid python code in Types of Tree TryEditor page
    Given The user is on the TryEditor page
    When The user reads the invalid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see an error message in a pop-up alert box

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: Verify that user is able to see output for valid python code in Types of Trees TryEditor page
    Given The user is on the TryEditor page
    When The user reads the valid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see output in the Output console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

  Scenario: Verify that user is able to navigate to Tree Traversal page
    Given The user is on the Tree Data Structure page after signing in
    When The user clicks Tree Traversal link
    Then The user should be redirected to Tree Traversal page

  Scenario: Verify that user is able to navigate to try Editor page for Tree Traversal page
    Given The user is on the Tree Traversal page
    When The user clicks Try Here button in the Tree Traversal page
    Then The user should be redirected to a TryEditor page with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code in Tree Travesal TryEditor page for Tree Tryeditor
    Given The user is on the Try Editor page
    When The user clicks the Run button without entering code in the Editor
    Then The user should see an error message in a pop-up alert box

  Scenario Outline: Verify that user receives error for invalid python code in Tree Traversal TryEditor page
    Given The user is on the TryEditor page
    When The user reads the invalid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see an error message in a pop-up alert box

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: Verify that user is able to see output for valid python code in Tree Traversal TryEditor page
    Given The user is on the TryEditor page
    When The user reads the valid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see output in the Output console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

  Scenario: Verify that user is able to navigate to Traversals-Illustration page
    Given The user is on the Tree Data Structure page after signing in
    When The user clicks Traversals-Illustration link
    Then The user should be redirected to Traversals-Illustration page

  Scenario: Verify that user is able to navigate to TryEditor page for Traversals-Illustration page
    Given The user is on the Traversals-Illustration page
    When The user clicks Try Here button in the Traversals-Illustration page
    Then The user should be redirected to a TryEditor page with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code in Traversals-Illustration TryEditor page
    Given The user is on the TryEditor page
    When The user clicks the Run button without entering code in the TryEditor
    Then The user should see an error message in a pop-up alert box

  Scenario Outline: Verify that user receives error for invalid python code in Traversals-Illustration TryEditor page
    Given The user is on the TryEditor page
    When The user reads the invalid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see an error message in a pop-up alert box

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: Verify that user is able to see output for valid python code in Traversals-Illustration TryEditor page
    Given The user is on the TryEditor page
    When The user reads the valid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see output in the Output console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

  Scenario: Verify that user is able to navigate to Binary trees page
    Given The user is on the Tree Data Structure page after signing in
    When The user clicks Binary trees link
    Then The user should be redirected to Binary trees page

  Scenario: Verify that user is able to navigate to try Editor page for  Binary trees page
    Given The user is on the Binary trees page
    When The user clicks Try Here button in the Binary trees page
    Then The user should be redirected to a TryEditor page with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code in Binary trees TryEditor page
    Given The user is on the TryEditor page
    When The user clicks the Run button without entering code in the TryEditor
    Then The user should see an error message in a pop-up alert box

  Scenario Outline: Verify that user receives error for invalid python code in Binary trees TryEditor page
    Given The user is on the TryEditor page
    When The user reads the invalid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see an error message in a pop-up alert box

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: Verify that user is able to see output for valid python code in Binary trees TryEditor page
    Given The user is on the TryEditor page
    When The user reads the valid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see output in the Output console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

  Scenario: Verify that user is able to navigate to Types of Binary trees page
    Given The user is on the Tree Data Structure page after signing in
    When The user clicks Types of Binary trees link
    Then The user should be redirected to Types of Binary trees page

  Scenario: Verify that user is able to navigate to try Editor page for  Types of Binary Trees page
    Given The user is on the Types of Binary Trees page
    When The user clicks Try Here button in the Types of Binary Trees page
    Then The user should be redirected to a TryEditor page with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code in Types of Binary Trees TryEditor page
    Given The user is on the Try Editor page
    When The user clicks the Run button without entering code in the Editor
    Then The user should see an error message in a pop-up alert box

  Scenario Outline: Verify that user receives error for invalid python code in Types of Binary Trees TryEditor page
    Given The user is on the TryEditor page
    When The user reads the invalid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see an error message in a pop-up alert box

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: Verify that user is able to see output for valid python code in Types of Binary Trees TryEditor page
    Given The user is on the TryEditor page
    When The user reads the valid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see output in the Output console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

  Scenario: Verify that user is able to navigate to Implementation in Python page
    Given The user is on the Tree Data Structure page after signing in
    When The user clicks Implementation in Python link
    Then The user should be redirected to Implementation in Python page

  Scenario: Verify that user is able to navigate to try Editor page for Implementation in Python page
    Given The user is on the Implementation in Python page
    When The user clicks Try Here button in the Implementation in Python page
    Then The user should be redirected to a TryEditor page with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code in Implementation in Python TryEditor page
    Given The user is on the TryEditor page
    When The user clicks the Run button without entering code in the TryEditor
    Then The user should see an error message in a pop-up alert box

  Scenario Outline: Verify that user receives error for invalid python code in Implementation in Python TryEditor page
    Given The user is on the TryEditor page
    When The user reads the invalid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see an error message in a pop-up alert box

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: Verify that user is able to see output for valid python code in Implementation in Python TryEditor page
    Given The user is on the TryEditor page
    When The user reads the valid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see output in the Output console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

  Scenario: Verify that user is able to navigate to Binary Tree Traversals page
    Given The user is on the Tree Data Structure page after signing in
    When The user clicks Binary Tree Traversals link
    Then The user should be redirected to Binary Tree Traversals page

  Scenario: Verify that user is able to navigate to Try Editor page for  Binary Tree Traversals page
    Given The user is on the Binary Tree Traversals page
    When The user clicks the Try Here button
    Then The user should be redirected to a TryEditor page with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code in Binary Tree Traversals TryEditor page
    Given The user is in the TryEditor page for Binary Tree Traversals
    When The user clicks the Run button without entering code in the TryEditor
    Then The user should see an error message in a pop-up alert box

  Scenario Outline: Verify that user receives error for invalid python code in Binary Tree Traversals TryEditor page
    Given The user is in the TryEditor page for Binary Tree Traversals
    When The user reads the invalid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see an error message in a pop-up alert box

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: Verify that user is able to see output for valid python code in Binary Tree Traversals TryEditor page
    Given The user is in the TryEditor page for Binary Tree Traversals
    When The user reads the valid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see output in the Output console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

  Scenario: Verify that user is able to navigate to Implementation of Binary Trees page
    Given The user is in the Tree data structure page after sign in
    When The user clicks the Implementation of Binary Trees link
    Then The user should be redirected to the Implementation of Binary Trees page

  Scenario: Verify that user is able to navigate to try Editor page for  Implementation of Binary Trees page
    Given The user is on the Implementation of Binary Trees page
    When The user clicks the Try Here button
    Then The user should be redirected to a TryEditor page with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code in Implementation of Binary Trees TryEditor page
    Given The user is in the TryEditor page for Implementation of Binary Trees
    When The user clicks the Run button without entering code in the TryEditor
    Then The user should see an error message in a pop-up alert box

  Scenario Outline: Verify that user receives error for invalid python code in Implementation of Binary Trees TryEditor page
    Given The user is in the TryEditor page for Implementation of Binary Trees
    When The user reads the invalid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see an error message in a pop-up alert box

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: Verify that user is able to see output for valid python code in Implementation of Binary Trees TryEditor page
    Given The user is in the TryEditor page for Implementation of Binary Trees
    When The user reads the valid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see output in the Output console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

  Scenario: Verify that user is able to navigate to Applications of Binary trees page
    Given The user is in the Tree data structure page after sign in
    When The user clicks the Applications of Binary trees link
    Then The user should be redirected to the Applications of Binary trees page

  Scenario: Verify that user is able to navigate to try Editor page for  Applications of Binary trees page
    Given The user is on the Applications of Binary trees page
    When The user clicks the Try Here button
    Then The user should be redirected to a TryEditor page with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code in Applications of Binary trees TryEditor page
    Given The user is in the TryEditor page for Applications of Binary trees
    When The user clicks the Run button without entering code in the TryEditor
    Then The user should see an error message in a pop-up alert box

  Scenario Outline: Verify that user receives error for invalid python code in Applications of Binary trees TryEditor page
    Given The user is in the TryEditor page for Applications of Binary trees
    When The user reads the invalid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see an error message in a pop-up alert box

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: Verify that user is able to see output for valid python code in Applications of Binary trees TryEditor page
    Given The user is in the TryEditor page for Applications of Binary trees
    When The user reads the valid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see output in the Output console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

  Scenario: Verify that user is able to navigate to Binary Search Trees page
    Given The user is in the Tree data structure page after sign in
    When The user clicks the Binary Search Trees link
    Then The user should be redirected to the Binary Search Trees page

  Scenario: Verify that user is able to navigate to try Editor page for  Binary Search Trees page
    Given The user is on the Binary Search Trees page
    When The user clicks the Try Here button
    Then The user should be redirected to a TryEditor page with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code in Binary Search Trees TryEditor page
    Given The user is in the TryEditor page for Binary Search Trees
    When The user clicks the Run button without entering code in the TryEditor
    Then The user should see an error message in a pop-up alert box

  Scenario Outline: Verify that user receives error for invalid python code in Binary Search Trees TryEditor page
    Given The user is in the TryEditor page for Binary Search Trees
    When The user reads the invalid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see an error message in a pop-up alert box

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: Verify that user is able to see output for valid python code in Binary Search Trees TryEditor page
    Given The user is in the TryEditor page for Binary Search Trees
    When The user reads the valid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see output in the Output console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

  Scenario: Verify that user is able to navigate to Implementation Of BST page
    Given The user is in the Tree data structure page after sign in
    When The user clicks the Implementation Of BST link
    Then The user should be redirected to the Implementation Of BST page

  Scenario: Verify that user is able to navigate to try Editor page for  Implementation Of BST page
    Given The user is on the Implementation Of BST page
    When The user clicks the Try Here button
    Then The user should be redirected to a TryEditor page with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code in Implementation Of BST TryEditor page
    Given The user is in the TryEditor page for Implementation Of BST
    When The user clicks the Run button without entering code in the TryEditor
    Then The user should see an error message in a pop-up alert box

  Scenario Outline: Verify that user receives error for invalid python code in Implementation Of BST TryEditor page
    Given The user is in the TryEditor page for Implementation Of BST
    When The user reads the invalid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see an error message in a pop-up alert box

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: Verify that user is able to see output for valid python code in Implementation Of BST TryEditor page
    Given The user is in the TryEditor page for Implementation Of BST
    When The user reads the valid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see output in the Output console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

  Scenario: Verify that user able to logout from the Tree data structure
    Given The user is in the Tree data structure page
    When The User clicks signout button from the Tree page
    Then The user should Logged out successfully
