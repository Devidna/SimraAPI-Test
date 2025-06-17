Feature: Checkout Flow on SauceDemo

  Scenario: TC004 - Add a product to the cart and verify it appears
    Given User logs in with valid credentials
    When User clicks the Add to Cart button on the first product
    And User clicks the cart icon
    Then The selected product is displayed in the cart page

  Scenario Outline: TC005 - Proceed to checkout and view the order summary
    And User clicks Checkout button
    And User enters customer information with first name "<FirstName>", last name "<LastName>", and postal code "<PostalCode>"
    And User clicks Continue
    Then User is redirected to the order summary page

    Examples:
      | FirstName | LastName | PostalCode |
      | Test      | User     | 12345      |

  Scenario: TC006 - Complete the purchase and see success message
    And User clicks Finish button
    Then User sees a success message

  Scenario: TC007 - Logout from the system
    And User clicks menu icon
    And User clicks Logout
    Then User is redirected to login page

