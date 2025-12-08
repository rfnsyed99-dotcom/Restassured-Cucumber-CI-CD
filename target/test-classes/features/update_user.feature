Feature: Update User API

  Scenario: Update existing user
    Given user sends PUT request
    Then status code should be 200
