Feature: GoogleSearch

  Scenario: Search Bird in the Google
    When the Google page is opened
    Then enter the Word 'Bird'
    And Hit Enter
