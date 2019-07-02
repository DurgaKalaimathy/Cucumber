Feature: Test background keyword

Background: display WELCOME
Given app displays welcome settings
@unit
Scenario: signin
Given users un and pwd
And click signin
@integration @unit
Scenario: search for product
Given user searches for iphone
@smoke
Scenario: add to cart
Given user adding the searched product to cart
@smoke @unit
Scenario: payment
Given user paid
@integration
Scenario: signout
Given user signed out

