Feature: Login Page Validation
As a CS Rep I want to Login into Customer Service Portal

Scenario: Login Success
Given The User is in the  login page
When The User enters the valid credentials "khegde-consultant@scholastic.com" and "welcome1"
And User clicks on Login button
Then User should be redirected to Home page
