Feature: Register user

  Scenario Outline: User is able to sign up with valid credentials
    Given User is on 'Ellite Shoppy Home' page
    And User clicks on 'SignUp' 'button'
    And User is on 'Sign Up' page
    When User enters '<name>' in 'name' field
    And User enters '<email>' in 'email' field
    And User enters '<password>' in 'password' field
    And User enters '<confirmPassword>' in 'confirm password' field
    And User clicks on 'SignUp' 'button'
    Then User is registered successfully

    Examples:
      | name  | email                    | password    | confirmPassword |
      | Alina | teleatnicalina@gmail.com | 1314215aFJ+ | 1314215aFJ+     |
