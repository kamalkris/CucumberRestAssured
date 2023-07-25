Feature: This file contains test scenarios of add employee

Scenario: Validate New employee getting created and searched in HRMS System
Given Login with admin user
When Go to PIM Tab
Then validate user gettting searched

Scenario: validate employee not getting created if mandatory fields missing.
Given Login with admin user
When Go to PIM Tab
Then validate user not gettting searched
