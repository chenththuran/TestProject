#Author: n.chenththuran
Feature: customer login from header
  #I want to use this template for my feature file

 # Scenario: Successful login with valid credentials
  #  Given User is on AuthenticationPage
   # When User enters his valid credentials
   # And clicks create an account button
   # Then User is directed to CreateAccount Page
    
   @SmokeTest 
    Scenario: Unsuccessful login
   Given I am on a new user registration page
	 When I enter valid data on the page
| Fields                 | Values              |
| First Name             | Tom                 |
| Last Name              | Kenny               |
| Email Address          | someone@someone.com |
| Re-enter Email Address | someone@someone.com |
| Password               | Password1           |
| Birthdate              | 01                  |
Then the user registration should be successful