Feature: Test Login

Scenario: Login with valid
Given open newtours app
When user enters un as "mercury" and pwd as "mercury"
And submit login form
Then verify pass

Scenario: Login with valid
Given open newtours app
When user enters un as "mercury" and pwd as "durga"
And submit login form
Then verify fail