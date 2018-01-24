Feature: Facebook login
@SmokeTest
  Scenario Outline: Facebook login functionality
    Given user navigates to Facebook
    When I enter Username as "<username>" and Password as "<password>"
    Then login should be unsuccessful

    Examples: 
      | username          | password  |
      | automationtester1 | password1 |
      | automationtester2 | password2 |
