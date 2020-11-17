Feature: Login user

  Background: Registered user exists
    Given User is on 'Ellite Shoppy Home' page
    And User clicks on 'SignUp' 'button'
    And User is on 'Sign Up' page
    When User enters 'Alina' in 'name' field
    And User enters 'teleatnicalina@gmail.com' in 'email' field
    And User enters '1314215aFJ+' in 'password' field
    And User enters '1314215aFJ+' in 'confirm password' field
    And User clicks on 'SignUp' 'button'
    Then User is registered successfully
    And User clicks on Back to Site button

  Scenario Outline: User is able to sign in with valid credentials
    Given User is on 'Ellite Shoppy Home' page
    And User clicks on 'SignIn' 'button'
    And User is on 'Sign In' page
    When User enters '<name>' in 'name' field
    And User enters '<email>' in 'email' field
    And User clicks on 'SignIn' 'button'
    Then User is logged in successfully

    Examples:
      | name  | email                    |
      | Alina | teleatnicalina@gmail.com |