Feature: popular page check with section

  Scenario: Popular page movie check
    Given I am on the login page
    When correct username and Password
    And login to the popular page
    And  Click on the movie icon
    And  Venom name check
    Then Home Page click