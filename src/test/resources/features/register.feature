Feature: User Registration

Scenario: Register a new user

Given user is on the registration page
When user enters the registration details 
And user clicks on the register button
Then user should see account created message