@FundingData Service
Feature: User would like to get fundingDataServices

  Scenario: User should be able to get all fundingDataServices
    Given the following fundingDataServices exists in the library
      | description                 |
      | Twinkle twinkle little star |
    When user requests for all fundingDataServices
    Then the user gets the following fundingDataServices
      | description                 |
      | Twinkle twinkle little star |
