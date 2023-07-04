Feature: Google Search Page

  @google-search
  Scenario: Search google homepage
    Given A user navigates to google HomePage
    When User enter search "This is test "
    And Click search button
    Then search results are displayed
