Feature: feature to test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And user click on login button
    Then user is navigated to the homepage

    Examples: 
      | username                | password        |
      | tufail                  | ahmed           |
      | standard_user           | secret_sauce    |
      | standard_user           | locked_out_user |
      | problem_user            | secret_sauce    |
      | performance_glitch_user | secret_sauce    |
      | divyanshu               | helloworld      |
