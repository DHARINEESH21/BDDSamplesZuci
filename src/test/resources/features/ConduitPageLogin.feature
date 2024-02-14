Feature: User Login

This feature is to implement login functionality in Conduit Page

Scenario: Valid Login
Given User is on Login Page 
When User enters credentials
Then Should display Success Msg

Scenario: Invalid Login
Given User is on Login Page 
When User enters invalid credentials
Then Should display Error Msg


