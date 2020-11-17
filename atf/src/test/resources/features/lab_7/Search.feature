Feature: Search functionality

  Scenario: "Did you mean link appear" if user search for irrelevant
    Given User is on 'Google Home' page
    When User enters 'loftef+' in 'search' field
    And User clicks on 'search' 'button'
    Then The following message appears
      | Ați dorit să scrieți: |


  Scenario: Nothing is happening if user enters nothing
    Given User is on 'Google Home' page
    When User enters '' in 'search' field
    And User clicks on 'search' 'button'
    Then Lucky Button is displayed


  Scenario: Check how many results display on a single page
    Given User is on 'Google Home' page
    When User enters 'animal' in 'search' field
    And User clicks on 'search' 'button'
    Then The folowing number of results apperas
    |13|
