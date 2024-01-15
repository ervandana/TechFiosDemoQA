Feature: Validate login page

  Scenario: 
    Given user is in DemoQA boostore login page
    When user enters username "harryPotter"
    When user enters password "Abcd@1234"
    And clicks on login button
    Then user should land on profile page
