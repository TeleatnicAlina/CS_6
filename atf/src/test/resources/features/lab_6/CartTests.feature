Feature: User can add and delete products from cart

  @CAL-138
  Scenario: Anonymous user can delete products from cart
    Given User is on 'Ellite Shoppy Home' page
    And User scroll down to the contact form
    And User clicks on 'Add to Cart' 'button'
    And User clicks on 'close Pop up' 'button'
    When User clicks on 'cart' 'icon'
    And User delete product from cart
    And User clicks on 'cart' 'icon'
    Then 'Your shopping cart is empty' message appears

