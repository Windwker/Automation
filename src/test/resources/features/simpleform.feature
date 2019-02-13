Feature: Simple Form
  As a user, I want to be able to input some values and get the results displayed on the screen.

  Scenario: Single Input Field
    Given im on the basic form demo website
    When i enter a message on the Message input box
    And i click on Show Message button
    Then i should be able to see the message i entered




    Scenario: Two Input Fields
      Given im on the basic form demo website
      When i enter value A
      And i enter value B
      And i click on Get Total button
      Then i should be able to see the sum of A and B
