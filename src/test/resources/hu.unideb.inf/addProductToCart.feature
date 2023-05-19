Feature: Add Product To Cart

  Background:
    Given the home page is opened

  Scenario: User login
    Given the "Signup / Login" button is clicked
    And the "Email Address" field is filled with "teszt.elek77@mail.hu"
    And the "Password" field is filled with "Jelszó"
    And the "Login" button is clicked

  Scenario: Add Blue Top to cart
    Given the "Blue Top Add to cart" button is clicked
    And the "View Cart" button is clicked
    And the "Proceed To Checkout" button is clicked
    Then the "Total Amount" should read "Rs. 500"

  Scenario: Add Men Tshirt to cart
    Given the "Men Tshirt Add to cart" button is clicked
    And the "View Cart" button is clicked
    And the "Proceed To Checkout" button is clicked
    Then the "Total Amount" should read "Rs. 900"

  Scenario: Add Sleeveless Dress to cart
    Given the "Sleeveless Dress Add to cart" button is clicked
    And the "View Cart" button is clicked
    And the "Proceed To Checkout" button is clicked
    Then the "Total Amount" should read "Rs. 1900"

  Scenario: Add Stylish Dress to cart
    Given the "Stylish Dress Add to cart" button is clicked
    And the "View Cart" button is clicked
    And the "Proceed To Checkout" button is clicked
    Then the "Total Amount" should read "Rs. 3400"

  Scenario: Add Winter Top to cart
    Given the "Winter Top Add to cart" button is clicked
    And the "View Cart" button is clicked
    And the "Proceed To Checkout" button is clicked
    Then the "Total Amount" should read "Rs. 4000"

  Scenario: Add Summer White Top to cart
    Given the "Summer White Top Add to cart" button is clicked
    And the "View Cart" button is clicked
    And the "Proceed To Checkout" button is clicked
    Then the "Total Amount" should read "Rs. 4400"

  Scenario: Add two Madame Top For Women to cart
    Given the "Madame Top For Women View Product" button is clicked
    And the "Product Quantity" field is filled with "2"
    And the "Add to cart" button is clicked
    And the "View Cart" button is clicked
    And the "Proceed To Checkout" button is clicked
    Then the "Total Amount" should read "Rs. 6400"

  Scenario: Add five Fancy Green Top to cart
    Given the "Fancy Green Top View Product" button is clicked
    And the "Product Quantity" field is filled with "5"
    And the "Add to cart" button is clicked
    And the "View Cart" button is clicked
    And the "Proceed To Checkout" button is clicked
    Then the "Total Amount" should read "Rs. 9900"

  Scenario: Add three Sleeves Printed Top - White to cart
    Given the "Sleeves Printed Top - White View Product" button is clicked
    And the "Product Quantity" field is filled with "3"
    And the "Add to cart" button is clicked
    And the "View Cart" button is clicked
    And the "Proceed To Checkout" button is clicked
    Then the "Total Amount" should read "Rs. 11397"

  Scenario: Add four Half Sleeves Top Schiffli Detailing - Pink to cart
    Given the "Half Sleeves Top Schiffli Detailing - Pink View Product" button is clicked
    And the "Product Quantity" field is filled with "4"
    And the "Add to cart" button is clicked
    And the "View Cart" button is clicked
    And the "Proceed To Checkout" button is clicked
    Then the "Total Amount" should read "Rs. 12833"

  Scenario: Delete cart
    Given the "Cart" button is clicked
    And the "Cart Delete" buttons are clicked