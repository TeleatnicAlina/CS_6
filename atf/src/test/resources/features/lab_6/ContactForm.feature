Feature: Contact store representatives

  Scenario Outline: Anonymous user is able to contact store representatives using [Contact Form]
    Given User is on 'Ellite Shoppy Home' page
    And User clicks on 'Contact' 'tab'
    And User scroll down to the contact form
    When User enters '<name>' in 'name' field
    And User enters '<email>' in 'email' field
    And User enters '<subject>' in 'subject' field
    And User enters '<message>' in 'message' field
    And User clicks on 'Send' 'button'
    Then Message is sent successfully

    Examples:
      | name  | email                    | subject | message       |
      | Alina | teleatnicalina@gmail.com | My book | Need to talk! |