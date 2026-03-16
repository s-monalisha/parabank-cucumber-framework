Feature: Transfer Funds

Scenario: Transfer money between accounts

Given user logs into the application
When user navigates to the transfer fund page
And user enters transfer amount
And user submits the transfer
Then transfer should be successful