#Feature: ParaBank Login page

#Scenario: Verify login page Title

#Given user is on the login page
#Then page title should be "ParaBank | Welcome | Online Banking"

Feature: Login Functionality

Scenario: Login with valid credentials
#Scenario Outline: Login with multiple credentials 

Given user is on the login page
When user enters username "<username>"
And user enters password "<password>"
#When user enters username from excel
#And user enters password from excel
And user clicks login 
Then user should be logged in

#Examples:

#|username|password|
#|jhon|demo|
#|test|demo|
#|invalid|invalid|

#Scenario: Login with Excel data

#Given User navigates to login page
#When User logs in with Excel data
#Then Login should be successful


