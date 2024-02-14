Feature: User Interface
  As a user of the e-commerce website
  I want to be able to log in to my account
  So that I can access personalized features and make purchases


  Scenario: User Interface Successful
    Given I am on the login page
    When I check the Login Page Display the Movie And Movie Name
    And I click on the login button
    Then The login functional with error massage

  Scenario: Login Functional Username empty Successful
    Given  I am on the login page
    When Empty Username
    And  I click on the login button
    Then The login functional with error massage

  Scenario: Login Functional Password empty Successful
    Given I am on the login page
    When  Empty Password
    And  I click on the login button
    Then The login functional with error massage

    Scenario:Login Functional Wrong Password Successful
     Given I am on the login page
      When Incorrect Password
      And  I click on the login button
      Then Text error massage

  Scenario:Login Functional Wrong username Successful
    Given I am on the login page
    When Incorrect Username
    And  I click on the login button
   Then login error massage

  Scenario:Login Functional correct Successful
    Given I am on the login page
    When correct username and Password
    And  I click on the login button
    Then Navigate to home page











