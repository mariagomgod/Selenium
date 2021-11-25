Feature: Login
  As a user I want to login to be able to check main page

  Scenario: User is able to login with valid credentials
    Given I go to main page
    When I click on FormAuthentication link
    And I fill the username
    And I fill password
    And I click login button
    Then welcome message is displayed in SecureArea page