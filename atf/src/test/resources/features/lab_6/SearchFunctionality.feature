Feature: Search for products

  Scenario Outline: Anonymous user is able to search for products using Search field
    Given User is on 'Ellite Shoppy Home' page
    When User enters '<productName>' in 'search' field
    And User clicks on 'search' 'button'
    Then Products with word '<productName>' in name are displayed


    Examples:
      | productName |
      | product     |