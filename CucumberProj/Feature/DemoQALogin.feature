Feature: DemaQA bookstore Login page functionality validation

Scenario: User should be able to login with valid credential

Given user is in the Techfios DemoQA page
When user enters username
When user enters password
And user clicks on login button
Then user should land on profile page