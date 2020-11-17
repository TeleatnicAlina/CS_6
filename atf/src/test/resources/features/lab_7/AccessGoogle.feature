Feature: Access google.co.in

  Scenario: User can access google page by entering url in URL box
    When User navigate to url 'https://www.google.co.in'
    Then User is on 'Google Home' page
    And Lucky Button is displayed
