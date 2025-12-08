Feature: Create User API

  Scenario: Create new user
    Given user sends POST request
    Then status code should be 201
