Feature: Dropdown
  As a user, i want to test the dropdown.


  Scenario: Simple Select List
    Given im on the basic select dropdown demo website
    When i select an option from the Select List Demo
    Then i should be able to check the selection

  @current
  Scenario: Multi Select List One Option , First Selected button
    Given im on the basic select dropdown demo website
    When i select only an option from the Multi Select List
    And i press First Selected button
    Then i should see the only option i selected

  Scenario:  Multi Select List One Option , Get All Selected button
    Given im on the basic select dropdown demo website
    When i select only an option from the Multi Select List
    And i press Get All Selected button
    Then i should see the only option i selected

  Scenario:  Multi Select List Multiple Option , First Selected button
    Given im on the basic select dropdown demo website
    When i select several options from the Multi Select List
    And i press First Selected button
    Then i should see the first option i selected

  Scenario:  Multi Select List Multiple Option , Get All Selected button
    Given im on the basic select dropdown demo website
    When i select several options from the Multi Select List
    And i press Get All Selected button
    Then i should see all the options i selected listed in order of selection


