Feature: Logout Functionality

  Background: 
    Given I am has logged in with valid credentials

  Scenario: Successful logout
    Given I am on the dashboard page
    When I open the menu
    And I click the logout button
    Then I should be logged out successfully