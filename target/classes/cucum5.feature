Feature: Login 

Scenario: Registered user login 
Given open testmeapp
When user enters username
|mercury|
|Lalitha|
And user enters password
And user clicks submit button
Then verify login 