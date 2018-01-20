Feature: change PIN

  Background: Insert newly issued card and sign in
    In order to be able to change the pin, customer with new atm card need to be able to change the PIN
    using the ATM

    Given I have been issued a new card
    And I insert the card , entering the correct pin
    And I choose "chane pin" from the menu

  Scenario: Change pin successfully
    When I change the PIN to 8887
    Then the system should remember my pin is now 8887

  Scenario: Try to change PIN to the same as before
    When I try to change the PIN to the original PIN
    Then I should see a warning message
    And the system should not have changed my PIN
    
    
    Given a user "michael" born on 1958
    And a user "misha" born on 1998
    And a user "meera" born on 2000
    
    
    Given these users:
    |name      | year|
    |michael|1958|
    |micha|1998|
    |meera|2000|
    
    
    
    
    
