Feature: Employee Login Functionality
Scenario: Verify Employee ID and Slogan
  Given I am in landing page 
      When I Click on Login menu
      And I click on EMP Login
      Then Enter user Id
      And Enter user Pass
      And I click on EMP Login Button
      Then verify EMP Id
      And verify EMP Home page Slogan