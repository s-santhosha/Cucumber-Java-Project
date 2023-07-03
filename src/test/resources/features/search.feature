Feature: Google Search Page

  @google-search
  Scenario: Search google homepage
    Given A user navigates to google HomePage
    When User enter search "This is test "
    And Click search button
    Then search results are displayed


  Scenario: Test scenario
    Given heading details available
    When request details for "<heading>"
    Then detailText returned will be "<detailText>"
    And description returned will be "<description>"
    Given a valid XML file with name as "T.XML"

  Example:
  | heading   | detailText               | description            |
  | H1        | test detail heading 1    | heading style 1        |
  | H2        | test detail heading 2    | heading style 2        |
  | H3        | test detail heading 3    | heading style 3        |

