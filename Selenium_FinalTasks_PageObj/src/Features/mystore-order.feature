@order
  Feature: Shop order

  Scenario: User can order

    Given I go to main
    When I sign in
    And I login by "cirilla@gmail.com" and "secretpassword666"

    When I click clothes and I choose Hummingbird Printed Sweater
    And I check discount "SAVE 20%"
    And I choose "XL" size and quantity "2" and I add item to cart
    Then I checkout and confirm basket

    When I confirm address
    And I choose PrestaShop and Pay by check
    Then I take screenshot

    When I go to order history and check my order is "Awaiting check payment"
#    Then I check amount to pay is equal like
    And I close browser

