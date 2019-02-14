Feature: Checkbox
  As a user, I want to be able to test all the checkbox on the site.


  Scenario: Single Checkbox
    Given im on the basic checkbox demo website
    When i click on the checkbox
    Then i should see a success message


  Scenario: Check all options clicking on each check option
    Given im on the basic checkbox demo website
    When i click each checkbox
    Then i should see that the button is changed to Uncheck All

  @current
  Scenario: Check all options clicking the Check All button
    Given im on the basic checkbox demo website
    When  i click on the Check All button
    Then i should see that all the options gets checked
    And the button is changed to Uncheck All


  Scenario: Uncheck all options clicking the Uncheck All button
    Given im on the basic checkbox demo website
    When i click on the Uncheck All button
    Then i should see that all the options gets unchecked
    And the button is changed to Check All