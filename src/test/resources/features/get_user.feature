Feature: Get User API

  Scenario: Get user list
    Given user sends GET request
    Then status code should be 200
