Feature: Signup

Scenario Outline: Signing up
Given oprn signup page
When user enters fn as "<fn>"
And user enters ln as "<ln>"
And user enters dob as "<dob>"
And user enters pwd as "<pwd>"
And user enters cpwd as "<cpwd>"

Examples:
|fn|ln|dob|pwd|cpwd|
|durga|kalaimathy|12-10-1998|durga1997|durga1997|
|asma|imthiyas|12-05-1998|asma1998|asma1998|
