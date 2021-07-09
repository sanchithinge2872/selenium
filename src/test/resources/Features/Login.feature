Feature: check login functionality

  Scenario: check user credentials
    Given User is on facebook Site.
    When Enter <username> and <password>.
    And click on submit button.
    Then User successfully logged into home page.
