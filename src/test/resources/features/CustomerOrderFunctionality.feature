Feature: Customer Order Functionality

  Scenario: Create Product Order
      Given I am in landing page 
    When I Click on Login menu
    And Click on Customer Login
    Then Enter User Id 
    And I Enter Password 
    And I Click on Login Button
    And I Click Customer Product Menu
    Then Select Product Name
    And Input Order Date
    Then I Click Order Submit Button
