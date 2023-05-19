Feature: Checkout And Payment

  Background:
    Given the home page is opened

  Scenario: User login
    Given the "Signup / Login" button is clicked
    And the "Email Address" field is filled with "teszt.elek77@mail.hu"
    And the "Password" field is filled with "Jelszó"
    And the "Login" button is clicked

  Scenario: Add products to cart
    Given the "Blue Top Add to cart" button is clicked
    And the "Continue Shopping" button is clicked
    And the "Sleeveless Dress Add to cart" button is clicked
    And the "Continue Shopping" button is clicked
    And the "Sleeves Printed Top - White View Product" button is clicked
    And the "Product Quantity" field is filled with "3"
    And the "Add to cart" button is clicked
    And the "Continue Shopping" button is clicked

  Scenario: Payment
    Given the "Cart" button is clicked
    And the "Proceed To Checkout" button is clicked
    And the "Place Order" button is clicked
    And the "Name on Card" field is filled with "Teszt Elek"
    And the "Card Number" field is filled with "123456789"
    And the "CVC" field is filled with "123"
    And the "Expiration Month" field is filled with "12"
    And the "Expiration Year" field is filled with "2028"
    And the "Pay and Confirm Order" button is clicked
    Then the "ORDER PLACED!" message is shown