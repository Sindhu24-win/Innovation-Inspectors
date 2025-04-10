@Regression

Feature: Tree Datastructure

  Background: The user sign in to dsAlgo Portal

  @Tree1
  Scenario: Verify that user is able to navigate to Tree data structure page
    Given The user is in the Home page after Sign in
    When The user clicks the Getting Started button in Tree Panel
    And The user select Tree item from the drop down menu
    Then The user be directed to Tree Data Structure Page

  @Tree2
  Scenario: Verify that user is able to navigate to Tree Data Structures page
    Given The user is on the Home page after signed in
    When The user selects Tree item from the drop-down menu
    Then The user should land on the Tree Data Structure page

  @Tree3
  Scenario: Verify that user is able to navigate to Overview of Trees page
    Given The user is on the Tree Data Structure page after signing in
    When The user clicks Overview of Trees link
    Then The user should be redirected to Overview of Trees page

  @Tree4
  Scenario: Verify that user is able to navigate to try Editor page for Overview of Trees page
    Given The user is on the Overview of Trees page
    When The user clicks Try Here button in the Overview of Trees page
    Then The user should be redirected to a TryEditor page with a Run button to test.

  @Tree5
  Scenario: Verify that user receives error when click on Run button without entering code in Overview of Trees TryEditor page
    Given The user is on the TryEditor page.
    When The user clicks the Run button without entering code in the TryEditor.
    Then The user should see an error message in a pop-up alert box

  @Tree6
  Scenario Outline: Verify that user receives error for invalid python code in Overview of Trees TryEditor page
    Given The user is on the TryEditor page
    When The user reads the invalid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see an error message in a pop-up alert box

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  @Tree7
  Scenario Outline: Verify that user is able to see output for valid python code in Overview of Trees TryEditor page
    Given The user is on the TryEditor page
    When The user reads the valid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see output in the Output console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

  @Tree8
  Scenario: Verify that user is able to navigate to Practice Questions inthe Trees Data Structure page
    Given The user is on the Tree page after signing in
    When The user clicks Practice Questions link of the Tree data structure
    Then The user should be redirected to Practice page of the Tree data structure

  @Tree9
  Scenario: Verify that user is able to navigate to Terminologies page
    Given The user is on the Tree Data Structure page after signing in
    When The user clicks Terminologies link
    Then The user should be redirected to Terminologies page

  @Tree10
  Scenario: Verify that user is able to navigate to try Editor page for Terminologies page
    Given The user is on the Terminologies page
    When The user clicks Try Here button in the Terminologies page
    Then The user should be redirected to a TryEditor page with a Run button to test

  @Tree11
  Scenario: Verify that user receives error when click on Run button without entering code in Terminologies TryEditor page
    Given The user is on the TryEditor page
    When The user clicks the Run button without entering code in the TryEditor
    Then The user should see an error message in a pop-up alert box

  @Tree12
  Scenario Outline: Verify that user receives error for invalid python code in Terminologies TryEditor page
    Given The user is on the TryEditor page
    When The user reads the invalid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see an error message in an pop-up alert box

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  @Tree13
  Scenario Outline: Verify that user is able to see output for valid python code in Terminologies TryEditor page
    Given The user is on the TryEditor page
    When The user reads the valid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see output in the Output console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

  @Tree14
  Scenario: Verify that user is able to navigate to Types of Trees page
    Given The user is on the Tree Data Structure page after signing in
    When The user clicks Types of Trees link
    Then The user should be redirected to Types of Trees page

  @Tree15
  Scenario: Verify that user is able to navigate to try Editor page for  Types of Trees page
    Given The user is on the Types of Trees page
    When The user clicks Try Here button in the Types of Trees page
    Then The user should be redirected to a TryEditor page with a Run button to test

  @Tree16
  Scenario: Verify that user receives error when click on Run button without entering code in Types of Trees TryEditor page
    Given The user is on the TryEditor page
    When The user clicks the Run button without entering code in the TryEditor
    Then The user should see an error message in a pop-up alert box

  @Tree17
  Scenario Outline: Verify that user receives error for invalid python code in Types of Tree TryEditor page
    Given The user is on the TryEditor page
    When The user reads the invalid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see an error message in a pop-up alert box

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  @Tree18
  Scenario Outline: Verify that user is able to see output for valid python code in Types of Trees TryEditor page
    Given The user is on the TryEditor page
    When The user reads the valid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see output in the Output console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

  @Tree19
  Scenario: Verify that user is able to navigate to Tree Traversal page
    Given The user is on the Tree Data Structure page after signing in
    When The user clicks Tree Traversal link
    Then The user should be redirected to Tree Traversal page

  @Tree20
  Scenario: Verify that user is able to navigate to try Editor page for Tree Traversal page
    Given The user is on the Tree Traversal page
    When The user clicks Try Here button in the Tree Traversal page
    Then The user should be redirected to a TryEditor page with a Run button to test

  @Tree21
  Scenario: Verify that user receives error when click on Run button without entering code in Tree Travesal TryEditor page for Tree Tryeditor
    Given The user is on the Try Editor page
    When The user clicks the Run button without entering code in the Editor
    Then The user should see an error message in a pop-up alert box

  @Tree22
  Scenario Outline: Verify that user receives error for invalid python code in Tree Traversal TryEditor page
    Given The user is on the TryEditor page
    When The user reads the invalid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see an error message in a pop-up alert box

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  @Tree23
  Scenario Outline: Verify that user is able to see output for valid python code in Tree Traversal TryEditor page
    Given The user is on the TryEditor page
    When The user reads the valid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see output in the Output console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

  @Tree24
  Scenario: Verify that user is able to navigate to Traversals-Illustration page
    Given The user is on the Tree Data Structure page after signing in
    When The user clicks Traversals-Illustration link
    Then The user should be redirected to Traversals-Illustration page

  @Tree25
  Scenario: Verify that user is able to navigate to TryEditor page for Traversals-Illustration page
    Given The user is on the Traversals-Illustration page
    When The user clicks Try Here button in the Traversals-Illustration page
    Then The user should be redirected to a TryEditor page with a Run button to test

  @Tree26
  Scenario: Verify that user receives error when click on Run button without entering code in Traversals-Illustration TryEditor page
    Given The user is on the TryEditor page
    When The user clicks the Run button without entering code in the TryEditor
    Then The user should see an error message in a pop-up alert box

  @Tree27
  Scenario Outline: Verify that user receives error for invalid python code in Traversals-Illustration TryEditor page
    Given The user is on the TryEditor page
    When The user reads the invalid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see an error message in a pop-up alert box

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  @Tree28
  Scenario Outline: Verify that user is able to see output for valid python code in Traversals-Illustration TryEditor page
    Given The user is on the TryEditor page
    When The user reads the valid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see output in the Output console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

  @Tree29
  Scenario: Verify that user is able to navigate to Binary trees page
    Given The user is on the Tree Data Structure page after signing in
    When The user clicks Binary trees link
    Then The user should be redirected to Binary trees page

  @Tree30
  Scenario: Verify that user is able to navigate to try Editor page for  Binary trees page
    Given The user is on the Binary trees page
    When The user clicks Try Here button in the Binary trees page
    Then The user should be redirected to a TryEditor page with a Run button to test

  @Tree31
  Scenario: Verify that user receives error when click on Run button without entering code in Binary trees TryEditor page
    Given The user is on the TryEditor page
    When The user clicks the Run button without entering code in the TryEditor
    Then The user should see an error message in a pop-up alert box

  @Tree32
  Scenario Outline: Verify that user receives error for invalid python code in Binary trees TryEditor page
    Given The user is on the TryEditor page
    When The user reads the invalid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see an error message in a pop-up alert box

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  @Tree33
  Scenario Outline: Verify that user is able to see output for valid python code in Binary trees TryEditor page
    Given The user is on the TryEditor page
    When The user reads the valid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see output in the Output console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

  @Tree34
  Scenario: Verify that user is able to navigate to Types of Binary trees page
    Given The user is on the Tree Data Structure page after signing in
    When The user clicks Types of Binary trees link
    Then The user should be redirected to Types of Binary trees page

  @Tree35
  Scenario: Verify that user is able to navigate to try Editor page for  Types of Binary Trees page
    Given The user is on the Types of Binary Trees page
    When The user clicks Try Here button in the Types of Binary Trees page
    Then The user should be redirected to a TryEditor page with a Run button to test

  @Tree36
  Scenario: Verify that user receives error when click on Run button without entering code in Types of Binary Trees TryEditor page
    Given The user is on the Try Editor page
    When The user clicks the Run button without entering code in the Editor
    Then The user should see an error message in a pop-up alert box

  @Tree37
  Scenario Outline: Verify that user receives error for invalid python code in Types of Binary Trees TryEditor page
    Given The user is on the TryEditor page
    When The user reads the invalid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see an error message in a pop-up alert box

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  @Tree38
  Scenario Outline: Verify that user is able to see output for valid python code in Types of Binary Trees TryEditor page
    Given The user is on the TryEditor page
    When The user reads the valid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see output in the Output console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

  @Tree39
  Scenario: Verify that user is able to navigate to Implementation in Python page
    Given The user is on the Tree Data Structure page after signing in
    When The user clicks Implementation in Python link
    Then The user should be redirected to Implementation in Python page

  @Tree40
  Scenario: Verify that user is able to navigate to try Editor page for Implementation in Python page
    Given The user is on the Implementation in Python page
    When The user clicks Try Here button in the Implementation in Python page
    Then The user should be redirected to a TryEditor page with a Run button to test

  @Tree41
  Scenario: Verify that user receives error when click on Run button without entering code in Implementation in Python TryEditor page
    Given The user is on the TryEditor page
    When The user clicks the Run button without entering code in the TryEditor
    Then The user should see an error message in a pop-up alert box

  @Tree42
  Scenario Outline: Verify that user receives error for invalid python code in Implementation in Python TryEditor page
    Given The user is on the TryEditor page
    When The user reads the invalid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see an error message in a pop-up alert box

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  @Tree43
  Scenario Outline: Verify that user is able to see output for valid python code in Implementation in Python TryEditor page
    Given The user is on the TryEditor page
    When The user reads the valid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see output in the Output console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

  @Tree44
  Scenario: Verify that user is able to navigate to Binary Tree Traversals page
    Given The user is on the Tree Data Structure page after signing in
    When The user clicks Binary Tree Traversals link
    Then The user should be redirected to Binary Tree Traversals page

  @Tree45
  Scenario: Verify that user is able to navigate to Try Editor page for  Binary Tree Traversals page
    Given The user is on the Binary Tree Traversals page
    When The user clicks the Try Here button
    Then The user should be redirected to a TryEditor page with a Run button to test

  @Tree46
  Scenario: Verify that user receives error when click on Run button without entering code in Binary Tree Traversals TryEditor page
    Given The user is in the TryEditor page for Binary Tree Traversals
    When The user clicks the Run button without entering code in the TryEditor
    Then The user should see an error message in a pop-up alert box

  @Tree47
  Scenario Outline: Verify that user receives error for invalid python code in Binary Tree Traversals TryEditor page
    Given The user is in the TryEditor page for Binary Tree Traversals
    When The user reads the invalid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see an error message in a pop-up alert box

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  @Tree48
  Scenario Outline: Verify that user is able to see output for valid python code in Binary Tree Traversals TryEditor page
    Given The user is in the TryEditor page for Binary Tree Traversals
    When The user reads the valid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see output in the Output console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

  @Tree49
  Scenario: Verify that user is able to navigate to Implementation of Binary Trees page
    Given The user is in the Tree data structure page after sign in
    When The user clicks the Implementation of Binary Trees link
    Then The user should be redirected to the Implementation of Binary Trees page

  @Tree50
  Scenario: Verify that user is able to navigate to try Editor page for  Implementation of Binary Trees page
    Given The user is on the Implementation of Binary Trees page
    When The user clicks the Try Here button
    Then The user should be redirected to a TryEditor page with a Run button to test

  @Tree51
  Scenario: Verify that user receives error when click on Run button without entering code in Implementation of Binary Trees TryEditor page
    Given The user is in the TryEditor page for Implementation of Binary Trees
    When The user clicks the Run button without entering code in the TryEditor
    Then The user should see an error message in a pop-up alert box

  @Tree52
  Scenario Outline: Verify that user receives error for invalid python code in Implementation of Binary Trees TryEditor page
    Given The user is in the TryEditor page for Implementation of Binary Trees
    When The user reads the invalid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see an error message in a pop-up alert box

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  @Tree53
  Scenario Outline: Verify that user is able to see output for valid python code in Implementation of Binary Trees TryEditor page
    Given The user is in the TryEditor page for Implementation of Binary Trees
    When The user reads the valid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see output in the Output console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

  @Tree54
  Scenario: Verify that user is able to navigate to Applications of Binary trees page
    Given The user is in the Tree data structure page after sign in
    When The user clicks the Applications of Binary trees link
    Then The user should be redirected to the Applications of Binary trees page

  @Tree55
  Scenario: Verify that user is able to navigate to try Editor page for  Applications of Binary trees page
    Given The user is on the Applications of Binary trees page
    When The user clicks the Try Here button
    Then The user should be redirected to a TryEditor page with a Run button to test

  @Tree56
  Scenario: Verify that user receives error when click on Run button without entering code in Applications of Binary trees TryEditor page
    Given The user is in the TryEditor page for Applications of Binary trees
    When The user clicks the Run button without entering code in the TryEditor
    Then The user should see an error message in a pop-up alert box

  @Tree57
  Scenario Outline: Verify that user receives error for invalid python code in Applications of Binary trees TryEditor page
    Given The user is in the TryEditor page for Applications of Binary trees
    When The user reads the invalid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see an error message in a pop-up alert box

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  @Tree58
  Scenario Outline: Verify that user is able to see output for valid python code in Applications of Binary trees TryEditor page
    Given The user is in the TryEditor page for Applications of Binary trees
    When The user reads the valid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see output in the Output console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

  @Tree59
  Scenario: Verify that user is able to navigate to Binary Search Trees page
    Given The user is in the Tree data structure page after sign in
    When The user clicks the Binary Search Trees link
    Then The user should be redirected to the Binary Search Trees page

  @Tree60
  Scenario: Verify that user is able to navigate to try Editor page for  Binary Search Trees page
    Given The user is on the Binary Search Trees page
    When The user clicks the Try Here button
    Then The user should be redirected to a TryEditor page with a Run button to test

  @Tree61
  Scenario: Verify that user receives error when click on Run button without entering code in Binary Search Trees TryEditor page
    Given The user is in the TryEditor page for Binary Search Trees
    When The user clicks the Run button without entering code in the TryEditor
    Then The user should see an error message in a pop-up alert box

  @Tree62
  Scenario Outline: Verify that user receives error for invalid python code in Binary Search Trees TryEditor page
    Given The user is in the TryEditor page for Binary Search Trees
    When The user reads the invalid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see an error message in a pop-up alert box

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  @Tree63
  Scenario Outline: Verify that user is able to see output for valid python code in Binary Search Trees TryEditor page
    Given The user is in the TryEditor page for Binary Search Trees
    When The user reads the valid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see output in the Output console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

  @Tree64
  Scenario: Verify that user is able to navigate to Implementation Of BST page
    Given The user is in the Tree data structure page after sign in
    When The user clicks the Implementation Of BST link
    Then The user should be redirected to the Implementation Of BST page

  @Tree65
  Scenario: Verify that user is able to navigate to try Editor page for  Implementation Of BST page
    Given The user is on the Implementation Of BST page
    When The user clicks the Try Here button
    Then The user should be redirected to a TryEditor page with a Run button to test

  @Tree66
  Scenario: Verify that user receives error when click on Run button without entering code in Implementation Of BST TryEditor page
    Given The user is in the TryEditor page for Implementation Of BST
    When The user clicks the Run button without entering code in the TryEditor
    Then The user should see an error message in a pop-up alert box

  @Tree67
  Scenario Outline: Verify that user receives error for invalid python code in Implementation Of BST TryEditor page
    Given The user is in the TryEditor page for Implementation Of BST
    When The user reads the invalid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see an error message in a pop-up alert box

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  @Tree68
  Scenario Outline: Verify that user is able to see output for valid python code in Implementation Of BST TryEditor page
    Given The user is in the TryEditor page for Implementation Of BST
    When The user reads the valid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run button for Tree Tryeditor
    Then The user should see output in the Output console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

  
