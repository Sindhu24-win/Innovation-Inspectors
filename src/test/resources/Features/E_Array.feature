@Regression

Feature: Array Navigation

  Background: The User sign in to dsAlgo portal

  @Array1
  Scenario: Verify that user is able to navigate to Array data structure page
    Given The user is in the Home page after Sign in with valid credentials
    When The user clicks the Getting Started button in Array Panel
    Then The user should be directed to Array Data Structure Page

  @Array2
  Scenario: Verify that user is able to navigate to Arrays in Python page
    Given The user is in the Array page after Sign in
    When The user clicks Arrays in Python link
    Then The user should be redirected to Arrays in Python page

  @Array3
  Scenario: Verify that user is able to navigate to try Editor page for Arrays in Python page
    Given The user is on the Arrays in Python page
    When The user clicks Try Here button in Arrays in Python page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @Array4
  Scenario: Verify that user receives error when click on Run button without entering code
    Given The user is in the tryEditor page for Arrays in Python page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should be able to see error message in alert pop-up

  @Array5
  Scenario Outline: Verify that user receives error for invalid python code read from "<SheetName>"  and <RowNumber>
    Given The user is in the tryEditor page Arrays in Python page
    When The user reads the invalid python code from  excel "<SheetName>"  and <RowNumber> and  enters in the Editor and clicks on Run Button
    Then The user should be able to see an error message in alert pop-up

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  @Array6
  Scenario Outline: Verify that user is able to see output for valid python code read from "<SheetName>"  and <RowNumber>
    Given The user is in the tryEditor page Arrays in Python page
    When The user reads the valid python code from excel "<SheetName>" and <RowNumber> and  enters in the Editor and click the Run Button
    Then The user should able to see output in the console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

  @Array7
  Scenario: Verify that user is able to navigate to Arrays using List page
    Given The user is on the Arrays using List page
    When The user clicks Try Here button in Arrays using List page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @Array8
  Scenario Outline: Verify that user receives error for invalid python code read from "<SheetName>" and <RowNumber>
    Given The user is in the tryEditor page Arrays using List page
    When The user reads  the invalid python code from excel "<SheetName>" and <RowNumber> and enters in Arrays using List Editor and click the Run Button
    Then The user should able to see an error message in alert pop-up

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  @Array9
  Scenario Outline: Verify that user is able to see output for valid python code read from "<SheetName>" and <RowNumber>
    Given The user is in the tryEditor page Arrays using List page
    When The user reads  the valid python code from excel "<SheetName>" and <RowNumber> and  enters in Arrays using List Editor and click the Run Button
    Then The user should able to see output for Arrays using list in the console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

  @Array10
  Scenario: Verify that user is able to navigate to Basic Operations in Lists page
    Given The user is on the Basic Operations in Lists page
    When The user clicks Try Here button in Basic Operations in Lists page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @Array11
  Scenario Outline: Verify that user receives error for invalid python code read from "<SheetName>" and <RowNumber>
    Given The user is in the tryEditor page Basic Operations in Lists page
    When The user read the invalid python code from excel "<SheetName>" and <RowNumber> and  enters in Basic Operations Editor and click the Run Button
    Then The user should able to see an error message for Basic Operations in alert pop-up

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  @Array12
  Scenario Outline: Verify that user is able to see output for valid python code read from "<SheetName>" and <RowNumber> for Basic Operations in Lists page
    Given The user is in the tryEditor page Basic Operations in Lists page
    When The user write the valid python code from excel "<SheetName>" and <RowNumber> and enters in Basic Operations Editor and click the Run Button
    Then The user should able to see output for Basic Operations in the console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

  @Array13
  Scenario: Verify that user is able to navigate to Applications of Array page
    Given The user is in the Array page after Sign in
    When The user clicks Applications of Array link
    Then The user should be redirected to Applications of Array page

  @Array14
  Scenario: Verify that user is able to navigate to try Editor page
    Given The user is on the Applications of Array page
    When The user clicks Try Here button in Application of Arrays page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @Array15
  Scenario Outline: Verify that user receives error for invalid python code  read from "<SheetName>" and <RowNumber>
    Given The user is in the tryEditor page Applications of Array page
    When The user reads the invalid python code from excel "<SheetName>" and <RowNumber> and enters  in  Applications of Arrays Editor and click the Run Button
    Then The user should able to see error message in alert pop-up

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         1 |

  @Array16
  Scenario Outline: Verify that user is able to see output for valid python code  read from "<SheetName>" and <RowNumber>
    Given The user is in the tryEditor page Applications of Array page
    When The user reads the valid  python code from excel "<SheetName>" and <RowNumber> and  enters in Application of Arrays Editor and click the Run Button
    Then The user should able to see output for Application of Arrays in the console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         0 |

  @Array17
  Scenario: Verify that user is able to navigate to Practice Questions Page for Applications of Array page
    Given The user is in the Array page after Sign in
    When The user clicks Practice Questions link Applications of Array page
    Then The user should be redirected to Practice page

  @Array18
  Scenario: Verify that user is able to navigate to Search the array Page from Practice question page of Applications of Array page
    Given The user is in the practice page
    When The user clicks the Search the array link
    Then The user should be redirected to Question page contains a question,and try Editor with Run and Submit button

  @Array19
  Scenario: Verify that user receives error when click on Run button without entering code
    Given The user is in the try editor in question page
    When The user did not  write the code for search element in  Editor and Click the Run Button
    Then The user should be able to see error message for search element  in alert pop-up

  @Array20
  Scenario Outline: Verify that user is able to run valid python code  read from "<SheetName>" and <RowNumber>
    Given The user is in the try editor in question page
    When The user reads the valid python code for search element from excel "<SheetName>" and <RowNumber> and enters in Editor and Click the Run Button
    Then The user should able to see output for search element  in the console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         2 |

  @Array21
  Scenario: Verify that user is able to navigate to Max Consecutive Ones Page from Practice questions page
    Given The user is in the practice  page
    When The user clicks the Max ConsecutiveOnes link
    Then The user should be redirected to Question page contains a question,and try Editor with Run and Submit button

  @Array22
  Scenario Outline: Verify that user is able to run valid python code read from "<SheetName>" and <RowNumber> for Max Consecutive Ones question
    Given The user is in the tryEditor in question page
    When The user reads the valid python code from excel "<SheetName>" and <RowNumber> and enters in Editor for maximum number of consecutive ones and Click the Run Button
    Then The user should able to see output for maximum number of consecutive ones  in the console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         4 |

  @Array23
  Scenario: Verify that user is able to navigate to Find Numbers with Even Number of Digits Page from Practice questions page
    Given The user is in the practice page
    When The user clicks the Find Numbers with Even Number of Digits link
    Then The user should be redirected to Question page contains a question,and try Editor with Run and Submit button

  @Array24
  Scenario Outline: Verify that user is able to see output for valid python code  read from "<SheetName>" and <RowNumber>
    Given The user is in the tryEditor in question page
    When The user reads the valid python code from excel "<SheetName>" and <RowNumber> and  enters in Editor for even number of integers and Click the Run Button
    Then The user should able to see output for even number of integers in the console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         6 |

  @Array25
  Scenario: Verify that user is able to navigate to Squares of a Sorted Array Page from Practice questions page
    Given The user is in the  practice  page
    When The user clicks the Squares of a Sorted Array link
    Then The user should be redirected to Question page contains a question,and try Editor with Run and Submit button

  @Array26
  Scenario Outline: Verify that user is able to see output for valid python code  read from "<SheetName>" and <RowNumber>
    Given The user is in the tryEditor in question page
    When The user reads the valid python code from excel "<SheetName>" and <RowNumber> and enters in Editor for squares of each number in Editor and Click the Run Button
    Then The user should able to see output for squares of each number  in the console

    Examples: 
      | SheetName  | RowNumber |
      | pythonCode |         8 |
