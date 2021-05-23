Feature: Search

  Agile story: User should be able to search on Topview home page.

  @topViewSearch
  Scenario: Error message verification after search
    Given User is on the Top View home page
    When User searches "bus tours"
    And User clicks to search button
    Then User should see Sorry, we couldn't find any search results. Please try another search term.