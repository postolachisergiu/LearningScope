Feature: LoginFeature
  This feature deals with login functionality

  Scenario: Login with correct username and password
    Given I navigate to the login page of the application
    And I enter the users email address as Email:admin
    And I verify the count of my salary digits 1000000
    And I would like to see how looks Cucumber-java8
    And I enter the credentials
      | username | password      |
      | admin    | adminPassword |
    And I click on login button
    Then I should see the userform page


  Scenario Outline: Login with correct username and password using scenario outline
    Given I navigate to the login page of the application
    And I enter the credentials <username> and <password>
    And I click on login button
    Then I should see the userform page

    Examples:
      | username | password   |
      | execute  | automation |
      | run      | qa         |
      | try      | na         |
