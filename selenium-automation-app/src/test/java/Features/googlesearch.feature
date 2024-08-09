Feature: feature to search from google

  Scenario: Check google search is successful
    Given user is on the home page
    When user enters the value to be searched
    And user press enter
    Then user is navigated to the searched page
