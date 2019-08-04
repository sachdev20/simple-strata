Feature: Sign up to application

  Scenario: User register in to application
    Given User is on Login page
    Then I click on create new account button on login page
    And I enter signup details on register page
    And I click on create now button on register page
    And I sign out from current user
    And I enter username and password on login page
    And I click on login button on login page
    Then I click on left navigation icon
    And I select organisation tab from left panel
    And I create a new function under my organisation
    And I verify that new function has been created
    And I close the browser