Feature: Login Test
Description: Registered user can login into application using username and valid password


Scenario: Login with valid credentials
Given user opens login in newtour's application
When user enters username as "Lalitha" and password as "password123"
And Click Submit button
Then verify login success