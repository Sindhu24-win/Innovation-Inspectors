Feature: dsAlgo Portal Stack Functionality

Background:
Given the user has successfully logged into the dsAlgo Portal

Scenario: Navigate to Stack Data Structure Page
Given the user is on the homepage after logging into the dsAlgo Portal
When the user selects the Getting Started button from the Stack panel
Then the user should be redirected to the Stack Data Structure page

Scenario: Navigate to Operations in Stack Page
Given the user is on the Stack page after logging in
When the user clicks the Operations in Stack link
Then the user should be navigated to the Operations in Stack page

Scenario: Navigate to TryEditor for Operations in Stack
Given the user is on the Operations in Stack page
When the user clicks the Try Here button on the Stack in Python page
Then the user should be taken to a page containing a try editor with a Run button for testing the code

Scenario: Error on Clicking Run Without Code in Operations in Stack
Given the user is on the TryEditor page
When the user clicks the Run button without any code in the editor
Then the user should receive an error message in the alert window

Scenario: Error for Invalid Python Code in Operations in Stack
Given the user is on the TryEditor page
When the user types invalid code in the editor and clicks the Run button
Then the user should see an error message in the alert window

Scenario: Display Output for Valid Python Code in Operations in Stack
Given the user is on the TryEditor page
When the user enters valid code in the editor and clicks the Run button
Then the user should see the output displayed in the console

Scenario: Navigate to Practice Questions Page for Operations in Stack
Given the user is on the Stack page after logging into the dsAlgo Portal
When the user clicks the Practice Questions button
Then the user should be redirected to the Practice Questions page

Scenario: Navigate to Implementation Page
Given the user is on the Stack page after logging into the dsAlgo Portal
When the user clicks the Implementation link
Then the user should be taken to the Implementation page

Scenario: Navigate to TryEditor for Implementation Page
Given the user is on the Implementation page
When the user clicks the Try Here button on the Stack in Python page
Then the user should be redirected to a page containing a try editor with a Run button for testing the code

Scenario: Error on Clicking Run Without Code in Implementation Page
Given the user is on the TryEditor page
When the user clicks the Run button without entering any code in the editor
Then the user should see an error message in the alert window

Scenario: Error for Invalid Python Code in Implementation Page
Given the user is on the TryEditor page
When the user enters invalid code in the editor and clicks the Run button
Then the user should receive an error message in the alert window

Scenario: Display Output for Valid Python Code in Implementation Page
Given the user is on the TryEditor page
When the user enters valid code in the editor and clicks the Run button
Then the user should see the output displayed in the console

Scenario: Navigate to Applications Page
Given the user is on the Stack page after logging into the dsAlgo Portal
When the user clicks the Applications link
Then the user should be taken to the Applications page

Scenario: Navigate to TryEditor for Applications Page
Given the user is on the Applications page
When the user clicks the Try Here button on the Stack in Python page
Then the user should be redirected to a page containing a try editor with a Run button for testing the code

Scenario: Error on Clicking Run Without Code in Applications Page
Given the user is on the TryEditor page
When the user clicks the Run button without any code in the editor
Then the user should see an error message in the alert window

Scenario: Error for Invalid Python Code in Applications Page
Given the user is on the TryEditor page
When the user enters invalid code in the editor and clicks the Run button
Then the user should receive an error message in the alert window

Scenario: Display Output for Valid Python Code in Applications Page
Given the user is on the TryEditor page
When the user enters valid code in the editor and clicks the Run button
Then the user should see the output displayed in the console