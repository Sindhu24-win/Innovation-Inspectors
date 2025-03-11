Feature: Data Structures - Introduction Navigation

  Scenario: Verify that the user can navigate to Data Structures - Introduction page
    Given The user is in the Home page after logged in the DsAlgo portal
    When The user clicks on the Getting Started button in Data Structures Introduction
    Then The user should land in Data Structures Introduction Page	
    
   Scenario: Verify that the user is able to navigate to the Time Comlexity Page
    Given The user is in the Data Structure Introduction page
    When The user clicks on the Time Complexity link		
    Then The user should be able to land on the Time complexity page
    
   Scenario: Verify that user is able to navigate to Practice Questions page
    Given The user is in the Time Complexity page
    When The user clicks the Practice Questions button
    Then The user should be redirected to Practice Questions of Data structures-Introduction
    
   Scenario: Verify that user is able to navigate to try Editor page
    Given The user is in the Time Complexity page									
    When The user clicks Try Here button
    Then The user should be redirected to a page having an try Editor with a Run button to test
    
   Scenario: Verify that user receives error when click on Run button without entering code
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should able to see an error message in alert window
    
   Scenario: Verify that user receives error for invalid python code
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window
    
    Scenario: Verify that user is able to see output for valid python code
    Given The user is in the tryEditor page
    When The user writes the valid code in try editor box and click the Run Button
    Then The user should able to see output in the console
    